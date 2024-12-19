package com.microsoft.repository;

import java.io.Serializable;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microsoft.entity.EmployeeDetailsEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeDetailsEntity, Serializable> {
	//EmployeeDetailsEntity findByName( employeeName);

	Optional<EmployeeDetailsEntity> findByName(String employeeName);

	//Optional<EmployeeDetailsEntity> findByName(String employeeName);
}
