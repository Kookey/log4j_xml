package com.steel.log4j;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
public class HelloLog4j {

	public HelloLog4j() throws IOException{
		
		InputStream inStream = this.getClass().getClassLoader().getResourceAsStream("log4j.xml");
		Properties property = new Properties();
		property.load(inStream);
		PropertyConfigurator.configure(property);
	}
	public void doSample(){
		Logger logger = Logger.getLogger(HelloLog4j.class);
		logger.debug("debug");
		logger.info("info");
		logger.warn("warn");
		logger.error("error");
		logger.fatal("fatal");
	}
}
