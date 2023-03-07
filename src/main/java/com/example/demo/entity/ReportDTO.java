package com.example.demo.entity;

import java.io.Serializable;
import java.sql.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="report", schema = "public")
public class ReportDTO implements Serializable{
		
	private static final long serialVersionUID = -313508986756637112L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Reportid")
	private Long reportId;
	
	@Column(name="fileNumber")
	private String fileNumber;
		
	@Column(name="name")
	private String name;

	@Column(name="surname")
	private String surname;
		
	@Column(name="patientNationalIdentityNumber")
	private String patientNationalIdentityNumber;
		
	@Column(name="diagnosis")
	private String diagnosis;
		
	@Column(name="date")
	private Date date;
	
	public Long getReportId() {
		return reportId;
	}

	public void setReportId(Long reportId) {
		this.reportId = reportId;
	}

	public String getFileNumber() {
		return fileNumber;
	}

	public void setFileNumber(String fileNumber) {
		this.fileNumber = fileNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPatientNationalIdentityNumber() {
		return patientNationalIdentityNumber;
	}

	public void setPatientNationalIdentityNumber(String patientNationalIdentityNumber) {
		this.patientNationalIdentityNumber = patientNationalIdentityNumber;
	}

	public String getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}			
}
