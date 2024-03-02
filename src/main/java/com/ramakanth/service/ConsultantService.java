package com.ramakanth.service;

import java.util.List;

import com.ramakanth.entity.Consultant;


public interface ConsultantService {
	
	public List<Consultant> getConsultants(Integer sessionId);
	public void addConsultants(Consultant cons);

}
