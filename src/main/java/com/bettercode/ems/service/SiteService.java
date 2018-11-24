package com.bettercode.ems.service;

import java.util.List;

import com.bettercode.ems.model.Parameter;
import com.bettercode.ems.model.SiteConfigModel;

public interface SiteService {

	public List<SiteConfigModel> getAllSitesOfUser(int userId);

	public List<Parameter> getAllParametersOfSite(Integer siteId);

}
