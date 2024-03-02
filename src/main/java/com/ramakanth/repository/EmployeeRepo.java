package com.ramakanth.repository;





import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ramakanth.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	
	@Query("select empId from Employee where empEmail=:empEmail AND empPassword=:empPassword")
	public Integer findByEmpEmailAndEmpPassword(String empEmail, String empPassword);
	
	@Query("select empPassword from Employee where empEmail=:empEmail")
	public String findByEmpEmail(String empEmail);

}
