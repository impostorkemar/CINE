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
import javax.swing.JCheckBox;

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
	public JCheckBox chck_adultos;
	public JCheckBox chck_tercerEdad;
	public JCheckBox chck_niños;
	
	private logica_negocio_panelCompra ln_pc;
	
	
	
	/**
	 * Create the panel.
	 */
	public panel_compra(pelicula[] peliculas,String nombrePelicula,String tipo,cine ARCANE) {
		setLayout(null);
		
		JPanel panel_compra = new JPanel();
		panel_compra.setBounds(0,0, 1024, 800);
		add(panel_compra);
		panel_compra.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CEDULA");
		lblNewLabel.setBounds(10, 14, 56, 14);
		panel_compra.add(lblNewLabel);
		
		JLabel lblNombre = new JLabel("NOMBRE");
		lblNombre.setBounds(10, 39, 56, 14);
		panel_compra.add(lblNombre);
		
		JLabel lblTelefono = new JLabel("TELEFONO");
		lblTelefono.setBounds(10, 71, 79, 14);
		panel_compra.add(lblTelefono);
		
		JLabel lblDireccionn = new JLabel("DIRECCION");
		lblDireccionn.setBounds(10, 104, 79, 14);
		panel_compra.add(lblDireccionn);
		
		txt_cedula = new JTextField();
		txt_cedula.setBounds(121, 11, 233, 20);
		panel_compra.add(txt_cedula);
		txt_cedula.setColumns(10);
		
		txt_nombre = new JTextField();
		txt_nombre.setColumns(10);
		txt_nombre.setBounds(121, 40, 233, 20);
		panel_compra.add(txt_nombre);
		
		txt_telefono = new JTextField();
		txt_telefono.setColumns(10);
		txt_telefono.setBounds(121, 68, 233, 20);
		panel_compra.add(txt_telefono);
		
		txt_direccion = new JTextArea();
		txt_direccion.setBounds(121, 99, 233, 38);
		panel_compra.add(txt_direccion);
		
		txt_adultos = new JTextField();
		txt_adultos.setBounds(212, 226, 63, 20);
		panel_compra.add(txt_adultos);
		txt_adultos.setColumns(10);
		
		txt_niños = new JTextField();
		txt_niños.setColumns(10);
		txt_niños.setBounds(211, 288, 64, 20);
		panel_compra.add(txt_niños);
		
		txt_evento = new JTextField();
		txt_evento.setEditable(false);
		txt_evento.setColumns(10);
		txt_evento.setBounds(223, 148, 131, 20);
		panel_compra.add(txt_evento);
		
		JLabel lblAdultos = new JLabel("ADULTOS");
		lblAdultos.setBounds(71, 226, 63, 14);
		panel_compra.add(lblAdultos);
		
		JLabel lblNios = new JLabel("NI\u00D1OS");
		lblNios.setBounds(74, 288, 49, 14);
		panel_compra.add(lblNios);
		
		JLabel lblEvento = new JLabel("EVENTO");
		lblEvento.setBounds(108, 151, 63, 14);
		panel_compra.add(lblEvento);
		
		JButton btn_confirmar = new JButton("CONFIRMAR");
		btn_confirmar.addActionListener(new ActionListener() {
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
		btn_confirmar.setBounds(201, 319, 111, 23);
		panel_compra.add(btn_confirmar);
		
		JButton btn_cancelar = new JButton("CANCELAR");
		btn_cancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_compra.setVisible(false);
				panel_cine= new panel_cine(peliculas,ARCANE);
				panel_cine.setBounds(0,0,1024,800);
				add(panel_cine);
				
			}
		});
		btn_cancelar.setBounds(71, 353, 119, 23);
		panel_compra.add(btn_cancelar);
		
		JLabel lblEdad = new JLabel("TERCERA EDAD");
		lblEdad.setBounds(71, 257, 97, 14);
		panel_compra.add(lblEdad);
		
		txt_TerceraEdad = new JTextField();
		txt_TerceraEdad.setColumns(10);
		txt_TerceraEdad.setBounds(212, 257, 63, 20);
		panel_compra.add(txt_TerceraEdad);
		
		JButton btn_Asientos = new JButton("ASIENTOS");
		btn_Asientos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(ln_pc.getNumeroAsientos()!=0) {
					panel_compra.setVisible(false);
					ln_pc.cargarHorario();
					prueba= new panel_asientos(peliculas,nombrePelicula,tipo,ARCANE,ln_pc.getNumeroAsientos(),ln_pc.getNombresAsientos(),ln_pc, ln_pc.getSalaH());
					prueba.setBounds(0 , 0 ,1024 ,800);
					add(prueba);
				}else {
					ln_pc.print("Ingrese por lo menos un asiento a comprar",2);
				}
				
			}
		});
		btn_Asientos.setBounds(201, 353, 131, 23);
		panel_compra.add(btn_Asientos);
		
		combobox_horario = new JComboBox();
		combobox_horario.setBounds(223, 179, 131, 22);
		panel_compra.add(combobox_horario);
		
		JLabel lbl_horario = new JLabel("HORARIO");
		lbl_horario.setBounds(108, 183, 79, 14);
		panel_compra.add(lbl_horario);
		
		chck_adultos = new JCheckBox("");
		chck_adultos.setBounds(291, 226, 21, 23);
		panel_compra.add(chck_adultos);
		
		chck_tercerEdad = new JCheckBox("");
		chck_tercerEdad.setBounds(291, 258, 21, 23);
		panel_compra.add(chck_tercerEdad);
		
		chck_niños = new JCheckBox("");
		chck_niños.setBounds(291, 288, 21, 23);
		panel_compra.add(chck_niños);
		
		JLabel lbl_IMAX = new JLabel("IMAX");
		lbl_IMAX.setBounds(285, 212, 49, 14);
		panel_compra.add(lbl_IMAX);
		ln_pc=new logica_negocio_panelCompra(this, peliculas,nombrePelicula,tipo,ARCANE);
		
		if(!ln_pc.comprobarCensura()) {
			txt_niños.setEditable(false);
		}
		
	}
}
