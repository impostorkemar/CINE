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
		public boolean validarNombre(String nombre){
			//Validacion del nombre
			return nombre.matches("^([A-Z]{1}[a-z·ÈÌÛ˙]+[ ]?){2,4}$");
		}
		public boolean validarCedula(String cedula) {
			return cedula.matches("^(0|1)[0-9]{9}$");
		}
		public boolean validarTelefCasa(String telfcasa) {
			return telfcasa.matches("^[(][0][2-7]{1}[)][-][0-9]{4}[-][0-9]{3}$");
		}
		public boolean validarCelular(String celular) {
			return celular.matches("^[0][1-9]{1}[0-9]{8}$");
		}
		public boolean validarDireccion(String direccion) {
			return direccion.matches("^[0-9A-Za-z:;.,-_·ÈÌÛ˙¡…Õ”⁄/ ]+$");
		}
		
}
