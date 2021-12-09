package CONTROLADORES;

import MODELO.cine;
import MODELO.pelicula;
import VISTA.panel_cine;
import VISTA.panel_teatro;
import patron_generico_g2.configurable;

public class logica_negocio_panelTeatro implements configurable {
	private cine ARCANE;
	private panel_teatro pt;
	private pelicula[] peliculas;
	
	public logica_negocio_panelTeatro(panel_teatro pc_,pelicula[] peliculas_,cine ARCANE_) {
		this.ARCANE=ARCANE_;
		this.pt= pc_;		
		peliculas= peliculas_;
		cargarPeliculasComboBox();
		
	}
	public void cargarPeliculasComboBox() {
		//System.out.println("COmbo: ");
		for(int j=0; j<10;j++) {
			pt.comboBox.addItem(peliculas[j].getDatos().getAtributoT1());			
			//System.out.println(peliculas[j].toString());
		}

	}
	public void cargarInformacionPanelDetalles() {
		for(int j=0; j<10;j++) {			
			if(pt.comboBox.getSelectedItem().toString().equals(peliculas[j].getDatos().getAtributoT1())) {
				pt.txt_nombre.setText(peliculas[j].getDatos().getAtributoT1());
				if(Boolean.valueOf(peliculas[j].getDatos().getAtributoS1())==false)
					pt.txt_censura.setText("NO");
				else if((Boolean.valueOf(peliculas[j].getDatos().getAtributoS1())==true)) 
					pt.txt_censura.setText("SI");					
				pt.txt_genero.setText(peliculas[j].getDatos().getAtributoT2());
				pt.txtA_sinapsis.setText(peliculas[j].getDatos().getAtributoT3());
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
