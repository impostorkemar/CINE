package VISTA;

import javax.swing.JPanel;

import CONTROLADORES.logica_negocio;
import MODELO.cine;

import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;

public class panel_menu extends JPanel {
	private JButton btn_cine;
	private JPanel panel_menu;
	private JButton btn_teatro;
	private JPanel panel_teatro;
	private panel_cine panel_cine;
	private panel_Cartelera panel_cartelera;
	private logica_negocio ln;
	/**
	 * Create the panel.
	 */
	public panel_menu(cine ARCANE) {
		setLayout(null);
		
		panel_menu = new JPanel();
		panel_menu.setBackground(new Color(30, 144, 255));
		panel_menu.setBounds(0, 0, 1024, 800);
		add(panel_menu);
		panel_menu.setLayout(null);
		
		btn_cine = new JButton("CINE");
		btn_cine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setLayout(null);
				panel_menu.setVisible(false);
				panel_cine= new panel_cine(ln.getPeliculas(),ln.getARCANE());
				panel_cine.setBounds(0, 0, 1024, 800);
				add(panel_cine);				
				
			}
		});
		btn_cine.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btn_cine.setBounds(57, 33, 327, 79);
		panel_menu.add(btn_cine);
		
		btn_teatro = new JButton("TEATRO");
		btn_teatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setLayout(null);
				panel_menu.setVisible(false);
				panel_teatro= new panel_teatro(ln.getPeliculas(),ln.getARCANE());
				panel_teatro.setBounds(0, 0, 1024, 800);
				add(panel_teatro);
			}
		});
		btn_teatro.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btn_teatro.setBounds(57, 143, 327, 79);
		panel_menu.add(btn_teatro);
		
		JButton btn_cartelera = new JButton("CARTELERA");
		btn_cartelera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setLayout(null);
				panel_menu.setVisible(false);
				panel_cartelera= new panel_Cartelera(ARCANE);
				panel_cartelera.setBounds(0, 0, 1024, 800);
				add(panel_cartelera);
			}
		});
		btn_cartelera.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btn_cartelera.setBounds(57, 255, 327, 79);
		panel_menu.add(btn_cartelera);

		ln= new logica_negocio(this,ARCANE);
	}
}
