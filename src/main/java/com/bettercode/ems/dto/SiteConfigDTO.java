package com.bettercode.ems.dto;

public class SiteConfigDTO {

	private String siteName;
	private Integer userId;

	private String postURL;
	private String schemaURL;

	private String deviceName;
	private String deviceManuf;
	private String deviceModel;
	private String deviceAddress;

	private String label;
	private String acronym;
	private String type;
	private String measuringUnit;
	private String highValue;
	private String lowValue;
	private String highFault;
	private String lowFault;
	private String address;

	public String getSiteName() {
		return siteName;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public void setSiteName(String siteName) {
		this.siteName = siteName;
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

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getAcronym() {
		return acronym;
	}

	public void setAcronym(String acronym) {
		this.acronym = acronym;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMeasuringUnit() {
		return measuringUnit;
	}

	public void setMeasuringUnit(String measuringUnit) {
		this.measuringUnit = measuringUnit;
	}

	public String getHighValue() {
		return highValue;
	}

	public void setHighValue(String highValue) {
		this.highValue = highValue;
	}

	public String getLowValue() {
		return lowValue;
	}

	public void setLowValue(String lowValue) {
		this.lowValue = lowValue;
	}

	public String getHighFault() {
		return highFault;
	}

	public void setHighFault(String highFault) {
		this.highFault = highFault;
	}

	public String getLowFault() {
		return lowFault;
	}

	public void setLowFault(String lowFault) {
		this.lowFault = lowFault;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
