package com.ramakanth.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

@Entity
public class Submission {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer consId;
	
	@NotNull
	private String consName;
	
	@NotNull
	@Email
	private String consEmail;

	@NotNull
	private Long consPhoneNumber;
	
	private String consLocation;
	
	private String consVisa;
	
	private String Rate;
	
	private String client;
	
	private String bullhornNumber;
	private Integer empId;
	private String status;

	
	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public Long getConsPhoneNumber() {
		return consPhoneNumber;
	}

	public void setConsPhoneNumber(Long consPhoneNumber) {
		this.consPhoneNumber = consPhoneNumber;
	}

	public String getConsLocation() {
		return consLocation;
	}

	public void setConsLocation(String consLocation) {
		this.consLocation = consLocation;
	}

	public String getConsVisa() {
		return consVisa;
	}

	public void setConsVisa(String consVisa) {
		this.consVisa = consVisa;
	}

	public String getRate() {
		return Rate;
	}

	public void setRate(String rate) {
		Rate = rate;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public String getBullhornNumber() {
		return bullhornNumber;
	}

	public void setBullhornNumber(String bullhornNumber) {
		this.bullhornNumber = bullhornNumber;
	}

	@Override
	public String toString() {
		return "Submission [consId=" + consId + ", consName=" + consName + ", consEmail=" + consEmail
				+ ", consPhoneNumber=" + consPhoneNumber + ", consLocation=" + consLocation + ", consVisa=" + consVisa
				+ ", Rate=" + Rate + ", client=" + client + ", bullhornNumber=" + bullhornNumber + "]";
	}
	
	
	
}
