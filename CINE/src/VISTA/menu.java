package VISTA;

import javax.swing.JPanel;



import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class menu extends JPanel {
	private JButton btn_cine;
	private JPanel panel;
	private JButton btn_teatro;
	private JPanel panel_teatro;
	private JPanel panel_cine;

	/**
	 * Create the panel.
	 */
	public menu() {
		setLayout(null);
		
		panel = new JPanel();
		panel.setBackground(new Color(30, 144, 255));
		panel.setBounds(10, 11, 829, 493);
		add(panel);
		panel.setLayout(null);
		
		btn_cine = new JButton("CINE");
		btn_cine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				panel_cine= new cine();
				panel_cine.setBounds(20, -30, 800, 500);
				add(panel_cine);
			}
		});
		btn_cine.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btn_cine.setBounds(51, 76, 327, 79);
		panel.add(btn_cine);
		
		btn_teatro = new JButton("TEATRO");
		btn_teatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(false);
				panel_teatro= new teatro();
				panel_teatro.setBounds(10, 11, 355, 460);
				add(panel_teatro);
			}
		});
		btn_teatro.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		btn_teatro.setBounds(51, 220, 327, 79);
		panel.add(btn_teatro);

	}
}