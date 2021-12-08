package VISTA;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import CONTROLADORES.logica_negocio_panelCompra;
import MODELO.cine;
import MODELO.pelicula;
import VISTA.panel_menu;

import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class panel_compra extends JPanel {
	private JPanel panel_cine;
	private JPanel panel_asientos;
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
	public JTextField txt_TerceraEdad;
	public JComboBox combobox_horario;
	
	private logica_negocio_panelCompra ln_pc;
	
	
	/**
	 * Create the panel.
	 */
	public panel_compra(pelicula[] peliculas,String nombrePelicula,String tipo,cine ARCANE) {
		setLayout(null);
		
		JPanel panel_datos = new JPanel();
		panel_datos.setBounds(31, 21, 379, 416);
		add(panel_datos);
		panel_datos.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CEDULA");
		lblNewLabel.setBounds(10, 21, 56, 14);
		panel_datos.add(lblNewLabel);
		
		JLabel lblNombre = new JLabel("NOMBRE");
		lblNombre.setBounds(10, 46, 56, 14);
		panel_datos.add(lblNombre);
		
		JLabel lblTelefono = new JLabel("TELEFONO");
		lblTelefono.setBounds(10, 78, 79, 14);
		panel_datos.add(lblTelefono);
		
		JLabel lblDireccionn = new JLabel("DIRECCION");
		lblDireccionn.setBounds(10, 111, 79, 14);
		panel_datos.add(lblDireccionn);
		
		txt_cedula = new JTextField();
		txt_cedula.setBounds(143, 18, 211, 20);
		panel_datos.add(txt_cedula);
		txt_cedula.setColumns(10);
		
		txt_nombre = new JTextField();
		txt_nombre.setColumns(10);
		txt_nombre.setBounds(143, 47, 211, 20);
		panel_datos.add(txt_nombre);
		
		txt_telefono = new JTextField();
		txt_telefono.setColumns(10);
		txt_telefono.setBounds(143, 75, 211, 20);
		panel_datos.add(txt_telefono);
		
		txt_direccion = new JTextArea();
		txt_direccion.setBounds(143, 106, 211, 74);
		panel_datos.add(txt_direccion);
		
		txt_adultos = new JTextField();
		txt_adultos.setBounds(26, 280, 63, 20);
		panel_datos.add(txt_adultos);
		txt_adultos.setColumns(10);
		
		txt_niños = new JTextField();
		txt_niños.setColumns(10);
		txt_niños.setBounds(174, 280, 56, 20);
		panel_datos.add(txt_niños);
		
		txt_evento = new JTextField();
		txt_evento.setEditable(false);
		txt_evento.setColumns(10);
		txt_evento.setBounds(223, 191, 131, 20);
		panel_datos.add(txt_evento);
		
		JLabel lblAdultos = new JLabel("ADULTOS");
		lblAdultos.setBounds(26, 255, 63, 14);
		panel_datos.add(lblAdultos);
		
		JLabel lblNios = new JLabel("NI\u00D1OS");
		lblNios.setBounds(181, 255, 49, 14);
		panel_datos.add(lblNios);
		
		JLabel lblEvento = new JLabel("EVENTO");
		lblEvento.setBounds(108, 194, 63, 14);
		panel_datos.add(lblEvento);
		
		JLabel lblSubtotal = new JLabel("SUBTOTAL");
		lblSubtotal.setBounds(156, 320, 79, 14);
		panel_datos.add(lblSubtotal);
		
		JLabel lblNios_1_1 = new JLabel("IVA");
		lblNios_1_1.setBounds(156, 350, 79, 14);
		panel_datos.add(lblNios_1_1);
		
		JLabel lblNios_1_2 = new JLabel("TOTAL");
		lblNios_1_2.setBounds(156, 381, 79, 14);
		panel_datos.add(lblNios_1_2);
		
		txt_subtotal = new JTextField();
		txt_subtotal.setEditable(false);
		txt_subtotal.setColumns(10);
		txt_subtotal.setBounds(239, 314, 115, 20);
		panel_datos.add(txt_subtotal);
		
		txt_iva = new JTextField();
		txt_iva.setEditable(false);
		txt_iva.setColumns(10);
		txt_iva.setBounds(239, 347, 115, 20);
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
					ln_pc.contarAsientos();
					ln_pc.calcularCosto();					
					ln_pc.print("Datos registrados",2);	
				}else if(!ln_pc.comprobarCensura())	{
					ln_pc.crearPersona();
					ln_pc.contarAsientos();
					ln_pc.calcularCosto();
					ln_pc.reservarAsiento("asiento0", "IMAX");
					
				}else
					limpiar();			
				ln_pc.reservarAsiento("asiento0", "IMAX");
			}
				
		});
		btn_aceptar.setBounds(21, 365, 106, 23);
		panel_datos.add(btn_aceptar);
		
		JButton btn_cancelar = new JButton("CANCELAR");
		btn_cancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_datos.setVisible(false);
				panel_cine= new panel_cine(peliculas,ARCANE);
				panel_cine.setBounds(10, 11, 439, 468);
				add(panel_cine);
				limpiar();
			}
		});
		btn_cancelar.setBounds(21, 331, 106, 23);
		panel_datos.add(btn_cancelar);
		
		JLabel lblEdad = new JLabel("3 EDAD");
		lblEdad.setBounds(108, 255, 49, 14);
		panel_datos.add(lblEdad);
		
		txt_TerceraEdad = new JTextField();
		txt_TerceraEdad.setColumns(10);
		txt_TerceraEdad.setBounds(101, 280, 63, 20);
		panel_datos.add(txt_TerceraEdad);
		
		JButton btn_Asientos = new JButton("ASIENTOS");
		btn_Asientos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_Asientos.setBounds(251, 279, 89, 23);
		panel_datos.add(btn_Asientos);
		
		combobox_horario = new JComboBox();
		combobox_horario.setBounds(223, 222, 131, 22);
		panel_datos.add(combobox_horario);
		
		JLabel lbl_horario = new JLabel("HORARIO");
		lbl_horario.setBounds(108, 226, 79, 14);
		panel_datos.add(lbl_horario);
		ln_pc=new logica_negocio_panelCompra(this, peliculas,nombrePelicula,tipo,ARCANE);
		
		if(!ln_pc.comprobarCensura()) {
			txt_niños.setEditable(false);
		}
		
	}
	public void desplegarAsientos() {
		
		panel_asientos=new panel_asientos();
		panel_asientos.setBounds(10, 22, 700, 538);
		add(panel_asientos);
	}
	public void limpiar() {
		txt_subtotal.setText("");
		txt_iva.setText("");
		txt_total.setText("");
	}
}
