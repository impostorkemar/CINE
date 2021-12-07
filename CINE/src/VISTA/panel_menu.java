package VISTA;

import javax.swing.JPanel;

import CONTROLADORES.logica_negocio;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class panel_menu extends JPanel {
	private JButton btn_cine;
	private JPanel panel_menu;
	private JButton btn_teatro;
	private JPanel panel_teatro;
	private panel_cine panel_cine;

	private logica_negocio ln;
	/**
	 * Create the panel.
	 */
	public panel_menu() {
		setLayout(null);
		
		panel_menu = new JPanel();
		panel_menu.setBackground(new Color(30, 144, 255));
		panel_menu.setBounds(10, 11, 829, 493);
		add(panel_menu);
		panel_menu.setLayout(null);
		
		btn_cine = new JButton("CINE");
		btn_cine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_menu.setVisible(false);
				panel_cine= new panel_cine(ln.getPeliculas());
				panel_cine.setBounds(20, -30, 800, 500);
				add(panel_cine);				
				
			}
		});
		btn_cine.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btn_cine.setBounds(51, 76, 327, 79);
		panel_menu.add(btn_cine);
		
		btn_teatro = new JButton("TEATRO");
		btn_teatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_menu.setVisible(false);
				panel_teatro= new panel_teatro(ln.getPeliculas());
				panel_teatro.setBounds(10, 11, 355, 460);
				add(panel_teatro);
			}
		});
		btn_teatro.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btn_teatro.setBounds(51, 220, 327, 79);
		panel_menu.add(btn_teatro);

		ln= new logica_negocio(this);
	}
}
