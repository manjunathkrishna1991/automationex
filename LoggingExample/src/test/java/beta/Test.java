package beta;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test {
	private static Logger log=LogManager.getLogger(Test.class.getName());
	public static void main(String[] args) {
			log.error("this is an error");
			log.info("this is an information");
			log.trace("this is an trace");
	}
}
