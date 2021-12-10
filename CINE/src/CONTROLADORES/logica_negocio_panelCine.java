package CONTROLADORES;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

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
	private JLabel[] auxi;
	
	public logica_negocio_panelCine(panel_cine pc_,pelicula[] peliculas_) {
		this.pc= pc_;			
		auxi= new JLabel[10];
	}
	public logica_negocio_panelCine(panel_cine pc_,pelicula[] peliculas_, cine ARCANE_) {
		this.ARCANE=ARCANE_;
		auxi= new JLabel[10];
		this.pc= pc_;			
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
	
			if(pc.txt_nombre.getText().toString().equals("La sirenita")) {
				pc.lbl_fotos.setIcon(new ImageIcon(panel_Cartelera.class.getResource("/Iconos/Sirenita.jpeg")));
			}else if(pc.txt_nombre.getText().toString().equals("Pinocho")) {
				pc.lbl_fotos.setIcon(new ImageIcon(panel_Cartelera.class.getResource("/Iconos/Pinocho.jpg")));
			}else if(pc.txt_nombre.getText().toString().equals("SAW")) {
				pc.lbl_fotos.setIcon(new ImageIcon(panel_Cartelera.class.getResource("/Iconos/Saw.jpeg")));
			}else if(pc.txt_nombre.getText().toString().equals("El exorcista")) {
				pc.lbl_fotos.setIcon(new ImageIcon(panel_Cartelera.class.getResource("/Iconos/Exorcista.jpeg")));
			}else if(pc.txt_nombre.getText().toString().equals("SPIDERMAN NO WAY HOME")) {
				pc.lbl_fotos.setIcon(new ImageIcon(panel_Cartelera.class.getResource("/Iconos/Spiderman.jpeg")));
			}else if(pc.txt_nombre.getText().toString().equals("La senicienta")) {
				pc.lbl_fotos.setIcon(new ImageIcon(panel_Cartelera.class.getResource("/Iconos/Senisienta.jpeg")));
			}else if(pc.txt_nombre.getText().toString().equals("El rito")) {
				pc.lbl_fotos.setIcon(new ImageIcon(panel_Cartelera.class.getResource("/Iconos/Rito.jpeg")));
			}else if(pc.txt_nombre.getText().toString().equals("Enterrada")) {
				pc.lbl_fotos.setIcon(new ImageIcon(panel_Cartelera.class.getResource("/Iconos/enterrado.jpeg")));
			}else if(pc.txt_nombre.getText().toString().equals("ENCHUFETV")) {
				pc.lbl_fotos.setIcon(new ImageIcon(panel_Cartelera.class.getResource("/Iconos/Dedidaca_a_mi_ex.jpeg")));
			}else if(pc.txt_nombre.getText().toString().equals("Vivo")) {
				pc.lbl_fotos.setIcon(new ImageIcon(panel_Cartelera.class.getResource("/Iconos/Vivo.jpeg")));
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
