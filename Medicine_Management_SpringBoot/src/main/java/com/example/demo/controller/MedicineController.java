package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MedicineController {
	
	@RequestMapping("/home")
	public String showHome() {
		return "index";
	}
	 

	@RequestMapping("/services")
	public String showServices() {
		return "services";
	}
	
}
