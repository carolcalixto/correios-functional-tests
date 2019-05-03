package com.carolsmanioto.com.correiosfunctionaltests;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	@Value("${configuration.operationalsystem}")
	private String operationalSystem;
	
	@Value("${configuration.browser}")
	private String browser;
	
	public String getBrowser() {
		return browser;
	}
	
	public String getOperationalSystem() {
		return operationalSystem;
	}
	
}
