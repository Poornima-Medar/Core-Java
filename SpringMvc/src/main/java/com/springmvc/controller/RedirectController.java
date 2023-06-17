package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {

//	@RequestMapping("/one")
//	public String one() {
//		System.out.println("One");
//		return "redirect:/two";
//	}

	@RequestMapping("/one")
	public RedirectView one() {
		RedirectView r = new RedirectView();
		r.setUrl("two");
		return r;
	}

	@RequestMapping("/two")
	public String two() {
		System.out.println("two");
		return "contact";
	}
}
