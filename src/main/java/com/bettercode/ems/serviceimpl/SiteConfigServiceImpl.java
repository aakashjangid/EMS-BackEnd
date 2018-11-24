package com.bettercode.ems.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bettercode.ems.dao.SiteConfigDAO;
import com.bettercode.ems.dto.SiteConfigDTO;
import com.bettercode.ems.model.Parameter;
import com.bettercode.ems.service.SiteConfigService;

@Service
public class SiteConfigServiceImpl implements SiteConfigService {
	
	@Autowired
	private SiteConfigDAO siteConfigDAO;

	@Override
	public boolean addDevice(SiteConfigDTO siteConfigDTO) {
		return siteConfigDAO.addDevice(siteConfigDTO);
	}

	@Override
	public void addParameter(Parameter parameter) {
		siteConfigDAO.addParameter(parameter);
	}

}