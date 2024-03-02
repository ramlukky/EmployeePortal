package com.ramakanth.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ramakanth.email.EmailUtility;
import com.ramakanth.entity.Employee;
import com.ramakanth.repository.EmployeeRepo;

@Service
public class EmployeeServiceImplementation implements EmployeeService {

	@Autowired
	private EmployeeRepo empRepo;
	
	@Autowired
	private EmailUtility emailUtility;
	
	@Override
	public Boolean saveEmployee(Employee emp) {
	
		Boolean isSave=false;
		Employee savedEmp=empRepo.save(emp);
		if(savedEmp!=null)
		{
			String body="Hi "+savedEmp.getEmpName()+", you have sucessfully registered:";
			emailUtility.sendEmail(savedEmp.getEmpEmail(), "Sucessfully Registerd", body);
			isSave=true;
		}
		
		return isSave;
	}

	@Override
	public Integer loginCheck(String empEmail, String empPassword) {
		
		return empRepo.findByEmpEmailAndEmpPassword(empEmail, empPassword);  
	
	}

	@Override
	public Boolean recoverPassword(String empEmail) {
		 boolean isSend=false;
		 
		 if(empRepo.findByEmpEmail(empEmail)!=null) {
			 isSend=true;
			 
			 String body="your password is "+empRepo.findByEmpEmail(empEmail);
			 emailUtility.sendEmail(empEmail, "Password Recovery for Employee portal", body);
		 }
		return isSend;
	}
	
	public Boolean alreadyRegister(String empEmail) {
		Boolean register=false;
		
		if(empRepo.findByEmpEmail(empEmail)!=null) {
			register=true;
		}
		return register;
		
	}

}
