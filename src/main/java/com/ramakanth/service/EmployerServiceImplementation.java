package com.ramakanth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ramakanth.entity.Employer;
import com.ramakanth.repository.EmployerRepo;

@Service
public class EmployerServiceImplementation implements EmployerService {

	@Autowired
	private EmployerRepo emprRepo;
	
	
	public List<Employer> getEmployers(Integer sessionId){
		
		return emprRepo.findAllByEmpId(sessionId);
		
	}
	
	public void addEmployers(Employer empr) {
		emprRepo.save(empr);
	}
}
