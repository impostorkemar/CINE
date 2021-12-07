package CONTROLADORES;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import MODELO.pelicula;
import MODELO.persona;
import VISTA.panel_compra;
import patron_generico_g2.configurable;

public class logica_negocio_panelCompra implements configurable {
	private persona persona;
	private panel_compra pc;
	private pelicula[] peliculas;
	private int numeroAdultos=0, numeroNiños=0, numero3Edad=0;
	private double iva=0.12, costoAsiento=0.0, precioBoletoCine=4.5,subtotal=0, total=0,precioBoletoTeatro=12.5;
	private String nombre_Pelicula_Funcion, tipo;	
	private DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getCurrencyInstance(); 
	
	public logica_negocio_panelCompra(panel_compra pc_, pelicula[] peliculas_,String nombrePelicula_Funcion,String tipo_) {
		decimalFormat.setMinimumFractionDigits(2);
		this.pc=pc_;
		this.peliculas=peliculas_;
		this.tipo=tipo_;
		nombre_Pelicula_Funcion=nombrePelicula_Funcion;	
		pc.txt_evento.setText(nombrePelicula_Funcion);
	
	}
	
	public void crearPersona() {
		persona= new persona(pc.txt_nombre.getText(),"adulto",Long.valueOf(pc.txt_cedula.getText()),Integer.valueOf(pc.txt_telefono.getText()),pc.txt_direccion.getText());
	}
	public void contarAsientos() {
		int numeroASientos=0;
		if(pc.txt_niños.getText().equals(""))
			numeroNiños=0;
		else
			numeroNiños=Integer.valueOf(pc.txt_niños.getText());
		if(pc.txt_adultos.getText().equals(""))
			numeroAdultos=0;
		else
			numeroAdultos=Integer.valueOf(pc.txt_adultos.getText());
		if(pc.txt_3edad.getText().equals(""))
			numero3Edad=0;
		else
			numero3Edad=Integer.valueOf(pc.txt_adultos.getText());
		numeroASientos= numeroAdultos+numeroNiños+numero3Edad;
	}
	
	public boolean comprobarCensura() {	
		contarAsientos();
		boolean censura=false;
		for (int i=0;i<peliculas.length;i++) {
			if(nombre_Pelicula_Funcion.equals(peliculas[i].getDatos().getAtributoT1())) {
				censura=peliculas[i].getDatos().getAtributoS1();
			}			
		}		
		if(censura==true) {			
			return false;
		}else
			return true;
			
	}
	public void calcularCosto() {
		calcularSubtotal();	
		calcularIva();
		calcularTotal();
	}
	public void calcularSubtotal() {
		subtotal=0.0;
		if(tipo.equals("cine")) {			
			subtotal=precioBoletoCine*numeroAdultos+((precioBoletoCine/2)*numeroNiños)+((precioBoletoCine/2)*numero3Edad);
			pc.txt_subtotal.setText(String.valueOf(decimalFormat.format(subtotal)));
		}			
		else if(tipo.equals("teatro")) {
			subtotal=precioBoletoTeatro*numeroAdultos+((precioBoletoTeatro/2)*numeroNiños)+((precioBoletoTeatro/2)*numero3Edad);
			pc.txt_subtotal.setText(String.valueOf(decimalFormat.format(subtotal)));
		}
		
	}
	public void calcularTotal() {
		total=0.0;
		total=subtotal+iva;
		pc.txt_total.setText(String.valueOf(decimalFormat.format(total)));		
	}
	public void calcularIva() {
		iva=0.12;
		iva=subtotal*iva;
		pc.txt_iva.setText(String.valueOf(decimalFormat.format(iva)));
	}

	
	
}
