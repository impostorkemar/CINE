package VISTA;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

import CONTROLADORES.logica_negocio_panelTeatro;
import MODELO.pelicula;

import javax.swing.JComboBox;

public class panel_teatro extends JPanel {
	private JPanel panel_teatro;
	private JPanel panel_menu;
	private JPanel panel_datos;
	public JComboBox comboBox;
	
	private logica_negocio_panelTeatro t_pc;
	
	/**
	 * Create the panel.
	 */
	public panel_teatro(pelicula[] peliculas) {
		setLayout(null);
		
		panel_teatro = new JPanel();
		panel_teatro.setBackground(new Color(245, 222, 179));
		panel_teatro.setBounds(10, 11, 355, 460);
		add(panel_teatro);
		panel_teatro.setLayout(null);
		
		JButton btn_menu = new JButton("MENU");
		btn_menu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_teatro.setVisible(false);
				panel_menu= new panel_menu();
				panel_menu.setBounds(10, 11, 829, 493);
				add(panel_menu);
			}
		});
		btn_menu.setBounds(254, 347, 89, 23);
		panel_teatro.add(btn_menu);
		
		JButton btn_detalle3 = new JButton("DETALLE");
		btn_detalle3.setBounds(254, 305, 89, 23);
		panel_teatro.add(btn_detalle3);
		
		comboBox = new JComboBox();
		comboBox.setBounds(36, 31, 301, 22);
		panel_teatro.add(comboBox);
		
		JButton btn_comprar = new JButton("COMPRAR");
		btn_comprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_teatro.setVisible(false);
				panel_datos= new panel_compra(peliculas,comboBox.getSelectedItem().toString(),"teatro");
				panel_datos.setBounds(10, 11, 439, 468);
				add(panel_datos);
			}
		});
		btn_comprar.setBounds(162, 347, 89, 23);
		panel_teatro.add(btn_comprar);
		
		t_pc= new logica_negocio_panelTeatro(this, peliculas);
		
	}
}
