package examples.LoggingExample;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Example {

	private static Logger log=LogManager.getLogger(Example.class.getName());
	public static void main(String[] args) {
			log.error("this is an error");
			log.info("this is an information");
			log.trace("this is an trace");
	}

}
