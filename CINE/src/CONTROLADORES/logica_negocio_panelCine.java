package CONTROLADORES;

import MODELO.cine;
import MODELO.pelicula;
import VISTA.panel_cine;
import VISTA.panel_menu;
import patron_generico_g2.archivos;
import patron_generico_g2.configurable;

public class logica_negocio_panelCine implements configurable {
	private panel_cine pc;
	private pelicula[] peliculas;
	
	public logica_negocio_panelCine(panel_cine pc_,pelicula[] peliculas_) {
		this.pc= pc_;		
		peliculas= peliculas_;
		cargarPeliculasComboBox();
		
	}
	public void cargarPeliculasComboBox() {
		System.out.println("COmbo: ");
		for(int j=0; j<10;j++) {
			pc.comboBox.addItem(peliculas[j].getDatos().getAtributoT1());			
			//System.out.println(peliculas[j].toString());
		}

	}
	
}
