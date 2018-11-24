package com.bettercode.ems.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bettercode.ems.dao.UserDAO;
import com.bettercode.ems.model.User;
import com.bettercode.ems.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;
	
	@Override
	public List<User> getAllRegisteredOrganizations() {
		return userDAO.getAllRegisteredOrganizations();
	}

}
