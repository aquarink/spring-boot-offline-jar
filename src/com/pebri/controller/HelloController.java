package com.pebri.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class HelloController {
	
	@RequestMapping("/")
	public ModelAndView index() {
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("msg","Index Page HelloController");
		
		return model;
	}
 
	@RequestMapping("/welcome/{getName}")
	public ModelAndView helloWorld(@PathVariable("getName") String name) {
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("msg","My Name : " + name);
		
		return model;
	}
	
	@RequestMapping("/welcome/{getName}/{getAge}")
	public ModelAndView hiWorld(@PathVariable Map<String,String> getVariable) {
		
		String name = getVariable.get("getName");
		String age = getVariable.get("getAge");
		
		ModelAndView model = new ModelAndView("HelloPage");
		model.addObject("msg","My Name : " + name + " and " + age + " years old");
		
		return model;
	}
	
}
