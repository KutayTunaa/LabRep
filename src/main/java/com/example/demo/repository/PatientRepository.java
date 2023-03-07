package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.PatientDTO;

@Repository
public interface PatientRepository extends CrudRepository<PatientDTO, Long> {
	
}