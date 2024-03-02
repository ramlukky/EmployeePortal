package com.ramakanth.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ramakanth.entity.Consultant;

public interface ConsultantRepo extends JpaRepository<Consultant, Integer> {

	public List<Consultant> findAllByEmpId(Integer empId);
}
