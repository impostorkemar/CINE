package VISTA;

import javax.swing.JPanel;

import CONTROLADORES.logica_negocio_panelAsientos;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class panel_asientos extends JPanel {
	private JPanel panel_menu;
	private JButton btn_finalizar;
	
	private logica_negocio_panelAsientos ln_pA;
	public JButton asiento0;

	/**
	 * Create the panel.
	 */
	public panel_asientos() {
		setLayout(null);
		
		JPanel panel_asientos = new JPanel();
		panel_asientos.setBounds(10, 32, 425, 353);
		add(panel_asientos);
		panel_asientos.setLayout(null);
		
		btn_finalizar = new JButton("FINISH");
		btn_finalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*panel_asientos.setVisible(false);
				panel_menu= new panel_menu();
				panel_menu.setBounds(10, 11, 439, 468);
				add(panel_menu);*/
				
			}
		});
		btn_finalizar.setBounds(270, 301, 89, 23);
		panel_asientos.add(btn_finalizar);
		
		asiento0 = new JButton("asiento0");
		asiento0.setForeground(Color.ORANGE);
		asiento0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		asiento0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				asiento0.setBackground(Color.RED);
			}			
			@Override
			public void mouseEntered(MouseEvent e) {
			}
		});
		asiento0.setBackground(Color.ORANGE);
		asiento0.setFont(new Font("Tahoma", Font.PLAIN, 6));
		asiento0.setBounds(0, 11, 35, 23);
		panel_asientos.add(asiento0);
		
		JButton asiento1 = new JButton("asiento1");
		asiento1.setForeground(Color.ORANGE);
		asiento1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				asiento1.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				asiento1.setBackground(Color.ORANGE);
			}
		});
		asiento1.setBackground(Color.ORANGE);
		asiento1.setFont(new Font("Tahoma", Font.PLAIN, 6));
		asiento1.setBounds(37, 11, 35, 23);
		panel_asientos.add(asiento1);
		
		JButton asiento2 = new JButton("1");
		asiento2.setForeground(Color.ORANGE);
		asiento2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				asiento2.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				asiento2.setBackground(Color.ORANGE);
			}
		});
		asiento2.setBackground(Color.ORANGE);
		asiento2.setFont(new Font("Tahoma", Font.PLAIN, 6));
		asiento2.setBounds(74, 11, 35, 23);
		panel_asientos.add(asiento2);
		
		JButton asiento3 = new JButton("1");
		asiento3.setForeground(Color.ORANGE);
		asiento3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				asiento3.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				asiento3.setBackground(Color.ORANGE);
			}
		});
		asiento3.setBackground(Color.ORANGE);
		asiento3.setFont(new Font("Tahoma", Font.PLAIN, 6));
		asiento3.setBounds(113, 9, 35, 23);
		panel_asientos.add(asiento3);
		
		JButton asiento4 = new JButton("1");
		asiento4.setForeground(Color.ORANGE);
		asiento4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				asiento4.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				asiento4.setBackground(Color.ORANGE);
			}
		});
		asiento4.setBackground(Color.ORANGE);
		asiento4.setFont(new Font("Tahoma", Font.PLAIN, 6));
		asiento4.setBounds(151, 11, 35, 23);
		panel_asientos.add(asiento4);
		
		JButton asiento5 = new JButton("1");
		asiento5.setForeground(Color.ORANGE);
		asiento5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				asiento5.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				asiento5.setBackground(Color.ORANGE);
			}
		});
		asiento5.setBackground(Color.ORANGE);
		asiento5.setFont(new Font("Tahoma", Font.PLAIN, 6));
		asiento5.setBounds(190, 11, 35, 23);
		panel_asientos.add(asiento5);
		
		JButton asiento6 = new JButton("1");
		asiento6.setForeground(Color.ORANGE);
		asiento6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				asiento6.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				asiento6.setBackground(Color.ORANGE);
			}
		});
		asiento6.setBackground(Color.ORANGE);
		asiento6.setFont(new Font("Tahoma", Font.PLAIN, 6));
		asiento6.setBounds(229, 9, 35, 23);
		panel_asientos.add(asiento6);
		
		JButton asiento7 = new JButton("1");
		asiento7.setForeground(Color.ORANGE);
		asiento7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				asiento7.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				asiento7.setBackground(Color.ORANGE);
			}
		});
		asiento7.setBackground(Color.ORANGE);
		asiento7.setFont(new Font("Tahoma", Font.PLAIN, 6));
		asiento7.setBounds(267, 11, 35, 23);
		panel_asientos.add(asiento7);
		
		JButton asiento8 = new JButton("1");
		asiento8.setForeground(Color.ORANGE);
		asiento8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				asiento8.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				asiento8.setBackground(Color.ORANGE);
			}
		});
		asiento8.setBackground(Color.ORANGE);
		asiento8.setFont(new Font("Tahoma", Font.PLAIN, 6));
		asiento8.setBounds(308, 11, 35, 23);
		panel_asientos.add(asiento8);
		
		JButton asiento9 = new JButton("1");
		asiento9.setForeground(Color.ORANGE);
		asiento9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				asiento9.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				asiento9.setBackground(Color.ORANGE);
			}
		});
		asiento9.setBackground(Color.ORANGE);
		asiento9.setFont(new Font("Tahoma", Font.PLAIN, 6));
		asiento9.setBounds(346, 11, 35, 23);
		panel_asientos.add(asiento9);
		
		JLabel lbl1 = new JLabel("A1");
		lbl1.setBounds(10, 35, 21, 14);
		panel_asientos.add(lbl1);
		
		JLabel lbl2 = new JLabel("A2");
		lbl2.setBounds(47, 35, 21, 14);
		panel_asientos.add(lbl2);
		
		JLabel lbl3 = new JLabel("A3");
		lbl3.setBounds(84, 35, 21, 14);
		panel_asientos.add(lbl3);
		
		JLabel lbl4 = new JLabel("A4");
		lbl4.setBounds(123, 35, 21, 14);
		panel_asientos.add(lbl4);
		
		JLabel lbl5 = new JLabel("A5");
		lbl5.setBounds(161, 35, 21, 14);
		panel_asientos.add(lbl5);
		
		JLabel lbl6 = new JLabel("A6");
		lbl6.setBounds(200, 35, 21, 14);
		panel_asientos.add(lbl6);
		
		JLabel lbl7 = new JLabel("A7");
		lbl7.setBounds(239, 35, 21, 14);
		panel_asientos.add(lbl7);
		
		JLabel lbl8 = new JLabel("A8");
		lbl8.setBounds(277, 35, 21, 14);
		panel_asientos.add(lbl8);
		
		JLabel lbl9 = new JLabel("A9");
		lbl9.setBounds(318, 35, 21, 14);
		panel_asientos.add(lbl9);
		
		JLabel lbl10 = new JLabel("A10");
		lbl10.setBounds(356, 35, 35, 14);
		panel_asientos.add(lbl10);
		
		JButton asiento0_0 = new JButton("1");
		asiento0_0.setForeground(Color.BLUE);
		asiento0_0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				asiento0_0.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				asiento0_0.setBackground(Color.BLUE);
			}
		});
		asiento0_0.setFont(new Font("Tahoma", Font.PLAIN, 6));
		asiento0_0.setBackground(Color.BLUE);
		asiento0_0.setBounds(0, 57, 35, 23);
		panel_asientos.add(asiento0_0);
		
		JLabel lblB = new JLabel("B1");
		lblB.setBounds(10, 81, 21, 14);
		panel_asientos.add(lblB);
		
		JButton asiento0_1 = new JButton("1");
		asiento0_1.setForeground(Color.BLUE);
		asiento0_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				asiento0_1.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				asiento0_1.setBackground(Color.BLUE);
			}
		});
		asiento0_1.setFont(new Font("Tahoma", Font.PLAIN, 6));
		asiento0_1.setBackground(Color.BLUE);
		asiento0_1.setBounds(37, 57, 35, 23);
		panel_asientos.add(asiento0_1);
		
		JLabel lblB_1 = new JLabel("B2");
		lblB_1.setBounds(47, 81, 21, 14);
		panel_asientos.add(lblB_1);
		
		JButton asiento0_2 = new JButton("1");
		asiento0_2.setForeground(Color.BLUE);
		asiento0_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				asiento0_2.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				asiento0_2.setBackground(Color.BLUE);
			}
		});
		asiento0_2.setFont(new Font("Tahoma", Font.PLAIN, 6));
		asiento0_2.setBackground(Color.BLUE);
		asiento0_2.setBounds(74, 57, 35, 23);
		panel_asientos.add(asiento0_2);
		
		JLabel lblB_2 = new JLabel("B3");
		lblB_2.setBounds(84, 81, 21, 14);
		panel_asientos.add(lblB_2);
		
		JButton asiento0_3 = new JButton("1");
		asiento0_3.setForeground(Color.BLUE);
		asiento0_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				asiento0_3.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				asiento0_3.setBackground(Color.BLUE);
			}
		});
		asiento0_3.setFont(new Font("Tahoma", Font.PLAIN, 6));
		asiento0_3.setBackground(Color.BLUE);
		asiento0_3.setBounds(113, 55, 35, 23);
		panel_asientos.add(asiento0_3);
		
		JLabel lblB_3 = new JLabel("B4");
		lblB_3.setBounds(123, 81, 21, 14);
		panel_asientos.add(lblB_3);
		
		JButton asiento0_4 = new JButton("1");
		asiento0_4.setForeground(Color.BLUE);
		asiento0_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				asiento0_4.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				asiento0_4.setBackground(Color.BLUE);
			}
		});
		asiento0_4.setFont(new Font("Tahoma", Font.PLAIN, 6));
		asiento0_4.setBackground(Color.BLUE);
		asiento0_4.setBounds(151, 57, 35, 23);
		panel_asientos.add(asiento0_4);
		
		JLabel lblB_4 = new JLabel("B5");
		lblB_4.setBounds(161, 81, 21, 14);
		panel_asientos.add(lblB_4);
		
		JButton asiento0_5 = new JButton("1");
		asiento0_5.setForeground(Color.BLUE);
		asiento0_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				asiento0_5.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				asiento0_5.setBackground(Color.BLUE);
			}
		});
		asiento0_5.setFont(new Font("Tahoma", Font.PLAIN, 6));
		asiento0_5.setBackground(Color.BLUE);
		asiento0_5.setBounds(190, 57, 35, 23);
		panel_asientos.add(asiento0_5);
		
		JLabel lblB_5 = new JLabel("B6");
		lblB_5.setBounds(200, 81, 21, 14);
		panel_asientos.add(lblB_5);
		
		JButton asiento0_6 = new JButton("1");
		asiento0_6.setForeground(Color.BLUE);
		asiento0_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				asiento0_6.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				asiento0_6.setBackground(Color.BLUE);
			}
		});
		asiento0_6.setFont(new Font("Tahoma", Font.PLAIN, 6));
		asiento0_6.setBackground(Color.BLUE);
		asiento0_6.setBounds(229, 55, 35, 23);
		panel_asientos.add(asiento0_6);
		
		JLabel lblB_6 = new JLabel("B7");
		lblB_6.setBounds(239, 81, 21, 14);
		panel_asientos.add(lblB_6);
		
		JButton asiento0_7 = new JButton("1");
		asiento0_7.setForeground(Color.BLUE);
		asiento0_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				asiento0_7.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				asiento0_7.setBackground(Color.BLUE);
			}
		});
		asiento0_7.setFont(new Font("Tahoma", Font.PLAIN, 6));
		asiento0_7.setBackground(Color.BLUE);
		asiento0_7.setBounds(267, 57, 35, 23);
		panel_asientos.add(asiento0_7);
		
		JLabel lblB_7 = new JLabel("B8");
		lblB_7.setBounds(277, 81, 21, 14);
		panel_asientos.add(lblB_7);
		
		JButton asiento0_8 = new JButton("1");
		asiento0_8.setForeground(Color.BLUE);
		asiento0_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				asiento0_8.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				asiento0_8.setBackground(Color.BLUE);
			}
		});
		asiento0_8.setFont(new Font("Tahoma", Font.PLAIN, 6));
		asiento0_8.setBackground(Color.BLUE);
		asiento0_8.setBounds(308, 57, 35, 23);
		panel_asientos.add(asiento0_8);
		
		JLabel lblB_8 = new JLabel("B9");
		lblB_8.setBounds(318, 81, 21, 14);
		panel_asientos.add(lblB_8);
		
		JButton asiento0_9 = new JButton("1");
		asiento0_9.setForeground(Color.BLUE);
		asiento0_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				asiento0_9.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				asiento0_9.setBackground(Color.BLUE);
			}
		});
		asiento0_9.setFont(new Font("Tahoma", Font.PLAIN, 6));
		asiento0_9.setBackground(Color.BLUE);
		asiento0_9.setBounds(346, 57, 35, 23);
		panel_asientos.add(asiento0_9);
		
		JLabel lblB_9 = new JLabel("B10");
		lblB_9.setBounds(356, 81, 35, 14);
		panel_asientos.add(lblB_9);
		
		JButton asiento1_0 = new JButton("1");
		asiento1_0.setForeground(Color.BLUE);
		asiento1_0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				asiento1_0.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				asiento1_0.setBackground(Color.BLUE);
			}
		});
		asiento1_0.setFont(new Font("Tahoma", Font.PLAIN, 6));
		asiento1_0.setBackground(Color.BLUE);
		asiento1_0.setBounds(0, 102, 35, 23);
		panel_asientos.add(asiento1_0);
		
		JLabel lblC = new JLabel("C1");
		lblC.setBounds(10, 126, 21, 14);
		panel_asientos.add(lblC);
		
		JButton asiento1_1 = new JButton("1");
		asiento1_1.setForeground(Color.BLUE);
		asiento1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				asiento1_1.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				asiento1_1.setBackground(Color.BLUE);
			}
		});
		asiento1_1.setFont(new Font("Tahoma", Font.PLAIN, 6));
		asiento1_1.setBackground(Color.BLUE);
		asiento1_1.setBounds(37, 102, 35, 23);
		panel_asientos.add(asiento1_1);
		
		JLabel lblC_1 = new JLabel("C2");
		lblC_1.setBounds(47, 126, 21, 14);
		panel_asientos.add(lblC_1);
		
		JButton asiento1_2 = new JButton("1");
		asiento1_2.setForeground(Color.BLUE);
		asiento1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				asiento1_2.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				asiento1_2.setBackground(Color.BLUE);
			}
		});
		asiento1_2.setFont(new Font("Tahoma", Font.PLAIN, 6));
		asiento1_2.setBackground(Color.BLUE);
		asiento1_2.setBounds(74, 102, 35, 23);
		panel_asientos.add(asiento1_2);
		
		JLabel lblC_2 = new JLabel("C3");
		lblC_2.setBounds(84, 126, 21, 14);
		panel_asientos.add(lblC_2);
		
		JButton asiento1_3 = new JButton("1");
		asiento1_3.setForeground(Color.BLUE);
		asiento1_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				asiento1_3.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				asiento1_3.setBackground(Color.BLUE);
			}
		});
		asiento1_3.setFont(new Font("Tahoma", Font.PLAIN, 6));
		asiento1_3.setBackground(Color.BLUE);
		asiento1_3.setBounds(113, 100, 35, 23);
		panel_asientos.add(asiento1_3);
		
		JLabel lblC_3 = new JLabel("C4");
		lblC_3.setBounds(123, 126, 21, 14);
		panel_asientos.add(lblC_3);
		
		JButton asiento1_4 = new JButton("1");
		asiento1_4.setForeground(Color.BLUE);
		asiento1_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				asiento1_4.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				asiento1_4.setBackground(Color.BLUE);
			}
		});
		asiento1_4.setFont(new Font("Tahoma", Font.PLAIN, 6));
		asiento1_4.setBackground(Color.BLUE);
		asiento1_4.setBounds(151, 102, 35, 23);
		panel_asientos.add(asiento1_4);
		
		JLabel lblC_4 = new JLabel("C5");
		lblC_4.setBounds(161, 126, 21, 14);
		panel_asientos.add(lblC_4);
		
		JButton asiento1_5 = new JButton("1");
		asiento1_5.setForeground(Color.BLUE);
		asiento1_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				asiento1_5.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				asiento1_5.setBackground(Color.BLUE);
			}
		});
		asiento1_5.setFont(new Font("Tahoma", Font.PLAIN, 6));
		asiento1_5.setBackground(Color.BLUE);
		asiento1_5.setBounds(190, 102, 35, 23);
		panel_asientos.add(asiento1_5);
		
		JLabel lblC_5 = new JLabel("C6");
		lblC_5.setBounds(200, 126, 21, 14);
		panel_asientos.add(lblC_5);
		
		JButton asiento1_6 = new JButton("1");
		asiento1_6.setForeground(Color.BLUE);
		asiento1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		asiento1_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				asiento1_6.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				asiento1_6.setBackground(Color.BLUE);
			}
		});
		asiento1_6.setFont(new Font("Tahoma", Font.PLAIN, 6));
		asiento1_6.setBackground(Color.BLUE);
		asiento1_6.setBounds(229, 100, 35, 23);
		panel_asientos.add(asiento1_6);
		
		JLabel lblC_6 = new JLabel("C7");
		lblC_6.setBounds(239, 126, 21, 14);
		panel_asientos.add(lblC_6);
		
		JButton asiento1_7 = new JButton("1");
		asiento1_7.setForeground(Color.BLUE);
		asiento1_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				asiento1_7.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				asiento1_7.setBackground(Color.BLUE);
			}
		});
		asiento1_7.setFont(new Font("Tahoma", Font.PLAIN, 6));
		asiento1_7.setBackground(Color.BLUE);
		asiento1_7.setBounds(267, 102, 35, 23);
		panel_asientos.add(asiento1_7);
		
		JLabel lblC_7 = new JLabel("C8");
		lblC_7.setBounds(277, 126, 21, 14);
		panel_asientos.add(lblC_7);
		
		JButton asiento1_8 = new JButton("1");
		asiento1_8.setForeground(Color.BLUE);
		asiento1_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				asiento1_8.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				asiento1_8.setBackground(Color.BLUE);
			}
		});
		asiento1_8.setFont(new Font("Tahoma", Font.PLAIN, 6));
		asiento1_8.setBackground(Color.BLUE);
		asiento1_8.setBounds(308, 102, 35, 23);
		panel_asientos.add(asiento1_8);
		
		JLabel lblC_8 = new JLabel("C9");
		lblC_8.setBounds(318, 126, 21, 14);
		panel_asientos.add(lblC_8);
		
		JButton asiento1_9 = new JButton("1");
		asiento1_9.setForeground(Color.BLUE);
		asiento1_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				asiento1_9.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				asiento1_9.setBackground(Color.BLUE);
			}
		});
		asiento1_9.setFont(new Font("Tahoma", Font.PLAIN, 6));
		asiento1_9.setBackground(Color.BLUE);
		asiento1_9.setBounds(346, 102, 35, 23);
		panel_asientos.add(asiento1_9);
		
		JLabel lblC_9 = new JLabel("C10");
		lblC_9.setBounds(356, 126, 35, 14);
		panel_asientos.add(lblC_9);
		
		JButton asiento2_0 = new JButton("1");
		asiento2_0.setForeground(Color.BLUE);
		asiento2_0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				asiento2_0.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				asiento2_0.setBackground(Color.BLUE);
			}
		});
		asiento2_0.setFont(new Font("Tahoma", Font.PLAIN, 6));
		asiento2_0.setBackground(Color.BLUE);
		asiento2_0.setBounds(0, 148, 35, 23);
		panel_asientos.add(asiento2_0);
		
		JLabel lblD = new JLabel("D1");
		lblD.setBounds(10, 172, 21, 14);
		panel_asientos.add(lblD);
		
		JButton asiento2_1 = new JButton("1");
		asiento2_1.setForeground(Color.BLUE);
		asiento2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				asiento2_1.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				asiento2_1.setBackground(Color.BLUE);
			}
		});
		asiento2_1.setFont(new Font("Tahoma", Font.PLAIN, 6));
		asiento2_1.setBackground(Color.BLUE);
		asiento2_1.setBounds(37, 148, 35, 23);
		panel_asientos.add(asiento2_1);
		
		JLabel lblD_1 = new JLabel("D2");
		lblD_1.setBounds(47, 172, 21, 14);
		panel_asientos.add(lblD_1);
		
		JButton asiento2_2 = new JButton("1");
		asiento2_2.setForeground(Color.BLUE);
		asiento2_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				asiento2_2.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				asiento2_2.setBackground(Color.BLUE);
			}
		});
		asiento2_2.setFont(new Font("Tahoma", Font.PLAIN, 6));
		asiento2_2.setBackground(Color.BLUE);
		asiento2_2.setBounds(74, 148, 35, 23);
		panel_asientos.add(asiento2_2);
		
		JLabel lblD_2 = new JLabel("D3");
		lblD_2.setBounds(84, 172, 21, 14);
		panel_asientos.add(lblD_2);
		
		JButton asiento2_3 = new JButton("1");
		asiento2_3.setForeground(Color.BLUE);
		asiento2_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				asiento2_3.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				asiento2_3.setBackground(Color.BLUE);
			}
		});
		asiento2_3.setFont(new Font("Tahoma", Font.PLAIN, 6));
		asiento2_3.setBackground(Color.BLUE);
		asiento2_3.setBounds(113, 146, 35, 23);
		panel_asientos.add(asiento2_3);
		
		JLabel lblD_3 = new JLabel("D4");
		lblD_3.setBounds(123, 172, 21, 14);
		panel_asientos.add(lblD_3);
		
		JButton asiento2_4 = new JButton("1");
		asiento2_4.setForeground(Color.BLUE);
		asiento2_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				asiento2_4.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				asiento2_4.setBackground(Color.BLUE);
			}
		});
		asiento2_4.setFont(new Font("Tahoma", Font.PLAIN, 6));
		asiento2_4.setBackground(Color.BLUE);
		asiento2_4.setBounds(151, 148, 35, 23);
		panel_asientos.add(asiento2_4);
		
		JLabel lblD_4 = new JLabel("D5");
		lblD_4.setBounds(161, 172, 21, 14);
		panel_asientos.add(lblD_4);
		
		JButton asiento2_5 = new JButton("1");
		asiento2_5.setForeground(Color.BLUE);
		asiento2_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				asiento2_5.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				asiento2_5.setBackground(Color.BLUE);
			}
		});
		asiento2_5.setFont(new Font("Tahoma", Font.PLAIN, 6));
		asiento2_5.setBackground(Color.BLUE);
		asiento2_5.setBounds(190, 148, 35, 23);
		panel_asientos.add(asiento2_5);
		
		JLabel lblD_5 = new JLabel("D6");
		lblD_5.setBounds(200, 172, 21, 14);
		panel_asientos.add(lblD_5);
		
		JButton asiento2_6 = new JButton("1");
		asiento2_6.setForeground(Color.BLUE);
		asiento2_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				asiento2_6.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				asiento2_6.setBackground(Color.BLUE);
			}
		});
		asiento2_6.setFont(new Font("Tahoma", Font.PLAIN, 6));
		asiento2_6.setBackground(Color.BLUE);
		asiento2_6.setBounds(229, 146, 35, 23);
		panel_asientos.add(asiento2_6);
		
		JLabel lblD_6 = new JLabel("D7");
		lblD_6.setBounds(239, 172, 21, 14);
		panel_asientos.add(lblD_6);
		
		JButton asiento2_7 = new JButton("1");
		asiento2_7.setForeground(Color.BLUE);
		asiento2_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				asiento2_7.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				asiento2_7.setBackground(Color.BLUE);
			}
		});
		asiento2_7.setFont(new Font("Tahoma", Font.PLAIN, 6));
		asiento2_7.setBackground(Color.BLUE);
		asiento2_7.setBounds(267, 148, 35, 23);
		panel_asientos.add(asiento2_7);
		
		JLabel lblD_7 = new JLabel("D8");
		lblD_7.setBounds(277, 172, 21, 14);
		panel_asientos.add(lblD_7);
		
		JButton asiento2_8 = new JButton("1");
		asiento2_8.setForeground(Color.BLUE);
		asiento2_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				asiento2_8.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				asiento2_8.setBackground(Color.BLUE);
			}
		});
		asiento2_8.setFont(new Font("Tahoma", Font.PLAIN, 6));
		asiento2_8.setBackground(Color.BLUE);
		asiento2_8.setBounds(308, 148, 35, 23);
		panel_asientos.add(asiento2_8);
		
		JLabel lblD_8 = new JLabel("D9");
		lblD_8.setBounds(318, 172, 21, 14);
		panel_asientos.add(lblD_8);
		
		JButton asiento2_9 = new JButton("1");
		asiento2_9.setForeground(Color.BLUE);
		asiento2_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				asiento2_9.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				asiento2_9.setBackground(Color.BLUE);
			}
		});
		asiento2_9.setFont(new Font("Tahoma", Font.PLAIN, 6));
		asiento2_9.setBackground(Color.BLUE);
		asiento2_9.setBounds(346, 148, 35, 23);
		panel_asientos.add(asiento2_9);
		
		JLabel lblD_9 = new JLabel("D10");
		lblD_9.setBounds(356, 172, 35, 14);
		panel_asientos.add(lblD_9);
		
		JButton asiento3_0 = new JButton("1");
		asiento3_0.setForeground(Color.BLUE);
		asiento3_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		asiento3_0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				asiento3_0.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				asiento3_0.setBackground(Color.BLUE);
			}
		});
		asiento3_0.setFont(new Font("Tahoma", Font.PLAIN, 6));
		asiento3_0.setBackground(Color.BLUE);
		asiento3_0.setBounds(0, 194, 35, 23);
		panel_asientos.add(asiento3_0);
		
		JLabel lblE = new JLabel("E1");
		lblE.setBounds(10, 218, 21, 14);
		panel_asientos.add(lblE);
		
		JButton asiento3_1 = new JButton("1");
		asiento3_1.setForeground(Color.BLUE);
		asiento3_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				asiento3_1.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				asiento3_1.setBackground(Color.BLUE);
			}
		});
		asiento3_1.setFont(new Font("Tahoma", Font.PLAIN, 6));
		asiento3_1.setBackground(Color.BLUE);
		asiento3_1.setBounds(37, 194, 35, 23);
		panel_asientos.add(asiento3_1);
		
		JLabel lblE_1 = new JLabel("E2");
		lblE_1.setBounds(47, 218, 21, 14);
		panel_asientos.add(lblE_1);
		
		JButton asiento3_2 = new JButton("1");
		asiento3_2.setForeground(Color.BLUE);
		asiento3_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				asiento3_2.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				asiento3_2.setBackground(Color.BLUE);
			}
		});
		asiento3_2.setFont(new Font("Tahoma", Font.PLAIN, 6));
		asiento3_2.setBackground(Color.BLUE);
		asiento3_2.setBounds(74, 194, 35, 23);
		panel_asientos.add(asiento3_2);
		
		JLabel lblE_2 = new JLabel("E3");
		lblE_2.setBounds(84, 218, 21, 14);
		panel_asientos.add(lblE_2);
		
		JButton asiento3_3 = new JButton("1");
		asiento3_3.setForeground(Color.BLUE);
		asiento3_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				asiento3_3.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				asiento3_3.setBackground(Color.BLUE);
			}
		});
		asiento3_3.setFont(new Font("Tahoma", Font.PLAIN, 6));
		asiento3_3.setBackground(Color.BLUE);
		asiento3_3.setBounds(113, 192, 35, 23);
		panel_asientos.add(asiento3_3);
		
		JLabel lblE_3 = new JLabel("E4");
		lblE_3.setBounds(123, 218, 21, 14);
		panel_asientos.add(lblE_3);
		
		JButton asiento3_4 = new JButton("1");
		asiento3_4.setForeground(Color.BLUE);
		asiento3_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				asiento3_4.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				asiento3_4.setBackground(Color.BLUE);
			}
		});
		asiento3_4.setFont(new Font("Tahoma", Font.PLAIN, 6));
		asiento3_4.setBackground(Color.BLUE);
		asiento3_4.setBounds(151, 194, 35, 23);
		panel_asientos.add(asiento3_4);
		
		JLabel lblE_4 = new JLabel("E5");
		lblE_4.setBounds(161, 218, 21, 14);
		panel_asientos.add(lblE_4);
		
		JButton asiento3_5 = new JButton("1");
		asiento3_5.setForeground(Color.BLUE);
		asiento3_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				asiento3_5.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				asiento3_5.setBackground(Color.BLUE);
			}
		});
		asiento3_5.setFont(new Font("Tahoma", Font.PLAIN, 6));
		asiento3_5.setBackground(Color.BLUE);
		asiento3_5.setBounds(190, 194, 35, 23);
		panel_asientos.add(asiento3_5);
		
		JLabel lblE_5 = new JLabel("E6");
		lblE_5.setBounds(200, 218, 21, 14);
		panel_asientos.add(lblE_5);
		
		JButton asiento3_6 = new JButton("1");
		asiento3_6.setForeground(Color.BLUE);
		asiento3_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				asiento3_6.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				asiento3_6.setBackground(Color.BLUE);
			}
		});
		asiento3_6.setFont(new Font("Tahoma", Font.PLAIN, 6));
		asiento3_6.setBackground(Color.BLUE);
		asiento3_6.setBounds(229, 192, 35, 23);
		panel_asientos.add(asiento3_6);
		
		JLabel lblE_6 = new JLabel("E7");
		lblE_6.setBounds(239, 218, 21, 14);
		panel_asientos.add(lblE_6);
		
		JButton asiento3_7 = new JButton("1");
		asiento3_7.setForeground(Color.BLUE);
		asiento3_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				asiento3_7.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				asiento3_7.setBackground(Color.BLUE);
			}
		});
		asiento3_7.setFont(new Font("Tahoma", Font.PLAIN, 6));
		asiento3_7.setBackground(Color.BLUE);
		asiento3_7.setBounds(267, 194, 35, 23);
		panel_asientos.add(asiento3_7);
		
		JLabel lblE_7 = new JLabel("E8");
		lblE_7.setBounds(277, 218, 21, 14);
		panel_asientos.add(lblE_7);
		
		JButton asiento3_8 = new JButton("1");
		asiento3_8.setForeground(Color.BLUE);
		asiento3_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				asiento3_8.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				asiento3_8.setBackground(Color.BLUE);
			}
		});
		asiento3_8.setFont(new Font("Tahoma", Font.PLAIN, 6));
		asiento3_8.setBackground(Color.BLUE);
		asiento3_8.setBounds(308, 194, 35, 23);
		panel_asientos.add(asiento3_8);
		
		JLabel lblE_8 = new JLabel("E9");
		lblE_8.setBounds(318, 218, 21, 14);
		panel_asientos.add(lblE_8);
		
		JButton asiento3_9 = new JButton("1");
		asiento3_9.setForeground(Color.BLUE);
		asiento3_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				asiento3_9.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				asiento3_9.setBackground(Color.BLUE);
			}
		});
		asiento3_9.setFont(new Font("Tahoma", Font.PLAIN, 6));
		asiento3_9.setBackground(Color.BLUE);
		asiento3_9.setBounds(346, 194, 35, 23);
		panel_asientos.add(asiento3_9);
		
		JLabel lblE_9 = new JLabel("E10");
		lblE_9.setBounds(356, 218, 35, 14);
		panel_asientos.add(lblE_9);
		
		JButton asiento4_0 = new JButton("1");
		asiento4_0.setForeground(Color.BLUE);
		asiento4_0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
			@Override
			public void mouseEntered(MouseEvent e) {
			}
		});
		asiento4_0.setFont(new Font("Tahoma", Font.PLAIN, 6));
		asiento4_0.setBackground(Color.BLUE);
		asiento4_0.setBounds(0, 245, 35, 23);
		panel_asientos.add(asiento4_0);
		
		JButton asiento4_1 = new JButton("1");
		asiento4_1.setForeground(Color.BLUE);
		asiento4_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
			@Override
			public void mouseEntered(MouseEvent e) {
			}
		});
		asiento4_1.setFont(new Font("Tahoma", Font.PLAIN, 6));
		asiento4_1.setBackground(Color.BLUE);
		asiento4_1.setBounds(37, 245, 35, 23);
		panel_asientos.add(asiento4_1);
		
		JButton asiento4_2 = new JButton("1");
		asiento4_2.setForeground(Color.BLUE);
		asiento4_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
			@Override
			public void mouseEntered(MouseEvent e) {
			}
		});
		asiento4_2.setFont(new Font("Tahoma", Font.PLAIN, 6));
		asiento4_2.setBackground(Color.BLUE);
		asiento4_2.setBounds(74, 245, 35, 23);
		panel_asientos.add(asiento4_2);
		
		JButton asiento4_3 = new JButton("1");
		asiento4_3.setForeground(Color.BLUE);
		asiento4_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
			@Override
			public void mouseEntered(MouseEvent e) {
			}
		});
		asiento4_3.setFont(new Font("Tahoma", Font.PLAIN, 6));
		asiento4_3.setBackground(Color.BLUE);
		asiento4_3.setBounds(113, 243, 35, 23);
		panel_asientos.add(asiento4_3);
		
		JButton asiento4_4 = new JButton("1");
		asiento4_4.setForeground(Color.BLUE);
		asiento4_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
			@Override
			public void mouseEntered(MouseEvent e) {
			}
		});
		asiento4_4.setFont(new Font("Tahoma", Font.PLAIN, 6));
		asiento4_4.setBackground(Color.BLUE);
		asiento4_4.setBounds(151, 245, 35, 23);
		panel_asientos.add(asiento4_4);
		
		JButton asiento4_5 = new JButton("1");
		asiento4_5.setForeground(Color.BLUE);
		asiento4_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
			@Override
			public void mouseEntered(MouseEvent e) {
			}
		});
		asiento4_5.setFont(new Font("Tahoma", Font.PLAIN, 6));
		asiento4_5.setBackground(Color.BLUE);
		asiento4_5.setBounds(190, 245, 35, 23);
		panel_asientos.add(asiento4_5);
		
		JButton asiento4_6 = new JButton("1");
		asiento4_6.setForeground(Color.BLUE);
		asiento4_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
			@Override
			public void mouseEntered(MouseEvent e) {
			}
		});
		asiento4_6.setFont(new Font("Tahoma", Font.PLAIN, 6));
		asiento4_6.setBackground(Color.BLUE);
		asiento4_6.setBounds(229, 243, 35, 23);
		panel_asientos.add(asiento4_6);
		
		JButton asiento4_7 = new JButton("1");
		asiento4_7.setForeground(Color.BLUE);
		asiento4_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
			@Override
			public void mouseEntered(MouseEvent e) {
			}
		});
		asiento4_7.setFont(new Font("Tahoma", Font.PLAIN, 6));
		asiento4_7.setBackground(Color.BLUE);
		asiento4_7.setBounds(267, 245, 35, 23);
		panel_asientos.add(asiento4_7);
		
		JButton asiento4_8 = new JButton("1");
		asiento4_8.setForeground(Color.BLUE);
		asiento4_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
			@Override
			public void mouseEntered(MouseEvent e) {
			}
		});
		asiento4_8.setFont(new Font("Tahoma", Font.PLAIN, 6));
		asiento4_8.setBackground(Color.BLUE);
		asiento4_8.setBounds(308, 245, 35, 23);
		panel_asientos.add(asiento4_8);
		
		JButton asiento4_9 = new JButton("1");
		asiento4_9.setForeground(Color.BLUE);
		asiento4_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
			@Override
			public void mouseEntered(MouseEvent e) {
			}
		});
		asiento4_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		asiento4_9.setFont(new Font("Tahoma", Font.PLAIN, 6));
		asiento4_9.setBackground(Color.BLUE);
		asiento4_9.setBounds(346, 245, 35, 23);
		panel_asientos.add(asiento4_9);
		
		JLabel lblF = new JLabel("F1");
		lblF.setBounds(10, 269, 21, 14);
		panel_asientos.add(lblF);
		
		JLabel lblE_1_1 = new JLabel("F2");
		lblE_1_1.setBounds(47, 269, 21, 14);
		panel_asientos.add(lblE_1_1);
		
		JLabel lblE_2_1 = new JLabel("F3");
		lblE_2_1.setBounds(84, 269, 21, 14);
		panel_asientos.add(lblE_2_1);
		
		JLabel lblE_3_1 = new JLabel("F4");
		lblE_3_1.setBounds(123, 269, 21, 14);
		panel_asientos.add(lblE_3_1);
		
		JLabel lblE_4_1 = new JLabel("F5");
		lblE_4_1.setBounds(161, 269, 21, 14);
		panel_asientos.add(lblE_4_1);
		
		JLabel lblE_5_1 = new JLabel("F6");
		lblE_5_1.setBounds(200, 269, 21, 14);
		panel_asientos.add(lblE_5_1);
		
		JLabel lblE_6_1 = new JLabel("F7");
		lblE_6_1.setBounds(239, 269, 21, 14);
		panel_asientos.add(lblE_6_1);
		
		JLabel lblE_7_1 = new JLabel("F8");
		lblE_7_1.setBounds(277, 269, 21, 14);
		panel_asientos.add(lblE_7_1);
		
		JLabel lblE_8_1 = new JLabel("F9");
		lblE_8_1.setBounds(318, 269, 21, 14);
		panel_asientos.add(lblE_8_1);
		
		JLabel lblE_9_1 = new JLabel("F10");
		lblE_9_1.setBounds(356, 269, 35, 14);
		panel_asientos.add(lblE_9_1);

		ln_pA= new logica_negocio_panelAsientos(this);
		crearBotones(this);
		
	}
	public void crearBotones(panel_asientos panel_asientos){
		JLabel etiqueta[]= new JLabel[10];
		JButton botones[]=new JButton[10];        
        for(int i=0; i<10; i++){
        	etiqueta[i]= new JLabel("asiento" + i);
        	botones[i] = new JButton("asiento" + i);
        	panel_asientos.add(etiqueta[i]);
        	panel_asientos.add(botones[i]);
        	
        }
        for(int i=0; i<10; i++){
        	if(ln_pA.botonReservado(botones[i].getText().toString())) {
        		botones[i].setEnabled(false);
        	}
        }
        
    }
	
}
