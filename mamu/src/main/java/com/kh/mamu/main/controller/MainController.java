package com.kh.mamu.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kh.mamu.main.model.service.MainService;
import com.kh.mamu.main.model.vo.ProductCategory;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@Controller
@RequestMapping("/main")
public class MainController {
	

	@Autowired
	private MainService mainService;
	
	@RequestMapping(value = "/main.do", method = RequestMethod.GET)
	public String mainHome(Model model) {
		
		List<ProductCategory> productCategoryList = mainService.productCategoryList(); 
		
		log.debug("list={}",productCategoryList);
		
		model.addAttribute("productCategoryList",productCategoryList);
		
		return "main/main";
	}
	
}
