package com.kat.util.log;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.RollingFileAppender;

import com.kat.base.OrderPlacement;

public class LoggerAppender extends OrderPlacement {

	public static void main(String[] args) {
		// loggerCreation();

	}

	// public static Logger loggerCreation() {
	public static Logger loggerCreation(int master_id, int order_id, int detail_id, String URL) {

		PatternLayout layout = new PatternLayout();
		String conversionPattern = "%d{yyyy-MM-dd HH:mm:ss} %-5p %c{1}:%L - %m%n";
		layout.setConversionPattern(conversionPattern);

		// String folder = request.getParameter("folder");
		// String file = request.getParameter("file");

		// String folder = "" + master_id + "/" + order_id + "/" + detail_id;
		String folder = "New";
		String file = "test";

		// creates daily rolling file appender
		RollingFileAppender rollingAppender = new RollingFileAppender();
		rollingAppender.setName("file");
		rollingAppender.setFile("D:/workspace/BestBuy_RobotOrdering/logs/" + folder + "/" + file + ".log");
		rollingAppender.setAppend(true);
		rollingAppender.setLayout(layout);
		rollingAppender.activateOptions();

		// configures the root logger
		Logger rootLogger = Logger.getRootLogger();
		rootLogger.setLevel(Level.INFO);
		rootLogger.addAppender(rollingAppender);

		// creates a custom logger and log messages
		Logger logger = Logger.getLogger(OrderPlacement.class);
		logger.info("New Message 1 inserted");
		return logger;
	}

}
