package com.test.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@EnableAutoConfiguration
public class SimpleController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	@ResponseBody
	public String hello(){
		return "hello,baby";
	}
	
	public static void main(String[] agrs){
		SpringApplication.run(SimpleController.class,agrs);
	}

}
