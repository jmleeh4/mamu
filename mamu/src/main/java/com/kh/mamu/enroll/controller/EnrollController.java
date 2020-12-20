package com.kh.mamu.enroll.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kh.mamu.enroll.model.service.EnrollService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/enroll")
public class EnrollController {

	@Autowired
	private EnrollService enrollService;
	
	@RequestMapping(value = "/agreement.do", method = RequestMethod.GET)
	public String agreement() {
		
		return "enroll/agree";
	}
	@RequestMapping(value = "/enroll.do", method = RequestMethod.GET)
	public String enroll() {
		
		return "enroll/enroll";
	}
	
	
}
