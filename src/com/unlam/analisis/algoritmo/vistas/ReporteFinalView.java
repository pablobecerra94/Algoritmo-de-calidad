package com.unlam.analisis.algoritmo.vistas;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ReporteFinalView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private FiabilidadView fiabilidad;
	private MantenibilidadView mantenibilidad;
	private PortabilidadView portabilidad;
	private UsabilidadView usabilidad;
	private FuncionalidadView funcionalidad;
	private EficienciaView eficiencia;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Create the frame.
	 */
	public ReporteFinalView() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCalificacin = new JLabel("Calificación");
		lblCalificacin.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblCalificacin.setBounds(130, 11, 160, 48);
		contentPane.add(lblCalificacin);
		
		JLabel lblFuncionalidad = new JLabel("Funcionalidad");
		lblFuncionalidad.setBounds(26, 64, 87, 14);
		contentPane.add(lblFuncionalidad);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(112, 61, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblEficiencia = new JLabel("Eficiencia");
		lblEficiencia.setBounds(26, 106, 46, 14);
		contentPane.add(lblEficiencia);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(112, 103, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblFiabilidad = new JLabel("Fiabilidad");
		lblFiabilidad.setBounds(26, 144, 46, 14);
		contentPane.add(lblFiabilidad);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setBounds(112, 141, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblMantenibilidad = new JLabel("Mantenibilidad");
		lblMantenibilidad.setBounds(231, 61, 100, 14);
		contentPane.add(lblMantenibilidad);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBounds(317, 61, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblUsabilidad = new JLabel("Usabilidad");
		lblUsabilidad.setBounds(231, 106, 87, 14);
		contentPane.add(lblUsabilidad);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setBounds(317, 103, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblPortabilidad = new JLabel("Portabilidad");
		lblPortabilidad.setBounds(231, 144, 100, 14);
		contentPane.add(lblPortabilidad);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setBounds(317, 141, 86, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnNewButton = new JButton("Atras");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				anterior();
			}
		});
		btnNewButton.setBounds(97, 209, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cerrar();
			}
		});
		btnSalir.setBounds(253, 209, 89, 23);
		contentPane.add(btnSalir);
	}

	protected void cerrar() {
		this.dispose();
	}

	protected void anterior() {
		this.setVisible(false);
		portabilidad.setVisible(true);	
	}

	public void setViews(FiabilidadView fiabilidad2, MantenibilidadView mantenibilidad2, PortabilidadView portabilidad2,
			UsabilidadView usabilidad2, EficienciaView eficiencia2, FuncionalidadView funcionalidad2) {
		this.funcionalidad = funcionalidad2;
		this.eficiencia = eficiencia2;
		this.usabilidad = usabilidad2;
		this.portabilidad = portabilidad2;
		this.mantenibilidad = mantenibilidad2;
		this.fiabilidad = fiabilidad2;
	}

	public void calcular() {
		// TODO hacer calculo.
		
	}
}
