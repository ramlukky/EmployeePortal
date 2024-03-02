package com.ramakanth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ramakanth.entity.Employer;
import com.ramakanth.service.EmployerService;

import jakarta.servlet.http.HttpSession;

@Controller
public class EmployerController {

	@Autowired
	private EmployerService emprService;
	
	@GetMapping("/employer")
	public String getEmployer(Model model, HttpSession session) {
		
		
		model.addAttribute("empr", emprService.getEmployers(Integer.parseInt(session.getAttribute("sessionId").toString())));
		
		System.out.println("session ID: "+session.getAttribute("sessionId"));
		
		return "employer";
	}
	
	@GetMapping("/addemployer")
	public String addEmployer(Model model) {
		
		Employer empr=new Employer();
		model.addAttribute("empr", empr);
		
		return "addemployer";
		
	}
	
	@PostMapping("/addemployer")
	public String saveEmployer(Model model, Employer empr, HttpSession session) {
		Integer empId=Integer.parseInt(session.getAttribute("sessionId").toString());
		empr.setEmpId(empId);
		emprService.addEmployers(empr);
		model.addAttribute("empr", emprService.getEmployers(empId));
		
		return "employer";
	}
}
