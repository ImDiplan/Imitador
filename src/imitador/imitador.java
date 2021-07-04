package imitador;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.event.*;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class imitador extends JFrame {

	private JPanel contentPane;
	private JTextField nombre;
	private JTextField apellido;
	private JTextField matri;
	private JTextField nombre1;
	private JTextField apellido1;
	private JTextField matri1;
	JRadioButton rbtnM1;
	JRadioButton rbtnF1;
	JCheckBox estudiante1;
	JCheckBox soltero1;
	JCheckBox trabajo1;
	JRadioButton rbtnM;
	JRadioButton rbtnF;
	ButtonGroup grupo;
	ButtonGroup grupo2;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					imitador frame = new imitador();
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
	public imitador() {
		inicializar();
		

	}
	
	void inicializar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 403, 440);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(Color.LIGHT_GRAY));
		panel.setBounds(10, 11, 369, 186);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lbl1 = new JLabel("Original");
		lbl1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbl1.setBounds(10, 11, 49, 14);
		panel.add(lbl1);
		
		nombre = new JTextField();
		nombre.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				nombre1.setText(nombre.getText());
			}
		});
		nombre.setBounds(10, 52, 96, 20);
		panel.add(nombre);
		nombre.setColumns(10);
		
		apellido = new JTextField();
		apellido.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				apellido1.setText(apellido.getText());
			}
		});
		apellido.setColumns(10);
		apellido.setBounds(10, 93, 96, 20);
		panel.add(apellido);
		
		matri = new JTextField();
		matri.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				matri1.setText(matri.getText());
			}
		});
		matri.setColumns(10);
		matri.setBounds(10, 133, 96, 20);
		panel.add(matri);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 36, 49, 14);
		panel.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(10, 78, 49, 14);
		panel.add(lblApellido);
		
		JLabel lblMatricula = new JLabel("Matricula");
		lblMatricula.setBounds(10, 117, 96, 14);
		panel.add(lblMatricula);
				
		JRadioButton rbtnM = new JRadioButton("Masculino");
		rbtnM.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(rbtnM.isSelected()) {
					rbtnM1.setSelected(true);
				}else {
					rbtnM1.setSelected(false);
				}
			}
		});
		rbtnM.setBounds(132, 78, 111, 23);
		panel.add(rbtnM);
		
		JRadioButton rbtnF = new JRadioButton("Femenino");
		rbtnF.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(rbtnF.isSelected()) {
					rbtnF1.setSelected(true);
				}else {
					rbtnF1.setSelected(false);
				}
			}
		});
		rbtnF.setBounds(132, 117, 111, 23);
		panel.add(rbtnF);
		
		grupo = new ButtonGroup();
		grupo.add(rbtnM);
		grupo.add(rbtnF);
		
		JCheckBox estudiante = new JCheckBox("Estudiante");
		estudiante.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(estudiante.isSelected()) {
					estudiante1.setSelected(true);
				}else {
					estudiante1.setSelected(false);
				}
			}
		});
		estudiante.setBounds(239, 51, 99, 23);
		panel.add(estudiante);
		
		JCheckBox soltero = new JCheckBox("Soltero");
		soltero.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(soltero.isSelected()) {
					soltero1.setSelected(true);
				}else {
					soltero1.setSelected(false);
				}
			}
		});
		soltero.setBounds(239, 92, 99, 23);
		panel.add(soltero);
		
		JCheckBox trabajo = new JCheckBox("Trabajador");
		trabajo.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				if(trabajo.isSelected()) {
					trabajo1.setSelected(true);
				}else {
					trabajo1.setSelected(false);
				}
			}
		});
		trabajo.setBounds(239, 132, 99, 23);
		panel.add(trabajo);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(Color.LIGHT_GRAY));
		panel_1.setBounds(10, 205, 369, 187);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lbl2 = new JLabel("Espejo");
		lbl2.setEnabled(false);
		lbl2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbl2.setBounds(10, 11, 49, 14);
		panel_1.add(lbl2);
		
		nombre1 = new JTextField();
		nombre1.setEditable(false);
		nombre1.setColumns(10);
		nombre1.setBounds(10, 52, 96, 20);
		panel_1.add(nombre1);
		
		apellido1 = new JTextField();
		apellido1.setEditable(false);
		apellido1.setColumns(10);
		apellido1.setBounds(10, 93, 96, 20);
		panel_1.add(apellido1);
		
		matri1 = new JTextField();
		matri1.setEditable(false);
		matri1.setColumns(10);
		matri1.setBounds(10, 133, 96, 20);
		panel_1.add(matri1);
		
		JLabel lblNombre_1 = new JLabel("Nombre");
		lblNombre_1.setEnabled(false);
		lblNombre_1.setBounds(10, 36, 49, 14);
		panel_1.add(lblNombre_1);
		
		JLabel lblApellido_1 = new JLabel("Apellido");
		lblApellido_1.setEnabled(false);
		lblApellido_1.setBounds(10, 78, 49, 14);
		panel_1.add(lblApellido_1);
		
		JLabel lblMatricula_1 = new JLabel("Matricula");
		lblMatricula_1.setEnabled(false);
		lblMatricula_1.setBounds(10, 117, 96, 14);
		panel_1.add(lblMatricula_1);
		
		
		rbtnM1 = new JRadioButton("Masculino");
		rbtnM1.setEnabled(false);
		rbtnM1.setBounds(137, 78, 111, 23);
		panel_1.add(rbtnM1);
		
		rbtnF1 = new JRadioButton("Femenino");
		rbtnF1.setEnabled(false);
		rbtnF1.setBounds(137, 117, 111, 23);
		panel_1.add(rbtnF1);
		
		grupo2 = new ButtonGroup();
		grupo2.add(rbtnM1);
		grupo2.add(rbtnF1);
		
		estudiante1 = new JCheckBox("Estudiante");
		estudiante1.setEnabled(false);
		estudiante1.setBounds(238, 52, 99, 23);
		panel_1.add(estudiante1);
		
		soltero1 = new JCheckBox("Soltero");
		soltero1.setEnabled(false);
		soltero1.setBounds(238, 93, 99, 23);
		panel_1.add(soltero1);
		
		trabajo1 = new JCheckBox("Trabajador");
		trabajo1.setEnabled(false);
		trabajo1.setBounds(238, 133, 99, 23);
		panel_1.add(trabajo1);		
		
	}
	
}
