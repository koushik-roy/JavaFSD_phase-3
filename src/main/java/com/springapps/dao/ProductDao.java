package com.springapps.dao;

import java.util.List;

import com.springapps.entity.Product;

public interface ProductDao {
	List<Product> findProducts();

}
