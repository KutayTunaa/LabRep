package com.example.demo.client;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.service.PatientService;

@Component
public class PatientSavePanel extends JFrame{
	
	private static final long serialVersionUID = -8243662125267844477L;


	@Autowired
	private PatientService patientService;
	
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	
	public PatientSavePanel() {
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Sign in:");
		btnNewButton.setBounds(0, 243, 450, 29);
		getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(101, 47, 212, 26);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(101, 98, 212, 26);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(101, 147, 212, 26);
		getContentPane().add(textField_2);
		
		JLabel lblNewLabel = new JLabel("NIN:");
		lblNewLabel.setBounds(29, 52, 61, 16);
		getContentPane().add(lblNewLabel);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(29, 103, 61, 16);
		getContentPane().add(lblName);
		
		JLabel lblSurname = new JLabel("Surname:");
		lblSurname.setBounds(29, 152, 61, 16);
		getContentPane().add(lblSurname);
	}
}
