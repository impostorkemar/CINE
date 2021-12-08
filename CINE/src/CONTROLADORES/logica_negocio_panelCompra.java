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
	private int numeroAdultos=0, numeroNiños=0, numeroTerceraEdad=0;
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
		if(comprobarCensura()) {
			print("caso1",1);
			if(pc.txt_niños.getText().equals("")&&pc.txt_adultos.getText().equals("")&&pc.txt_TerceraEdad.getText().equals("")) {
				numeroNiños=0;
				numeroAdultos=0;
				numeroTerceraEdad=0;
			}else if(pc.txt_niños.getText().equals("")&&pc.txt_adultos.getText().equals("")){
				numeroNiños=0;
				numeroAdultos=0;
				numeroTerceraEdad=Integer.valueOf(pc.txt_TerceraEdad.getText());
			}else if(pc.txt_adultos.getText().equals("")&&pc.txt_TerceraEdad.getText().equals("")) {
				numeroAdultos=0;
				numeroTerceraEdad=0;
				numeroNiños=Integer.valueOf(pc.txt_niños.getText());
			}else if(pc.txt_niños.getText().equals("")&&pc.txt_TerceraEdad.getText().equals("")) {
				numeroNiños=0;
				numeroTerceraEdad=0;
				numeroAdultos=Integer.valueOf(pc.txt_adultos.getText());
			}else if(pc.txt_niños.getText().equals("")){
				numeroNiños=0;
				numeroAdultos=Integer.valueOf(pc.txt_adultos.getText());
				numeroTerceraEdad=Integer.valueOf(pc.txt_TerceraEdad.getText());
			}else if(pc.txt_adultos.getText().equals("")) {
				numeroAdultos=0;
				numeroNiños=Integer.valueOf(pc.txt_niños.getText());
				numeroTerceraEdad=Integer.valueOf(pc.txt_TerceraEdad.getText());
			}else if(pc.txt_TerceraEdad.getText().equals("")) {
				numeroTerceraEdad=0;
				numeroNiños=Integer.valueOf(pc.txt_niños.getText());
				numeroAdultos=Integer.valueOf(pc.txt_adultos.getText());
			}else {
				numeroNiños=Integer.valueOf(pc.txt_niños.getText());
				numeroAdultos=Integer.valueOf(pc.txt_adultos.getText());
				numeroTerceraEdad=Integer.valueOf(pc.txt_TerceraEdad.getText());
			}
			numeroASientos= Integer.valueOf(numeroNiños+numeroTerceraEdad+numeroAdultos);
		}else if(comprobarCensura()==false) {
			print("caso2",1);
			numeroNiños=0;
			if(pc.txt_adultos.getText().equals("")&&pc.txt_TerceraEdad.getText().equals("")) {
				numeroAdultos=0;
				numeroTerceraEdad=0;
			}else if(pc.txt_adultos.getText().equals("")) {
				numeroAdultos=0;
				numeroTerceraEdad=Integer.valueOf(pc.txt_TerceraEdad.getText());
			}else if(pc.txt_TerceraEdad.getText().equals("")) {
				numeroTerceraEdad=0;
				numeroAdultos=Integer.valueOf(pc.txt_adultos.getText());
			}else {
				numeroAdultos=Integer.valueOf(pc.txt_adultos.getText());
				numeroTerceraEdad=Integer.valueOf(pc.txt_TerceraEdad.getText());
			}
			numeroASientos= Integer.valueOf(numeroTerceraEdad+numeroAdultos);
		}
		print("adulto: "+numeroAdultos+" niños: "+numeroNiños+"numeroTerceraEdad: "+numeroTerceraEdad+"censura:"+comprobarCensura(),1);
		
	}
	
	public boolean comprobarCensura() {	
		//contarAsientos();
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
			subtotal=precioBoletoCine*numeroAdultos+((precioBoletoCine/2)*numeroNiños)+((precioBoletoCine/2)*numeroTerceraEdad);
			pc.txt_subtotal.setText(String.valueOf(decimalFormat.format(subtotal)));
		}			
		else if(tipo.equals("teatro")) {
			subtotal=precioBoletoTeatro*numeroAdultos+((precioBoletoTeatro/2)*numeroNiños)+((precioBoletoTeatro/2)*numeroTerceraEdad);
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
