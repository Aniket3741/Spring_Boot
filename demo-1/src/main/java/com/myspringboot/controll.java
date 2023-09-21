package com.myspringboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import springmVc.Student;

@Controller
public class controll {
	@RequestMapping("/hhh")
	public ModelAndView disp(Student st) {
		ModelAndView mv=new ModelAndView();
		mv.addObject("obj",st);
		mv.setViewName("home");
		return mv;
	}
}
