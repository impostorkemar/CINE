package MODELO;

import patron_generico_g2.atributos_gen;

public class horario {
	//ATRIBUTOS
	private atributos_gen<String,pelicula> datos;
	private pelicula pelicula;
	//CONSTRUCTOR
	public horario() {
	
	}	
	public horario(String nombre,String nombreP, String generoP, Boolean estado_CensuraP, String sinapsisP) {
		pelicula=new pelicula(nombreP,generoP,estado_CensuraP,sinapsisP);
		datos= new atributos_gen<String,pelicula>(nombre,pelicula);			
	}
	//GETTERS AND SETTERS
	public atributos_gen<String, pelicula> getDatos() {
		return datos;
	}
	public void setDatos(atributos_gen<String, pelicula> datos) {
		this.datos = datos;
	}
	public pelicula getPelicula() {
		return pelicula;
	}
	public void setPelicula(pelicula pelicula) {
		this.pelicula = pelicula;
	}
	@Override
	public String toString() {
		return "horario [datos=" + datos + ", pelicula=" + pelicula + "]";
	}
			
			
}
