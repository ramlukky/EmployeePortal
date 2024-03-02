package com.ramakanth.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Consultant {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer consId;
	
	
	private String consName;
	
	private String consEmail;
	
	private String consPhoneNumber;
	
	private String consVisa;
	
	private String consTechnology;
	
	private String consLocation;
	
	private String consStatus;
	
	private Integer empId;

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public Integer getConsId() {
		return consId;
	}

	public void setConsId(Integer consId) {
		this.consId = consId;
	}

	public String getConsName() {
		return consName;
	}

	public void setConsName(String consName) {
		this.consName = consName;
	}

	public String getConsEmail() {
		return consEmail;
	}

	public void setConsEmail(String consEmail) {
		this.consEmail = consEmail;
	}

	public String getConsPhoneNumber() {
		return consPhoneNumber;
	}

	public void setConsPhoneNumber(String consPhoneNumber) {
		this.consPhoneNumber = consPhoneNumber;
	}

	public String getConsVisa() {
		return consVisa;
	}

	public void setConsVisa(String consVisa) {
		this.consVisa = consVisa;
	}

	public String getConsTechnology() {
		return consTechnology;
	}

	public void setConsTechnology(String consTechnology) {
		this.consTechnology = consTechnology;
	}

	public String getConsLocation() {
		return consLocation;
	}

	public void setConsLocation(String consLocation) {
		this.consLocation = consLocation;
	}

	public String getConsStatus() {
		return consStatus;
	}

	public void setConsStatus(String consStatus) {
		this.consStatus = consStatus;
	}

	@Override
	public String toString() {
		return "Consultant [consId=" + consId + ", consName=" + consName + ", consEmail=" + consEmail
				+ ", consPhoneNumber=" + consPhoneNumber + ", consVisa=" + consVisa + ", consTechnology="
				+ consTechnology + ", consLocation=" + consLocation + ", consStatus=" + consStatus + "]";
	}
	
	
	
	
}
