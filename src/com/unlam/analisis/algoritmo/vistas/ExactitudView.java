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

public class ExactitudView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private SeguridadDeAccesoView seguridad;
	private AdecuacionView fiabilidad;
	private String opcionElegida;
	private boolean ponderada=false;


	/**
	 * Create the frame.
	 * @param fiabilidad 
	 * @param seguridad 
	 */
	public ExactitudView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAdecuacion = new JLabel("Exactitud");
		lblAdecuacion.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAdecuacion.setBounds(156, 11, 160, 48);
		contentPane.add(lblAdecuacion);
		
		JRadioButton radioButton = new JRadioButton("Bueno");
		radioButton.setActionCommand("Bueno");
		radioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seleccionar();
			}
		});
		buttonGroup.add(radioButton);
		radioButton.setBounds(55, 95, 109, 23);
		contentPane.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("Regular");
		radioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seleccionar();
			}
		});
		radioButton_1.setActionCommand("Regular");
		buttonGroup.add(radioButton_1);
		radioButton_1.setBounds(55, 121, 109, 23);
		contentPane.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("Malo");
		radioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seleccionar();
			}
		});
		radioButton_2.setActionCommand("Malo");
		buttonGroup.add(radioButton_2);
		radioButton_2.setBounds(55, 147, 109, 23);
		contentPane.add(radioButton_2);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirFuncionalidad();
			}
		});
		btnAtras.setBounds(67, 214, 89, 23);
		contentPane.add(btnAtras);
		
		JButton button_1 = new JButton("Siguiente");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirSiguiente();
			}
		});
		button_1.setBounds(280, 214, 89, 23);
		contentPane.add(button_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setText("Informes realizados\ncorrectamente");
		textArea.setEditable(false);
		textArea.setBackground(Color.LIGHT_GRAY);
		textArea.setBounds(227, 80, 142, 109);
		contentPane.add(textArea);
	}

	protected void abrirSiguiente() {
		if(buttonGroup.getSelection()!=null){			
			this.setVisible(false);
			fiabilidad.setVisible(true);
		}
		else{
			JOptionPane.showMessageDialog(null, "Error! Debe seleccionar una opción","Error",JOptionPane.ERROR_MESSAGE);
		}		
	}

	protected void seleccionar() {
		setOpcionElegida(buttonGroup.getSelection().getActionCommand());
		
	}

	protected void abrirFuncionalidad() {
		this.setVisible(false);
		seguridad.setVisible(true);
	}
	
	public void setViews(SeguridadDeAccesoView seguridad,AdecuacionView fiabilidad){
		this.seguridad=seguridad;
		this.fiabilidad=fiabilidad;
	}

	public String getOpcionElegida() {
		return opcionElegida;
	}

	public void setOpcionElegida(String opcionElegida) {
		this.opcionElegida = opcionElegida;
	}

	public boolean isPonderada() {
		return ponderada;
	}

	public void setPonderada(boolean ponderada) {
		this.ponderada = ponderada;
	}

}
