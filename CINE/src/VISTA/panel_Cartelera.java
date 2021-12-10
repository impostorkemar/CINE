package VISTA;

import javax.swing.JPanel;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Scrollable;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class panel_Cartelera extends JPanel {
	public JLabel lbl_sirenita;
	public JLabel lbl_miex;
	public JLabel lbl_rito;
	public JLabel lbl_vivo;
	public JLabel lbl_spiderman;
	public JLabel lbl_enterrado;
	public JLabel lbl_saw;
	public JLabel lbl_exorcista;
	public JLabel lbl_senicienta;
	public JLabel lbl_pinocho;
	
	public JLabel [] aux= new JLabel[10];
	private JButton btn_menu;
	private panel_menu panel_menu;
	
	/**
	 * Create the panel.
	 */
	public panel_Cartelera() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1024, 800);
		add(panel);
		panel.setLayout(null);
		
		lbl_sirenita = new JLabel("");
		lbl_sirenita.setHorizontalTextPosition(SwingConstants.CENTER);
		lbl_sirenita.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_sirenita.setIcon(new ImageIcon(panel_Cartelera.class.getResource("/Iconos/Sirenita.jpeg")));
		lbl_sirenita.setBounds(31, 26, 117, 167);
		panel.add(lbl_sirenita);
		
		lbl_miex = new JLabel("");
		lbl_miex.setHorizontalTextPosition(SwingConstants.CENTER);
		lbl_miex.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_miex.setIcon(new ImageIcon(panel_Cartelera.class.getResource("/Iconos/Dedidaca_a_mi_ex.jpeg")));
		lbl_miex.setBounds(166, 26, 128, 167);
		panel.add(lbl_miex);
		
		lbl_rito = new JLabel("");
		lbl_rito.setHorizontalTextPosition(SwingConstants.CENTER);
		lbl_rito.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_rito.setIcon(new ImageIcon(panel_Cartelera.class.getResource("/Iconos/Rito.jpeg")));
		lbl_rito.setBounds(304, 26, 117, 167);
		panel.add(lbl_rito);
		
		lbl_spiderman = new JLabel("");
		lbl_spiderman.setHorizontalTextPosition(SwingConstants.CENTER);
		lbl_spiderman.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_spiderman.setIcon(new ImageIcon(panel_Cartelera.class.getResource("/Iconos/Spiderman.jpeg")));
		lbl_spiderman.setBounds(31, 204, 117, 167);
		panel.add(lbl_spiderman);
		
		lbl_enterrado = new JLabel("");
		lbl_enterrado.setHorizontalTextPosition(SwingConstants.CENTER);
		lbl_enterrado.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_enterrado.setIcon(new ImageIcon(panel_Cartelera.class.getResource("/Iconos/enterrado.jpeg")));
		lbl_enterrado.setBounds(176, 204, 117, 167);
		panel.add(lbl_enterrado);
		
		lbl_saw = new JLabel("");
		lbl_saw.setHorizontalTextPosition(SwingConstants.CENTER);
		lbl_saw.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_saw.setIcon(new ImageIcon(panel_Cartelera.class.getResource("/Iconos/Saw.jpeg")));
		lbl_saw.setBounds(314, 204, 117, 167);
		panel.add(lbl_saw);
		
		lbl_vivo = new JLabel("");
		lbl_vivo.setHorizontalTextPosition(SwingConstants.CENTER);
		lbl_vivo.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_vivo.setIcon(new ImageIcon(panel_Cartelera.class.getResource("/Iconos/Vivo.jpeg")));
		lbl_vivo.setBounds(460, 26, 117, 167);
		panel.add(lbl_vivo);
		
		lbl_exorcista = new JLabel("");
		lbl_exorcista.setHorizontalTextPosition(SwingConstants.CENTER);
		lbl_exorcista.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_exorcista.setIcon(new ImageIcon(panel_Cartelera.class.getResource("/Iconos/Exorcista.jpeg")));
		lbl_exorcista.setBounds(599, 26, 117, 167);
		panel.add(lbl_exorcista);
		
		lbl_senicienta = new JLabel("");
		lbl_senicienta.setHorizontalTextPosition(SwingConstants.CENTER);
		lbl_senicienta.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_senicienta.setIcon(new ImageIcon(panel_Cartelera.class.getResource("/Iconos/Senisienta.jpeg")));
		lbl_senicienta.setBounds(609, 204, 133, 167);
		panel.add(lbl_senicienta);
		
		lbl_pinocho = new JLabel("");
		lbl_pinocho.setHorizontalTextPosition(SwingConstants.CENTER);
		lbl_pinocho.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_pinocho.setIcon(new ImageIcon(panel_Cartelera.class.getResource("/Iconos/Pinocho.jpg")));
		lbl_pinocho.setBounds(460, 204, 117, 167);
		panel.add(lbl_pinocho);
		
		btn_menu = new JButton("MENU");
		btn_menu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				panel_menu= new panel_menu();
				panel_menu.setBounds(0, 0, 1024, 800);
				add(panel_menu);
			}
		});
		btn_menu.setBounds(454, 382, 109, 32);
		panel.add(btn_menu);
		
		for(int i=0;i<10;i++) {
			aux[i]= new JLabel("");
		}
		aux[0].setIcon(new ImageIcon(panel_Cartelera.class.getResource("/Iconos/Sirenita.jpeg")));
		aux[1].setIcon(new ImageIcon(panel_Cartelera.class.getResource("/Iconos/Pinocho.jpg")));
		aux[2].setIcon(new ImageIcon(panel_Cartelera.class.getResource("/Iconos/Saw.jpeg")));
		aux[3].setIcon(new ImageIcon(panel_Cartelera.class.getResource("/Iconos/Exorcista.jpeg")));
		aux[4].setIcon(new ImageIcon(panel_Cartelera.class.getResource("/Iconos/Spiderman.jpeg")));
		aux[5].setIcon(new ImageIcon(panel_Cartelera.class.getResource("/Iconos/Senisienta.jpeg")));
		aux[6].setIcon(new ImageIcon(panel_Cartelera.class.getResource("/Iconos/Rito.jpeg")));
		aux[7].setIcon(new ImageIcon(panel_Cartelera.class.getResource("/Iconos/enterrado.jpeg")));
		aux[8].setIcon(new ImageIcon(panel_Cartelera.class.getResource("/Iconos/Dedidaca_a_mi_ex.jpeg")));
		aux[9].setIcon(new ImageIcon(panel_Cartelera.class.getResource("/Iconos/Vivo.jpeg")));

	}
}
