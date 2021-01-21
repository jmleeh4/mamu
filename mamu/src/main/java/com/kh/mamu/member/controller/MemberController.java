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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.kh.mamu.member.model.service.MemberService;
import com.kh.mamu.member.model.vo.Member;

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
	public Map<String, Object> idCheck(@RequestParam("memberId") String memberId,
									   Model model) {
		
		Map<String, Object> map = new HashMap<>();
		
		boolean isAvailable = memberService.idCheck(memberId) == null;
		
		log.debug("customer={}",memberService.idCheck(memberId));
		log.debug("isAvailable={}",isAvailable);
		map.put("customerId", memberId);
		map.put("isAvailable", isAvailable);
		
		return map;
	}
	
	@RequestMapping(value="/memberEnroll.do",
					method = RequestMethod.POST)
	public String memberEnroll(Member member,
							   Model model,
							   RedirectAttributes red
							   ) {
		
		log.debug("member={}", member);
		int result = memberService.memberEnroll(member);
		
		red.addFlashAttribute("msg", "회원가입을 성공적으로 마쳤습니다.");
		
		return "redirect:/";
	}
	
	

	
	/*
	 * @InitBinder public void initBinder(WebDataBinder binder) { SimpleDateFormat
	 * sdf = new SimpleDateFormat("yyyy-MM-dd");
	 * 
	 * PropertyEditor editor = new CustomDateEditor(sdf, true);
	 * binder.registerCustomEditor(Date.class, editor);
	 * 
	 * }
	 */
	
	 
	
	
}
