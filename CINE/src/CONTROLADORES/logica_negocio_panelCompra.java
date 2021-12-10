package CONTROLADORES;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;

import MODELO.cine;
import MODELO.horario;
import MODELO.pelicula;
import MODELO.persona;
import MODELO.sala;
import VISTA.panel_compra;
import patron_generico_g2.configurable;

public class logica_negocio_panelCompra implements configurable {
	private persona persona;
	private panel_compra pc;
	private cine ARCANE;
	private pelicula[] peliculas;
	private String[] asientos;
	public ArrayList<String> nombresAsientos;
	private int numeroAdultos=0, numeroNiños=0, numeroTerceraEdad=0, numeroAsientos, asientosIMAX=0;
	private double  costoAsientoA=0.0, costoAsientoN=0.0, costoAsientoTerceraEdad=0.0;	
	private double[] costoAsientos;	
	private String nombre_Pelicula_Funcion, tipo, salaH;	
	private DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getCurrencyInstance(); 
	
	public logica_negocio_panelCompra(logica_negocio_panelCompra ln_pc, pelicula[] peliculas_,String nombrePelicula_Funcion,
			String tipo_,cine ARCANE_) {
		costoAsientos= new double[3];
		nombresAsientos=new ArrayList<String>();
		ARCANE=ARCANE_;
		decimalFormat.setMinimumFractionDigits(2);
		this.pc=ln_pc.getPc();
		pc.setVisible(true);
		this.peliculas=peliculas_;
		this.tipo=tipo_;		
		nombre_Pelicula_Funcion=nombrePelicula_Funcion;	
		pc.txt_evento.setText(nombrePelicula_Funcion);
		cargarHorarios();
		
	}
	
	public logica_negocio_panelCompra(panel_compra pc_, pelicula[] peliculas_,String nombrePelicula_Funcion,
			String tipo_,cine ARCANE_) {
		nombresAsientos=new ArrayList<String>();
		ARCANE=ARCANE_;
		decimalFormat.setMinimumFractionDigits(2);
		this.pc=pc_;
		this.peliculas=peliculas_;
		this.tipo=tipo_;
		nombre_Pelicula_Funcion=nombrePelicula_Funcion;	
		pc.txt_evento.setText(nombrePelicula_Funcion);
		cargarHorarios();
	}
	
