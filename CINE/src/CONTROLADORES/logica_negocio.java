package CONTROLADORES;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JPanel;

import MODELO.asiento;
import MODELO.cine;
import MODELO.horario;
import MODELO.pelicula;
import MODELO.persona;
import MODELO.sala;
import VISTA.panel_cine;
import VISTA.panel_menu;
import patron_generico_g2.archivos;
import patron_generico_g2.configurable;

public class logica_negocio implements configurable {
	private cine ARCANE;
	private pelicula [] peliculas;	
	private pelicula [] obras;
	private archivos archivo;
	private panel_menu pm;	
	private final String pathnameP="src/ARCHIVOS/taquilla.txt";	
	private final String pathnameO="src/ARCHIVOS/obras.txt";
	private final String pathnameS="src/ARCHIVOS/";
	private sala[] salasCine_;
	private sala[] salasTeatro_;
	
	Pattern patron;
	Matcher analisis;
	public logica_negocio() {
		archivo= new archivos();
	}
	public logica_negocio(panel_menu pm_,cine ARCANE_) {
		this.pm= pm_;	
		ARCANE= new cine();
		peliculas= new pelicula[10];	
		obras= new pelicula[10];
		archivo= new archivos();
		ARCANE=ARCANE_;
		crearPeliculas();
		if(ARCANE==null){			
			crearObras();
			crearCine();
		}else {
			salasCine_=ARCANE_.getSalasVisuales();
			salasTeatro_=ARCANE_.getSalasTeatro();
			ARCANE= new cine("ARCANE","Quito Estadio Olímpico",salasCine_,salasTeatro_);
			print("VENGO GORDITO",1);
		}
		
		imprimirSalas(ARCANE);
	}
	public void crearPeliculas() {	
		String texto="", texto1="";
		String[] palabrasAux= new String[40] ;		
		boolean censura=false;
		texto1=leer(pathnameP);		
		analizarCadena(texto1,"[a-zA-Z0-9]",palabrasAux);
		int i=0;
		for(int j=0; j<10;j++) {			
			if(palabrasAux[i+2].equals("1"))
				peliculas[j]=new pelicula(palabrasAux[i],palabrasAux[i+1],false,palabrasAux[i+3]);
			else
				peliculas[j]=new pelicula(palabrasAux[i],palabrasAux[i+1],true,palabrasAux[i+3]);
			i+=4;
		}	
		/*for(int j=0; j<10;j++) {
			System.out.println(j+":"+peliculas[j]);

		}*/
		
	}
	public void crearObras() {			
		String texto="", texto1="";
		String[] palabrasAux= new String[40] ;		
		boolean censura=false;
		texto1=leer(pathnameO);		
		analizarCadena(texto1,"[a-zA-Z0-9]",palabrasAux);
		int i=0;
		for(int j=0; j<10;j++) {			
			if(palabrasAux[i+2].equals("1"))
				obras[j]=new pelicula(palabrasAux[i],palabrasAux[i+1],false,palabrasAux[i+3]);
			else
				obras[j]=new pelicula(palabrasAux[i],palabrasAux[i+1],true,palabrasAux[i+3]);
			i+=4;
		}	
		/*for(int j=0; j<10;j++) {
			System.out.println(j+":"+obras[j]);

		}*/
		
	}
	
	public String leer(String pathname) {
		try {
			String texto="";
			FileReader archivo=new FileReader(pathname);
			BufferedReader entrada= new BufferedReader(archivo);
			while(entrada.ready()) {
				texto+=entrada.readLine()+"\n";
			}
			entrada.close();
			archivo.close();
			//print(texto,2);
			return texto;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			print("No se encontro el archivo: "+ e.toString(),2);
			return "";
		}catch (IOException ioe) {
			print("Error al leer: "+ ioe,2);
			return "";
		}
		
	}
	public void analizarCadena(String texto,String ER,String [] palabrasAux) {		
		String [] palabras= texto.split("[\n,]");		
		String aux="";
		int cont=0;
		patron=Pattern.compile(ER);
		//print("Analizar Cadena:\n",1);
		for(String palabra: palabras) {
			analisis=patron.matcher(palabra);
			if(analisis.find()) {
				aux+=palabra+"\n";
				palabrasAux[cont]=palabra;
				//print(palabrasAux[cont],1);
				cont++;
				}
		}	
		//print("aux: "+aux,1);
	}
	public asiento[] crearAsientosI() {
		asiento[] asientosI= new asiento[10];
		for(int k=0;k<10;k++) {
			asientosI[k]= new asiento("asiento"+k,"IMAX", 0, k, false);			
		}
		return asientosI;
	}
	public asiento[][] crearASientosN() {
		asiento[][] asientosN= new asiento[5][10];
		for(int m=0; m<5;m++) {
			for(int l=0;l<10;l++) {			
				asientosN[m][l]= new asiento("asiento"+m+"_"+l,"NORMALES", m, l, false);				
			}
		}
		return asientosN;
	}
	public horario[]  crearHorarios(int i,String nombreSala, pelicula[] funciones) {
		horario[] auxHorarios1= new horario[2];	
		for(int p=0;p<2;p++) {		
			auxHorarios1[p]=new horario(nombreSala+"_horario"+p,funciones[i].getDatos().getAtributoT1(),funciones[i].getDatos().getAtributoT2(),
					funciones[i].getDatos().getAtributoS1(),funciones[i].getDatos().getAtributoT3(),crearAsientosI(),crearASientosN());
		}
		return auxHorarios1;
	}
	public sala[] crearSalasCine() {
		sala[] salasCine= new sala[10];
		for(int i=0;i<10;i++) {			
			salasCine[i]= new sala("sala"+i,crearHorarios(i,"sala"+i,peliculas), "cine");	
		}		
		return salasCine;
	}
	public sala[] crearSalasObra() {
		sala[] salasTeatro= new sala[10];
		for(int i=0;i<10;i++) {			
			salasTeatro[i]= new sala("sala"+i,crearHorarios(i,"sala"+i,obras), "teatro");	
		}		
		return salasTeatro;
	}
	public void crearCine() {		
		
		ARCANE= new cine("ARCANE","Quito Estadio Olímpico",crearSalasCine(),crearSalasObra());
		//print(ARCANE.toString(),1);
		
	}
	public cine getARCANE() {
		return ARCANE;
	}
	public void setARCANE(cine aRCANE) {
		ARCANE = aRCANE;
	}
	public void imprimirSalas(cine ARCANE) {		
		String texto1="", texto2="";
		sala[] salaAuxC= new sala[10];
		sala[] salaAuxT= new sala[10];
		salaAuxC=ARCANE.getSalasVisuales();
		salaAuxT=ARCANE.getSalasTeatro();
		
		for(int i=0;i<salaAuxC.length;i++) {
			texto1=salaAuxC[i].toString();
			//print(texto1,1);		
			archivo.escribir(pathnameS+salaAuxC[i].getNombre()+"_cine.txt", texto1,true);
		}
		for(int i=0;i<salaAuxT.length;i++) {
			texto2=salaAuxT[i].toString();
			//print(texto2,1);
			archivo.escribir(pathnameS+salaAuxT[i].getNombre()+"_obra.txt", texto2,true);
		}
		
		
	}
	//GETTERS AND SETTERS

	public pelicula[] getPeliculas() {
		return peliculas;
	}	

	public void setPeliculas(pelicula[] peliculas) {
		this.peliculas = peliculas;
	}
	
	
	
	
}