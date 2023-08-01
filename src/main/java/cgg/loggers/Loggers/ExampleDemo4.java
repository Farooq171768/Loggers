package cgg.loggers.Loggers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleDemo4 {
	private static final Logger logger=LoggerFactory.getLogger(ExampleDemo4.class);
	public static void main(String[] args) {
		setTemp(45);
		setTemp(53);
	}
	static Integer t;
	static Integer OldT;
	
	private static void setTemp(int temp) {
		OldT=t;
		t=temp;
		
		logger.debug("Temperature set to {}. Old temperature was {}",t,OldT);
		if(temp>50) {
			logger.info("Temperature has raised to above 50 degrees");
		}
		
	}

}
