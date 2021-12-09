package MODELO;

import java.util.ArrayList;
import java.util.Arrays;

import patron_generico_g2.atributos_gen;

public class sala {
	//ATRIBUTOS
	private String nombre;	
	private String tipo;	
	private horario [] horarios;
			
	//CONSTRUCTOR
	public sala() {
		
	}
	public sala(String nombre_, horario[] horarios_, String tipo_) {
		this.nombre=nombre_;
		this.tipo=tipo_;
		this.horarios=horarios_;				
		
	}
	//GETTERS AND SETTERS
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	public horario[] getHorarios() {
		return horarios;
	}
	public void setHorarios(horario[] horarios) {
		this.horarios = horarios;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	//METODOS
	
	public void crearhorarios() {
		horarios= new horario[2];
	}
	public String ImprimirHorarios() {
		String resultado="";
		for(int i=0; i<2; i++) {
			resultado+="\n"+horarios[i].toString();
		}
		return resultado;
	}
	
	@Override
	public String toString() {
		return "\n"+nombre+" tipo=" + tipo + "\n\t"+ ImprimirHorarios();
	}
		
	
}
