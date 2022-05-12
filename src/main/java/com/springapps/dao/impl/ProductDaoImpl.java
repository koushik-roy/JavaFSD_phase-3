 package com.springapps.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.springapps.dao.ProductDao;
import com.springapps.entity.Product;

@Repository
public class ProductDaoImpl implements ProductDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Override
	public List<Product> findProducts() {
		return hibernateTemplate.loadAll(Product.class);
	}

}
