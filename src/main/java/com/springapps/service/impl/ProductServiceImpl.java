package com.springapps.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springapps.dao.ProductDao;
import com.springapps.entity.Product;
import com.springapps.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductDao productdao;

	@Override
	@Transactional
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		List<Product> products = productdao.findProducts();
		return products;
	}

}
