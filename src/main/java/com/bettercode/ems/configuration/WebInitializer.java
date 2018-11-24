package com.bettercode.ems.configuration;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	private static final String LOCATION = System.getProperty("catalina.base")+"/webapps"; // Temporary location where files will be stored

	private static final long MAX_FILE_SIZE = 5242880; // 5MB : Max file size.
	private static final long MAX_REQUEST_SIZE = 20971520; // 20MB : Total request size containing Multi part.
	private static final int FILE_SIZE_THRESHOLD = 0; // Size threshold after which files will be written to disk

	private MultipartConfigElement getMultipartConfigElement() {

		return new MultipartConfigElement(LOCATION+"/ROOT/applications/", MAX_FILE_SIZE, MAX_REQUEST_SIZE, FILE_SIZE_THRESHOLD);
	}
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { WebConfiguration.class };
	}
	
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return null;
	}
	
	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}
	
	@Override
	protected void customizeRegistration(ServletRegistration.Dynamic registration) {
	    registration.setMultipartConfig(getMultipartConfigElement());
	}

}