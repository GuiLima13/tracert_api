package com.tracert.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tracert.model.User;
import com.tracert.model.dao.UserDAO;
import com.tracert.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository repository;
	
	public UserDAO userLogin(User body) {
		UserDAO userDao = new UserDAO();
		User user = repository.findByUsername(body.getUsername());
		if(user == null || !user.getPassword().equals(body.getPassword())) {
			userDao.setStatus(false);
		}else {
			userDao.setId(user.getId());
			userDao.setName(user.getName());
			userDao.setEmail(user.getEmail());
			userDao.setUsername(user.getUsername());
			userDao.setStatus(true);
		}
		return userDao;
	}
	
	public User findByUsername(String username) {
		return repository.findByUsername(username);
	}
	
	public void insertUser(User user) {
		repository.save(user);
	}
}
