package com.bettercode.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bettercode.ems.dto.SiteConfigDTO;
import com.bettercode.ems.model.Parameter;
import com.bettercode.ems.model.SiteConfigModel;
import com.bettercode.ems.service.SiteConfigService;
import com.bettercode.ems.service.SiteService;

@RestController
@RequestMapping(value="/sites")
@CrossOrigin(origins="*")
public class SiteConfigController {
	
	@Autowired
	private SiteConfigService siteConfigService;
	
	@Autowired
	private SiteService siteService;
	
	@PostMapping(value="/addDevice")
	public boolean addDevice(@RequestBody SiteConfigDTO siteConfigDTO) {
		return siteConfigService.addDevice(siteConfigDTO);
	}
	
	@GetMapping(value="getAllSitesOfUser/{userId}")
	public List<SiteConfigModel> getAllSitesOfUser(@PathVariable String userId){
		return siteService.getAllSitesOfUser(Integer.parseInt(userId));
	}
	
	@PostMapping(value="/addParameter")
	public List<Parameter> addParameter(@RequestBody Parameter parameter) {
		siteConfigService.addParameter(parameter);
		return siteService.getAllParametersOfSite(parameter.getSiteId());
	}

}