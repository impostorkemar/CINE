package CONTROLADORES;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import MODELO.cine;
import MODELO.pelicula;
import VISTA.panel_Cartelera;
import VISTA.panel_cine;
import VISTA.panel_teatro;
import patron_generico_g2.configurable;

public class logica_negocio_panelTeatro implements configurable {
	private cine ARCANE;
	private panel_teatro pt;
	private pelicula[] peliculas;
	private panel_Cartelera pcc;
	private JLabel[] auxi;
	
	public logica_negocio_panelTeatro(panel_teatro pc_,pelicula[] peliculas_) {
		this.pt= pc_;
		auxi= new JLabel[10];
	}
	public logica_negocio_panelTeatro(panel_teatro pc_,pelicula[] peliculas_,cine ARCANE_) {
		this.ARCANE=ARCANE_;
		auxi= new JLabel[10];
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
			if(pt.txt_nombre.getText().toString().equals("La sirenita")) {
				pt.lbl_fotos.setIcon(new ImageIcon(panel_Cartelera.class.getResource("/Iconos/Sirenita.jpeg")));
			}else if(pt.txt_nombre.getText().toString().equals("Pinocho")) {
				pt.lbl_fotos.setIcon(new ImageIcon(panel_Cartelera.class.getResource("/Iconos/Pinocho.jpg")));
			}else if(pt.txt_nombre.getText().toString().equals("SAW")) {
				pt.lbl_fotos.setIcon(new ImageIcon(panel_Cartelera.class.getResource("/Iconos/Saw.jpeg")));
			}else if(pt.txt_nombre.getText().toString().equals("El exorcista")) {
				pt.lbl_fotos.setIcon(new ImageIcon(panel_Cartelera.class.getResource("/Iconos/Exorcista.jpeg")));
			}else if(pt.txt_nombre.getText().toString().equals("SPIDERMAN NO WAY HOME")) {
				pt.lbl_fotos.setIcon(new ImageIcon(panel_Cartelera.class.getResource("/Iconos/Spiderman.jpeg")));
			}else if(pt.txt_nombre.getText().toString().equals("La senicienta")) {
				pt.lbl_fotos.setIcon(new ImageIcon(panel_Cartelera.class.getResource("/Iconos/Senisienta.jpeg")));
			}else if(pt.txt_nombre.getText().toString().equals("El rito")) {
				pt.lbl_fotos.setIcon(new ImageIcon(panel_Cartelera.class.getResource("/Iconos/Rito.jpeg")));
			}else if(pt.txt_nombre.getText().toString().equals("Enterrada")) {
				pt.lbl_fotos.setIcon(new ImageIcon(panel_Cartelera.class.getResource("/Iconos/enterrado.jpeg")));
			}else if(pt.txt_nombre.getText().toString().equals("ENCHUFETV")) {
				pt.lbl_fotos.setIcon(new ImageIcon(panel_Cartelera.class.getResource("/Iconos/Dedidaca_a_mi_ex.jpeg")));
			}else if(pt.txt_nombre.getText().toString().equals("Vivo")) {
				pt.lbl_fotos.setIcon(new ImageIcon(panel_Cartelera.class.getResource("/Iconos/Vivo.jpeg")));
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
