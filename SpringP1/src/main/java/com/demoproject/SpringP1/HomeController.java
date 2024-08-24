package com.demoproject.SpringP1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller			// to identify this is controller class
public class HomeController {
	
	
	@ModelAttribute("hi")			// call direct by url 
	public String cource() {
		return "ashu's";
	}
	
	
	
	
	@RequestMapping("/")		//for mapping the request 1st port 
	
	public String Hello(){

		System.out.println("Controller .....");		//only for checking  home() class is running or not
		return"index.jsp";							// u can use "index.jsp" also if u r not ussing suffix in application.properties;
	}
	
	
	@RequestMapping("add")			//2nd mapping port
	
	public String add(@RequestParam("num1") int num1 , @RequestParam("num2" )int num2 , Model model ) {
		
		//public ModelAndView add(@RequestParam("num1") int num1 , @RequestParam("num2" )int num2 , ModelAndView mv ) {
			
		// HttpSession session  --->>> model
		//HttpServletRequest --->>>  @RequestParam("num1") int num
//		int num1= Integer.parseInt(req.getParameter("num1"));  these 2 use when u r using HttpServletRequest
//		int num2=Integer.parseInt(req.getParameter("num2"));
		
		int result = num1+num2;
		model.addAttribute("result", result);  // this is for model 
		
		
//session.setAttribute("result", result);    this is for  HttpSession session
		//mv.addObject("result" , result);		//this is modelview
		//mv.setViewName("result");
		
		return "result.jsp";				// u can use "result.jsp" also if u r not ussing suffix in application.properties;
		
		
	}

}
