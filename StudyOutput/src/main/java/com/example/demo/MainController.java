package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;


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

}
