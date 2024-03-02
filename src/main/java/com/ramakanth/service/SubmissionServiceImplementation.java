package com.ramakanth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ramakanth.entity.Submission;

import com.ramakanth.repository.SubmissionRepo;

@Service
public class SubmissionServiceImplementation implements SubmissionService {

	
	@Autowired
	private SubmissionRepo subRepo;
	
	
	public List<Submission> getSubmissions(Integer sessionId){
		
		
		return subRepo.findAllByEmpId(sessionId);
		
	}
	
	public void addSubmission(Submission sub) {
		subRepo.save(sub);
	}
}
