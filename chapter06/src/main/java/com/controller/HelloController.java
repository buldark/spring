package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class HelloController {
	
											//메소드방식 -반드시대문자		
	@RequestMapping(value="/hello.do", method=RequestMethod.GET )
	   //public ?? 메소드명()  ==> 메소드명은 대부분 requestmapping value의 값과 똑같이 준다   
	   public ModelAndView hello() { //사용자가 만든 콜백 메소드
	      ModelAndView mav = new ModelAndView();
	      
	      mav.addObject("result","Have a nice day!!");
	      mav.setViewName("/WEB-INF/view/hello");//web에 띄울 name
	      			// = "/view/hello.jsp" = "hello"
	      
	      
	      return mav;

	
	}
	@RequestMapping(value="/hello2.do", method=RequestMethod.GET, produces = "text/html; charset=UTF-8")
	@ResponseBody
	public String hello2(){
		
		return "환영";//한글은 인식 못한다.
		//return "WELCOME"; 
		
	}
	//스프링에서는 리턴타입이 String 이면 단순문자열이 아니라 파일명으로 인식한다.
	//스프링은 welcom.jsp 파일을 찾는다. 
	//만약 단순문자열로 웹에 타나태려면 @ResponseBody를 써야한다.
}




























