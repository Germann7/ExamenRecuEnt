package com.ejemplo.calculadora;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class Ventanas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventanas frame = new Ventanas();
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
	public Ventanas() {
		setBackground(new Color(255, 255, 0));
		setFont(new Font("Dialog", Font.BOLD, 12));
		setForeground(Color.RED);
		setForeground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 398, 326);
	
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NUEVO USUARIO");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(80, 0, 296, 35);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		lblNewLabel_1.setBounds(30, 33, 44, 12);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(102, 30, 137, 18);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Contraseña:");
		lblNewLabel_2.setBounds(30, 61, 56, 12);
		contentPane.add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(102, 58, 116, 18);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_3 = new JLabel("Idioma:");
		lblNewLabel_3.setBounds(30, 90, 44, 12);
		contentPane.add(lblNewLabel_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground((Color.GRAY));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Español"}));
		comboBox.setBounds(102, 86, 67, 20);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_4 = new JLabel("Correo electronico:");
		lblNewLabel_4.setBounds(10, 119, 88, 12);
		contentPane.add(lblNewLabel_4);
		
		textField_1 = new JTextField();
		textField_1.setBounds(102, 116, 117, 18);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Comunicacion");
		lblNewLabel_5.setBounds(19, 156, 67, 12);
		contentPane.add(lblNewLabel_5);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Telefono");
		rdbtnNewRadioButton.setBackground(new Color(128, 128, 128));
		rdbtnNewRadioButton.setBounds(102, 156, 102, 20);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Correo electrónico");
		rdbtnNewRadioButton_1.setBackground(new Color(128, 128, 128));
		rdbtnNewRadioButton_1.setBounds(102, 178, 116, 20);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_6 = new JLabel("Observaciones");
		lblNewLabel_6.setBounds(30, 210, 68, 12);
		contentPane.add(lblNewLabel_6);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(125, 204, 114, 34);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.setForeground(new Color(64, 0, 0));
		btnNewButton.setBackground(new Color(255, 255, 128));
		btnNewButton.setContentAreaFilled(true);
		btnNewButton.setBounds(30, 243, 77, 18);
		btnNewButton.setBackground(Color.YELLOW);
		btnNewButton.setOpaque(true);
		btnNewButton.setContentAreaFilled(false);
		btnNewButton.setBorderPainted(false);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Borrar datos");
		btnNewButton_1.setBounds(163, 243, 116, 20);
		contentPane.add(btnNewButton_1);

	}
}
