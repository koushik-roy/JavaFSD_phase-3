package com.springapps.service.impl;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springapps.dao.UserDao;
import com.springapps.service.UserService;
import com.springapps.entity.User;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	public UserDao userdao;

	@Override
	@Transactional
	public List<User> getUsers() {
		List<User> users = userdao.findUsers();
		return users;
	}

}
