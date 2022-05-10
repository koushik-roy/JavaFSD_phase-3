package com.springapps.dao;

import java.util.List;

import com.springapps.entity.User;


public interface UserDao {
	List<User> findUsers();
}
