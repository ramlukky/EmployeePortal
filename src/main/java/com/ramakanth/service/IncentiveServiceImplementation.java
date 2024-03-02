package com.ramakanth.service;



import org.springframework.stereotype.Service;

import com.ramakanth.entity.Incentive;

@Service
public class IncentiveServiceImplementation implements IncentiveService {
	private Double netBillRate;
	private Double volumeRebate=0.06;

	private Double billRate;
	private  Double payRate;
	private String payRollType;
	private Double rebaate;
	private Double margin;
	private Double totalWorkHours;
	
	private String c6Months;
	private Double x;
	private Double incentives;
	@Override
	public Double calculateIncentive(Incentive incentive) {
		
		try{
				
			if(incentive.getClientName().equalsIgnoreCase("freddiemac")) volumeRebate=0.11;
			if(incentive.getClientName().equalsIgnoreCase("navy federal credit union")||incentive.getClientName().equalsIgnoreCase("Navy") || incentive.getClientName().equalsIgnoreCase("nfcu") || incentive.getClientName().equalsIgnoreCase("navy federal")) volumeRebate=0.09;
			netBillRate=incentive.getNetBillRate();
			billRate=incentive.getBillRate();
			netBillRate=billRate-(billRate*volumeRebate);
			payRollType=incentive.getPayRollType();
			payRate=incentive.getPayRate();
			if(payRollType.equalsIgnoreCase("w2"))payRate=payRate*1.18;
			else payRate=payRate*1.04;
			margin=netBillRate-payRate;
			totalWorkHours=incentive.getTotalWorkHours();
			x=margin*totalWorkHours;
			c6Months=incentive.getC6Months();
			rebaate=incentive.getRebaate();
			if(c6Months.equalsIgnoreCase("yes")||c6Months.equalsIgnoreCase("y")) rebaate=x*0.03;
			else rebaate=x*0.06;
			incentives=rebaate*78.0;	
			}
			catch(Exception e)
			{System.out.println(e);
			}
		return incentives;
	}

}
