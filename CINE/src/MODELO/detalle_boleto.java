package MODELO;

import java.util.Date;

import patron_generico_g2.atributos_gen;

public class detalle_boleto {	
	//ATRIBUTOA
	private asiento asiento;
	private horario horario;
	private atributos_gen<Integer,String> datos;
	private double costo_asiento;
	//CONSTRUCTOR
	public detalle_boleto() {
		
	}
	public detalle_boleto(int numero,String codigo,double costo_asiento ,asiento asiento) {
		datos= new atributos_gen<Integer,String>(numero,codigo);
		this.costo_asiento=costo_asiento;
		this.asiento=asiento;
	}
	//GETTERS AND SETTERS
	public asiento getAsiento() {
		return asiento;
	}
	public void setAsiento(asiento asiento) {
		this.asiento = asiento;
	}
	public atributos_gen<Integer, String> getDatos() {
		return datos;
	}
	public void setDatos(atributos_gen<Integer, String> datos) {
		this.datos = datos;
	}
	public double getCosto_asiento() {
		return costo_asiento;
	}
	public void setCosto_asiento(double costo_asiento) {
		this.costo_asiento = costo_asiento;
	}
	
	public horario getHorario() {
		return horario;
	}
	public void setHorario(horario horario) {
		this.horario = horario;
	}
	//METODOS
	@Override
	public String toString() {
		return "detalle_boleto [asiento=" + asiento + ", datos=" + datos + ", costo_asiento=" + costo_asiento + "]";
	}
	
}
