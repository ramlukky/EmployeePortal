package com.ramakanth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;

import com.ramakanth.entity.Employee;
import com.ramakanth.service.EmployeeService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService empService;
	
	@GetMapping("/aboutus")
	public String aboutUs(Model model) {
		
				
		return "aboutus";
	}
	
	@GetMapping("/")
	public String index(Model model) {
		
		Employee emp=new Employee();
		model.addAttribute("emp", emp);
		
		return "index";
	}
	
	@GetMapping("/register")
	public String register(Model model) {
		
		Employee emp=new Employee();
		model.addAttribute("emp", emp);
		
		return "register";
	}
	
	@PostMapping("/register")
	public String handleregister(@Valid Employee emp, BindingResult bindingResult, Model model) {
		if(!bindingResult.hasErrors()) {
		Boolean isSave=false;
		if(empService.alreadyRegister(emp.getEmpEmail())) {
			model.addAttribute("errormsg", "already registered; please use another email Id");
			return "register.html";
		}
		
		isSave=empService.saveEmployee(emp);
		
		if(isSave) {
			Employee emp1=new Employee();
			model.addAttribute("emp", emp1);
			model.addAttribute("sucessmsg", "sucessfully Registerd");
		}	
		
		return "index";
		}
		else {
			Employee emp1=new Employee();
			model.addAttribute("emp", emp1);
			model.addAttribute("errormsg", "please enter valid details");
			return "register";
		}
			
	}
	@GetMapping("/forgetpassword")
	public String forgetPassword(Model model) {
		
		model.addAttribute("msg", "plese give valid password");
		return "forgetpassword";
		
	}
	
	@GetMapping("/handleforgetpassword")
	public String handleForgetPassword(@RequestParam(value="empEmail") String empEmail, Model model) {
		
		System.out.println("given ID: " +empEmail);
		if(empService.recoverPassword(empEmail)) {
			
			
			model.addAttribute("sucessmsg", "Password sent to your email Id");
			Employee emp=new Employee();
			model.addAttribute("emp", emp);
			return "index";
		}
		else {
		model.addAttribute("errormsg", "please give valid email"+empEmail);
		return "index";
		}
		
	}
	
	@PostMapping("/login")
	public String login(Model model, @Valid Employee emp, BindingResult bindingResult, HttpServletRequest request) {
		HttpSession session=request.getSession();
		Integer empId=empService.loginCheck(emp.getEmpEmail(), emp.getEmpPassword());
if(empId!=null) {
	session.setAttribute("sessionId", empId);
	model.addAttribute("sucessmsg", "sucessfully logined");
	model.addAttribute("sessionId", session.getAttribute("sessionId"));
	return "home";
}	
	model.addAttribute("emp", emp);
	model.addAttribute("errormsg", "Login Id or Password is incorect");
	return "index";		
		
	}
	
	@GetMapping("/home")
	public String home(Model model, HttpSession session) {
		
		
		model.addAttribute("sessionId", session.getAttribute("sessionId"));
		
		return "home";
	}
	
	@GetMapping("/logout")
	public String logout(Model model, HttpSession session, HttpServletRequest request) {
		
		Employee emp=new Employee();
		model.addAttribute("emp", emp);
		model.addAttribute("sucessmsg", "Logged out of Employee portal");
		session.invalidate();
		request.getSession(false);
		return "index";
		
	}

	@GetMapping("/database")
	public String database(Model model) {
		
		
		return "database";
	}
	
	
	@GetMapping("/getquote")
	public String getQuote(Model model) {
	
	return "quote";
	}

	
	
	
	
}	