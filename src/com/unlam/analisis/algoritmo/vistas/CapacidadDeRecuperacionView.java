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

public class CapacidadDeRecuperacionView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private ComportamientoTemporalView usabilidad;
	private ToleranciaAFallos reporte;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private String opcionElegida;
	private boolean ponderada=false;
	

	/**
	 * Create the frame.
	 */
	public CapacidadDeRecuperacionView() {
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
		
		JButton btnFinalizar = new JButton("Siguiente");
		btnFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				abrirSiguiente();
			}
		});
		btnFinalizar.setBounds(272, 214, 89, 23);
		contentPane.add(btnFinalizar);
		
		JTextArea textArea = new JTextArea();
		textArea.setText("Reanudacion luego de\nerrores criticos");
		textArea.setEditable(false);
		textArea.setBackground(Color.LIGHT_GRAY);
		textArea.setBounds(219, 80, 142, 109);
		contentPane.add(textArea);
		
		JLabel lblFiabilidad = new JLabel("Capacidad de Recuperación");
		lblFiabilidad.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblFiabilidad.setBounds(73, 11, 325, 48);
		contentPane.add(lblFiabilidad);
	}



	public void setViews(ComportamientoTemporalView usabilidad2, ToleranciaAFallos reporte2) {
		this.usabilidad=usabilidad2;
		this.reporte=reporte2;
		
	}
	
	protected void abrirSiguiente() {
		if(buttonGroup.getSelection()!=null){			
			this.setVisible(false);
			reporte.setVisible(true);
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
		usabilidad.setVisible(true);
		
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
