package com.abhi.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abhi.springboot.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{ 
	

}
