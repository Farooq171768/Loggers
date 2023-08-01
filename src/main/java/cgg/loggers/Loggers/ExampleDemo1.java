package cgg.loggers.Loggers;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ExampleDemo1 {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger(ExampleDemo1.class.getName());
		logger.setLevel(Level.SEVERE);
		logger.log(Level.INFO,"This is an Info message");
		logger.log(Level.WARNING,"This is a Warning message");
		logger.log(Level.SEVERE,"This is a Severe message");
		
		

	}

}
