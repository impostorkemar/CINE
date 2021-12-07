package VISTA;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import CONTROLADORES.logica_negocio_panelCompra;
import MODELO.pelicula;
import VISTA.panel_menu;

import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class panel_compra extends JPanel {
	private JPanel panel_cine;
	public JTextField txt_cedula;
	public JTextField txt_nombre;
	public JTextField txt_telefono;
	public JTextField txt_adultos;
	public JTextField txt_niños;
	public JTextField txt_evento;
	public JTextField txt_subtotal;
	public JTextField txt_iva;
	public JTextField txt_total;
	public JTextArea txt_direccion;
	public JTextField txt_3edad;
	
	private logica_negocio_panelCompra ln_pc;
	
	/**
	 * Create the panel.
	 */
	public panel_compra(pelicula[] peliculas,String nombrePelicula,String tipo) {
		setLayout(null);
		
		JPanel panel_datos = new JPanel();
		panel_datos.setBounds(10, 11, 430, 474);
		add(panel_datos);
		panel_datos.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CEDULA");
		lblNewLabel.setBounds(10, 21, 56, 14);
		panel_datos.add(lblNewLabel);
		
		JLabel lblNombre = new JLabel("NOMBRE");
		lblNombre.setBounds(10, 53, 56, 14);
		panel_datos.add(lblNombre);
		
		JLabel lblTelefono = new JLabel("TELEFONO");
		lblTelefono.setBounds(10, 93, 79, 14);
		panel_datos.add(lblTelefono);
		
		JLabel lblDireccionn = new JLabel("DIRECCION");
		lblDireccionn.setBounds(10, 134, 79, 14);
		panel_datos.add(lblDireccionn);
		
		txt_cedula = new JTextField();
		txt_cedula.setBounds(143, 18, 211, 20);
		panel_datos.add(txt_cedula);
		txt_cedula.setColumns(10);
		
		txt_nombre = new JTextField();
		txt_nombre.setColumns(10);
		txt_nombre.setBounds(143, 50, 211, 20);
		panel_datos.add(txt_nombre);
		
		txt_telefono = new JTextField();
		txt_telefono.setColumns(10);
		txt_telefono.setBounds(143, 90, 211, 20);
		panel_datos.add(txt_telefono);
		
		txt_direccion = new JTextArea();
		txt_direccion.setBounds(143, 129, 211, 74);
		panel_datos.add(txt_direccion);
		
		txt_adultos = new JTextField();
		txt_adultos.setBounds(10, 233, 63, 20);
		panel_datos.add(txt_adultos);
		txt_adultos.setColumns(10);
		
		txt_niños = new JTextField();
		txt_niños.setColumns(10);
		txt_niños.setBounds(157, 233, 56, 20);
		panel_datos.add(txt_niños);
		
		txt_evento = new JTextField();
		txt_evento.setEditable(false);
		txt_evento.setColumns(10);
		txt_evento.setBounds(223, 233, 131, 20);
		panel_datos.add(txt_evento);
		
		JLabel lblAdultos = new JLabel("ADULTOS");
		lblAdultos.setBounds(10, 214, 63, 14);
		panel_datos.add(lblAdultos);
		
		JLabel lblNios = new JLabel("NI\u00D1OS");
		lblNios.setBounds(157, 214, 49, 14);
		panel_datos.add(lblNios);
		
		JLabel lblEvento = new JLabel("EVENTO");
		lblEvento.setBounds(255, 214, 79, 14);
		panel_datos.add(lblEvento);
		
		JLabel lblSubtotal = new JLabel("SUBTOTAL");
		lblSubtotal.setBounds(156, 297, 79, 14);
		panel_datos.add(lblSubtotal);
		
		JLabel lblNios_1_1 = new JLabel("IVA");
		lblNios_1_1.setBounds(156, 338, 79, 14);
		panel_datos.add(lblNios_1_1);
		
		JLabel lblNios_1_2 = new JLabel("TOTAL");
		lblNios_1_2.setBounds(156, 381, 79, 14);
		panel_datos.add(lblNios_1_2);
		
		txt_subtotal = new JTextField();
		txt_subtotal.setEditable(false);
		txt_subtotal.setColumns(10);
		txt_subtotal.setBounds(239, 294, 115, 20);
		panel_datos.add(txt_subtotal);
		
		txt_iva = new JTextField();
		txt_iva.setEditable(false);
		txt_iva.setColumns(10);
		txt_iva.setBounds(239, 335, 115, 20);
		panel_datos.add(txt_iva);
		
		txt_total = new JTextField();
		txt_total.setEditable(false);
		txt_total.setColumns(10);
		txt_total.setBounds(239, 378, 115, 20);
		panel_datos.add(txt_total);
		
		JButton btn_aceptar = new JButton("ACEPTAR");
		btn_aceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ln_pc.comprobarCensura()) {
					ln_pc.crearPersona();
					ln_pc.calcularCosto();
					ln_pc.print("Datos registrados",2);					
				}else 					
					limpiar();			}
		});
		btn_aceptar.setBounds(21, 365, 106, 23);
		panel_datos.add(btn_aceptar);
		
		JButton btn_cancelar = new JButton("CANCELAR");
		btn_cancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_datos.setVisible(false);
				panel_cine= new panel_cine(peliculas);
				panel_cine.setBounds(10, 11, 439, 468);
				add(panel_cine);
				limpiar();
			}
		});
		btn_cancelar.setBounds(21, 316, 106, 23);
		panel_datos.add(btn_cancelar);
		
		JLabel lblEdad = new JLabel("3 EDAD");
		lblEdad.setBounds(96, 214, 49, 14);
		panel_datos.add(lblEdad);
		
		txt_3edad = new JTextField();
		txt_3edad.setColumns(10);
		txt_3edad.setBounds(83, 233, 63, 20);
		panel_datos.add(txt_3edad);
		ln_pc=new logica_negocio_panelCompra(this, peliculas,nombrePelicula,tipo);
		
		if(!ln_pc.comprobarCensura()) {
			txt_niños.setEditable(false);
		}
		
	}
	public void limpiar() {
		txt_subtotal.setText("");
		txt_iva.setText("");
		txt_total.setText("");
	}
}
