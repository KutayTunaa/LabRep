package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.StaffDTO;
import com.example.demo.repository.StaffRepository;

@Service
public class StaffService {
	@Autowired
	private StaffRepository staffRepository;
	
	public StaffDTO saveStaff(StaffDTO dto) {
		return staffRepository.save(dto);
	}
}