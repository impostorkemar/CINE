package CONTROLADORES;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JButton;

import MODELO.cine;
import VISTA.panel_asientos;
import VISTA.panel_asientos;

public class logica_negocio_panelAsientos {	
	private logica_negocio_panelCompra ln_pc;
	private panel_asientos pA;
	private String[] nombresBotones={"asiento0","asiento1","asiento2","asiento0_0","asiento0.1"};
	private int numeroAdultos=0, numeroNiños=0, numeroTerceraEdad=0, numeroAsientos=0;
	private ArrayList<String> nombresI;
	private ArrayList<String> nombresN;
	private DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getCurrencyInstance();
	private double iva=0.12, costoAsiento=0.0, precioBoletoCine=4.5,subtotal=0, total=0,precioBoletoTeatro=12.5;
	private String tipo;
	private JButton[] nBotonesI;
	private JButton[][] nBotonesN;
	
	
	public logica_negocio_panelAsientos(panel_asientos pa_,ArrayList<String> nombres_,String tipo_,int numeroAdultos, 
			int numeroNiños,int numeroTerceraEdad, cine ARCANE, logica_negocio_panelCompra ln_pc_) {
		this.nBotonesI=pa_.botones;
		this.nBotonesN=pa_.botones2;
		this.ln_pc=ln_pc_;
		this.numeroAdultos=numeroAdultos;
		this.numeroNiños=numeroNiños;
		this.numeroTerceraEdad=numeroTerceraEdad;
		this.tipo=tipo_;
		nombresI= new ArrayList<String>();
		nombresN= new ArrayList<String>();
		this.pA=pa_;
		decimalFormat.setMinimumFractionDigits(2);
	}
	public void botonesOcupadosI(String [] nAux) {
		for(int i=0;i<nAux.length;i++) {
			cambiarEditable(nAux[i],nBotonesI[i]);
		}
	}
	public void botonesOcupadosN(String [] nAux) {
		for(int i=0;i<10;i++) {
			for(int j=0;j<5;j++) {
				cambiarEditable(nAux[i],nBotonesN[i][j]);
			}			
		}
	}
	public void cambiarEditable(String  nAux, JButton boton) {
		if(boton.getText().equals(nAux)) {			
			boton.setEnabled(false);
		}
	}
	public boolean botonReservado(String nombre) {
		boolean flag=false;
		for(int i=0;i<nombresBotones.length;i++) {
			if(nombresBotones[i].equals(nombre)) {
				flag=true;
			}
		}
		return flag;		
	}
	
	public void calcularCosto() {
		calcularSubtotal();	
		calcularIva();
		calcularTotal();
	}
	public void calcularSubtotal() {
		subtotal=0.0;
		double[] aux= new double[3];
		aux=ln_pc.getCostoAsientos();
		if(tipo.equals("cine")) {			
			subtotal=aux[0]*numeroAdultos+((aux[1]/2)*numeroNiños)+((aux[2]/2)*numeroTerceraEdad);
			pA.txt_subtotal.setText(String.valueOf(decimalFormat.format(subtotal)));
		}			
		else if(tipo.equals("teatro")) {
			subtotal=aux[0]*numeroAdultos+((aux[1]/2)*numeroNiños)+((aux[2]/2)*numeroTerceraEdad);
			pA.txt_subtotal.setText(String.valueOf(decimalFormat.format(subtotal)));
		}
		System.out.println("costoBoleto A:"+aux[0]*numeroAdultos);
		System.out.println("costoBoleto N:"+(aux[1]/2)*numeroAdultos);		
		System.out.println("costoBoleto TE:"+(aux[2]/2)*numeroAdultos);
		
	}
	public void calcularTotal() {
		total=0.0;
		total=subtotal+iva;
		pA.txt_total.setText(String.valueOf(decimalFormat.format(total)));		
	}
	public void calcularIva() {
		iva=0.12;
		iva=subtotal*iva;
		pA.txt_iva.setText(String.valueOf(decimalFormat.format(iva)));
	}
	public void reservarAsientosSeleccionados(){
		ArrayList<String> auxA= new ArrayList<String>();
		auxA.addAll(getNombresI());
		auxA.addAll(getNombresN());
		if(auxA.size()>0) {	
			ln_pc.print( "ENTRE IMAX y NORMALES",1);
			ln_pc.escogerAsientos(auxA);			
		}else {
			ln_pc.print("Escoja asientos solicitados", 2);
		}
	}
	public void impirmirTicket() {
		Date date=new Date();
		ln_pc.print("\nTICKET\n\t"+date+ "\nSALA: "+ln_pc.getTipo()+  "\nHorario: "+ln_pc.getSalaH() +
		"\nPersona: "+ln_pc.getPersona().getDatos().getAtributoT1()+ "\nAsientos: \nIMAX:\n"+nombresI.toString()+"\nNORMALES\n"+
				nombresN.toString()+"\n",2);
	}
	public ArrayList<String> getNombresI() {
		return nombresI;
	}
	public void setNombresI(ArrayList<String> nombresI) {
		this.nombresI = nombresI;
	}
	public ArrayList<String> getNombresN() {
		return nombresN;
	}
	public void setNombresN(ArrayList<String> nombresN) {
		this.nombresN = nombresN;
	}
	
}
