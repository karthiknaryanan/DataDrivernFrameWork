package log4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class BasicConfiguratorExample {

	static Logger logger = Logger.getLogger(BasicConfiguratorExample.class);
	public static void main(String[] args) {
		
		
		BasicConfigurator.configure();
		logger.debug("This a debug message");
		logger.info("This a info message");
		logger.warn("This a warn message");
		logger.error("This a error message");
		logger.fatal("This a fatal message");
		//Commits that has to done everyday

	}

}
