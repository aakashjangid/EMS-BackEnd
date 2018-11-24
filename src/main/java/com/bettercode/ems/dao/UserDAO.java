package com.bettercode.ems.dao;

import java.util.List;

import com.bettercode.ems.model.User;

public interface UserDAO {

	public List<User> getAllRegisteredOrganizations();

}
