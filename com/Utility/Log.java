package com.Utility;





import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;

public class Log {
	public static Logger log;
	public static void info(String message) // User defined Method with Parameters
	{
		log= Logger.getLogger("Log");

	PropertyConfigurator.configure("Log4j.properties");
	log.info(message);

	}
}
