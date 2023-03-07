package com.example.demo.entity;

import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="patient", schema = "public")
public class PatientDTO implements Serializable{

	private static final long serialVersionUID = -4313508986756637112L;

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="patientid")
	private Long patientId;
	
	@Column(name="NationalIdentificationo")
	private String NationalIdentificationNo;
		
	@Column(name="registryno")
	private String registryNo;
		
	@Column(name="name")
	private String name;
		
	@Column(name="surname")
	private String surname;
	
	@Column(name="password")
	private String password;

	public Long getPatientId() {
		return patientId;
	}

	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}

	public String getNationalIdentificationNo() {
		return NationalIdentificationNo;
	}

	public void setNationalIdentificationNo(String NationalIdentificationNo) {
		this.NationalIdentificationNo = NationalIdentificationNo;
	}

	public String getRegistryNo() {
		return registryNo;
	}

	public void setRegistryNo(String registryNo) {
		this.registryNo = registryNo;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}

