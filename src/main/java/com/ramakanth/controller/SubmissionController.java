package com.ramakanth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import com.ramakanth.entity.Submission;

import com.ramakanth.service.SubmissionService;

import jakarta.servlet.http.HttpSession;

@Controller
public class SubmissionController {

	
	@Autowired
	private SubmissionService subService;
	
	@GetMapping("/submission")
	public String getSubmission(Model model, HttpSession session) {
		
		
		model.addAttribute("sub", subService.getSubmissions(Integer.parseInt(session.getAttribute("sessionId").toString())));
		
		System.out.println("session ID: "+session.getAttribute("sessionId"));
		
		return "submission";
	}
	
	@GetMapping("/addsubmission")
	public String addsubmission(Model model) {
		
		Submission sub=new Submission();
		model.addAttribute("sub", sub);
		
		return "addsubmission";
		
	}
	
	@PostMapping("/addsubmission")
	public String saveSubmission(Model model, Submission sub, HttpSession session) {
		Integer empId=Integer.parseInt(session.getAttribute("sessionId").toString());		
		sub.setEmpId(empId);	
		//consService.addConsultants(cons);
		subService.addSubmission(sub);
	//	model.addAttribute("cons", consService.getConsultants(empId));	
		
		model.addAttribute("sub",subService.getSubmissions(empId));
		return "submission";
	}
	
}
