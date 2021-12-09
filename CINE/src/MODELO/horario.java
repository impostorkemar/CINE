package MODELO;

import patron_generico_g2.atributos_gen;

public class horario {
	//ATRIBUTOS
	private atributos_gen<String,pelicula> datos;
	private pelicula pelicula;
	private asiento [] asientosIMAX;
	private asiento [][] asientosNormales;
	//CONSTRUCTOR
	public horario() {
	
	}	
	public horario(String nombre,String nombreP, String generoP, Boolean estado_CensuraP, 
			String sinapsisP, asiento[] asientosIMAX_,asiento[][] asientosNormales_) {
		this.asientosIMAX=asientosIMAX_;
		this.asientosNormales=asientosNormales_;
		pelicula=new pelicula(nombreP,generoP,estado_CensuraP,sinapsisP);
		datos= new atributos_gen<String,pelicula>(nombre,pelicula);			
	}
	public horario(String nombre,pelicula pelicula_, asiento[] asientosIMAX_,asiento[][] asientosNormales_) {	
		this.asientosIMAX=asientosIMAX_;
		this.asientosNormales=asientosNormales_;
		pelicula=new pelicula(pelicula_.getDatos().getAtributoT1(),pelicula_.getDatos().getAtributoT2(),
				pelicula_.getDatos().getAtributoS1(),pelicula_.getDatos().getAtributoT3());
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
	
	public asiento[] getAsientosIMAX() {
		return asientosIMAX;
	}
	public void setAsientosIMAX(asiento[] asientosIMAX) {
		this.asientosIMAX = asientosIMAX;
	}
	public asiento[][] getAsientosNormales() {
		return asientosNormales;
	}
	public void setAsientosNormales(asiento[][] asientosNormales) {
		this.asientosNormales = asientosNormales;
	}
	public String imprimirAsientosIMAX() {
		String resultado="";
		for(int i=0;i<10;i++) {
			resultado+="\n\t"+asientosIMAX[i].toString();
		}
		return resultado;
	}
	public String imprimirAsientoNORMALES() {
		String resultado="";
		for(int m=0; m<5;m++) {
			for(int l=0;l<10;l++) {			
				resultado+="\n\t"+asientosNormales[m][l].toString();
			}
		}
		return resultado;
	}
	//METODOS
	public void crearIMAX() {
		asientosIMAX= new asiento[10];
	}
	public void crearNormales() {
		asientosNormales= new asiento[5][10];
	}
	@Override
	public String toString() {
		return datos.getAtributoT1()+" ["+datos.getAtributoS1().toString()+ "]"+imprimirAsientosIMAX()+imprimirAsientoNORMALES();
	}
			
			
}
