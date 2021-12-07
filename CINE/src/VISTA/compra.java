package VISTA;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class compra extends JPanel {
	private JPanel panel_cine;
	private JTextField txt_cedula;
	private JTextField txt_nombre;
	private JTextField txt_telefono;
	private JTextField txt_adultos;
	private JTextField txt_niños;
	private JTextField txt_evento;
	private JTextField txt_subtotal;
	private JTextField txt_iva;
	private JTextField txt_total;

	/**
	 * Create the panel.
	 */
	public compra() {
		setLayout(null);
		
		JPanel panel_datos = new JPanel();
		panel_datos.setBounds(10, 11, 430, 474);
		add(panel_datos);
		panel_datos.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CEDULA");
		lblNewLabel.setBounds(10, 21, 46, 14);
		panel_datos.add(lblNewLabel);
		
		JLabel lblNombre = new JLabel("NOMBRE");
		lblNombre.setBounds(10, 53, 46, 14);
		panel_datos.add(lblNombre);
		
		JLabel lblTelefono = new JLabel("TELEFONO");
		lblTelefono.setBounds(10, 93, 56, 14);
		panel_datos.add(lblTelefono);
		
		JLabel lblDireccionn = new JLabel("DIRECCION");
		lblDireccionn.setBounds(10, 134, 79, 14);
		panel_datos.add(lblDireccionn);
		
		txt_cedula = new JTextField();
		txt_cedula.setBounds(76, 18, 211, 20);
		panel_datos.add(txt_cedula);
		txt_cedula.setColumns(10);
		
		txt_nombre = new JTextField();
		txt_nombre.setColumns(10);
		txt_nombre.setBounds(76, 50, 211, 20);
		panel_datos.add(txt_nombre);
		
		txt_telefono = new JTextField();
		txt_telefono.setColumns(10);
		txt_telefono.setBounds(76, 90, 211, 20);
		panel_datos.add(txt_telefono);
		
		JTextArea txt_direccion = new JTextArea();
		txt_direccion.setBounds(76, 129, 211, 74);
		panel_datos.add(txt_direccion);
		
		txt_adultos = new JTextField();
		txt_adultos.setBounds(10, 233, 63, 20);
		panel_datos.add(txt_adultos);
		txt_adultos.setColumns(10);
		
		txt_niños = new JTextField();
		txt_niños.setColumns(10);
		txt_niños.setBounds(118, 233, 56, 20);
		panel_datos.add(txt_niños);
		
		txt_evento = new JTextField();
		txt_evento.setColumns(10);
		txt_evento.setBounds(214, 233, 187, 20);
		panel_datos.add(txt_evento);
		
		JLabel lblAdultos = new JLabel("ADULTOS");
		lblAdultos.setBounds(10, 214, 79, 14);
		panel_datos.add(lblAdultos);
		
		JLabel lblNios = new JLabel("NI\u00D1OS");
		lblNios.setBounds(125, 214, 79, 14);
		panel_datos.add(lblNios);
		
		JLabel lblEvento = new JLabel("EVENTO");
		lblEvento.setBounds(255, 214, 79, 14);
		panel_datos.add(lblEvento);
		
		JLabel lblSubtotal = new JLabel("SUBTOTAL");
		lblSubtotal.setBounds(220, 297, 79, 14);
		panel_datos.add(lblSubtotal);
		
		JLabel lblNios_1_1 = new JLabel("IVA");
		lblNios_1_1.setBounds(220, 338, 79, 14);
		panel_datos.add(lblNios_1_1);
		
		JLabel lblNios_1_2 = new JLabel("TOTAL");
		lblNios_1_2.setBounds(220, 381, 79, 14);
		panel_datos.add(lblNios_1_2);
		
		txt_subtotal = new JTextField();
		txt_subtotal.setColumns(10);
		txt_subtotal.setBounds(274, 294, 56, 20);
		panel_datos.add(txt_subtotal);
		
		txt_iva = new JTextField();
		txt_iva.setColumns(10);
		txt_iva.setBounds(274, 335, 56, 20);
		panel_datos.add(txt_iva);
		
		txt_total = new JTextField();
		txt_total.setColumns(10);
		txt_total.setBounds(274, 378, 56, 20);
		panel_datos.add(txt_total);
		
		JButton btn_aceptar = new JButton("ACEPTAR");
		btn_aceptar.setBounds(312, 440, 89, 23);
		panel_datos.add(btn_aceptar);
		
		JButton btn_cancelar = new JButton("CANCELAR");
		btn_cancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_datos.setVisible(false);
				panel_cine= new JPanel();
				panel_cine.setBounds(10, 11, 439, 468);
				add(panel_cine);
			}
		});
		btn_cancelar.setBounds(198, 440, 89, 23);
		panel_datos.add(btn_cancelar);

	}
}