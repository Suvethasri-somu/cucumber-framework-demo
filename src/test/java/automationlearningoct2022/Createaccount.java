package automationlearningoct2022;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Createaccount {
	
	
	

@Test
	public void Createacc(){
	WebDriverManager.chromedriver().setup();
	RemoteWebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	driver.get("http://automationpractice.com/index.php");
	driver.findElement(By.className("login")).click();
	driver.findElement(By.id("email_create")).sendKeys("sssssss234@gmail.com");
	driver.findElement(By.id("SubmitCreate")).click();
	
	
	
}
}