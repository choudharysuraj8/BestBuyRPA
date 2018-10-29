package com.kat.util;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.RollingFileAppender;

import com.kat.base.OrderPlacement;
import com.kat.base.PlaceOrder;
import com.kat.bean.LogParams;

public class LoggerAppender extends OrderPlacement {

	public static void main(String[] args) {
		// loggerCreation();

	}

	// public static Logger loggerCreation() {
	public static Logger loggerCreation(LogParams logparams) {
		PatternLayout layout = new PatternLayout();
		String conversionPattern = "%d{yyyy-MM-dd HH:mm:ss} %-5p %c{1}:%L - %m%n";
		layout.setConversionPattern(conversionPattern);

		// String folder = request.getParameter("folder");
		// String file = request.getParameter("file");
		
		
		System.out.println("getMasterId Id "+logparams.getMasterId());
		System.out.println("getDetailId Id "+logparams.getDetailId());
		System.out.println("getTransactionDetailId Id "+logparams.getTransactionDetailId());
		System.out.println("getTransactionOrderId Id "+logparams.getTransactionOrderId());
		String folder = "" + logparams.getSession_id() + "/" + logparams.getMasterId() + "/" + logparams.getDetailId() + "/"
				+ logparams.getTransactionDetailId();
		// String folder = "New";
		// String file = "test";

		// creates daily rolling file appender
		RollingFileAppender rollingAppender = new RollingFileAppender();
		rollingAppender.setName("file");
		rollingAppender.setFile(
				"D:/workspace/BestBuy_RobotOrdering/logs/" + folder + "/" + logparams.getTransactionOrderId() + ".log");
		rollingAppender.setAppend(true);
		rollingAppender.setLayout(layout);
		rollingAppender.activateOptions();

		// configures the root logger
		Logger rootLogger = Logger.getRootLogger();
		rootLogger.setLevel(Level.INFO);
		rootLogger.addAppender(rollingAppender);

		// creates a custom logger and log messages
		Logger logger = Logger.getLogger(PlaceOrder.class);
		logger.info("New Message 1 inserted");
		return logger;
	}

}
