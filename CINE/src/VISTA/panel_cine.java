package VISTA;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

import CONTROLADORES.logica_negocio_panelCine;
import CONTROLADORES.logica_negocio;
import MODELO.pelicula;

import javax.swing.JComboBox;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JCheckBox;

public class panel_cine extends JPanel {
	private JPanel panel_cine;
	private JPanel panel_menu;
	private JButton btn_menu_1;
	private JPanel panel_datos;	
	public JComboBox comboBox;
	public JPanel panel_detalles;
	private JLabel lbl_nombre;
	private JLabel lbl_genero;
	private JLabel lbl_censura;
	private JLabel lbl_sinapsis;
	public JTextField txt_nombre;
	public JTextField txt_genero;
	public JTextField txt_censura;
	public JTextArea txtA_sinapsis;
	private logica_negocio_panelCine c_pc;
	private JButton btn_detalles;
	
	/**
	 * Create the panel.
	 */
	public panel_cine(pelicula[] peliculas) {
		setLayout(null);
		
		panel_cine = new JPanel();
		panel_cine.setBackground(new Color(192, 192, 192));
		panel_cine.setBounds(10, 11, 434, 107);
		add(panel_cine);
		panel_cine.setLayout(null);
		
		JButton btn_menu = new JButton("MENU");
		btn_menu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setLayout(null);
				panel_cine.setVisible(false);
				panel_detalles.setVisible(false);
				panel_menu= new panel_menu();
				panel_menu.setBounds(20, -30, 800, 500);
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
				panel_detalles.setVisible(false);
				panel_datos= new panel_compra(peliculas, comboBox.getSelectedItem().toString(),"cine");
				panel_datos.setBounds(10, 11, 439, 468);
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
		
		
		panel_detalles = new JPanel();
		panel_detalles.setBounds(20, 129, 423, 296);
		add(panel_detalles);
		panel_detalles.setLayout(null);
		
		lbl_nombre = new JLabel("NOMBRE");
		lbl_nombre.setBounds(10, 28, 70, 14);
		panel_detalles.add(lbl_nombre);
		
		lbl_genero = new JLabel("GENERO");
		lbl_genero.setBounds(10, 53, 70, 14);
		panel_detalles.add(lbl_genero);
		
		lbl_censura = new JLabel("MAYORES DE 18");
		lbl_censura.setBounds(10, 82, 101, 14);
		panel_detalles.add(lbl_censura);
		
		lbl_sinapsis = new JLabel("SINAPSIS");
		lbl_sinapsis.setBounds(10, 120, 70, 14);
		panel_detalles.add(lbl_sinapsis);
		
		txt_nombre = new JTextField();
		txt_nombre.setEditable(false);
		txt_nombre.setBounds(121, 25, 270, 20);
		panel_detalles.add(txt_nombre);
		txt_nombre.setColumns(10);
		
		txt_genero = new JTextField();
		txt_genero.setEditable(false);
		txt_genero.setColumns(10);
		txt_genero.setBounds(121, 53, 270, 20);
		panel_detalles.add(txt_genero);
		
		txt_censura = new JTextField();
		txt_censura.setEditable(false);
		txt_censura.setColumns(10);
		txt_censura.setBounds(121, 79, 270, 20);
		panel_detalles.add(txt_censura);
		
		txtA_sinapsis = new JTextArea();
		txtA_sinapsis.setEditable(false);
		txtA_sinapsis.setBounds(121, 115, 270, 36);
		panel_detalles.add(txtA_sinapsis);
		
		c_pc= new logica_negocio_panelCine(this, peliculas);
	}
}