/**
 * 
 */
package com.lpz.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * TODO 控制层代码
 * @author aitacx
 * @date 2014年11月27日
 */
@Controller
public class MyController {
	
	@RequestMapping("login")
	@ResponseBody 
	private String hello(@RequestParam(value="username", required=false)String username,
			@RequestParam(value="password", required=false)String password){
	    
	    
		return "Hello "+username+",Your password is: "+password;
		
	}

}
