package MODELO;

import patron_generico_g2.atributos_gen;

public class asiento {
	//ATRIBUTOS
		private atributos_gen<String,Integer> datos;
		private boolean ocupado;
		private persona persona;
		//CONSTRUCTOR
		public asiento() {
		
		}	
		public asiento(String n_asiento,String tipo, int fila, int columna, boolean estado,persona persona) {			
			datos= new atributos_gen<String,Integer>(n_asiento,tipo,fila,columna);	
			this.persona=persona;
			this.ocupado=ocupado;
		}
		//GETTERS AND SETTERS
		public atributos_gen<String, Integer> getDatos() {
			return datos;
		}
		public void setDatos(atributos_gen<String, Integer> datos) {
			this.datos = datos;
		}
		public boolean isOcupado() {
			return ocupado;
		}
		public void setOcupado(boolean ocupado) {
			this.ocupado = ocupado;
		}
		public persona getPersona() {
			return persona;
		}
		public void setPersona(persona persona) {
			this.persona = persona;
		}
		@Override
		public String toString() {
			return "asiento [datos=" + datos + ", ocupado=" + ocupado + ", persona=" + persona + "]";
		}
			
}
