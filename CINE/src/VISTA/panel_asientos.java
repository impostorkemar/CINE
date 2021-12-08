package VISTA;

import javax.swing.JPanel;
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

	/**
	 * Create the panel.
	 */
	public panel_asientos() {
		setLayout(null);
		
		JPanel panel_asientos = new JPanel();
		panel_asientos.setBounds(0, 11, 761, 353);
		add(panel_asientos);
		panel_asientos.setLayout(null);
		
		btn_finalizar = new JButton("FINISH");
		btn_finalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_asientos.setVisible(false);
				panel_menu= new panel_menu();
				panel_menu.setBounds(10, 11, 439, 468);
				add(panel_menu);
			}
		});
		btn_finalizar.setBounds(270, 301, 89, 23);
		panel_asientos.add(btn_finalizar);
		
		JButton btn1 = new JButton("1");
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btn1.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btn1.setBackground(Color.ORANGE);
			}
		});
		btn1.setBackground(Color.ORANGE);
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btn1.setBounds(0, 11, 35, 23);
		panel_asientos.add(btn1);
		
		JButton btn2 = new JButton("1");
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btn2.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btn2.setBackground(Color.ORANGE);
			}
		});
		btn2.setBackground(Color.ORANGE);
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btn2.setBounds(37, 11, 35, 23);
		panel_asientos.add(btn2);
		
		JButton btn3 = new JButton("1");
		btn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btn3.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btn3.setBackground(Color.ORANGE);
			}
		});
		btn3.setBackground(Color.ORANGE);
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btn3.setBounds(74, 11, 35, 23);
		panel_asientos.add(btn3);
		
		JButton btn4 = new JButton("1");
		btn4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btn4.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btn4.setBackground(Color.ORANGE);
			}
		});
		btn4.setBackground(Color.ORANGE);
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btn4.setBounds(113, 9, 35, 23);
		panel_asientos.add(btn4);
		
		JButton btn5 = new JButton("1");
		btn5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btn5.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btn5.setBackground(Color.ORANGE);
			}
		});
		btn5.setBackground(Color.ORANGE);
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btn5.setBounds(151, 11, 35, 23);
		panel_asientos.add(btn5);
		
		JButton btn6 = new JButton("1");
		btn6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btn6.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btn6.setBackground(Color.ORANGE);
			}
		});
		btn6.setBackground(Color.ORANGE);
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btn6.setBounds(190, 11, 35, 23);
		panel_asientos.add(btn6);
		
		JButton btn7 = new JButton("1");
		btn7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btn7.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btn7.setBackground(Color.ORANGE);
			}
		});
		btn7.setBackground(Color.ORANGE);
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btn7.setBounds(229, 9, 35, 23);
		panel_asientos.add(btn7);
		
		JButton btn8 = new JButton("1");
		btn8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btn8.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btn8.setBackground(Color.ORANGE);
			}
		});
		btn8.setBackground(Color.ORANGE);
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btn8.setBounds(267, 11, 35, 23);
		panel_asientos.add(btn8);
		
		JButton btn9 = new JButton("1");
		btn9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btn9.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btn9.setBackground(Color.ORANGE);
			}
		});
		btn9.setBackground(Color.ORANGE);
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btn9.setBounds(308, 11, 35, 23);
		panel_asientos.add(btn9);
		
		JButton btn10 = new JButton("1");
		btn10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btn10.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btn10.setBackground(Color.ORANGE);
			}
		});
		btn10.setBackground(Color.ORANGE);
		btn10.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btn10.setBounds(346, 11, 35, 23);
		panel_asientos.add(btn10);
		
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
		
		JButton btn1_1 = new JButton("1");
		btn1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btn1_1.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btn1_1.setBackground(Color.BLUE);
			}
		});
		btn1_1.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btn1_1.setBackground(Color.BLUE);
		btn1_1.setBounds(0, 57, 35, 23);
		panel_asientos.add(btn1_1);
		
		JLabel lblB = new JLabel("B1");
		lblB.setBounds(10, 81, 21, 14);
		panel_asientos.add(lblB);
		
		JButton btn2_1 = new JButton("1");
		btn2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btn2_1.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btn2_1.setBackground(Color.BLUE);
			}
		});
		btn2_1.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btn2_1.setBackground(Color.BLUE);
		btn2_1.setBounds(37, 57, 35, 23);
		panel_asientos.add(btn2_1);
		
		JLabel lblB_1 = new JLabel("B2");
		lblB_1.setBounds(47, 81, 21, 14);
		panel_asientos.add(lblB_1);
		
		JButton btn3_1 = new JButton("1");
		btn3_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btn3_1.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btn3_1.setBackground(Color.BLUE);
			}
		});
		btn3_1.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btn3_1.setBackground(Color.BLUE);
		btn3_1.setBounds(74, 57, 35, 23);
		panel_asientos.add(btn3_1);
		
		JLabel lblB_2 = new JLabel("B3");
		lblB_2.setBounds(84, 81, 21, 14);
		panel_asientos.add(lblB_2);
		
		JButton btn4_1 = new JButton("1");
		btn4_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btn4_1.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btn4_1.setBackground(Color.BLUE);
			}
		});
		btn4_1.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btn4_1.setBackground(Color.BLUE);
		btn4_1.setBounds(113, 55, 35, 23);
		panel_asientos.add(btn4_1);
		
		JLabel lblB_3 = new JLabel("B4");
		lblB_3.setBounds(123, 81, 21, 14);
		panel_asientos.add(lblB_3);
		
		JButton btn5_1 = new JButton("1");
		btn5_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btn5_1.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btn5_1.setBackground(Color.BLUE);
			}
		});
		btn5_1.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btn5_1.setBackground(Color.BLUE);
		btn5_1.setBounds(151, 57, 35, 23);
		panel_asientos.add(btn5_1);
		
		JLabel lblB_4 = new JLabel("B5");
		lblB_4.setBounds(161, 81, 21, 14);
		panel_asientos.add(lblB_4);
		
		JButton btn6_1 = new JButton("1");
		btn6_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btn6_1.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btn6_1.setBackground(Color.BLUE);
			}
		});
		btn6_1.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btn6_1.setBackground(Color.BLUE);
		btn6_1.setBounds(190, 57, 35, 23);
		panel_asientos.add(btn6_1);
		
		JLabel lblB_5 = new JLabel("B6");
		lblB_5.setBounds(200, 81, 21, 14);
		panel_asientos.add(lblB_5);
		
		JButton btn7_1 = new JButton("1");
		btn7_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btn7_1.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btn7_1.setBackground(Color.BLUE);
			}
		});
		btn7_1.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btn7_1.setBackground(Color.BLUE);
		btn7_1.setBounds(229, 55, 35, 23);
		panel_asientos.add(btn7_1);
		
		JLabel lblB_6 = new JLabel("B7");
		lblB_6.setBounds(239, 81, 21, 14);
		panel_asientos.add(lblB_6);
		
		JButton btn8_1 = new JButton("1");
		btn8_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btn8_1.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btn8_1.setBackground(Color.BLUE);
			}
		});
		btn8_1.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btn8_1.setBackground(Color.BLUE);
		btn8_1.setBounds(267, 57, 35, 23);
		panel_asientos.add(btn8_1);
		
		JLabel lblB_7 = new JLabel("B8");
		lblB_7.setBounds(277, 81, 21, 14);
		panel_asientos.add(lblB_7);
		
		JButton btn9_1 = new JButton("1");
		btn9_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btn9_1.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btn9_1.setBackground(Color.BLUE);
			}
		});
		btn9_1.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btn9_1.setBackground(Color.BLUE);
		btn9_1.setBounds(308, 57, 35, 23);
		panel_asientos.add(btn9_1);
		
		JLabel lblB_8 = new JLabel("B9");
		lblB_8.setBounds(318, 81, 21, 14);
		panel_asientos.add(lblB_8);
		
		JButton btn10_1 = new JButton("1");
		btn10_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btn10_1.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btn10_1.setBackground(Color.BLUE);
			}
		});
		btn10_1.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btn10_1.setBackground(Color.BLUE);
		btn10_1.setBounds(346, 57, 35, 23);
		panel_asientos.add(btn10_1);
		
		JLabel lblB_9 = new JLabel("B10");
		lblB_9.setBounds(356, 81, 35, 14);
		panel_asientos.add(lblB_9);
		
		JButton btn1_2 = new JButton("1");
		btn1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btn1_2.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btn1_2.setBackground(Color.BLUE);
			}
		});
		btn1_2.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btn1_2.setBackground(Color.BLUE);
		btn1_2.setBounds(0, 102, 35, 23);
		panel_asientos.add(btn1_2);
		
		JLabel lblC = new JLabel("C1");
		lblC.setBounds(10, 126, 21, 14);
		panel_asientos.add(lblC);
		
		JButton btn2_2 = new JButton("1");
		btn2_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btn2_2.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btn2_2.setBackground(Color.BLUE);
			}
		});
		btn2_2.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btn2_2.setBackground(Color.BLUE);
		btn2_2.setBounds(37, 102, 35, 23);
		panel_asientos.add(btn2_2);
		
		JLabel lblC_1 = new JLabel("C2");
		lblC_1.setBounds(47, 126, 21, 14);
		panel_asientos.add(lblC_1);
		
		JButton btn3_2 = new JButton("1");
		btn3_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btn3_2.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btn3_2.setBackground(Color.BLUE);
			}
		});
		btn3_2.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btn3_2.setBackground(Color.BLUE);
		btn3_2.setBounds(74, 102, 35, 23);
		panel_asientos.add(btn3_2);
		
		JLabel lblC_2 = new JLabel("C3");
		lblC_2.setBounds(84, 126, 21, 14);
		panel_asientos.add(lblC_2);
		
		JButton btn4_2 = new JButton("1");
		btn4_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btn4_2.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btn4_2.setBackground(Color.BLUE);
			}
		});
		btn4_2.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btn4_2.setBackground(Color.BLUE);
		btn4_2.setBounds(113, 100, 35, 23);
		panel_asientos.add(btn4_2);
		
		JLabel lblC_3 = new JLabel("C4");
		lblC_3.setBounds(123, 126, 21, 14);
		panel_asientos.add(lblC_3);
		
		JButton btn5_2 = new JButton("1");
		btn5_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btn5_2.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btn5_2.setBackground(Color.BLUE);
			}
		});
		btn5_2.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btn5_2.setBackground(Color.BLUE);
		btn5_2.setBounds(151, 102, 35, 23);
		panel_asientos.add(btn5_2);
		
		JLabel lblC_4 = new JLabel("C5");
		lblC_4.setBounds(161, 126, 21, 14);
		panel_asientos.add(lblC_4);
		
		JButton btn6_2 = new JButton("1");
		btn6_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btn6_2.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btn6_2.setBackground(Color.BLUE);
			}
		});
		btn6_2.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btn6_2.setBackground(Color.BLUE);
		btn6_2.setBounds(190, 102, 35, 23);
		panel_asientos.add(btn6_2);
		
		JLabel lblC_5 = new JLabel("C6");
		lblC_5.setBounds(200, 126, 21, 14);
		panel_asientos.add(lblC_5);
		
		JButton btn7_2 = new JButton("1");
		btn7_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btn7_2.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btn7_2.setBackground(Color.BLUE);
			}
		});
		btn7_2.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btn7_2.setBackground(Color.BLUE);
		btn7_2.setBounds(229, 100, 35, 23);
		panel_asientos.add(btn7_2);
		
		JLabel lblC_6 = new JLabel("C7");
		lblC_6.setBounds(239, 126, 21, 14);
		panel_asientos.add(lblC_6);
		
		JButton btn8_2 = new JButton("1");
		btn8_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btn8_2.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btn8_2.setBackground(Color.BLUE);
			}
		});
		btn8_2.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btn8_2.setBackground(Color.BLUE);
		btn8_2.setBounds(267, 102, 35, 23);
		panel_asientos.add(btn8_2);
		
		JLabel lblC_7 = new JLabel("C8");
		lblC_7.setBounds(277, 126, 21, 14);
		panel_asientos.add(lblC_7);
		
		JButton btn9_2 = new JButton("1");
		btn9_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btn9_2.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btn9_2.setBackground(Color.BLUE);
			}
		});
		btn9_2.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btn9_2.setBackground(Color.BLUE);
		btn9_2.setBounds(308, 102, 35, 23);
		panel_asientos.add(btn9_2);
		
		JLabel lblC_8 = new JLabel("C9");
		lblC_8.setBounds(318, 126, 21, 14);
		panel_asientos.add(lblC_8);
		
		JButton btn10_2 = new JButton("1");
		btn10_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btn10_2.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btn10_2.setBackground(Color.BLUE);
			}
		});
		btn10_2.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btn10_2.setBackground(Color.BLUE);
		btn10_2.setBounds(346, 102, 35, 23);
		panel_asientos.add(btn10_2);
		
		JLabel lblC_9 = new JLabel("C10");
		lblC_9.setBounds(356, 126, 35, 14);
		panel_asientos.add(lblC_9);
		
		JButton btn1_3 = new JButton("1");
		btn1_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btn1_3.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btn1_3.setBackground(Color.BLUE);
			}
		});
		btn1_3.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btn1_3.setBackground(Color.BLUE);
		btn1_3.setBounds(0, 148, 35, 23);
		panel_asientos.add(btn1_3);
		
		JLabel lblD = new JLabel("D1");
		lblD.setBounds(10, 172, 21, 14);
		panel_asientos.add(lblD);
		
		JButton btn2_3 = new JButton("1");
		btn2_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btn2_3.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btn2_3.setBackground(Color.BLUE);
			}
		});
		btn2_3.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btn2_3.setBackground(Color.BLUE);
		btn2_3.setBounds(37, 148, 35, 23);
		panel_asientos.add(btn2_3);
		
		JLabel lblD_1 = new JLabel("D2");
		lblD_1.setBounds(47, 172, 21, 14);
		panel_asientos.add(lblD_1);
		
		JButton btn3_3 = new JButton("1");
		btn3_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btn3_3.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btn3_3.setBackground(Color.BLUE);
			}
		});
		btn3_3.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btn3_3.setBackground(Color.BLUE);
		btn3_3.setBounds(74, 148, 35, 23);
		panel_asientos.add(btn3_3);
		
		JLabel lblD_2 = new JLabel("D3");
		lblD_2.setBounds(84, 172, 21, 14);
		panel_asientos.add(lblD_2);
		
		JButton btn4_3 = new JButton("1");
		btn4_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btn4_3.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btn4_3.setBackground(Color.BLUE);
			}
		});
		btn4_3.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btn4_3.setBackground(Color.BLUE);
		btn4_3.setBounds(113, 146, 35, 23);
		panel_asientos.add(btn4_3);
		
		JLabel lblD_3 = new JLabel("D4");
		lblD_3.setBounds(123, 172, 21, 14);
		panel_asientos.add(lblD_3);
		
		JButton btn5_3 = new JButton("1");
		btn5_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btn5_3.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btn5_3.setBackground(Color.BLUE);
			}
		});
		btn5_3.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btn5_3.setBackground(Color.BLUE);
		btn5_3.setBounds(151, 148, 35, 23);
		panel_asientos.add(btn5_3);
		
		JLabel lblD_4 = new JLabel("D5");
		lblD_4.setBounds(161, 172, 21, 14);
		panel_asientos.add(lblD_4);
		
		JButton btn6_3 = new JButton("1");
		btn6_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btn6_3.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btn6_3.setBackground(Color.BLUE);
			}
		});
		btn6_3.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btn6_3.setBackground(Color.BLUE);
		btn6_3.setBounds(190, 148, 35, 23);
		panel_asientos.add(btn6_3);
		
		JLabel lblD_5 = new JLabel("D6");
		lblD_5.setBounds(200, 172, 21, 14);
		panel_asientos.add(lblD_5);
		
		JButton btn7_3 = new JButton("1");
		btn7_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btn7_3.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btn7_3.setBackground(Color.BLUE);
			}
		});
		btn7_3.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btn7_3.setBackground(Color.BLUE);
		btn7_3.setBounds(229, 146, 35, 23);
		panel_asientos.add(btn7_3);
		
		JLabel lblD_6 = new JLabel("D7");
		lblD_6.setBounds(239, 172, 21, 14);
		panel_asientos.add(lblD_6);
		
		JButton btn8_3 = new JButton("1");
		btn8_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btn8_3.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btn8_3.setBackground(Color.BLUE);
			}
		});
		btn8_3.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btn8_3.setBackground(Color.BLUE);
		btn8_3.setBounds(267, 148, 35, 23);
		panel_asientos.add(btn8_3);
		
		JLabel lblD_7 = new JLabel("D8");
		lblD_7.setBounds(277, 172, 21, 14);
		panel_asientos.add(lblD_7);
		
		JButton btn9_3 = new JButton("1");
		btn9_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btn9_3.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btn9_3.setBackground(Color.BLUE);
			}
		});
		btn9_3.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btn9_3.setBackground(Color.BLUE);
		btn9_3.setBounds(308, 148, 35, 23);
		panel_asientos.add(btn9_3);
		
		JLabel lblD_8 = new JLabel("D9");
		lblD_8.setBounds(318, 172, 21, 14);
		panel_asientos.add(lblD_8);
		
		JButton btn10_3 = new JButton("1");
		btn10_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btn10_3.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btn10_3.setBackground(Color.BLUE);
			}
		});
		btn10_3.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btn10_3.setBackground(Color.BLUE);
		btn10_3.setBounds(346, 148, 35, 23);
		panel_asientos.add(btn10_3);
		
		JLabel lblD_9 = new JLabel("D10");
		lblD_9.setBounds(356, 172, 35, 14);
		panel_asientos.add(lblD_9);
		
		JButton btn1_4 = new JButton("1");
		btn1_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btn1_4.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btn1_4.setBackground(Color.BLUE);
			}
		});
		btn1_4.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btn1_4.setBackground(Color.BLUE);
		btn1_4.setBounds(0, 194, 35, 23);
		panel_asientos.add(btn1_4);
		
		JLabel lblE = new JLabel("E1");
		lblE.setBounds(10, 218, 21, 14);
		panel_asientos.add(lblE);
		
		JButton btn2_4 = new JButton("1");
		btn2_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btn2_4.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btn2_4.setBackground(Color.BLUE);
			}
		});
		btn2_4.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btn2_4.setBackground(Color.BLUE);
		btn2_4.setBounds(37, 194, 35, 23);
		panel_asientos.add(btn2_4);
		
		JLabel lblE_1 = new JLabel("E2");
		lblE_1.setBounds(47, 218, 21, 14);
		panel_asientos.add(lblE_1);
		
		JButton btn3_4 = new JButton("1");
		btn3_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btn3_4.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btn3_4.setBackground(Color.BLUE);
			}
		});
		btn3_4.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btn3_4.setBackground(Color.BLUE);
		btn3_4.setBounds(74, 194, 35, 23);
		panel_asientos.add(btn3_4);
		
		JLabel lblE_2 = new JLabel("E3");
		lblE_2.setBounds(84, 218, 21, 14);
		panel_asientos.add(lblE_2);
		
		JButton btn4_4 = new JButton("1");
		btn4_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btn4_4.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btn4_4.setBackground(Color.BLUE);
			}
		});
		btn4_4.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btn4_4.setBackground(Color.BLUE);
		btn4_4.setBounds(113, 192, 35, 23);
		panel_asientos.add(btn4_4);
		
		JLabel lblE_3 = new JLabel("E4");
		lblE_3.setBounds(123, 218, 21, 14);
		panel_asientos.add(lblE_3);
		
		JButton btn5_4 = new JButton("1");
		btn5_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btn5_4.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btn5_4.setBackground(Color.BLUE);
			}
		});
		btn5_4.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btn5_4.setBackground(Color.BLUE);
		btn5_4.setBounds(151, 194, 35, 23);
		panel_asientos.add(btn5_4);
		
		JLabel lblE_4 = new JLabel("E5");
		lblE_4.setBounds(161, 218, 21, 14);
		panel_asientos.add(lblE_4);
		
		JButton btn6_4 = new JButton("1");
		btn6_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btn6_4.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btn6_4.setBackground(Color.BLUE);
			}
		});
		btn6_4.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btn6_4.setBackground(Color.BLUE);
		btn6_4.setBounds(190, 194, 35, 23);
		panel_asientos.add(btn6_4);
		
		JLabel lblE_5 = new JLabel("E6");
		lblE_5.setBounds(200, 218, 21, 14);
		panel_asientos.add(lblE_5);
		
		JButton btn7_4 = new JButton("1");
		btn7_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btn7_4.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btn7_4.setBackground(Color.BLUE);
			}
		});
		btn7_4.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btn7_4.setBackground(Color.BLUE);
		btn7_4.setBounds(229, 192, 35, 23);
		panel_asientos.add(btn7_4);
		
		JLabel lblE_6 = new JLabel("E7");
		lblE_6.setBounds(239, 218, 21, 14);
		panel_asientos.add(lblE_6);
		
		JButton btn8_4 = new JButton("1");
		btn8_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btn8_4.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btn8_4.setBackground(Color.BLUE);
			}
		});
		btn8_4.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btn8_4.setBackground(Color.BLUE);
		btn8_4.setBounds(267, 194, 35, 23);
		panel_asientos.add(btn8_4);
		
		JLabel lblE_7 = new JLabel("E8");
		lblE_7.setBounds(277, 218, 21, 14);
		panel_asientos.add(lblE_7);
		
		JButton btn9_4 = new JButton("1");
		btn9_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btn9_4.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btn9_4.setBackground(Color.BLUE);
			}
		});
		btn9_4.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btn9_4.setBackground(Color.BLUE);
		btn9_4.setBounds(308, 194, 35, 23);
		panel_asientos.add(btn9_4);
		
		JLabel lblE_8 = new JLabel("E9");
		lblE_8.setBounds(318, 218, 21, 14);
		panel_asientos.add(lblE_8);
		
		JButton btn10_4 = new JButton("1");
		btn10_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btn10_4.setBackground(Color.RED);
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				btn10_4.setBackground(Color.BLUE);
			}
		});
		btn10_4.setFont(new Font("Tahoma", Font.PLAIN, 6));
		btn10_4.setBackground(Color.BLUE);
		btn10_4.setBounds(346, 194, 35, 23);
		panel_asientos.add(btn10_4);
		
		JLabel lblE_9 = new JLabel("E10");
		lblE_9.setBounds(356, 218, 35, 14);
		panel_asientos.add(lblE_9);

	}
}
