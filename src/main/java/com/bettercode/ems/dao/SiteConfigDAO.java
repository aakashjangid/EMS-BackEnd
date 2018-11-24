package com.bettercode.ems.dao;

import com.bettercode.ems.dto.SiteConfigDTO;
import com.bettercode.ems.model.Parameter;

public interface SiteConfigDAO {

	public boolean addDevice(SiteConfigDTO siteConfigDTO);

	public void addParameter(Parameter parameter);

}
