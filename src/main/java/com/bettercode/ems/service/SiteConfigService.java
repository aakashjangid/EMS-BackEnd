package com.bettercode.ems.service;

import com.bettercode.ems.dto.SiteConfigDTO;
import com.bettercode.ems.model.Parameter;

public interface SiteConfigService {

	public boolean addDevice(SiteConfigDTO siteConfigDTO);

	public void addParameter(Parameter parameter);

}
