package VISTA;

import javax.swing.JPanel;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Scrollable;
public class panel_Cartelera extends JPanel {
	public JLabel lbl_Sirenita;
	public JLabel lbl_Pinocho;
	public JLabel lbl_Saw;
	public JLabel lbl_Rito;
	public JLabel lbl_Exorcista;
	public JLabel lbl_Spiderman;
	public JLabel lbl_senicienta;
	public JLabel lbl_enterrado;
	public JLabel lbl_miex;
	public JLabel lbl_vivo;
	
	/**
	 * Create the panel.
	 */
	public panel_Cartelera() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 544, 503);
		add(panel);
		panel.setLayout(null);
		
		lbl_Sirenita = new JLabel("");
		lbl_Sirenita.setIcon(new ImageIcon(panel_Cartelera.class.getResource("/Iconos/Sirenita.jpeg")));
		lbl_Sirenita.setBounds(10, 38, 88, 126);
		panel.add(lbl_Sirenita);
		
		lbl_Pinocho = new JLabel("");
		lbl_Pinocho.setIcon(new ImageIcon(panel_Cartelera.class.getResource("/Iconos/Pinocho.jpeg")));
		lbl_Pinocho.setBounds(140, 38, 103, 126);
		panel.add(lbl_Pinocho);
		
		lbl_Saw = new JLabel("");
		lbl_Saw.setIcon(new ImageIcon(panel_Cartelera.class.getResource("/Iconos/Saw.jpeg")));
		lbl_Saw.setBounds(280, 38, 103, 126);
		panel.add(lbl_Saw);
		
		lbl_Exorcista = new JLabel("");
		lbl_Exorcista.setIcon(new ImageIcon(panel_Cartelera.class.getResource("/Iconos/Exorcista.jpeg")));
		lbl_Exorcista.setBounds(10, 192, 103, 126);
		panel.add(lbl_Exorcista);
		
		lbl_Spiderman = new JLabel("");
		lbl_Spiderman.setIcon(new ImageIcon(panel_Cartelera.class.getResource("/Iconos/Spiderman.jpeg")));
		lbl_Spiderman.setBounds(140, 192, 103, 126);
		panel.add(lbl_Spiderman);
		
		lbl_senicienta = new JLabel("");
		lbl_senicienta.setIcon(new ImageIcon(panel_Cartelera.class.getResource("/Iconos/Senisienta.jpeg")));
		lbl_senicienta.setBounds(280, 192, 103, 126);
		panel.add(lbl_senicienta);
		
		lbl_Rito = new JLabel("");
		lbl_Rito.setIcon(new ImageIcon(panel_Cartelera.class.getResource("/Iconos/Rito.jpeg")));
		lbl_Rito.setBounds(410, 38, 103, 126);
		panel.add(lbl_Rito);
		
		lbl_enterrado = new JLabel("");
		lbl_enterrado.setIcon(new ImageIcon(panel_Cartelera.class.getResource("/Iconos/enterrado.jpeg")));
		lbl_enterrado.setBounds(410, 206, 103, 126);
		panel.add(lbl_enterrado);
		
		lbl_miex = new JLabel("");
		lbl_miex.setIcon(new ImageIcon(panel_Cartelera.class.getResource("/Iconos/Dedidaca_a_mi_ex.jpeg")));
		lbl_miex.setBounds(89, 329, 103, 126);
		panel.add(lbl_miex);
		
		lbl_vivo = new JLabel("");
		lbl_vivo.setIcon(new ImageIcon(panel_Cartelera.class.getResource("/Iconos/Vivo.jpeg")));
		lbl_vivo.setBounds(280, 329, 88, 126);
		panel.add(lbl_vivo);

	}

}
