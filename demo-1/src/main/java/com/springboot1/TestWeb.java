package com.springboot1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestWeb {
	@RequestMapping("/")
	public String Index() {
		return "index";
	}
	@RequestMapping("/about")
	public String About() {
		return "about";
	}
	
	@RequestMapping("/aniket")
	public String Aniket() {
		return "aniket";
	}
}
