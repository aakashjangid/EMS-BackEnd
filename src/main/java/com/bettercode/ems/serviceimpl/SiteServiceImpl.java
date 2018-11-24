package com.bettercode.ems.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bettercode.ems.dao.SiteDAO;
import com.bettercode.ems.model.Parameter;
import com.bettercode.ems.model.SiteConfigModel;
import com.bettercode.ems.service.SiteService;

@Service
public class SiteServiceImpl implements SiteService {
	
	@Autowired
	private SiteDAO siteDAO;

	@Override
	public List<SiteConfigModel> getAllSitesOfUser(int userId) {
		return siteDAO.getAllSitesOfUser(userId);
	}

	@Override
	public List<Parameter> getAllParametersOfSite(Integer siteId) {
		return siteDAO.getAllParametersOfSite(siteId);
	}

}
