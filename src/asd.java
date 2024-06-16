
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import static org.openqa.selenium.support.locators.RelativeLocator.*;
public class asd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/Pc/Desktop/It akademija/Udemy academy/Chromedriver/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("Milan");
		driver.findElement(By.name("email")).sendKeys("ivanovicmilan401@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("milan1234");
		driver.findElement(By.id("exampleCheck1")).click();
		System.out.println(driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']")).getText());
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='exampleFormControlSelect1']"));
		Select gender = new Select(dropdown);
		gender.selectByVisibleText("Female");
		driver.findElement(By.id("inlineRadio1")).click();
		System.out.println(driver.findElement(By.cssSelector("label[for*='dateofBirth']")).getText());
		
		
		WebElement employmentStatus = driver.findElement(By.id("exampleFormControlSelect1"));
		System.out.println(driver.findElement(with(By.cssSelector("label[for$='exampleFormControlRadio1']")).below(employmentStatus)).getText());
		
		WebElement dateOfBirth = driver.findElement(By.cssSelector("label[for$='dateofBirth']"));
		driver.findElement(with(By.cssSelector("input[class='form-control']:nth-child(2)")).below(dateOfBirth)).sendKeys("10/26/1994");
		
		
	}

}

