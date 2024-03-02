package com.ramakanth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ramakanth.entity.Consultant;

import com.ramakanth.repository.ConsultantRepo;

@Service
public class ConsultantServiceImplementation implements ConsultantService {

	@Autowired
	private ConsultantRepo consRepo;
	
	
	public List<Consultant> getConsultants(Integer sessionId){
		
		return consRepo.findAllByEmpId(sessionId);
		
	}
	
	public void addConsultants(Consultant cons) {
		consRepo.save(cons);
	}
	
}
