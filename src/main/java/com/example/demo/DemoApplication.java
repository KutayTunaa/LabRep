package com.example.demo;

import javax.swing.JFrame;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.client.PatientSavePanel;
import com.example.demo.entity.PatientDTO;
import com.example.demo.entity.ReportDTO;
import com.example.demo.entity.StaffDTO;
import com.example.demo.service.PatientService;
import com.example.demo.service.ReportService;
import com.example.demo.service.StaffService;

@SpringBootApplication
public class DemoApplication {

	@Autowired
	private StaffService staffService;
	@Autowired
	private PatientService patientService;
	@Autowired
	private ReportService reportService;

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx = new SpringApplicationBuilder(DemoApplication.class) .headless(false).run(args);

		PatientSavePanel sw = new PatientSavePanel();
        sw.setVisible(true); 

		
	}

	/*
	 * @Override public void run(String... args) throws Exception {
	 * 
	 * PatientSavePanel patientSavePage = new PatientSavePanel();
	 * patientSavePage.setVisible(true);
	 * 
	 * 
	 * 
	 * /*StaffDTO dto = new StaffDTO(); dto.setIdentificationNo("99999999999");
	 * dto.setRegistryNo("S11234"); dto.setName("Test Name");
	 * dto.setSurname("Test Surname"); staffService.saveStaff(dto);
	 * 
	 * PatientDTO dto1 = new PatientDTO();
	 * dto1.setNationalIdentificationNo("11111111111");
	 * dto1.setRegistryNo("s00123"); dto1.setName("test Name");
	 * dto1.setSurname("test Surname"); patientService.savePatient(dto1);
	 * 
	 * ReportDTO dto2 = new ReportDTO(); dto2.setFileNumber("33333333333");
	 * dto2.setDiagnosis("S11234"); dto2.setName("patience report Name");
	 * dto2.setSurname("patience report Surname"); reportService.saveReport(dto2); }
	 */


}
