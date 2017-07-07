package com.unlam.analisis.algoritmo.vistas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class SeguridadDeAccesoView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private String opcionElegida;
	ExactitudView exactitud;
	private boolean ponderada=true;

	/**
	 * Create the frame.
	 */
	public SeguridadDeAccesoView() {
		setTitle("Algoritmo de calidad");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JRadioButton rdbtnBueno = new JRadioButton("Bueno");
		rdbtnBueno.setActionCommand("Bueno");
		rdbtnBueno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seleccionar();
			}
		});
		buttonGroup.add(rdbtnBueno);
		rdbtnBueno.setBounds(44, 93, 109, 23);
		contentPane.add(rdbtnBueno);

		JRadioButton rdbtnMalo = new JRadioButton("Malo");
		rdbtnMalo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seleccionar();
			}
		});
		rdbtnMalo.setActionCommand("Malo");
		buttonGroup.add(rdbtnMalo);
		rdbtnMalo.setBounds(44, 145, 109, 23);
		contentPane.add(rdbtnMalo);

		JRadioButton rdbtnRegular = new JRadioButton("Regular");
		rdbtnRegular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seleccionar();
			}
		});
		rdbtnRegular.setActionCommand("Regular");
		buttonGroup.add(rdbtnRegular);
		rdbtnRegular.setBounds(44, 119, 109, 23);
		contentPane.add(rdbtnRegular);

		JLabel lblFuncionalidad = new JLabel("Seguridad");
		lblFuncionalidad.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblFuncionalidad.setBounds(121, 11, 173, 48);
		contentPane.add(lblFuncionalidad);

		JTextArea txtrExplicacion = new JTextArea();
		txtrExplicacion.setBackground(Color.LIGHT_GRAY);
		txtrExplicacion.setText("Integridad y confidencialidad \nde los  datos");
		txtrExplicacion.setEditable(false);
		txtrExplicacion.setBounds(216, 76, 191, 109);
		contentPane.add(txtrExplicacion);

		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarSiguiente();
				
			}
		});
		btnSiguiente.setBounds(269, 212, 89, 23);
		contentPane.add(btnSiguiente);

		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cerrar();
			}
		});
		btnSalir.setBounds(56, 212, 89, 23);
		contentPane.add(btnSalir);
	}

	protected void mostrarSiguiente() {
		if(buttonGroup.getSelection()!=null){			
			this.setVisible(false);
			exactitud.setVisible(true);
		}
		else{
			JOptionPane.showMessageDialog(null, "Error! Debe seleccionar una opción","Error",JOptionPane.ERROR_MESSAGE);
		}
		
	}

	protected void seleccionar() {
		setOpcionElegida(buttonGroup.getSelection().getActionCommand());
	}

	protected void cerrar() {
		this.dispose();

	}

	public String getOpcionElegida() {
		return opcionElegida;
	}

	public void setOpcionElegida(String opcionElegida) {
		this.opcionElegida = opcionElegida;
	}

	public void setViews(ExactitudView eficiencia2) {
		this.exactitud=eficiencia2;		
	}

	public boolean isPonderada() {
		return ponderada;
	}

	public void setPonderada(boolean ponderada) {
		this.ponderada = ponderada;
	}
}
