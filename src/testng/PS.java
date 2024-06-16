package testng;

import org.testng.annotations.AfterMethod;

public class PS {
	
	public void doThis() {
		System.out.println("I am here");
		
	}
	
	@AfterMethod
	public void afterRun() {
		System.out.println("Run me last");
	}

}
