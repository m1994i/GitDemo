package testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
	@Parameters({"URL"})
	@Test
	public void WebLoginHome(String uname) {
		System.out.println("webloginhomePersonalLoan");
		System.out.println(uname);
	}
	
	@Test(groups = {"Smoke"})
	public void MobileLoginHome() {
		System.out.println("MobileLoginHome");
	}
	@Test 
	public void LogInAPIHomeLoan() {
		System.out.println("APIloginHome");
	}

}
