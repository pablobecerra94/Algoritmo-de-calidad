package com.unlam.analisis.algoritmo.vistas;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Main extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private FiabilidadView fiabilidad=new FiabilidadView();
	private MantenibilidadView mantenibilidad=new MantenibilidadView();
	private PortabilidadView portabilidad = new PortabilidadView();
	private UsabilidadView usabilidad = new UsabilidadView();
	
	private EficienciaView eficiencia =new EficienciaView();
	private FuncionalidadView funcionalidad= new FuncionalidadView();
	private ReporteFinalView reporte= new ReporteFinalView();	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAlgoritmoDeCalidad = new JLabel("Algoritmo de Calidad");
		lblAlgoritmoDeCalidad.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblAlgoritmoDeCalidad.setBounds(60, 11, 317, 48);
		contentPane.add(lblAlgoritmoDeCalidad);
		
		JButton btnComenzar = new JButton("Comenzar");
		btnComenzar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comenzar();
			}
		});
		btnComenzar.setBounds(163, 109, 89, 23);
		contentPane.add(btnComenzar);
	}

	protected void comenzar() {
		 fiabilidad.setViews(eficiencia,mantenibilidad);
		 mantenibilidad.setViews(fiabilidad,usabilidad);
		 portabilidad.setViews(usabilidad,reporte);
		 usabilidad.setViews(mantenibilidad,portabilidad);
		 funcionalidad.setViews(eficiencia);
		 eficiencia.setViews(funcionalidad,fiabilidad);
		 reporte.setViews(fiabilidad,mantenibilidad,portabilidad,usabilidad,eficiencia,funcionalidad);
		 funcionalidad.setVisible(true);
		
	}

}
