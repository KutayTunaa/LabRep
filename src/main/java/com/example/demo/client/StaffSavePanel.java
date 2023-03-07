package com.example.demo.client;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.service.StaffService;

import javax.swing.JButton;

@Component
public class StaffSavePanel extends JFrame {
	
	private static final long serialVersionUID = -3956062552195004368L;	
	
	@Autowired
	private StaffService staffService;
	
	
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	public StaffSavePanel() {
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Staff ID:");
		lblNewLabel.setBounds(34, 53, 61, 16);
		getContentPane().add(lblNewLabel);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(34, 94, 61, 16);
		getContentPane().add(lblName);
		
		JLabel lblSurname = new JLabel("Surname:");
		lblSurname.setBounds(34, 138, 61, 16);
		getContentPane().add(lblSurname);
		
		textField = new JTextField();
		textField.setBounds(107, 51, 218, 26);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(107, 89, 218, 26);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(107, 133, 218, 26);
		getContentPane().add(textField_2);
		
		JButton btnNewButton = new JButton("Sign in:");
		btnNewButton.setBounds(18, 237, 426, 29);
		getContentPane().add(btnNewButton);
	}
}
