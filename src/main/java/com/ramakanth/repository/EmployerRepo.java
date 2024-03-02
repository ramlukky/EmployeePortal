package com.ramakanth.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ramakanth.entity.Employer;

public interface EmployerRepo extends JpaRepository<Employer, Integer>{

	public List<Employer> findAllByEmpId(Integer empId);
}
