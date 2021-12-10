package VISTA;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

import CONTROLADORES.logica_negocio_panelTeatro;
import MODELO.cine;
import MODELO.pelicula;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class panel_teatro extends JPanel {
	private JPanel panel_teatro;
	private JPanel panel_menu;
	private JPanel panel_datos;
	public JComboBox comboBox;
	
	private logica_negocio_panelTeatro t_pc;
	public JTextField txt_censura;
	public JTextArea txtA_sinapsis;
	public JTextField txt_genero;
	public JTextField txt_nombre;
	public JLabel lbl_fotos;
	
	/**
	 * Create the panel.
	 */
	public panel_teatro(pelicula[] peliculas, cine ARCANE) {
		setLayout(null);
		
		panel_teatro = new JPanel();
		panel_teatro.setBackground(new Color(245, 222, 179));
		panel_teatro.setBounds(0, 0, 1024, 800);
		add(panel_teatro);
		panel_teatro.setLayout(null);
		
		JButton btn_menu = new JButton("MENU");
		btn_menu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_teatro.setVisible(false);
			//	panel_detalles.setVisible(false);
				panel_menu= new panel_menu(ARCANE);
				panel_menu.setBounds(0, 0, 1024, 800);
				add(panel_menu);
			}
		});
		btn_menu.setBounds(237, 64, 89, 23);
		panel_teatro.add(btn_menu);
		
		JButton btn_detalle3 = new JButton("DETALLE");
		btn_detalle3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t_pc.cargarInformacionPanelDetalles();
			}
		});
		btn_detalle3.setBounds(21, 64, 89, 23);
		panel_teatro.add(btn_detalle3);
		
		comboBox = new JComboBox();
		comboBox.setBounds(36, 31, 301, 22);
		panel_teatro.add(comboBox);
		
		JButton btn_comprar = new JButton("COMPRAR");
		btn_comprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel_teatro.setVisible(false);
			//	panel_detalles.setVisible(false);
				panel_datos= new panel_compra(peliculas,comboBox.getSelectedItem().toString(),"teatro",ARCANE);
				panel_datos.setBounds(0, 0, 1024, 800);
				add(panel_datos);
			}
		});
		btn_comprar.setBounds(121, 64, 106, 23);
		panel_teatro.add(btn_comprar);
		
		JLabel lbl_nombre = new JLabel("NOMBRE");
		lbl_nombre.setBounds(10, 117, 70, 14);
		panel_teatro.add(lbl_nombre);
		
		txt_nombre = new JTextField();
		txt_nombre.setEditable(false);
		txt_nombre.setColumns(10);
		txt_nombre.setBounds(121, 114, 270, 20);
		panel_teatro.add(txt_nombre);
		
		JLabel lbl_genero = new JLabel("GENERO");
		lbl_genero.setBounds(10, 142, 70, 14);
		panel_teatro.add(lbl_genero);
		
		txt_genero = new JTextField();
		txt_genero.setEditable(false);
		txt_genero.setColumns(10);
		txt_genero.setBounds(121, 142, 270, 20);
		panel_teatro.add(txt_genero);
		
		JLabel lbl_censura = new JLabel("MAYORES DE 18");
		lbl_censura.setBounds(10, 171, 101, 14);
		panel_teatro.add(lbl_censura);
		
		txt_censura = new JTextField();
		txt_censura.setEditable(false);
		txt_censura.setColumns(10);
		txt_censura.setBounds(121, 168, 270, 20);
		panel_teatro.add(txt_censura);
		
		JLabel lbl_sinapsis = new JLabel("SINAPSIS");
		lbl_sinapsis.setBounds(10, 209, 70, 14);
		panel_teatro.add(lbl_sinapsis);
		
		txtA_sinapsis = new JTextArea();
		txtA_sinapsis.setEditable(false);
		txtA_sinapsis.setBounds(121, 204, 270, 36);
		panel_teatro.add(txtA_sinapsis);
		
		lbl_fotos = new JLabel("");
		lbl_fotos.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_fotos.setBounds(167, 285, 128, 167);
		panel_teatro.add(lbl_fotos);
		
		t_pc= new logica_negocio_panelTeatro(this, peliculas,ARCANE);
		
		
		
	}
}
