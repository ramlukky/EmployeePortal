package com.ramakanth.entity;

import org.springframework.stereotype.Component;

@Component
public class Incentive {
	private Double netBillRate;
	private String c6Months;
	private String clientName;
	private Double billRate;
	private  Double payRate;
	private String payRollType;
	private Double rebaate;
	private Double margin;
	private Double totalWorkHours;
	private String consultantName;
	private Double x;
	private Double incentive;
	public Double getNetBillRate() {
		return netBillRate;
	}
	
	
	public String getClientName() {
		return clientName;
	}


	public void setClientName(String clientName) {
		this.clientName = clientName;
	}


	public String getC6Months() {
		return c6Months;
	}


	public void setC6Months(String c6Months) {
		this.c6Months = c6Months;
	}
	public void setNetBillRate(Double netBillRate) {
		this.netBillRate = netBillRate;
	}
	public Double getBillRate() {
		return billRate;
	}
	public void setBillRate(Double billRate) {
		this.billRate = billRate;
	}
	public Double getPayRate() {
		return payRate;
	}
	public void setPayRate(Double payRate) {
		this.payRate = payRate;
	}
	public String getPayRollType() {
		return payRollType;
	}
	public void setPayRollType(String payRollType) {
		this.payRollType = payRollType;
	}
	public Double getRebaate() {
		return rebaate;
	}
	public void setRebaate(Double rebaate) {
		this.rebaate = rebaate;
	}
	public Double getMargin() {
		return margin;
	}
	public void setMargin(Double margin) {
		this.margin = margin;
	}
	public Double getTotalWorkHours() {
		return totalWorkHours;
	}
	public void setTotalWorkHours(Double totalWorkHours) {
		this.totalWorkHours = totalWorkHours;
	}
	public String getConsultantName() {
		return consultantName;
	}
	public void setConsultantName(String consultantName) {
		this.consultantName = consultantName;
	}
	public Double getX() {
		return x;
	}
	public void setX(Double x) {
		this.x = x;
	}
	public Double getIncentive() {
		return incentive;
	}
	public void setIncentive(Double incentive) {
		this.incentive = incentive;
	}
	@Override
	public String toString() {
		return "Incentive [netBillRate=" + netBillRate + ", billRate=" + billRate + ", payRate=" + payRate
				+ ", payRollType=" + payRollType + ", rebaate=" + rebaate + ", margin=" + margin + ", totalWorkHours="
				+ totalWorkHours + ", consultantName=" + consultantName + ", x=" + x + ", incentive=" + incentive + "]";
	}
	
	
}
