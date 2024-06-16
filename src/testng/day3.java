package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("before executing any methods in the class");
	}
	@Parameters({"URL","APIKey/username"})
	@Test
	public void WebloginCarLoan(String urlname, String key) {
		//selenium
		System.out.println("weblogincarLoan");
		System.out.println(urlname);
		System.out.println(key);
	}
	@BeforeMethod//Before Method se izvrsava pre svake metode u java klasi day3
	public void beforeevery() {
		System.out.println("I will execute before every test method in day 3 class");
	}
	
	@AfterMethod
	public void afterevery() {//After Method se izvrsava nakon svake metode u java klasi day3
		//Api
		System.out.println("I will execute after every test method in day 3 class");
	}
	
	@AfterClass
	public void afterClass() {
		
		System.out.println("after executing all methods in class");
	}
	
	
	@BeforeSuite //Before Suite je roditelj i ima prednost u odnosu na sve metode tako da se prvi izvrsava
	public void Bfsuite() {
		System.out.println("I am no 1");	
		
	}
	@Test(enabled=false)
	public void MobileSignincarLoan() {
		
		System.out.println("Mobile SignIn");
	}
	@Test(dataProvider="getData")
	public void MobilSignOutloanCar(String username, String password) {
		
		System.out.println("Mobile Signout");
		System.out.println(username);
		System.out.println(password);
	}
	
	@Test(dependsOnMethods= {"WebloginCarLoan", "MobilSignOutloanCar"})
	public void ApiCarLoan() {
		//Rest Api automation
		System.out.println("ApiLoginCar");
	}
	
	@DataProvider
	public Object[][] getData() {
		//1st combination - username and password-good credit history
		//2nd - username and password - no credit history
		//3rd - fraudelent credit history
		Object [][] data = new Object[3][2];
		data[0][0] = "milanivan1";
		data[0][1] = "password1";
		//columns in the row are nothing but values for that particular combination(row)
		
		//2nd set
		data[1][0]="milanivan2";
		data[1][1]="password2";
		
		//3rd set
		data[2][0]="milanivan3";
		data[2][1]="password3";
		return data;
		//Data Provider jedan od pitanja na intervjuu za posao
		
	}
	
	
}


