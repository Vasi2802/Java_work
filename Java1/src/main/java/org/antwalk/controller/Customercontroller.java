package org.antwalk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class Customercontroller {
	
	@GetMapping("/helloc")
	public String hello()
	{
		return "hello";
	}

}
