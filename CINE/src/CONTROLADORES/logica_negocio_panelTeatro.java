package CONTROLADORES;

import MODELO.pelicula;
import VISTA.panel_cine;
import VISTA.panel_teatro;
import patron_generico_g2.configurable;

public class logica_negocio_panelTeatro implements configurable {
	private panel_teatro pt;
	private pelicula[] peliculas;
	
	public logica_negocio_panelTeatro(panel_teatro pc_,pelicula[] peliculas_) {
		this.pt= pc_;		
		peliculas= peliculas_;
		cargarPeliculasComboBox();
		
	}
	public void cargarPeliculasComboBox() {
		System.out.println("COmbo: ");
		for(int j=0; j<10;j++) {
			pt.comboBox.addItem(peliculas[j].getDatos().getAtributoT1());			
			//System.out.println(peliculas[j].toString());
		}

	}
	
}
