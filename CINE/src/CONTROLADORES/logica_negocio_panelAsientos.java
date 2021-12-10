package CONTROLADORES;

import java.awt.Color;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JButton;

import MODELO.cine;
import VISTA.panel_asientos;
import patron_generico_g2.configurable;
import VISTA.panel_asientos;

public class logica_negocio_panelAsientos implements configurable{	
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
	private cine ARCANE;
	private String horario;
	
	
	public logica_negocio_panelAsientos(panel_asientos pa_,ArrayList<String> nombres_,String tipo_,int numeroAdultos, 
			int numeroNiños,int numeroTerceraEdad, cine ARCANE, logica_negocio_panelCompra ln_pc_,String horario_) {
		this.ARCANE=ARCANE;
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
		this.horario=horario_;
	}
	public void BuscarDatosAsientos() {
		ArrayList<String> asientosLlenosI= new ArrayList<String>();
		ArrayList<String> asientosLlenosN= new ArrayList<String>();
		System.out.println("SALA A COMPARAR: "+horario);
		if(tipo.equals("cine")){			
			for(int g=0;g<10;g++) {			
				for(int j=0;j<2;j++) {
					for(int k=0;k<10;k++) {
						if(ARCANE.getSalasVisuales()[g].getHorarios()[j].getAsientosIMAX()[k].isOcupado() ==true) {
							System.out.println("NHorario: "+ARCANE.getSalasVisuales()[g].getHorarios()[j].getDatos().getAtributoT1());
							asientosLlenosI.add(ARCANE.getSalasVisuales()[g].getHorarios()[j].getAsientosIMAX()[k].getDatos().getAtributoT1());
						}
					}
				}
			}			
			for(int g=0;g<10;g++) {			
				for(int j=0;j<2;j++) {
					for(int k=0;k<5;k++) {
						for(int x=0; x<10;x++) {
							if(	ARCANE.getSalasVisuales()[g].getHorarios()[j].getAsientosNormales()[k][x].isOcupado()==true) {
								System.out.println("NHorario: "+ARCANE.getSalasVisuales()[g].getHorarios()[j].getDatos().getAtributoT1());
								asientosLlenosN.add(ARCANE.getSalasVisuales()[g].getHorarios()[j].getAsientosNormales()[k][x].getDatos().getAtributoT1());
							}
						}
					}
				}
			}
		}else if(tipo.equals("teatro")){			
			for(int g=0;g<10;g++) {			
				for(int j=0;j<2;j++) {
					for(int k=0;k<10;k++) {
						if(ln_pc.getNombre_Pelicula_Funcion().equals(ARCANE.getSalasTeatro()[g].getHorarios()[j].getPelicula().getDatos().getAtributoT1())&&
								ARCANE.getSalasTeatro()[g].getHorarios()[j].getDatos().getAtributoT1().equals(ln_pc.getSalaH())&&
								ARCANE.getSalasTeatro()[g].getHorarios()[j].getAsientosIMAX()[k].isOcupado() ==true) {
							asientosLlenosI.add(ARCANE.getSalasTeatro()[g].getHorarios()[j].getAsientosIMAX()[k].getDatos().getAtributoT1());
						}
					}
				}
			}			
			for(int g=0;g<10;g++) {			
				for(int j=0;j<2;j++) {
					for(int k=0;k<5;k++) {
						for(int x=0; x<10;x++) {
							if(ln_pc.getNombre_Pelicula_Funcion().equals(ARCANE.getSalasTeatro()[g].getHorarios()[j].getPelicula().getDatos().getAtributoT1())&&
									ARCANE.getSalasTeatro()[g].getHorarios()[j].getDatos().getAtributoT1().equals(ln_pc.getSalaH())&&
									ARCANE.getSalasTeatro()[g].getHorarios()[j].getAsientosNormales()[k][x].isOcupado()==true) {
								asientosLlenosN.add(ARCANE.getSalasTeatro()[g].getHorarios()[j].getAsientosNormales()[k][x].getDatos().getAtributoT1());
							}
						}
					}
				}
			}
		}
		print("Asientos precargados",1);
		for(String auxAsiento :asientosLlenosI) {
			print(auxAsiento.toString(),1);
			botonesOcupadosI(auxAsiento);
		}
		for(String auxAsiento1 :asientosLlenosN) {
			print(auxAsiento1.toString(),1);
			botonesOcupadosN(auxAsiento1);
		}
			
	}
	public void botonesOcupadosI(String nAux) {
		for(int i=0;i<nBotonesI.length;i++) {
			if(nBotonesI[i].getText().toString().equals(nAux)) {
				cambiarEditable(nBotonesI[i]);
			}
			
		}
	}
	public void botonesOcupadosN(String nAux) {
		for(int i=0;i<5;i++) {
			for(int j=0;j<10;j++) {
				if(nBotonesN[i][j].getText().toString().equals(nAux)) {
					cambiarEditable(nBotonesN[i][j]);
				}				
			}			
		}
	}
	public void cambiarEditable(JButton boton) {	
		boton.setBackground(Color.BLACK);
			boton.setEnabled(false);		
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
		//System.out.println("costoBoleto A:"+aux[0]*numeroAdultos);
		//System.out.println("costoBoleto N:"+(aux[1]/2)*numeroAdultos);		
		//System.out.println("costoBoleto TE:"+(aux[2]/2)*numeroAdultos);
		
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
		}
	}
	public void imprimirTicket() {
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