	public void crearPersona() {
		persona= new persona(pc.txt_nombre.getText(),"adulto",Long.valueOf(pc.txt_cedula.getText()),Integer.valueOf(pc.txt_telefono.getText()),pc.txt_direccion.getText());
	}
	public double[] verificarIMAX() {
		double costoBoleto=0.0;		
		if(tipo.equals("cine")) {	
			costoBoleto=4.5;
			if(pc.chck_adultos.isSelected()) {
				asientosIMAX+=numeroAdultos;
				costoAsientoA=costoBoleto*0.35+costoBoleto;
			}else {
				costoAsientoA=costoBoleto;
			}
			if(pc.chck_niños.isSelected()) {
				asientosIMAX+=numeroNiños;
				costoAsientoN=costoBoleto*0.35+costoBoleto;
			}else {
				costoAsientoN=costoBoleto;
			}
			if(pc.chck_tercerEdad.isSelected()) {
				asientosIMAX+=numeroTerceraEdad;
				costoAsientoTerceraEdad=costoBoleto*0.35+costoBoleto;
			}else {
				costoAsientoTerceraEdad=costoBoleto;
			}
		}else if(tipo.equals("teatro")){
			costoBoleto=12.5;
			if(pc.chck_adultos.isSelected()) {
				asientosIMAX+=numeroAdultos;
				costoAsientoA=costoBoleto*0.35+costoBoleto;
			}else {
				costoAsientoA=costoBoleto;
			}
			if(pc.chck_niños.isSelected()) {
				asientosIMAX+=numeroNiños;
				costoAsientoN=costoBoleto*0.35+costoBoleto;
			}else {
				costoAsientoN=costoBoleto;
			}
			if(pc.chck_tercerEdad.isSelected()) {
				asientosIMAX+=numeroTerceraEdad;
				costoAsientoTerceraEdad=costoBoleto*0.35+costoBoleto;
			}else {
				costoAsientoTerceraEdad=costoBoleto;
			}
		}
		double [] costoAsientosAux= new double[3];
		costoAsientosAux[0]=costoAsientoA;
		costoAsientosAux[1]=costoAsientoN;
		costoAsientosAux[2]=costoAsientoTerceraEdad;
		
		return costoAsientosAux;
		
	}
	public void contarAsientos() {
		
		if(comprobarCensura()) {
			//print("caso1",1);
			if(pc.txt_niños.getText().equals("")&&pc.txt_adultos.getText().equals("")&&pc.txt_TerceraEdad.getText().equals("")) {
				numeroNiños=0;
				numeroAdultos=0;
				numeroTerceraEdad=0;
			}else if(pc.txt_niños.getText().equals("")&&pc.txt_adultos.getText().equals("")){
				numeroNiños=0;
				numeroAdultos=0;
				numeroTerceraEdad=Integer.valueOf(pc.txt_TerceraEdad.getText());
			}else if(pc.txt_adultos.getText().equals("")&&pc.txt_TerceraEdad.getText().equals("")) {
				numeroAdultos=0;
				numeroTerceraEdad=0;
				numeroNiños=Integer.valueOf(pc.txt_niños.getText());
			}else if(pc.txt_niños.getText().equals("")&&pc.txt_TerceraEdad.getText().equals("")) {
				numeroNiños=0;
				numeroTerceraEdad=0;
				numeroAdultos=Integer.valueOf(pc.txt_adultos.getText());
			}else if(pc.txt_niños.getText().equals("")){
				numeroNiños=0;
				numeroAdultos=Integer.valueOf(pc.txt_adultos.getText());
				numeroTerceraEdad=Integer.valueOf(pc.txt_TerceraEdad.getText());
			}else if(pc.txt_adultos.getText().equals("")) {
				numeroAdultos=0;
				numeroNiños=Integer.valueOf(pc.txt_niños.getText());
				numeroTerceraEdad=Integer.valueOf(pc.txt_TerceraEdad.getText());
			}else if(pc.txt_TerceraEdad.getText().equals("")) {
				numeroTerceraEdad=0;
				numeroNiños=Integer.valueOf(pc.txt_niños.getText());
				numeroAdultos=Integer.valueOf(pc.txt_adultos.getText());
			}else {
				numeroNiños=Integer.valueOf(pc.txt_niños.getText());
				numeroAdultos=Integer.valueOf(pc.txt_adultos.getText());
				numeroTerceraEdad=Integer.valueOf(pc.txt_TerceraEdad.getText());
			}
			numeroAsientos= Integer.valueOf(numeroNiños+numeroTerceraEdad+numeroAdultos);
		}else if(comprobarCensura()==false) {
			//print("caso2",1);
			numeroNiños=0;
			if(pc.txt_adultos.getText().equals("")&&pc.txt_TerceraEdad.getText().equals("")) {
				numeroAdultos=0;
				numeroTerceraEdad=0;
			}else if(pc.txt_adultos.getText().equals("")) {
				numeroAdultos=0;
				numeroTerceraEdad=Integer.valueOf(pc.txt_TerceraEdad.getText());
			}else if(pc.txt_TerceraEdad.getText().equals("")) {
				numeroTerceraEdad=0;
				numeroAdultos=Integer.valueOf(pc.txt_adultos.getText());
			}else {
				numeroAdultos=Integer.valueOf(pc.txt_adultos.getText());
				numeroTerceraEdad=Integer.valueOf(pc.txt_TerceraEdad.getText());
			}
			numeroAsientos= Integer.valueOf(numeroTerceraEdad+numeroAdultos);
		}
		//print("adulto: "+numeroAdultos+" niños: "+numeroNiños+"numeroTerceraEdad: "+numeroTerceraEdad+"censura:"+comprobarCensura(),1);
		costoAsientos=verificarIMAX();
		
	}
	
