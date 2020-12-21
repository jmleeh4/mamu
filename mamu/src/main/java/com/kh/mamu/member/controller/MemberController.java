package com.kh.mamu.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kh.mamu.member.model.service.MemberService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/member")
public class MemberController {

	@Autowired
	private MemberService enrollService;
	
	@RequestMapping(value = "/agreement.do", method = RequestMethod.GET)
	public String agreement() {
		
		return "enroll/agree";
	}
	@RequestMapping(value = "/enroll.do", method = RequestMethod.GET)
	public String enroll() {
		
		return "enroll/enroll";
	}
	
	/*
	 * @RequestMapping(value = "/idCheck.do", method = RequestMethod.GET, produces =
	 * "application/json; charset=utf8")
	 * 
	 * @ResponseBody public
	 */
	
	
}
