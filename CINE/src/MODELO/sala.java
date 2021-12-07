package MODELO;

import java.util.ArrayList;
import java.util.Arrays;

import patron_generico_g2.atributos_gen;

public class sala {
	//ATRIBUTOS
	private String tipo;
	private asiento [] asientosIMAX;
	private asiento [] asientosNormales;
	private horario [] horarios;
			
	//CONSTRUCTOR
	public sala() {
		
	}
	public sala(asiento asiento, horario horario, String tipo) {		
		this.tipo=tipo;
		crearIMAX();
		crearNormales();
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
	public asiento[] getAsientosNormales() {
		return asientosNormales;
	}
	public void setAsientosNormales(asiento[] asientosNormales) {
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
		asientosIMAX[10]= new asiento();
	}
	public void crearNormales() {
		asientosNormales[60]= new asiento();
	}
	public void crearhorarios() {
		horarios[2]= new horario();
	}
	@Override
	public String toString() {
		return "sala [tipo=" + tipo + ", asientosIMAX=" + Arrays.toString(asientosIMAX) + ", asientosNormales="
				+ Arrays.toString(asientosNormales) + ", horarios=" + Arrays.toString(horarios) + "]";
	}
		
	
}
