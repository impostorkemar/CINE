package MODELO;

import java.util.ArrayList;
import java.util.Arrays;

import patron_generico_g2.atributos_gen;

public class sala {
	//ATRIBUTOS
	private String nombre;
	private String tipo;
	private asiento [] asientosIMAX;
	private asiento [][] asientosNormales;
	private horario [] horarios;
			
	//CONSTRUCTOR
	public sala() {
		
	}
	public sala(String nombre_,asiento[][] asientosNormales_, asiento[] asientosIMAX_, horario[] horarios_, String tipo_) {
		this.nombre=nombre_;
		this.tipo=tipo_;
		this.horarios=horarios_;
		this.asientosIMAX= asientosIMAX_;
		this.asientosNormales=asientosNormales_;		
		
	}
	//GETTERS AND SETTERS
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
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
	public horario[] getHorarios() {
		return horarios;
	}
	public void setHorarios(horario[] horarios) {
		this.horarios = horarios;
	}
	//METODOS
	public void crearIMAX() {
		asientosIMAX= new asiento[10];
	}
	public void crearNormales() {
		asientosNormales= new asiento[5][10];
	}
	public void crearhorarios() {
		horarios= new horario[2];
	}
	public String ImprimirHorarios() {
		String resultado="";
		for(int i=0; i<2; i++) {
			resultado+=horarios[i].toString()+"\n\t";
		}
		return resultado;
	}
	@Override
	public String toString() {
		return "\n"+nombre+" tipo=" + tipo + "\n\t"+ ImprimirHorarios() ;
	}
		
	
}
