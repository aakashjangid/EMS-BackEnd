package com.bettercode.ems.model;

import java.util.List;

public class SiteConfigModel {

	private Integer siteId;
	private String siteName;
	private Integer userId;

	private String postURL;
	private String schemaURL;

	private String deviceName;
	private String deviceManuf;
	private String deviceModel;
	private String deviceAddress;

	private List<Parameter> parameters;

	public List<Parameter> getParameters() {
		return parameters;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public void setParameters(List<Parameter> parameters) {
		this.parameters = parameters;
	}

	public String getSiteName() {
		return siteName;
	}

	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}

	public Integer getSiteId() {
		return siteId;
	}

	public void setSiteId(Integer siteId) {
		this.siteId = siteId;
	}

	public String getPostURL() {
		return postURL;
	}

	public void setPostURL(String postURL) {
		this.postURL = postURL;
	}

	public String getSchemaURL() {
		return schemaURL;
	}

	public void setSchemaURL(String schemaURL) {
		this.schemaURL = schemaURL;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getDeviceManuf() {
		return deviceManuf;
	}

	public void setDeviceManuf(String deviceManuf) {
		this.deviceManuf = deviceManuf;
	}

	public String getDeviceModel() {
		return deviceModel;
	}

	public void setDeviceModel(String deviceModel) {
		this.deviceModel = deviceModel;
	}

	public String getDeviceAddress() {
		return deviceAddress;
	}

	public void setDeviceAddress(String deviceAddress) {
		this.deviceAddress = deviceAddress;
	}

}