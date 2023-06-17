package com.springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.model.Student;

@Controller
@RequestMapping("/first")
public class HomeController {
	Student s = new Student();

	@RequestMapping(path = "/home", method = RequestMethod.GET)
	public String home(Model model) {
		System.out.println("This is a controller");
		model.addAttribute("name", "Poornima");
		model.addAttribute("id", 123);
		List<String> friends = new ArrayList<String>();
		friends.add("Poornima");
		friends.add("Pratiksha");
		friends.add("Sakshi");
		model.addAttribute("f", friends);
		s.setName("Nanda");
		model.addAttribute("s", s);
		return "index";
	}

	@RequestMapping("/about")
	public String about() {
		System.out.println("This is About Page");
		return "about";
	}

	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("This is a help page");

		// creating object of ModelAndView
		ModelAndView modelAndView = new ModelAndView();

		// setting a data
		modelAndView.addObject("name", "Poornima Andappa Medar");
		modelAndView.addObject("id", 11111);
		LocalDateTime now = LocalDateTime.now();
		modelAndView.addObject("time", now);

		List<Integer> num = new ArrayList<Integer>();
		num.add(123);
		num.add(234);
		num.add(345);
		num.add(456);

		modelAndView.addObject("num", num);

		// setting the view name
		modelAndView.setViewName("help");

		return modelAndView;
	}

}
