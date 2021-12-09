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
	private JPanel prueba;	
	public JTextField txt_cedula;
	public JTextField txt_nombre;
	public JTextField txt_telefono;
	public JTextField txt_adultos;
	public JTextField txt_niños;
	public JTextField txt_evento;
	public JTextArea txt_direccion;
	public JTextField txt_TerceraEdad;
	public JComboBox combobox_horario;
	
	private logica_negocio_panelCompra ln_pc;
	
	
	/**
	 * Create the panel.
	 */
	public panel_compra(pelicula[] peliculas,String nombrePelicula,String tipo,cine ARCANE) {
		setLayout(null);
		
		JPanel panel_compra = new JPanel();
		panel_compra.setBounds(31, 21, 379, 416);
		add(panel_compra);
		panel_compra.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CEDULA");
		lblNewLabel.setBounds(10, 21, 56, 14);
		panel_compra.add(lblNewLabel);
		
		JLabel lblNombre = new JLabel("NOMBRE");
		lblNombre.setBounds(10, 46, 56, 14);
		panel_compra.add(lblNombre);
		
		JLabel lblTelefono = new JLabel("TELEFONO");
		lblTelefono.setBounds(10, 78, 79, 14);
		panel_compra.add(lblTelefono);
		
		JLabel lblDireccionn = new JLabel("DIRECCION");
		lblDireccionn.setBounds(10, 111, 79, 14);
		panel_compra.add(lblDireccionn);
		
		txt_cedula = new JTextField();
		txt_cedula.setBounds(143, 18, 211, 20);
		panel_compra.add(txt_cedula);
		txt_cedula.setColumns(10);
		
		txt_nombre = new JTextField();
		txt_nombre.setColumns(10);
		txt_nombre.setBounds(143, 47, 211, 20);
		panel_compra.add(txt_nombre);
		
		txt_telefono = new JTextField();
		txt_telefono.setColumns(10);
		txt_telefono.setBounds(143, 75, 211, 20);
		panel_compra.add(txt_telefono);
		
		txt_direccion = new JTextArea();
		txt_direccion.setBounds(143, 106, 211, 74);
		panel_compra.add(txt_direccion);
		
		txt_adultos = new JTextField();
		txt_adultos.setBounds(26, 280, 63, 20);
		panel_compra.add(txt_adultos);
		txt_adultos.setColumns(10);
		
		txt_niños = new JTextField();
		txt_niños.setColumns(10);
		txt_niños.setBounds(174, 280, 56, 20);
		panel_compra.add(txt_niños);
		
		txt_evento = new JTextField();
		txt_evento.setEditable(false);
		txt_evento.setColumns(10);
		txt_evento.setBounds(223, 191, 131, 20);
		panel_compra.add(txt_evento);
		
		JLabel lblAdultos = new JLabel("ADULTOS");
		lblAdultos.setBounds(26, 255, 63, 14);
		panel_compra.add(lblAdultos);
		
		JLabel lblNios = new JLabel("NI\u00D1OS");
		lblNios.setBounds(181, 255, 49, 14);
		panel_compra.add(lblNios);
		
		JLabel lblEvento = new JLabel("EVENTO");
		lblEvento.setBounds(108, 194, 63, 14);
		panel_compra.add(lblEvento);
		
		JButton btn_aceptar = new JButton("ACEPTAR");
		btn_aceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ln_pc.comprobarCensura()) {
					ln_pc.crearPersona();
					ln_pc.contarAsientos();
					if(ln_pc.getNumeroAsientos()!=0) {
						ln_pc.print("Datos registrados",2);	
					}else {
						ln_pc.print("Ingrese por lo menos un asiento a comprar",2);
					}
				}else if(!ln_pc.comprobarCensura())	{
					ln_pc.crearPersona();
					ln_pc.contarAsientos();										
					if(ln_pc.getNumeroAsientos()!=0) {
						ln_pc.print("Datos registrados",2);
					}else {
						ln_pc.print("Ingrese por lo menos un asiento a comprar",2);
					}
				}
			}
				
		});
		btn_aceptar.setBounds(21, 365, 106, 23);
		panel_compra.add(btn_aceptar);
		
		JButton btn_cancelar = new JButton("CANCELAR");
		btn_cancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_compra.setVisible(false);
				panel_cine= new panel_cine(peliculas,ARCANE);
				panel_cine.setBounds(10, 11, 439, 468);
				add(panel_cine);
				
			}
		});
		btn_cancelar.setBounds(21, 331, 106, 23);
		panel_compra.add(btn_cancelar);
		
		JLabel lblEdad = new JLabel("3 EDAD");
		lblEdad.setBounds(108, 255, 49, 14);
		panel_compra.add(lblEdad);
		
		txt_TerceraEdad = new JTextField();
		txt_TerceraEdad.setColumns(10);
		txt_TerceraEdad.setBounds(101, 280, 63, 20);
		panel_compra.add(txt_TerceraEdad);
		
		JButton btn_Asientos = new JButton("ASIENTOS");
		btn_Asientos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ln_pc.getNumeroAsientos()!=0) {
					panel_compra.setVisible(false);
					prueba= new prueba(peliculas,nombrePelicula,tipo,ARCANE,ln_pc.getNumeroAsientos(),ln_pc.getNombresAsientos(),ln_pc);
					prueba.setBounds(10, 11, 439, 468);
					add(prueba);
				}else {
					ln_pc.print("Ingrese por lo menos un asiento a comprar",2);
				}
				
			}
		});
		btn_Asientos.setBounds(240, 279, 114, 23);
		panel_compra.add(btn_Asientos);
		
		combobox_horario = new JComboBox();
		combobox_horario.setBounds(223, 222, 131, 22);
		panel_compra.add(combobox_horario);
		
		JLabel lbl_horario = new JLabel("HORARIO");
		lbl_horario.setBounds(108, 226, 79, 14);
		panel_compra.add(lbl_horario);
		ln_pc=new logica_negocio_panelCompra(this, peliculas,nombrePelicula,tipo,ARCANE);
		
		if(!ln_pc.comprobarCensura()) {
			txt_niños.setEditable(false);
		}
		
	}
	
	
}
