package com.ramakanth.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer emprId;

  	private String emprCompany;
	private String emprName;
	private String emprEmail;
	private String emprPhoneNumber;
	private String technology;
	private Integer empId;
	
	
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public Integer getEmprId() {
		return emprId;
	}
	public void setEmprId(Integer emprId) {
		this.emprId = emprId;
	}
	public String getEmprCompany() {
		return emprCompany;
	}
	public void setEmprCompany(String emprCompany) {
		this.emprCompany = emprCompany;
	}
	public String getEmprName() {
		return emprName;
	}
	public void setEmprName(String emprName) {
		this.emprName = emprName;
	}
	public String getEmprEmail() {
		return emprEmail;
	}
	public void setEmprEmail(String emprEmail) {
		this.emprEmail = emprEmail;
	}
	public String getEmprPhoneNumber() {
		return emprPhoneNumber;
	}
	public void setEmprPhoneNumber(String emprPhoneNumber) {
		this.emprPhoneNumber = emprPhoneNumber;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	@Override
	public String toString() {
		return "Employer [emprId=" + emprId + ", emprCompany=" + emprCompany + ", emprName=" + emprName + ", emprEmail="
				+ emprEmail + ", emprPhoneNumber=" + emprPhoneNumber + ", technology=" + technology + "]";
	}
	
	
	
	
}
