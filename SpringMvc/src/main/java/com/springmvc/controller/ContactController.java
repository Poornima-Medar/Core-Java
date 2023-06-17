package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmvc.model.Student;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class ContactController {
	
	@ModelAttribute
	public void common(Model model) {
		model.addAttribute("Header","Student Registration Form");	
	}

	@RequestMapping(path = "/contact")
	public String contact() {
		return "contact";
	}

	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute Student student) {
		//To print data on console
		if(student.getName().equalsIgnoreCase("Poornima")) 
			return "sucess";
		
		System.out.println(student);
		return "";
		
	}

}

/*
@RequestMapping(path = "/processform", method = RequestMethod.POST)
public String handleForm(@RequestParam("name") String name, @RequestParam(required = false) String email,
		@RequestParam("password") String password, @RequestParam("address") String address,
		@RequestParam(defaultValue = "Gadag") String city, Model model) {

	//To print data on console
	System.out.println(name);
	System.out.println(email);
	System.out.println(password);
	System.out.println(address);
	System.out.println(city);
	
	//To send data to the view using Model
//	model.addAttribute("name",name);
//	model.addAttribute("email",email);
//	model.addAttribute("password",password);
//	model.addAttribute("address",address);
//	model.addAttribute("city",city);
//	
	
	Student student = new Student();
	student.setName(name);
	student.setEmail(email);
	student.setPassword(password);
	student.setAddress(address);
	student.setCity(city);
	
	model.addAttribute("student",student);
	
	return "sucess";
}
*/
