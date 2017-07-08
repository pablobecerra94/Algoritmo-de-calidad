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
	private SeguridadDeAccesoView seguridad= new SeguridadDeAccesoView();
	private ExactitudView exactitud =new ExactitudView();
	private AdecuacionView adecuacion=new AdecuacionView();
	private UtilizacionDeRecursosView utilizacionRecursos=new UtilizacionDeRecursosView();
	private ComportamientoTemporalView comportamientoTemporal = new ComportamientoTemporalView();
	private CapacidadDeRecuperacionView capacidadDeRecuperacion = new CapacidadDeRecuperacionView();
	private ToleranciaAFallos toleranciaAFallos= new ToleranciaAFallos();
	private CapacidadDeSerAnalizadoView capacidadDeSerAnalizado = new CapacidadDeSerAnalizadoView();
	private CapacidadDeSerModificadoView modificado = new CapacidadDeSerModificadoView();
	private Estabilidad estabilidad = new Estabilidad();
	private CapacidadDeSerEntendido capacidadDeSerEntendido = new CapacidadDeSerEntendido();
	private CapacidadDeSerOperado capacidadDeSerOperado = new CapacidadDeSerOperado();
	private CapacidadParaSerAtractivo capacidadParaSerAtractivo = new CapacidadParaSerAtractivo();
	private Adaptabilidad adaptabilidad = new Adaptabilidad();
	private Instalabilidad instalabilidad = new Instalabilidad();
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
		 seguridad.setViews(exactitud);
		 exactitud.setViews(seguridad,adecuacion);
		 adecuacion.setViews(exactitud,utilizacionRecursos);
		 utilizacionRecursos.setViews(adecuacion,comportamientoTemporal);
		 comportamientoTemporal.setViews(utilizacionRecursos,capacidadDeRecuperacion);
		 capacidadDeRecuperacion.setViews(comportamientoTemporal,toleranciaAFallos);
		 toleranciaAFallos.setViews(capacidadDeRecuperacion,capacidadDeSerAnalizado);
		 capacidadDeSerAnalizado.setViews(toleranciaAFallos, modificado);
		 modificado.setViews(capacidadDeSerAnalizado, estabilidad);
		 estabilidad.setViews(modificado, capacidadDeSerEntendido);
		 capacidadDeSerEntendido.setViews(estabilidad, capacidadDeSerOperado);
		 capacidadDeSerOperado.setViews(capacidadDeSerEntendido, capacidadParaSerAtractivo);
		 capacidadParaSerAtractivo.setViews(capacidadDeSerOperado, adaptabilidad);
		 adaptabilidad.setViews(capacidadParaSerAtractivo, instalabilidad);
		 instalabilidad.setViews(adaptabilidad, reporte);
		 
		 reporte.setViews(seguridad,exactitud,adecuacion,utilizacionRecursos,
				 comportamientoTemporal,capacidadDeRecuperacion,toleranciaAFallos,capacidadDeSerAnalizado,modificado,
				 estabilidad,capacidadDeSerEntendido,capacidadDeSerOperado,capacidadParaSerAtractivo,adaptabilidad,instalabilidad);
		 seguridad.setVisible(true);
		 this.dispose();
		
	}

}
