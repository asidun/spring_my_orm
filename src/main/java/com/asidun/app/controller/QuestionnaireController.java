package com.asidun.app.controller;

import com.asidun.app.orm.PersonDAO;
import com.asidun.app.orm.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class QuestionnaireController{
	
	@Autowired
	PersonDAO personDAO;

	@RequestMapping(value="/aform", method = RequestMethod.GET)
	public ModelAndView addNewsletterQueGet(){				
		return new ModelAndView("aform", "personForm", new Person());
	}
	
	@RequestMapping(value="/aform", method = RequestMethod.POST)
	public String addNewsletterQuePost(
			@ModelAttribute("personForm")
			//local code review (vtegza): no magic in java, igf you want to get your validation, do it explicitly @ 12.04.15
			@Valid
			Person que,
			Errors errors){
		if (errors.hasErrors()){
			return "/aform";
		}
		Person personToSave = que;
//		Person personToSave = new Person();
//		personToSave.setAddress(que.getAddress());
//		personToSave.setSex(que.getSex());
//		personToSave.setUserName(que.getUserName());
//		personToSave.setYouLikeNewsletter(que.getYouLikeNewsletter());
		
		personDAO.save(personToSave);
		
		return "redirect:/helloUser/" + que.getUserName();
	}
	
	@RequestMapping(value="/helloUser/{userName}", method = RequestMethod.GET)
	public String helloUser(@PathVariable String userName, Model model){	
		model.addAttribute("userName", userName);
		return "helloUser";
	}
	
}
