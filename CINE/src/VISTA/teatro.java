package VISTA;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;

public class teatro extends JPanel {
	private JPanel panel_teatro;
	private JPanel panel;
	private JPanel panel_datos;
	
	/**
	 * Create the panel.
	 */
	public teatro() {
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
				panel= new JPanel();
				panel.setBounds(10, 11, 829, 493);
				add(panel);
			}
		});
		btn_menu.setBounds(254, 347, 89, 23);
		panel_teatro.add(btn_menu);
		
		JButton btn_detalle3 = new JButton("DETALLE");
		btn_detalle3.setBounds(254, 305, 89, 23);
		panel_teatro.add(btn_detalle3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(36, 31, 301, 22);
		panel_teatro.add(comboBox);
		
		JButton btn_comprar = new JButton("COMPRAR");
		btn_comprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_teatro.setVisible(false);
				panel_datos= new JPanel();
				panel_datos.setBounds(10, 11, 439, 468);
				add(panel_datos);
			}
		});
		btn_comprar.setBounds(162, 347, 89, 23);
		panel_teatro.add(btn_comprar);

	}
}