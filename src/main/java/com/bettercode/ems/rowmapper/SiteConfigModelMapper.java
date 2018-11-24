package com.bettercode.ems.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bettercode.ems.model.SiteConfigModel;

public class SiteConfigModelMapper implements RowMapper<SiteConfigModel> {

	@Override
	public SiteConfigModel mapRow(ResultSet rs, int rowNum) throws SQLException {

		SiteConfigModel site = new SiteConfigModel();

		site.setSiteId(rs.getInt("siteId"));
		site.setUserId(rs.getInt("userId"));
		site.setSiteName(rs.getString("siteName"));

		site.setPostURL(rs.getString("postURL"));
		site.setSchemaURL(rs.getString("schemaURL"));

		site.setDeviceName(rs.getString("deviceName"));
		site.setDeviceManuf(rs.getString("deviceManuf"));
		site.setDeviceModel(rs.getString("deviceModel"));
		site.setDeviceAddress(rs.getString("deviceAddress"));

		return site;
	}

}
