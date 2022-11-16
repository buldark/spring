package com.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bean.SumDTO;


@Controller
public class SumController {
	//@RequestMapping(value="/input.do", method=RequestMethod.GET )
	@GetMapping(value="/input.do")//get방식으로 처리 하겠다는 뜻
	public String input(){
		
		
	 
		 return "sum/input";
	}
	/*
	 * @GetMapping(value="/result.do" ) public String result() {
	 * 
	 * return "sum/result"; }
	 */
	
	/*
	 * @GetMapping(value="/result.do" ) public ModelAndView result(@RequestParam int
	 * x , @RequestParam int y) {//=getPrameter ModelAndView mav = new
	 * ModelAndView(); mav.addObject("x",x); mav.addObject("y",y);
	 * mav.setViewName("sum/result"); return mav; }
	 */
	/*
	 * @GetMapping(value="/result.do" ) // 인자값이 안들어와도 오류내지 말아 달라 public ModelAndView
	 * result(@RequestParam(required=false, defaultValue = "0") String x , //보드에서
	 * 페이징할 때 많이 사용
	 * 
	 * @RequestParam(required=false, defaultValue = "0") String y) {//=getPrameter
	 * ModelAndView mav = new ModelAndView(); mav.addObject("x",x);
	 * mav.addObject("y",y); mav.setViewName("sum/result"); return mav; }
	 */
	
	/*
	 * @GetMapping(value="/result.do" ) // 모델맵은 ModelAndView 대신 사용 public String
	 * result(@RequestParam Map<String , String> map ,ModelMap modelMap)
	 * {//=getPrameter
	 * 
	 * modelMap.put("x",map.get("x")); modelMap.put("y",map.get("y"));
	 * 
	 * return "sum/result"; }
	 */
	
	/*
	 * @GetMapping(value="/result.do" ) // 모델맵은 ModelAndView 대신 사용 public String
	 * result(@ModelAttribute SumDTO sumDTO ,ModelMap modelMap) {//=getPrameter
	 * 
	 * modelMap.put("x",sumDTO.getX()); modelMap.put("y",sumDTO.getY());
	 * 
	 * return "sum/result"; }
	 */
	
	@GetMapping(value="/result.do" ) //	 모델맵은 ModelAndView 대신 사용
	public String result(@RequestParam Map<String , String> map ,Model model) {//=getPrameter
			
		model.addAttribute("x",map.get("x"));
		model.addAttribute("y",map.get("y"));
			
			return "sum/result";
			
	//ModelAndView 는 클래스
	//Model 과 ModelMap 은 인터페이스
	}
}



















