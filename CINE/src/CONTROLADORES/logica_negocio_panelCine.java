package CONTROLADORES;

import MODELO.cine;
import MODELO.pelicula;
import VISTA.panel_Cartelera;
import VISTA.panel_cine;
import VISTA.panel_menu;
import patron_generico_g2.archivos;
import patron_generico_g2.configurable;

public class logica_negocio_panelCine implements configurable {
	private cine ARCANE;
	private panel_cine pc;	
	private pelicula[] peliculas;
	private panel_Cartelera pcc;
	
<<<<<<< HEAD
	public logica_negocio_panelCine(panel_cine pc_,pelicula[] peliculas_) {
		this.pc= pc_;	
		this.pcc=pcc;
=======
	public logica_negocio_panelCine(panel_cine pc_,pelicula[] peliculas_, cine ARCANE_) {
		this.ARCANE=ARCANE_;
		this.pc= pc_;		
>>>>>>> 1083b846ae5b2a44d20fd58e358d0a440802ecac
		peliculas= peliculas_;
		cargarPeliculasComboBox();
		//pc.panel_detallesFuncion.setVisible(false);	
	}
	public void cargarPeliculasComboBox() {
		//System.out.println("COmbo: ");
		for(int j=0; j<10;j++) {
			pc.comboBox.addItem(peliculas[j].getDatos().getAtributoT1());
			//System.out.println(peliculas[j].toString());
		}
	}
	
	public void cargarInformacionPanelDetalles() {
		for(int j=0; j<10;j++) {		
			
			if(pc.comboBox.getSelectedItem().toString().equals(peliculas[j].getDatos().getAtributoT1())) {
				pc.txt_nombre.setText(peliculas[j].getDatos().getAtributoT1());
				//print("censura: "+peliculas[j].getDatos().getAtributoS1(),1);
				if(Boolean.valueOf(peliculas[j].getDatos().getAtributoS1())==false)
					pc.txt_censura.setText("NO");
				else if((Boolean.valueOf(peliculas[j].getDatos().getAtributoS1())==true)) 
					pc.txt_censura.setText("SI");				
				pc.txt_genero.setText(peliculas[j].getDatos().getAtributoT2());
				pc.txtA_sinapsis.setText(peliculas[j].getDatos().getAtributoT3());
			}
		}
		
	}
	public cine getARCANE() {
		return ARCANE;
	}
	public void setARCANE(cine aRCANE) {
		ARCANE = aRCANE;
	}
	
	
}
