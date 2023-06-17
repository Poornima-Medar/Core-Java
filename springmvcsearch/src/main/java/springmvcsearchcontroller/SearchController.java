package springmvcsearchcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.view.RedirectView;

import springmvcsearchmodel.Search;

@Controller
public class SearchController {

	@RequestMapping("/home")
	public String home() {
		System.out.println("Home page");
//		String s = null;
//		System.out.println(s.length());
		return "home";
	}

	@RequestMapping("/search")
	public RedirectView search(@ModelAttribute Search search) {

		String url = "https://www.google.com/search?q=" + search.getQuerybox();
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(url);
		return redirectView;
	}
	
//	
//	@ResponseStatus(value  =HttpStatus.INTERNAL_SERVER_ERROR)
//	@ExceptionHandler({NullPointerException.class})
//	public String exceptionHandler() {
//		return "error";
//	}

}
