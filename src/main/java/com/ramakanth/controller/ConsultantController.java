package com.ramakanth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.ramakanth.entity.Consultant;

import com.ramakanth.service.ConsultantService;


import jakarta.servlet.http.HttpSession;

@Controller
public class ConsultantController {

	
	
	@Autowired
	private ConsultantService consService;
	
	@GetMapping("/consultant")
	public String getConsultant(Model model, HttpSession session) {
		
		
		model.addAttribute("cons", consService.getConsultants(Integer.parseInt(session.getAttribute("sessionId").toString())));
		
		System.out.println("session ID: "+session.getAttribute("sessionId"));
		
		return "consultant";
	}
	
	@GetMapping("/addconsultant")
	public String addConsultant(Model model) {
		
		Consultant cons=new Consultant();
		model.addAttribute("cons", cons);
		
		return "addconsultant";
		
	}
	
	@PostMapping("/addconsultant")
	public String saveConsultant(Model model, Consultant cons, HttpSession session) {
		Integer empId=Integer.parseInt(session.getAttribute("sessionId").toString());		
		cons.setEmpId(empId);	
		//consService.addConsultants(cons);
		consService.addConsultants(cons);
	//	model.addAttribute("cons", consService.getConsultants(empId));	
		model.addAttribute("cons",consService.getConsultants(empId) );
		return "consultant";
	}
	
}
