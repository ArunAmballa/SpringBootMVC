package com.arun.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Hello 
{	
	@RequestMapping("sayhello")
	@ResponseBody
	public String sayHello()
	{
		return "Hello How are you Doing?";
	}
	
	@RequestMapping("sayhellojsp")
	public String sayHelloJSP()
	{
		return  "hello";
	
	
	}
	
}
	

