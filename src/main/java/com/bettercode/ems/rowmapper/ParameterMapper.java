package com.bettercode.ems.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bettercode.ems.model.Parameter;

public class ParameterMapper implements RowMapper<Parameter> {

	@Override
	public Parameter mapRow(ResultSet rs, int rowNum) throws SQLException {

		Parameter parameter = new Parameter();

		parameter.setParameterId(rs.getInt("parameterId"));
		parameter.setSiteId(rs.getInt("siteId"));
		parameter.setAddress(rs.getString("address"));

		parameter.setLabel(rs.getString("label"));
		parameter.setAcronym(rs.getString("acronym"));
		parameter.setType(rs.getString("type"));
		parameter.setMeasuringUnit(rs.getString("measuringUnit"));

		parameter.setHighValue(rs.getString("highValue"));
		parameter.setLowValue(rs.getString("lowValue"));
		parameter.setHighFault(rs.getString("highFault"));
		parameter.setLowFault(rs.getString("lowFault"));

		return parameter;
	}

}