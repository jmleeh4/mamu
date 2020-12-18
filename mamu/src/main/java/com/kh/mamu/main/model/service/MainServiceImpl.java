package com.kh.mamu.main.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.kh.mamu.main.model.dao.MainDAO;
import com.kh.mamu.main.model.vo.ProductCategory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Transactional(propagation = Propagation.REQUIRED, 
			   isolation = Isolation.READ_COMMITTED,
			   rollbackFor = Exception.class)
@Service
public class MainServiceImpl implements MainService {
	
	@Autowired
	private MainDAO mainDAO;
	
	@Override
	public List<ProductCategory> productCategoryList() {	
		
		return mainDAO.productCategoryList();
	}

}
