package VISTA;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

import CONTROLADORES.logica_negocio_panelCine;
import CONTROLADORES.logica_negocio;
import MODELO.cine;
import MODELO.pelicula;

import javax.swing.JComboBox;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;

public class panel_cine extends JPanel {
	private JPanel panel_cine;
	private JPanel panel_menu;
	private JButton btn_menu_1;
	private JPanel panel_datos;	
	public JComboBox comboBox;
	private logica_negocio_panelCine c_pc;
	private JButton btn_detalles;
	private panel_Cartelera pcc;
	private JLabel[] auxi;
	public JTextField txt_nombre;
	public JTextField txt_genero;
	public JTextField txt_censura;
	public JTextArea txtA_sinapsis;
	public JLabel lbl_fotos;
	
	
	
	/**
	 * Create the panel.
	 */
	public panel_cine(pelicula[] peliculas, cine ARCANE) {
		setLayout(null);
		this.pcc= new panel_Cartelera(ARCANE);
		auxi=pcc.aux;
		
		panel_cine = new JPanel();
		panel_cine.setBackground(new Color(192, 192, 192));
		panel_cine.setBounds(0, 0, 1024, 800);
		add(panel_cine);
		panel_cine.setLayout(null);
		
		JButton btn_menu = new JButton("MENU");
		btn_menu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setLayout(null);
				panel_cine.setVisible(false);
			//	panel_detalles.setVisible(false);
				panel_menu= new panel_menu(ARCANE);
				panel_menu.setBounds(0, 0, 1024, 800);
				add(panel_menu);
			}
		});
		btn_menu.setBounds(264, 71, 89, 23);
		panel_cine.add(btn_menu);
		
		comboBox = new JComboBox();
		comboBox.setBounds(39, 23, 308, 22);
		panel_cine.add(comboBox);
		
		btn_menu_1 = new JButton("COMPRAR");
		btn_menu_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setLayout(null);
				panel_cine.setVisible(false);			
				//panel_detalles.setVisible(false);
				panel_datos= new panel_compra(peliculas, comboBox.getSelectedItem().toString(),"cine",ARCANE);
				panel_datos.setBounds(0, 0, 1024, 800);
				add(panel_datos);
			}
		});
		btn_menu_1.setBounds(158, 71, 96, 23);
		panel_cine.add(btn_menu_1);
		
		btn_detalles = new JButton("DETALLES");
		btn_detalles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c_pc.cargarInformacionPanelDetalles();
			}
		});
		btn_detalles.setBounds(39, 71, 109, 23);
		panel_cine.add(btn_detalles);
		
		JLabel lbl_nombre = new JLabel("NOMBRE");
		lbl_nombre.setBounds(39, 131, 70, 14);
		panel_cine.add(lbl_nombre);
		
		JLabel lbl_genero = new JLabel("GENERO");
		lbl_genero.setBounds(39, 156, 70, 14);
		panel_cine.add(lbl_genero);
		
		JLabel lbl_censura = new JLabel("MAYORES DE 18");
		lbl_censura.setBounds(39, 185, 101, 14);
		panel_cine.add(lbl_censura);
		
		JLabel lbl_sinapsis = new JLabel("SINAPSIS");
		lbl_sinapsis.setBounds(39, 223, 70, 14);
		panel_cine.add(lbl_sinapsis);
		
		txt_nombre = new JTextField();
		txt_nombre.setEditable(false);
		txt_nombre.setColumns(10);
		txt_nombre.setBounds(150, 128, 270, 20);
		panel_cine.add(txt_nombre);
		
		txt_genero = new JTextField();
		txt_genero.setEditable(false);
		txt_genero.setColumns(10);
		txt_genero.setBounds(150, 156, 270, 20);
		panel_cine.add(txt_genero);
		
		txt_censura = new JTextField();
		txt_censura.setEditable(false);
		txt_censura.setColumns(10);
		txt_censura.setBounds(150, 182, 270, 20);
		panel_cine.add(txt_censura);
		
		txtA_sinapsis = new JTextArea();
		txtA_sinapsis.setEditable(false);
		txtA_sinapsis.setBounds(150, 218, 270, 36);
		panel_cine.add(txtA_sinapsis);
		
		lbl_fotos = new JLabel("");
		lbl_fotos.setHorizontalTextPosition(SwingConstants.CENTER);
		lbl_fotos.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_fotos.setBounds(167, 285, 128, 167);
		panel_cine.add(lbl_fotos);
		
		c_pc= new logica_negocio_panelCine(this, peliculas,ARCANE);
	}
}