package com.steel.log4j;

import org.apache.log4j.DailyRollingFileAppender;
import org.apache.log4j.Priority;

public class LogAppender extends DailyRollingFileAppender {

	@Override
	public boolean isAsSevereAsThreshold(Priority priority) {
		// TODO Auto-generated method stub
		return this.getThreshold().equals(priority);  
	}

	
}
