package MODELO;

import patron_generico_g2.atributos_gen;

public class persona {
	//ATRIBUTOS
		private atributos_gen<String,Long> datos;
		//CONSTRUCTOR
		public persona() {
			
		}	
		public persona(String nombre, String tipo, Long cedula, int telefono,String direccion) {
			datos= new atributos_gen<String, Long>(nombre,tipo,cedula,Long.valueOf(telefono));			
			datos.setAtributoT3(direccion);
		}
		//GETTERS AND SETTERS
		public atributos_gen<String, Long> getDatos() {
			return datos;
		}
		public void setDatos(atributos_gen<String, Long> datos) {
			this.datos = datos;
		}
		@Override
		public String toString() {
			return "persona [datos=" + datos + "]";
		}
		
		
}
