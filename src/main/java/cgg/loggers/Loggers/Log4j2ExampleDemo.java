package cgg.loggers.Loggers;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j2ExampleDemo {

	private static final Logger logger=LogManager.getLogger(Log4j2ExampleDemo.class);
	public static void main(String[] args) {
		logger.trace("Trace message");
		logger.debug("Debugging message");
		
		int [] numbers = {1,2,3,4,5};
		for(int i=0;i<6;i++) {
			try {
				logger.debug("Value at index {} : {}",i,numbers[i]);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				logger.error("Error accessing array at index {}",i,e.getMessage());
			}
		}
		

	}

}
