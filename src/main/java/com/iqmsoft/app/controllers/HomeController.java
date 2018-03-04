package com.iqmsoft.app.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String index(Model model) {
        model.addAttribute("message", "test");
		return "home/index";
	}


    @RequestMapping(value="/send")
    public String send(Model model) {
        return "home/index";
    }






}
