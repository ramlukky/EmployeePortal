package com.ramakanth.service;

import java.util.List;

import com.ramakanth.entity.Employer;

public interface EmployerService {

	public List<Employer> getEmployers(Integer sessionId);
	public void addEmployers(Employer empr);
}
