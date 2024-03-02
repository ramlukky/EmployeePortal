package com.ramakanth.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer empId;
	
	@NotEmpty
	private String empName;
	
	@Email
	@NotNull
	private String empEmail;
	
	@NotNull
	@Size(min = 5, max = 15, message = "password should be strong")
	private String empPassword;
	
	@NotNull
	private String empDesgination;

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public String getEmpPassword() {
		return empPassword;
	}

	public void setEmpPassword(String empPassword) {
		this.empPassword = empPassword;
	}

	public String getEmpDesgination() {
		return empDesgination;
	}

	public void setEmpDesgination(String empDesgination) {
		this.empDesgination = empDesgination;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empEmail=" + empEmail + ", empPassword="
				+ empPassword + ", empDesgination=" + empDesgination + "]";
	}
	
	
}
