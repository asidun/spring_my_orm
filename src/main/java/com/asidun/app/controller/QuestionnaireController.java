package com.asidun.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.asidun.app.entity.NewsletterQue;

@Controller
public class QuestionnaireController{

	@RequestMapping(value="/aform", method = RequestMethod.GET)
	public ModelAndView addNewsletterQueGet(){				
		return new ModelAndView("aform", "command", new NewsletterQue());
	}
	
	@RequestMapping(value="/aform", method = RequestMethod.POST)
	public ModelAndView addNewsletterQuePost(@ModelAttribute("/") NewsletterQue que, ModelMap model){
		
		model.addAttribute("userName", que.getUserName());
		model.addAttribute("address", que.getAddress());
		model.addAttribute("youLikeNewsletter", que.getYouLikeNewsletter());
		model.addAttribute("sex", que.getSex());
		
		return new ModelAndView("aform", "command", que);
	}
	
}
