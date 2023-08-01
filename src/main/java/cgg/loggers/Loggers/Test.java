package cgg.loggers.Loggers;

public class Test {

	public static void main(String[] args) {
		Calci c= new Calci();
		System.out.println("Calling add method");
		c.add(10,10);
		System.out.println("End of add method");
		
		System.out.println("Calling div method");
		c.div(10,0);
		System.out.println("End of div method");
		
		System.out.println("Calling Sub method");
		c.sub(10,5);
		System.out.println("End of SUb method");

	}

}
