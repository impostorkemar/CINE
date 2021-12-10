package VISTA;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import CONTROLADORES.logica_negocio_panelAsientos;
import CONTROLADORES.logica_negocio_panelCompra;
import MODELO.cine;
import MODELO.pelicula;

import javax.swing.border.TitledBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JTextField;

public class panel_asientos extends JPanel {
	private logica_negocio_panelAsientos ln_pA;
	private logica_negocio_panelCompra ln_pc;	
	public JButton [] botones;
	public JButton [][] botones2;
	private int nAsientos, nAsientosI, nAsientosN;
	public JTextField txt_iva;
	public JTextField txt_subtotal;
	public JTextField txt_total;
	private cine ARCANE;
	//private ArrayList<String> nombres;
	/**
	 * Create the panel.
	 */
	public panel_asientos(pelicula[] peliculas,String nombrePelicula,String tipo,cine ARCANE_,int nAsientos_, ArrayList<String> nombres_,
			logica_negocio_panelCompra ln_pc_) {
		this.ARCANE=ARCANE_;
		this.nAsientos=nAsientos_;
		this.nAsientosI=ln_pc_.getAsientosIMAX();
		this.nAsientosN=nAsientos_-ln_pc_.getAsientosIMAX();
		//this.nombres= new ArrayList<String>();
		System.out.println("A: "+nAsientos_);
		setLayout(null);
		
		JPanel panel_asientos = new JPanel();
		panel_asientos.setBorder(new TitledBorder(null, "PRUEBA GENERADOR ASIENTOS", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_asientos.setBounds(10, 11, 353, 427);
		add(panel_asientos);
		panel_asientos.setLayout(null);
		
		JButton btn_confirmar = new JButton("confirmar");
		btn_confirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ln_pA.calcularCosto();
				ln_pA.reservarAsientosSeleccionados();
				btn_confirmar.setEnabled(false);
			}
		});
		btn_confirmar.setBounds(230, 364, 94, 23);
		panel_asientos.add(btn_confirmar);
		
		JButton btn_pantalla = new JButton("PANTALLA");
		btn_pantalla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_pantalla.setEnabled(false);
		btn_pantalla.setBackground(Color.CYAN);
		btn_pantalla.setBounds(24, 287, 300, 34);
		panel_asientos.add(btn_pantalla);
		
		txt_iva = new JTextField();
		txt_iva.setEditable(false);
		txt_iva.setColumns(10);
		txt_iva.setBounds(107, 365, 115, 20);
		panel_asientos.add(txt_iva);
		
		txt_subtotal = new JTextField();
		txt_subtotal.setEditable(false);
		txt_subtotal.setColumns(10);
		txt_subtotal.setBounds(107, 332, 115, 20);
		panel_asientos.add(txt_subtotal);
		
		JLabel lblSubtotal = new JLabel("SUBTOTAL");
		lblSubtotal.setBounds(24, 338, 79, 14);
		panel_asientos.add(lblSubtotal);
		
		JLabel lblNios_1_2 = new JLabel("TOTAL");
		lblNios_1_2.setBounds(24, 399, 79, 14);
		panel_asientos.add(lblNios_1_2);
		
		txt_total = new JTextField();
		txt_total.setEditable(false);
		txt_total.setColumns(10);
		txt_total.setBounds(107, 396, 115, 20);
		panel_asientos.add(txt_total);
		
		JLabel lblNios_1_1 = new JLabel("IVA");
		lblNios_1_1.setBounds(24, 368, 79, 14);
		panel_asientos.add(lblNios_1_1);
		
		//BOTONES AUTOGENERADOS IMAX
		int ancho=20, alto=20, posX=30, posY=30, i=0;
		JLabel etiqueta[]= new JLabel[10];
		botones=new JButton[10];        
        for(i=0; i<10; i++){
        	botones[i] = new JButton("asiento" + i);         	
        	botones[i].setBackground(Color.ORANGE);
        	botones[i].setForeground(Color.ORANGE);
        	botones[i].setBounds(posX*(i+1), posY, ancho, alto);
        	panel_asientos.add(botones[i]);        	
        	etiqueta[i]= new JLabel("I" + i);
        	etiqueta[i].setBounds(posX*(i+1), posY+15, ancho+5, alto+5);
        	panel_asientos.add(etiqueta[i]);
        	
        	//System.out.println(botones[i].getText().toString());
        }
        //BOTONES AUTOGENERADOS NORMALES
        int ancho2=20, alto2=20, posX2=posX, posY2=posY+40, saltoEnY=0, saltoEnX=0;
		JLabel etiqueta2[][]= new JLabel[5][10];
		botones2=new JButton[5][10];        
        for(i=0; i<5; i++){
        	for(int j=0; j<10;j++) {
        		botones2[i][j] = new JButton("asiento" + i+"_"+j);
            	botones2[i][j].setBackground(Color.BLUE);
            	botones2[i][j].setForeground(Color.BLUE);
            	botones2[i][j].setBounds(posX2*(j+1), posY2+saltoEnY, ancho2, alto2);
            	
            	etiqueta2[i][j]= new JLabel("N" + i+j);
            	etiqueta2[i][j].setBounds(posX2*(j+1), posY2+saltoEnY+20, ancho2+10, alto2);
            	
            	panel_asientos.add(etiqueta2[i][j]);
            	panel_asientos.add(botones2[i][j]);
            	//System.out.println(botones2[i][j].getText().toString());
        	}          	
        	saltoEnY+=40;        	
        }
        //AGREGANDO ACTION LISTENERS
        for(i=0; i<10;i++) {
        	final JButton auxButton=botones[i];
        	botones[i].addActionListener(new ActionListener() {        		
			public void actionPerformed(ActionEvent e) {
				if(estoyEnArrayI(auxButton.getText().toString())&&ln_pA.getNombresI().size()<nAsientosI) {
					auxButton.setBackground(Color.RED);
					auxButton.setForeground(Color.RED);
					almacenarNombresI(auxButton.getText().toString());
					imprimirI_N();
				}else {
					auxButton.setBackground(Color.ORANGE);
	    			auxButton.setForeground(Color.ORANGE);
	    			eliminarNombresI(auxButton.getText().toString());
	    			imprimirI_N();
				}					
				}
        	});
        }
        
