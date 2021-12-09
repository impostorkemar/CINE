package CONTROLADORES;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;

import javax.swing.JButton;

import MODELO.cine;
import VISTA.panel_asientos;
import VISTA.prueba;

public class logica_negocio_panelAsientos {
	private panel_asientos pa;
	private logica_negocio_panelCompra ln_pc;
	private prueba p;
	private String[] nombresBotones={"asiento0","asiento1","asiento2","asiento0_0","asiento0.1"};
	private int numeroAdultos=0, numeroNiños=0, numeroTerceraEdad=0, numeroAsientos=0;
	private ArrayList<String> nombresI;
	private ArrayList<String> nombresN;
	private DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getCurrencyInstance();
	private double iva=0.12, costoAsiento=0.0, precioBoletoCine=4.5,subtotal=0, total=0,precioBoletoTeatro=12.5;
	private String tipo;
	
	public logica_negocio_panelAsientos(panel_asientos pa_) {
		decimalFormat.setMinimumFractionDigits(2);
		this.pa=pa_;
		botonesOcupados(nombresBotones);
		
	}
	public logica_negocio_panelAsientos(prueba pa_,ArrayList<String> nombres_,String tipo_,int numeroAdultos, 
			int numeroNiños,int numeroTerceraEdad, cine ARCANE, logica_negocio_panelCompra ln_pc_) {
		this.ln_pc=ln_pc_;
		this.numeroAdultos=numeroAdultos;
		this.numeroNiños=numeroNiños;
		this.numeroTerceraEdad=numeroTerceraEdad;
		this.tipo=tipo_;
		nombresI= new ArrayList<String>();
		nombresN= new ArrayList<String>();
		this.p=pa_;
		decimalFormat.setMinimumFractionDigits(2);
	}
	public void botonesOcupados(String [] nombres) {
		for(int i=0;i<nombres.length;i++) {
			cambiarEditable(pa.asiento0, nombres[i]);
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
	public void cambiarEditable(JButton boton,String nombre) {
		System.out.println(boton.getText().toString());
		if(boton.getText().toString().equals(nombre)) {
			boton.setEnabled(false);
		}
	}
	public void calcularCosto() {
		calcularSubtotal();	
		calcularIva();
		calcularTotal();
	}
	public void calcularSubtotal() {
		subtotal=0.0;
		if(tipo.equals("cine")) {			
			subtotal=precioBoletoCine*numeroAdultos+((precioBoletoCine/2)*numeroNiños)+((precioBoletoCine/2)*numeroTerceraEdad);
			p.txt_subtotal.setText(String.valueOf(decimalFormat.format(subtotal)));
		}			
		else if(tipo.equals("teatro")) {
			subtotal=precioBoletoTeatro*numeroAdultos+((precioBoletoTeatro/2)*numeroNiños)+((precioBoletoTeatro/2)*numeroTerceraEdad);
			p.txt_subtotal.setText(String.valueOf(decimalFormat.format(subtotal)));
		}
	}
	public void calcularTotal() {
		total=0.0;
		total=subtotal+iva;
		p.txt_total.setText(String.valueOf(decimalFormat.format(total)));		
	}
	public void calcularIva() {
		iva=0.12;
		iva=subtotal*iva;
		p.txt_iva.setText(String.valueOf(decimalFormat.format(iva)));
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
