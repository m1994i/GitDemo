package assignment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String text = "Milan";
		System.setProperty("webdriver.chrome.driver", " /Users/Pc/Desktop/It akademija/Udemy academy/Chromedriver/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.cssSelector("[id = 'alertbtn']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept(); //ova funckija odobrava pop-up obavestenje
		Thread.sleep(1000);
		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		
		
}
}