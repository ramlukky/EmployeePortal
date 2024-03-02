package com.ramakanth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ramakanth.entity.Incentive;
import com.ramakanth.service.IncentiveService;

@Controller
public class IncentiveController {
	
	@Autowired
	private IncentiveService incentiveService;
	
	@GetMapping("/incentive")
	public String incentiveCalucation(Model model) {
		Incentive incentive=new Incentive();
		model.addAttribute("incentive", incentive);
		
		return"incentive";
	}
	
	@PostMapping("/incentive")
	public String incentiveCaluculation(Model model, Incentive incentive) {
		Double result=incentiveService.calculateIncentive(incentive);
		Incentive incentive1=new Incentive();
		model.addAttribute("incentive", incentive1);
		
		model.addAttribute("sucessmsg", "Incentive on "+incentive.getConsultantName()+" is "+result);
		
		return "incentive";
		
	}

}

