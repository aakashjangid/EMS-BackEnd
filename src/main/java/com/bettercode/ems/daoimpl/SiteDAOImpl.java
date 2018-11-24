package com.bettercode.ems.daoimpl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bettercode.ems.dao.SiteDAO;
import com.bettercode.ems.model.Parameter;
import com.bettercode.ems.model.SiteConfigModel;
import com.bettercode.ems.rowmapper.ParameterMapper;
import com.bettercode.ems.rowmapper.SiteConfigModelMapper;

@Repository
public class SiteDAOImpl implements SiteDAO {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<SiteConfigModel> getAllSitesOfUser(int userId) {

		String sql = "SELECT * FROM sites WHERE userId=?";
		List<SiteConfigModel> sites = jdbcTemplate.query(sql, new Object[] { userId }, new SiteConfigModelMapper());

		for (SiteConfigModel site : sites) {
			sql = "SELECT * FROM parameters WHERE siteId=?";
			site.setParameters(jdbcTemplate.query(sql, new Object[] { site.getSiteId() }, new ParameterMapper()));
		}

		return sites;
	}

	@Override
	public List<Parameter> getAllParametersOfSite(Integer siteId) {
		String sql = "SELECT * FROM parameters WHERE siteId=?";
		return jdbcTemplate.query(sql, new Object[] { siteId }, new ParameterMapper());
	}

}