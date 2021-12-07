package VISTA;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.SwingConstants;

public class panel_inicio extends JPanel {
	public JLabel lbl_segundos;
	public JLabel lbl_minutos;

	/**
	 * Create the panel.
	 */
	public panel_inicio() {
		setLayout(null);
		
		JPanel panel_inicio = new JPanel();
		panel_inicio.setBounds(10, 11, 314, 375);
		add(panel_inicio);
		panel_inicio.setLayout(null);
		
		JLabel lbl_minutos = new JLabel("0");
		lbl_minutos.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_minutos.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbl_minutos.setBounds(80, 134, 61, 51);
		panel_inicio.add(lbl_minutos);
		
		lbl_segundos = new JLabel("0");
		lbl_segundos.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_segundos.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbl_segundos.setBounds(161, 134, 61, 51);
		panel_inicio.add(lbl_segundos);
		
		lbl_segundos = new JLabel("0");
		lbl_segundos.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_segundos.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbl_segundos.setBounds(161, 134, 61, 51);
		panel_inicio.add(lbl_segundos);

	}
}
