package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InterceptorController {
	
	@RequestMapping("/interceptorHome")
	public String nameForm() {
		return "interceptorHome";
	}
	
	@RequestMapping(value="/handler", method = RequestMethod.POST)
	public String submitForm(@RequestParam String username, Model m) {
		m.addAttribute("username", username);
		return "interceptorSuccess";
	}

}
