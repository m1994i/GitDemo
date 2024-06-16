package testng;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
public class day1 {
	
	@AfterTest // Izvrsice se poslednji medju svim testovima
	public void lastexecution() {
		
		System.out.println("I will execute last");
		
	}
	
	
	@Test 
	public void Demo() {
		System.out.println("hello");
		Assert.assertTrue(false);
	}
	@AfterSuite // After Suite se izvrsava poslednji i ima prednost u odnosu na sve ostale metode tako da se izvrsava poslednji
	public void aftSuite() {
		
		System.out.println("I am the last");
		
	}
	@Test
	public void SecondTest(){
		System.out.println("bye");
	}
	
}

