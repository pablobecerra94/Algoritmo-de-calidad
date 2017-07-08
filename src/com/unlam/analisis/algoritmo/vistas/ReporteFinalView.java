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
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private int puntajeTotal;
	private int puntajeFuncionabilidad;
	private int puntajeEficiencia;
	private int puntajeFiabilidad;
	private int puntajeMantenibilidad;
	private int puntajeUsabilidad;
	private int puntajePortabilidad;
	private JTextField textField_6;
	private JTextField textField_7;

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
		lblCalificacin.setFont(new Font("Tahoma", Font.PLAIN, 18));
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
		btnNewButton.setBounds(96, 228, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cerrar();
			}
		});
		btnSalir.setBounds(257, 228, 89, 23);
		contentPane.add(btnSalir);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setBounds(26, 184, 46, 14);
		contentPane.add(lblTotal);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setBounds(112, 181, 86, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setBounds(231, 184, 52, 14);
		contentPane.add(lblResultado);
		
		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setBounds(317, 181, 86, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
	}

	protected void cerrar() {
		this.dispose();
	}

	protected void anterior() {
		this.setVisible(false);
		this.instalabilidad.setVisible(true);
	}



	public void calcular() {
		calcularPuntajes();
		llenarCampos(puntajeTotal>=30?"Satisfactorio":"No satisfactorio");

	}

	private void llenarCampos(String resultado) {
		textField.setText(Integer.toString(puntajeFuncionabilidad));
		textField_1.setText(Integer.toString(puntajeEficiencia));
		textField_2.setText(Integer.toString(puntajeFiabilidad));
		textField_3.setText(Integer.toString(puntajeMantenibilidad));
		textField_4.setText(Integer.toString(puntajeUsabilidad));
		textField_5.setText(Integer.toString(puntajePortabilidad));
		textField_6.setText(Integer.toString(puntajeTotal));
		textField_7.setText(resultado);
	}

	private void calcularPuntajes() {
		puntajeTotal=0;
		puntajeFuncionabilidad=darPuntos(seguridad.getOpcionElegida(),seguridad.isPonderada())
								+darPuntos(exactitud.getOpcionElegida(),exactitud.isPonderada())+
								darPuntos(adecuacion.getOpcionElegida(),adecuacion.isPonderada());
		puntajeTotal+=puntajeFuncionabilidad;
		
		puntajeEficiencia=darPuntos(utilizacionRecursos.getOpcionElegida(),utilizacionRecursos.isPonderada())+
				darPuntos(comportamientoTemporal.getOpcionElegida(),comportamientoTemporal.isPonderada());
		puntajeTotal+=puntajeEficiencia;
		
		puntajeFiabilidad=darPuntos(capacidadDeRecuperacion.getOpcionElegida(),capacidadDeRecuperacion.isPonderada())+
				darPuntos(toleranciaAFallos.getOpcionElegida(),toleranciaAFallos.isPonderada());
		puntajeTotal+=puntajeFiabilidad;
		
		puntajeMantenibilidad=darPuntos(capacidadDeSerAnalizado.getOpcionElegida(),capacidadDeSerAnalizado.isPonderada())+
				darPuntos(modificado.getOpcionElegida(),modificado.isPonderada())+
				darPuntos(estabilidad.getOpcionElegida(),estabilidad.isPonderada());
		puntajeTotal+=puntajeMantenibilidad;
		
		puntajeUsabilidad= darPuntos(capacidadDeSerEntendido.getOpcionElegida(),capacidadDeSerEntendido.isPonderada())+
				darPuntos(capacidadDeSerOperado.getOpcionElegida(),capacidadDeSerOperado.isPonderada())+
				darPuntos(capacidadParaSerAtractivo.getOpcionElegida(),capacidadParaSerAtractivo.isPonderada());
		puntajeTotal+=puntajeUsabilidad;
		
		puntajePortabilidad= darPuntos(adaptabilidad.getOpcionElegida(),adaptabilidad.isPonderada())+
				darPuntos(instalabilidad.getOpcionElegida(),instalabilidad.isPonderada());
		puntajeTotal+=puntajePortabilidad;
	}

	private int darPuntos(String opcionElegida, boolean ponderada) {
		int puntajeADevolver=0;
		if(opcionElegida.equals("Bueno")){
			 puntajeADevolver=2;
		}
		else if(opcionElegida.equals("Regular")){
			puntajeADevolver=1;
		}
		
		return ponderada?puntajeADevolver*2:puntajeADevolver;
		
	}

	public void setViews(SeguridadDeAccesoView seguridad, ExactitudView exactitud, AdecuacionView adecuacion,
			UtilizacionDeRecursosView utilizacionRecursos, ComportamientoTemporalView comportamientoTemporal,
			CapacidadDeRecuperacionView capacidadDeRecuperacion, ToleranciaAFallos toleranciaAFallos,
			CapacidadDeSerAnalizadoView capacidadDeSerAnalizado, CapacidadDeSerModificadoView modificado,
			Estabilidad estabilidad, CapacidadDeSerEntendido capacidadDeSerEntendido,
			CapacidadDeSerOperado capacidadDeSerOperado, CapacidadParaSerAtractivo capacidadParaSerAtractivo,
			Adaptabilidad adaptabilidad, Instalabilidad instalabilidad) {
		
		this.seguridad=seguridad;
		this.exactitud=exactitud;
		this.adecuacion=adecuacion;
		this.utilizacionRecursos=utilizacionRecursos;
		this.comportamientoTemporal=comportamientoTemporal;
		this.capacidadDeRecuperacion=capacidadDeRecuperacion;
		this.toleranciaAFallos=toleranciaAFallos;
		this.capacidadDeSerAnalizado=capacidadDeSerAnalizado;
		this.modificado=modificado;
		this.estabilidad=estabilidad;
		this.capacidadDeSerEntendido=capacidadDeSerEntendido;
		this.capacidadDeSerOperado=capacidadDeSerOperado;
		this.capacidadParaSerAtractivo=capacidadParaSerAtractivo;
		this.adaptabilidad=adaptabilidad;
		this.instalabilidad=instalabilidad;
		
		
	}

	
}
