package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;



@Controller
public class MainController {
//@RequestMapping("/")
//public String index(Model model) {
//	model.addAttribute("name","レン");
//	return "index";
//}
@RequestMapping(value="/",method=RequestMethod.GET)
public ModelAndView index(ModelAndView mv) {
	mv.setViewName("index");
	return mv;
}
	@RequestMapping(value="/main",method=RequestMethod.GET)
	public ModelAndView main(ModelAndView mv) {
		mv.setViewName("main");
		return mv;
}
	@RequestMapping(value="/edit",method=RequestMethod.GET)
	public ModelAndView edit(ModelAndView mv) {
		mv.setViewName("edit");
		return mv;
	}
	@RequestMapping(value="/edit")
	public String edit(Model model) {
		model.addAttribute("day","11/14");
		return "edit";
	}
	}


