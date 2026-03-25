package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

	@RequestMapping("/home")
	@ResponseBody
	public String getHome() {
		return "this is your first web page...updated to dummy.";
	}
	
	
}
