package MODELO;

import java.util.Arrays;
import java.util.Date;

import patron_generico_g2.atributos_gen;

public class cine {
	//ATRIBUTOS
	private atributos_gen<String,?> datos;
	private sala [] salasVisuales; 
	private sala [] salasTeatro;
	//CONSTRUCTOR
	public cine() {
		
	}
	public cine(String nombre, String direccion) {
		datos= new atributos_gen<String,Date>(nombre,new Date());
		datos.setAtributoT2(direccion);
		this.salasVisuales = salasVisuales;
		this.salasTeatro = salasTeatro;
		crearSalas();
	}
	//GETTERS AND SETTERS
	public atributos_gen<String, ?> getDatos() {
		return datos;
	}
	public void setDatos(atributos_gen<String, ?> datos) {
		this.datos = datos;
	}
	public sala[] getSalasVisuales() {
		return salasVisuales;
	}
	public void setSalasVisuales(sala[] salasVisuales) {
		this.salasVisuales = salasVisuales;
	}
	public sala[] getSalasTeatro() {
		return salasTeatro;
	}
	public void setSalasTeatro(sala[] salasTeatro) {
		this.salasTeatro = salasTeatro;
	}
	//METODOS
	public void crearSalas() {
		salasVisuales[10]=new sala();
		salasTeatro[10]= new sala();
	}
	@Override
	public String toString() {
		return "cine [datos=" + datos + ", salasVisuales=" + Arrays.toString(salasVisuales) + ", salasTeatro="
				+ Arrays.toString(salasTeatro) + "]";
	}
	
}
