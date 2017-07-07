package com.unlam.analisis.algoritmo.vistas;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
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

	/**
	 * Create the frame.
	 */
	public ReporteFinalView() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
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

}
