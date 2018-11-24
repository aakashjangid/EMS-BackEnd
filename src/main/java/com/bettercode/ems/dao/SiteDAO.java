package com.bettercode.ems.dao;

import java.util.List;

import com.bettercode.ems.model.Parameter;
import com.bettercode.ems.model.SiteConfigModel;

public interface SiteDAO {

	List<SiteConfigModel> getAllSitesOfUser(int userId);

	List<Parameter> getAllParametersOfSite(Integer siteId);

}
