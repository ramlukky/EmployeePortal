package com.ramakanth.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.ramakanth.entity.Employee;

import jakarta.servlet.http.HttpSession;

@ControllerAdvice
public class GlobalException {

	@ExceptionHandler(Exception.class)
	public String exception(Model model, HttpSession session, Exception e) {
			if(session.getAttribute("sessionId")==null) {
		Employee emp=new Employee();
		model.addAttribute("emp", emp);
		model.addAttribute("errormsg", "Session Expired");		
		return "index";}
		
		else {
			
			model.addAttribute("errormsg", e.getMessage());
			
			
			return "home";
		}
	}
}
