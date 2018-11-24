package com.bettercode.ems.daoimpl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bettercode.ems.dao.UserDAO;
import com.bettercode.ems.model.User;
import com.bettercode.ems.rowmapper.UserMapper;

@Repository
public class UserDAOImpl implements UserDAO {

	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<User> getAllRegisteredOrganizations() {
		String sql = "SELECT * FROM users";
		return jdbcTemplate.query(sql, new UserMapper());
	}

}
