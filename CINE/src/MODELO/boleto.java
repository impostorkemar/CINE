package MODELO;

import java.util.ArrayList;

import patron_generico_g2.atributos_gen;

public class boleto {
	//ATRIBUTOS
	private atributos_gen<String,Double> datos;
	private ArrayList<detalle_boleto> detalle;
	//CONSTRUCTOR
	public void boleto() {
		
	}
	public void boleto(String codigo, double subtotal) {
		datos= new atributos_gen<String,Double>(codigo,subtotal);
	}
	//GETTERS AND SETTERS
	public atributos_gen<String, Double> getDatos() {
		return datos;
	}
	public void setDatos(atributos_gen<String, Double> datos) {
		this.datos = datos;
	}
	public ArrayList<detalle_boleto> getDetalle() {
		return detalle;
	}
	public void setDetalle(ArrayList<detalle_boleto> detalle) {
		this.detalle = detalle;
	}
	@Override
	public String toString() {
		return "boleto [datos=" + datos + ", detalle=" + detalle + "]";
	}
	
	//METODOS
}
