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
	public cine(String nombre, String direccion,sala [] salasVisuales_,sala [] salasTeatro_) {
		this.salasVisuales=salasVisuales_;
		this.salasTeatro=salasTeatro_;
		datos= new atributos_gen<String,Date>(nombre,new Date());
		datos.setAtributoT2(direccion);		
		
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
		salasVisuales=new sala[10];
		salasTeatro= new sala[10];
	}
	public String imprimirSalasCine() {
		String aux="";
		for(int k=0;k<10;k++) {
			aux+=salasVisuales[k].toString();
		}
		return aux;
	}
	public String imprimirSalasTeatro() {
		String aux="";
		for(int k=0;k<10;k++) {
			aux+=salasTeatro[k].toString();
		}
		return aux;
	}
	@Override
	public String toString() {
		return "\nCINE ="+datos.getAtributoT1()+" \n SALAS DE CINE \n" + imprimirSalasCine()+" \n SALAS DE TEATRO \n"+imprimirSalasTeatro();
	}
	
}
