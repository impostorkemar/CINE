package VISTA;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.SwingConstants;

import CONTROLADORES.tiempo;
import MODELO.cine;

import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class panel_inicio extends JPanel {
	public JLabel lbl_segundos;
	public JLabel lbl_minutos;
	private tiempo tiemp;
	private JPanel panel_menu;
	

	/**
	 * Create the panel.
	 */
	public panel_inicio() {
		addMouseListener(new MouseAdapter() {
		});
		setBackground(new Color(169, 169, 169));
		setLayout(null);
		
		JPanel panel_inicio = new JPanel();
		panel_inicio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				panel_inicio.setVisible(false);
				try {
					tiemp= new tiempo();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				cine ARCANE= null;
				panel_menu= new panel_menu(ARCANE);
				
				panel_menu.setBounds(0, 0, 1024, 800);
				add(panel_menu);
			}
		});
		panel_inicio.setBounds(0, 0, 1024, 800);
		add(panel_inicio);
		panel_inicio.setLayout(null);
		
		JLabel lbl_iconito = new JLabel("");
		lbl_iconito.setHorizontalTextPosition(SwingConstants.CENTER);
		lbl_iconito.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_iconito.setBounds(10, 11, 556, 464);
		panel_inicio.add(lbl_iconito);
		lbl_iconito.setIcon(new ImageIcon(panel_inicio.class.getResource("/Iconos/Arkane.jpg")));

	}
}
