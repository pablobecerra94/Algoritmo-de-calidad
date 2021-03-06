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

public class CapacidadParaSerAtractivo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private CapacidadDeSerOperado fiabilidad;
	private Adaptabilidad usabilidad;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private String opcionElegida;
	private boolean ponderada=true;
	

	
	public CapacidadParaSerAtractivo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton radioButton = new JRadioButton("Bueno");
		radioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seleccionar();
			}
		});
		buttonGroup.add(radioButton);
		radioButton.setActionCommand("Bueno");
		radioButton.setBounds(47, 95, 109, 23);
		contentPane.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("Regular");
		radioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seleccionar();

			}
		});
		buttonGroup.add(radioButton_1);
		radioButton_1.setActionCommand("Regular");
		radioButton_1.setBounds(47, 121, 109, 23);
		contentPane.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("Malo");
		radioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seleccionar();
			}
		});
		buttonGroup.add(radioButton_2);
		radioButton_2.setActionCommand("Malo");
		radioButton_2.setBounds(47, 147, 109, 23);
		contentPane.add(radioButton_2);
		
		JButton button = new JButton("Atras");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirAnterior();
			}
		});
		button.setBounds(59, 214, 89, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Siguiente");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirSiguiente();
			}
		});
		button_1.setBounds(272, 214, 89, 23);
		contentPane.add(button_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setText("Interfaz grafica amigable");
		textArea.setEditable(false);
		textArea.setBackground(Color.LIGHT_GRAY);
		textArea.setBounds(219, 80, 142, 109);
		contentPane.add(textArea);
		
		JLabel lblFiabilidad = new JLabel("Capacidad para ser atractivo");
		lblFiabilidad.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblFiabilidad.setBounds(103, 11, 291, 48);
		contentPane.add(lblFiabilidad);
	}

	protected void abrirSiguiente() {
		if(buttonGroup.getSelection()!=null){			
			this.setVisible(false);
			usabilidad.setVisible(true);
		}
		else{
			JOptionPane.showMessageDialog(null, "Error! Debe seleccionar una opción","Error",JOptionPane.ERROR_MESSAGE);
		}		
		
	}



	protected void seleccionar() {
		setOpcionElegida(buttonGroup.getSelection().getActionCommand());
	}



	protected void abrirAnterior() {
		this.setVisible(false);
		fiabilidad.setVisible(true);
		
	}

	public void setViews(CapacidadDeSerOperado capacidadDeSerOperado, Adaptabilidad adaptabilidad) {
		this.fiabilidad=capacidadDeSerOperado;
		this.usabilidad=adaptabilidad;
		
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