	public boolean comprobarCensura() {	
		//contarAsientos();
		boolean censura=false;
		for (int i=0;i<peliculas.length;i++) {
			if(nombre_Pelicula_Funcion.equals(peliculas[i].getDatos().getAtributoT1())) {
				censura=peliculas[i].getDatos().getAtributoS1();
			}			
		}		
		if(censura==true) {			
			return false;
		}else
			return true;
			
	}
	public void cargarHorarios() {
		String[] auxHorarios=new String[2];
		//print("Cargo horarios\n",1);
		if(tipo.equals("cine")) {
			 for(int i=0;i<10;i++) {
				 for(int j=0;j<2;j++) {
					 if(nombre_Pelicula_Funcion.equals(ARCANE.getSalasVisuales()[i].getHorarios()[j].getPelicula().getDatos().getAtributoT1()))
						 //print("cine: "+ARCANE.getSalasVisuales()[i].getHorarios()[j].getDatos().getAtributoT1(),1);
					 	 auxHorarios[j]=ARCANE.getSalasVisuales()[i].getHorarios()[j].getDatos().getAtributoT1();
				 }				 
			 }
		}else if(tipo.equals("teatro")) {
			for(int i=0;i<10;i++) {
				 for(int j=0;j<2;j++) {
					 if(nombre_Pelicula_Funcion.equals(ARCANE.getSalasTeatro()[i].getHorarios()[j].getPelicula().getDatos().getAtributoT1()))
						//print("teatro: "+ARCANE.getSalasTeatro()[i].getHorarios()[j].getDatos().getAtributoT1(),1);
					 	auxHorarios[j]=ARCANE.getSalasTeatro()[i].getHorarios()[j].getDatos().getAtributoT1();
				 }				 
			 }
		}
		for(int k=0;k<auxHorarios.length;k++) {
			//print(tipo+" "+auxHorarios[k],1);
			pc.combobox_horario.addItem(auxHorarios[k]);
		}
		
		
	}
	public void reservarAsiento(String nombreAsiento, String tipoAsiento) {
		String salaOfertada="";
		logica_negocio ln=new logica_negocio();
		sala[] auxVisuales= new sala[10];
		sala[] auxObras= new sala[10];
		horario[] horarios= new horario[2];
		if(tipo.equals("cine")) {
			if(tipoAsiento.equals("IMAX")) {
				auxVisuales=ARCANE.getSalasVisuales();
				for(int g=0;g<10;g++) {			
					for(int j=0;j<2;j++) {				
						auxVisuales[g].setHorarios(ARCANE.getSalasVisuales()[g].getHorarios());				
						//System.out.println(auxVisuales[g].getNombre()+"\t"+auxVisuales[g].getHorarios()[j].toString());
					}			
				}
				//BUSQUEDA DE LA SALA DONDE ESTA LA PELICULA/OBRA
				for(int g=0;g<10;g++) {			
					for(int j=0;j<2;j++) {
						if(nombre_Pelicula_Funcion.equals(ARCANE.getSalasVisuales()[g].getHorarios()[j].getPelicula().getDatos().getAtributoT1()))	{
							salaOfertada=auxVisuales[g].getNombre();
							//print(salaOfertada,1);
						}
					}
				}	
				//CAMBIO DE ASIENTO A OCUPADO
				for(int g=0;g<10;g++) {			
					for(int j=0;j<2;j++) {
						for(int k=0;k<10;k++) {
							if(nombre_Pelicula_Funcion.equals(ARCANE.getSalasVisuales()[g].getHorarios()[j].getPelicula().getDatos().getAtributoT1())&&
									ARCANE.getSalasVisuales()[g].getHorarios()[j].getDatos().getAtributoT1().equals(pc.combobox_horario.getSelectedItem().toString())&&
									ARCANE.getSalasVisuales()[g].getHorarios()[j].getAsientosIMAX()[k].getDatos().getAtributoT1().equals(nombreAsiento)) {
								//print(auxVisuales[g].getNombre()+"\t"+auxVisuales[g].getHorarios()[j].getAsientosIMAX()[k].toString(),1);
								salaH= pc.combobox_horario.getSelectedItem().toString();
								auxVisuales[g].getHorarios()[j].getAsientosIMAX()[k].setOcupado(true);
							}
						}
					}
				}
			}else if(tipoAsiento.equals("NORMALES")){
				auxVisuales=ARCANE.getSalasVisuales();
				for(int g=0;g<10;g++) {			
					for(int j=0;j<2;j++) {				
						auxVisuales[g].setHorarios(ARCANE.getSalasVisuales()[g].getHorarios());				
						//System.out.println(auxVisuales[g].getNombre()+"\t"+auxVisuales[g].getHorarios()[j].toString());
					}			
				}
				//BUSQUEDA DE LA SALA DONDE ESTA LA PELICULA/OBRA
				for(int g=0;g<10;g++) {			
					for(int j=0;j<2;j++) {
						if(nombre_Pelicula_Funcion.equals(ARCANE.getSalasVisuales()[g].getHorarios()[j].getPelicula().getDatos().getAtributoT1()))	{
							salaOfertada=auxVisuales[g].getNombre();
							//print(salaOfertada,1);
						}
					}
				}
				//BUSQUEDA DE LA SALA DONDE ESTA LA PELICULA/OBRA
				for(int g=0;g<10;g++) {			
					for(int j=0;j<2;j++) {
						for(int k=0;k<5;k++) {
							for(int x=0;x<10;x++) {
								if(nombre_Pelicula_Funcion.equals(ARCANE.getSalasVisuales()[g].getHorarios()[j].getPelicula().getDatos().getAtributoT1())&&
										ARCANE.getSalasVisuales()[g].getHorarios()[j].getDatos().getAtributoT1().equals(pc.combobox_horario.getSelectedItem().toString())&&
										ARCANE.getSalasVisuales()[g].getHorarios()[j].getAsientosNormales()[k][x].getDatos().getAtributoT1().equals(nombreAsiento)) {
									//print(auxVisuales[g].getNombre()+"\t"+auxVisuales[g].getHorarios()[j].getAsientosIMAX()[k].toString(),1);
									auxVisuales[g].getHorarios()[j].getAsientosNormales()[k][x].setOcupado(true);
									salaH= pc.combobox_horario.getSelectedItem().toString();
								}
							}
							
						}
					}
				}
			}
		}else if(tipo.equals("teatro")) {
			if(tipoAsiento.equals("IMAX")) {
				auxObras=ARCANE.getSalasTeatro();
				for(int g=0;g<10;g++) {			
					for(int j=0;j<2;j++) {				
						auxObras[g].setHorarios(ARCANE.getSalasTeatro()[g].getHorarios());
					}			
				}
				//BUSQUEDA DE LA SALA DONDE ESTA LA PELICULA/OBRA
				for(int g=0;g<10;g++) {			
					for(int j=0;j<2;j++) {
						if(nombre_Pelicula_Funcion.equals(ARCANE.getSalasTeatro()[g].getHorarios()[j].getPelicula().getDatos().getAtributoT1()))	{
							salaOfertada=auxObras[g].getNombre();
							//print(salaOfertada,1);
						}
					}
				}	
				//CAMBIO DE ASIENTO A OCUPADO
				for(int g=0;g<10;g++) {			
					for(int j=0;j<2;j++) {
						for(int k=0;k<10;k++) {
							if(nombre_Pelicula_Funcion.equals(ARCANE.getSalasTeatro()[g].getHorarios()[j].getPelicula().getDatos().getAtributoT1())&&
									ARCANE.getSalasTeatro()[g].getHorarios()[j].getDatos().getAtributoT1().equals(pc.combobox_horario.getSelectedItem().toString())&&
									ARCANE.getSalasTeatro()[g].getHorarios()[j].getAsientosIMAX()[k].getDatos().getAtributoT1().equals(nombreAsiento)) {
								//print(auxObras[g].getNombre()+"\t"+auxObras[g].getHorarios()[j].getAsientosIMAX()[k].toString(),1);
								auxObras[g].getHorarios()[j].getAsientosIMAX()[k].setOcupado(true);
								salaH= pc.combobox_horario.getSelectedItem().toString();
							}
						}
					}
				}
			}else if(tipoAsiento.equals("NORMALES")){
				auxObras=ARCANE.getSalasTeatro();
				for(int g=0;g<10;g++) {			
					for(int j=0;j<2;j++) {				
						auxObras[g].setHorarios(ARCANE.getSalasTeatro()[g].getHorarios());
					}			
				}
				//BUSQUEDA DE LA SALA DONDE ESTA LA PELICULA/OBRA
				for(int g=0;g<10;g++) {			
					for(int j=0;j<2;j++) {
						if(nombre_Pelicula_Funcion.equals(ARCANE.getSalasTeatro()[g].getHorarios()[j].getPelicula().getDatos().getAtributoT1()))	{
							salaOfertada=auxObras[g].getNombre();
							//print(salaOfertada,1);
						}
					}
				}	
				//CAMBIO DE ASIENTO A OCUPADO
				for(int g=0;g<10;g++) {			
					for(int j=0;j<2;j++) {
						for(int k=0;k<5;k++) {
							for(int x=0; x<10;x++) {
								if(nombre_Pelicula_Funcion.equals(ARCANE.getSalasTeatro()[g].getHorarios()[j].getPelicula().getDatos().getAtributoT1())&&
										ARCANE.getSalasTeatro()[g].getHorarios()[j].getDatos().getAtributoT1().equals(pc.combobox_horario.getSelectedItem().toString())&&
										ARCANE.getSalasTeatro()[g].getHorarios()[j].getAsientosNormales()[k][x].getDatos().getAtributoT1().equals(nombreAsiento)) {
									//print(auxObras[g].getNombre()+"\t"+auxObras[g].getHorarios()[j].getAsientosIMAX()[k].toString(),1);
									auxObras[g].getHorarios()[j].getAsientosNormales()[k][x].setOcupado(true);
									salaH= pc.combobox_horario.getSelectedItem().toString();
								}
							}
						}
					}
				}
			}
		}
		ln.imprimirSalas(ARCANE);
	}
	public void escogerAsientos(ArrayList<String> nombresAsientos) {
		int i=0;
		System.out.println("LLEGANDO A COMPRA");
		for(String auxNombreAsiento:nombresAsientos) {
			if(auxNombreAsiento.contains("_")) {
				reservarAsiento(auxNombreAsiento,"NORMALES");
			}else {
				reservarAsiento(auxNombreAsiento,"IMAX");
			}
				
		}
		/*for(String auxNombreAsiento:nombresAsientos) {
			reservarAsiento(auxNombreAsiento,tipo);
		}*/
	}
	

