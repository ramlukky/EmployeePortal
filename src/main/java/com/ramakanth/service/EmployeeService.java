package com.ramakanth.service;



import com.ramakanth.entity.Employee;

public interface EmployeeService {
	
	public Boolean saveEmployee(Employee emp);
	public Integer loginCheck(String empEmail, String empPassword);
	public Boolean recoverPassword(String empEmail);
	public Boolean alreadyRegister(String empEmail); 

}
