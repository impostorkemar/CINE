package VISTA;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;

public class cine extends JPanel {
	private JPanel panel_cine;
	private JPanel panel;
	private JButton btn_menu_1;
	private JPanel panel_datos;

	/**
	 * Create the panel.
	 */
	public cine() {
		setLayout(null);
		
		panel_cine = new JPanel();
		panel_cine.setBackground(new Color(192, 192, 192));
		panel_cine.setBounds(10, 11, 366, 479);
		add(panel_cine);
		panel_cine.setLayout(null);
		
		JButton btn_menu = new JButton("MENU");
		btn_menu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_cine.setVisible(false);
				panel= new JPanel();
				panel.setBounds(10, 11, 829, 493);
				add(panel);
			}
		});
		btn_menu.setBounds(258, 379, 89, 23);
		panel_cine.add(btn_menu);
		
		JButton btn_menu_4 = new JButton("DETALLE");
		btn_menu_4.setBounds(258, 334, 89, 23);
		panel_cine.add(btn_menu_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(39, 23, 308, 22);
		panel_cine.add(comboBox);
		
		btn_menu_1 = new JButton("COMPRAR");
		btn_menu_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_cine.setVisible(false);
				panel_datos= new JPanel();
				panel_datos.setBounds(10, 11, 439, 468);
				add(panel_datos);
			}
		});
		btn_menu_1.setBounds(152, 379, 96, 23);
		panel_cine.add(btn_menu_1);

	}
}
