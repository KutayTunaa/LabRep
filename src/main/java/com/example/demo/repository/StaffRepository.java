package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.StaffDTO;

@Repository
public interface StaffRepository extends CrudRepository<StaffDTO, Long> {
	
}
