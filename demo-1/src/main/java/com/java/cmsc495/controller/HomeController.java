package com.java.cmsc495.controller;

import java.util.Locale;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/" )
	public String home(Locale local, Model model) {
		
		return "Welcome to ProjectMediaDB";
	}

}
