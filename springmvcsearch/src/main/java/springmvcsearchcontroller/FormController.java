package springmvcsearchcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvcsearchmodel.Student;

@Controller
public class FormController {

	@RequestMapping("/form")
	public String formShow() {
		String s = null;
		System.out.println(s.charAt(0));
		return "form";
	}

	@RequestMapping(path = "/handle", method = RequestMethod.POST)
	public String handler(@ModelAttribute("student") Student student, BindingResult result) {
		if (result.hasErrors()) {
			return "form";
		}
		System.out.println(student);
		return "success";
	}

}
