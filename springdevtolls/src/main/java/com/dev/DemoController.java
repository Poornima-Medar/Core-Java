package com.dev;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@RequestMapping("/test")
	public String demo() {
		return "Hi Poornima, Good Morning";
	}

}