        for(i=0; i<5;i++) {
        	for(int j=0; j<10;j++) {
        		final JButton auxButton2=botones2[i][j];        		
        		botones2[i][j].addActionListener(new ActionListener() {        		
				public void actionPerformed(ActionEvent e) {
					if(estoyEnArrayN(auxButton2.getText().toString())&&ln_pA.getNombresN().size()<nAsientosN) {						
						auxButton2.setBackground(Color.RED);
						auxButton2.setForeground(Color.RED);
						almacenarNombresN(auxButton2.getText().toString());
						imprimirI_N();
					}else {						
						auxButton2.setBackground(Color.BLUE);
		    			auxButton2.setForeground(Color.BLUE);
		    			eliminarNombresN(auxButton2.getText().toString());
		    			imprimirI_N();
					}					
					}
	        	});
        	}
        	
        }
        
		ln_pA= new logica_negocio_panelAsientos(this, nombres_,tipo,ln_pc_.getNumeroAdultos(),ln_pc_.getNumeroNiños(),
				ln_pc_.getNumeroTerceraEdad(),ARCANE,ln_pc_);
		//crearBotones(this);
		
	}
	public boolean estoyEnArrayI(String nombreBoton) {
		boolean flag=true;
		for(String auxNombre:ln_pA.getNombresI()) {
			if(auxNombre.contains(nombreBoton)) {
				flag=false;
			}
		}
		return flag;
	}
	public boolean estoyEnArrayN(String nombreBoton) {
		boolean flag=true;		
		for(String auxNombre1:ln_pA.getNombresN()) {
			if(auxNombre1.contains(nombreBoton)) {
				flag=false;
			}
		}
		return flag;
	}
	//ALMACENAR ARRRAY IMAX
	public void almacenarNombresI(String nombreBotones) {
		boolean flag=true;
		for(String auxNombre:ln_pA.getNombresI()) {
			if(auxNombre.contains(nombreBotones)) {
				flag=false;
			}
		}
		if(flag==true) {
			ln_pA.getNombresI().add(nombreBotones);			
		}
	}
	//ALMACENAR ARRAR NORMALES	
	public void almacenarNombresN(String nombreBotones) {
		boolean flag=true;
		for(String auxNombre:ln_pA.getNombresN()) {
			if(auxNombre.contains(nombreBotones)) {
				flag=false;
			}
		}
		if(flag==true) {
			ln_pA.getNombresN().add(nombreBotones);			
		}	
	}
	public void eliminarNombresI(String nombreBotones) {
		ln_pA.getNombresI().remove(nombreBotones);			
	}
	public void eliminarNombresN(String nombreBotones) {
		ln_pA.getNombresN().remove(nombreBotones);
			
	}
	public void bloquearAsientosReservados(String[] nombres) {
		for(int i=0; i<botones.length; i++){
			for(int j=0;j<nombres.length;j++) {
				if(botones[i].getText().toString().equals(nombres[j])){
					botones[i].setBackground(Color.BLACK);
					botones[i].setBackground(Color.BLACK);
					botones[i].setEnabled(false);					
				}
			}			
		}
	}
	public void imprimirI_N() {
		System.out.println("AsientoosCliqueadosI: "+ln_pA.getNombresI().size()+" AsientosRecibidos"+nAsientos);
		System.out.println("AsientoosCliqueadosN: "+ln_pA.getNombresN().size()+" AsientosRecibidos"+nAsientos);
		System.out.println("\nBOTONES ALMACENADOS IMAX\n");
		for(String auxNombre:ln_pA.getNombresI()) {
			System.out.println(auxNombre);
		}
		System.out.println("\nBOTONES ALMACENADOS NORMALES\n");
		for(String auxNombre:ln_pA.getNombresN()) {
			System.out.println(auxNombre);
		}
	}
	public void limpiar() {
		txt_subtotal.setText("");
		txt_iva.setText("");
		txt_total.setText("");
	}
}
