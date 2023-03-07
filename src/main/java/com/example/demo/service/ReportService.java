package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.ReportDTO;
import com.example.demo.repository.ReportRepository;


@Service
public class ReportService {
	@Autowired
	private ReportRepository reportRepository;
	
	public ReportDTO saveReport(ReportDTO dto) {
		return reportRepository.save(dto);
	}

}
