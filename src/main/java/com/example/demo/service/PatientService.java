package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.PatientDTO;
import com.example.demo.repository.PatientRepository;

@Service
public class PatientService{
	@Autowired
	private PatientRepository patientRepository;
	
	public PatientDTO savePatient(PatientDTO dto1) {
		return patientRepository.save(dto1);
	}
	
}


