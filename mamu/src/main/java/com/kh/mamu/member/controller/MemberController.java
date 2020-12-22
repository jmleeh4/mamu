package com.kh.mamu.member.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kh.mamu.member.model.service.MemberService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/member")
public class MemberController {

	@Autowired
	private MemberService memberService;
	
	@RequestMapping(value = "/agreement.do", method = RequestMethod.GET)
	public String agreement() {
		
		return "enroll/agree";
	}
	@RequestMapping(value = "/enroll.do", method = RequestMethod.GET)
	public String enroll() {
		
		return "enroll/enroll";
	}
	
	
	@RequestMapping(value = "/idCheck.do", 
					method = RequestMethod.GET, 
					produces = "application/json; charset=utf8")
	@ResponseBody
	public Map<String, Object> idCheck(@RequestParam("customerId") String customerId,
									   Model model) {
		
		Map<String, Object> map = new HashMap<>();
		
		boolean isAvailable = memberService.idCheck(customerId) == null;
		
		log.debug("customer={}",memberService.idCheck(customerId));
		log.debug("isAvailable={}",isAvailable);
		map.put("customerId", customerId);
		map.put("isAvailable", isAvailable);
		
		return map;
	}
	
	/* @RequestMapping(value="/memberEnroll.do") */
	
	
	
	 
	
	
}
