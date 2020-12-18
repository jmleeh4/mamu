package com.kh.mamu.main.model.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.mamu.main.model.vo.ProductCategory;

@Repository
public class MainDAOImpl implements MainDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public List<ProductCategory> productCategoryList() {
		return sqlSession.selectList("main.productCategoryList");
	}
	
	

}
