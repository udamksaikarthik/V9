package com.ecommerce.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class Controller {
	
	@GetMapping("/")
	public ModelAndView HomePage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("loginPage.html");
		return mv;
	}
	
	@GetMapping("/loginPage")
	public ModelAndView LoginPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("loginPage.html");
		return mv;
	}
	
	@GetMapping("/signupPage")
	public ModelAndView SignupPage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("signupPage.html");
		return mv;
	}
}