	public cine getARCANE() {
		return ARCANE;
	}

	public void setARCANE(cine aRCANE) {
		ARCANE = aRCANE;
	}

	public String[] getAsientos() {
		return asientos;
	}

	public void setAsientos(String[] asientos) {
		this.asientos = asientos;
	}

	public int getNumeroAsientos() {
		return numeroAsientos;
	}

	public void setNumeroAsientos(int numeroAsientos) {
		this.numeroAsientos = numeroAsientos;
	}

	public ArrayList<String> getNombresAsientos() {
		return nombresAsientos;
	}

	public void setNombresAsientos(ArrayList<String> nombresAsientos) {
		this.nombresAsientos = nombresAsientos;
	}
	public panel_compra getPc() {
		return pc;
	}
	public void setPc(panel_compra pc) {
		this.pc = pc;
	}
	public int getNumeroAdultos() {
		return numeroAdultos;
	}
	public void setNumeroAdultos(int numeroAdultos) {
		this.numeroAdultos = numeroAdultos;
	}
	public int getNumeroNiños() {
		return numeroNiños;
	}
	public void setNumeroNiños(int numeroNiños) {
		this.numeroNiños = numeroNiños;
	}
	public int getNumeroTerceraEdad() {
		return numeroTerceraEdad;
	}
	public void setNumeroTerceraEdad(int numeroTerceraEdad) {
		this.numeroTerceraEdad = numeroTerceraEdad;
	}
	public double[] getCostoAsientos() {
		return costoAsientos;
	}
	public void setCostoAsientos(double[] costoAsientos) {
		this.costoAsientos = costoAsientos;
	}
	public int getAsientosIMAX() {
		return asientosIMAX;
	}
	public void setAsientosIMAX(int asientosIMAX) {
		this.asientosIMAX = asientosIMAX;
	}
	public persona getPersona() {
		return persona;
	}
	public void setPersona(persona persona) {
		this.persona = persona;
	}
	public String getSalaH() {
		return salaH;
	}
	public void setSalaH(String salaH) {
		this.salaH = salaH;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
	
}
