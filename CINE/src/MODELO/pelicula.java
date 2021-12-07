package MODELO;

import java.util.Date;

import patron_generico_g2.*;

public class pelicula implements configurable{
	//ATRIBUTOS
	private atributos_gen<String,Boolean> datos;
	//CONSTRUCTOR
	public pelicula() {
		
	}	
	public pelicula(String nombre, String genero, Boolean estado_Censura, String sinapsis) {
		datos= new atributos_gen<String, Boolean>(nombre,estado_Censura);
		datos.setAtributoT2(genero);
		datos.setAtributoT3(sinapsis);
	}
	//GETTERS AND SETTERS
	public atributos_gen<String, Boolean> getDatos() {
		return datos;
	}
	public void setDatos(atributos_gen<String, Boolean> datos) {
		this.datos = datos;
	}
	@Override
	public String toString() {
		return "pelicula [datos=" + datos + ", getDatos()=" + getDatos() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
