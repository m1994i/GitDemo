package testng;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
	
	@Test(groups = {"Smoke"})
	public void ploan() {
		System.out.println("good");
	}
	
	@BeforeTest //Izvrsice se prvi medju svim testovima bez obzira sto je po redosledu na nekom drugom mestu
	public void prerequiste() {
		System.out.println("I will execute first");
	}
}
