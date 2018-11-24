package com.bettercode.ems.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bettercode.ems.model.User;

public class UserMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user = new User();
		user.setId(rs.getInt("id"));
		user.setName(rs.getString("name"));
		user.setEmail(rs.getString("email"));
		user.setPassword(rs.getString("password"));
		user.setContact(rs.getString("contact"));
		user.setOrgName(rs.getString("orgName"));
		user.setRegDate(rs.getDate("regDate"));
		user.setRegTime(rs.getTime("regTime"));
		user.setRole(rs.getInt("role"));
		user.setStatus(rs.getInt("status"));
		user.setUserImage(rs.getString("userImage"));
		return user;
	}

}