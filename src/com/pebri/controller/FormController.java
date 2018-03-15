package com.pebri.controller;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.pebri.helper.PersonHelper;
import com.pebri.model.PersonModel;

@Controller
public class FormController {
	
	@ModelAttribute
	public void constructModelAttribute(Model models) {
		models.addAttribute("title", "Title ini bisa dipanggil disemua function didalam satu class");
	}
	
	@InitBinder
	public void constructInitBinder(WebDataBinder webDataBinder) {
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");
		webDataBinder.registerCustomEditor(Date.class, "personDOB", new CustomDateEditor(simpleDateFormat, false));
		webDataBinder.registerCustomEditor(String.class, "personName", new PersonHelper());
	}
	
	
	@RequestMapping(value = "/form-input.php", method = RequestMethod.GET)
	public ModelAndView formInput() {
		
		ModelAndView model = new ModelAndView("jsp/FormInput");
		
		return model;
	}
	
	@RequestMapping(value = "/input-form-old.php", method = RequestMethod.POST)
	public ModelAndView inputFormOld(@RequestParam Map<String,String> postVariable) {
		
		String name = postVariable.get("name");
		String hobby = postVariable.get("hobby");
		
		PersonModel person = new PersonModel();
		person.setPersonName(name);
		person.setPersonHobby(hobby);
		
		ModelAndView model = new ModelAndView("jsp/ResultInput");
//		model.addObject("title", "Person Result"); << ga perlu lagi karna sudah ada modelattribute
		model.addObject("result", person);
		
		return model;
	}
	
	@RequestMapping(value = "/input-form.php", method = RequestMethod.POST)
	public ModelAndView inputForm(@Valid @ModelAttribute("identitas") PersonModel orang, BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()) {
			ModelAndView model = new ModelAndView("jsp/FormInput");
			return model;
		} else {
			ModelAndView model = new ModelAndView("jsp/ResultInput");
			return model;
		}
	}
}
