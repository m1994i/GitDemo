package assignment;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class exercise2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/Pc/Desktop/It akademija/Udemy academy/Chromedriver/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://best.aliexpress.com/");
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[@class=' _1-SOk']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class=' _1-SOk']"))).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		System.out.println("Milan");
		System.out.println("Ivanovic");
		driver.quit();
	}

}
