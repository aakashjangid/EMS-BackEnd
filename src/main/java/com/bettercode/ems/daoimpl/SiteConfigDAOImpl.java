package com.bettercode.ems.daoimpl;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bettercode.ems.dao.SiteConfigDAO;
import com.bettercode.ems.dto.SiteConfigDTO;
import com.bettercode.ems.model.Parameter;

@Repository
public class SiteConfigDAOImpl implements SiteConfigDAO {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public boolean addDevice(SiteConfigDTO siteConfigDTO) {
		String sql = "INSERT INTO sites(siteName, postURL, schemaURL, deviceName, deviceManuf, deviceModel, deviceAddress, userId) VALUES(?,?,?,?,?,?,?,?)";
		int result = jdbcTemplate.update(sql, siteConfigDTO.getSiteName(), siteConfigDTO.getPostURL(),
				siteConfigDTO.getSchemaURL(), siteConfigDTO.getDeviceName(), siteConfigDTO.getDeviceManuf(),
				siteConfigDTO.getDeviceModel(), siteConfigDTO.getDeviceAddress(), siteConfigDTO.getUserId());

		if (result == 1) {
			sql = "SELECT siteId from sites ORDER BY siteId DESC limit 1";
			Integer insertedSiteId = jdbcTemplate.queryForObject(sql, Integer.class);

			sql = "INSERT INTO parameters(siteId, label, acronym, type, measuringUnit, highValue, lowValue, highFault, lowFault, address) VALUES(?,?,?,?,?,?,?,?,?,?)";
			jdbcTemplate.update(sql, insertedSiteId, siteConfigDTO.getLabel(), siteConfigDTO.getAcronym(),
					siteConfigDTO.getType(), siteConfigDTO.getMeasuringUnit(), siteConfigDTO.getHighValue(),
					siteConfigDTO.getLowValue(), siteConfigDTO.getHighFault(), siteConfigDTO.getLowFault(),
					siteConfigDTO.getAddress());
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void addParameter(Parameter parameter) {
		String sql = "INSERT INTO parameters(siteId, label, acronym, type, measuringUnit, highValue, lowValue, highFault, lowFault, address) VALUES(?,?,?,?,?,?,?,?,?,?)";
		jdbcTemplate.update(sql, parameter.getSiteId(), parameter.getLabel(), parameter.getAcronym(),
				parameter.getType(), parameter.getMeasuringUnit(), parameter.getHighValue(), parameter.getLowValue(),
				parameter.getHighFault(), parameter.getLowFault(), parameter.getAddress());
	}

}