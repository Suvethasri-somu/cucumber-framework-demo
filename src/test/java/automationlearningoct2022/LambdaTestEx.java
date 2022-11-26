package automationlearningoct2022;
import org.openqa.selenium.JavascriptExecutor;	
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;
public class LambdaTestEx {
	@Test
	
	public void Lambdatest()throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver=new ChromeDriver ();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://ecommerce-playground.lambdatest.io/");
		WebElement myAccount = driver.findElement(By.xpath("(//span[@class='title'])[32]"));

//		WebElement myAccount = driver.findElement(By.xpath("(//span[contains(text(),' My account')])[2]"));

		Actions action = new Actions(driver);
		action.moveToElement(myAccount).perform();

		WebElement register = driver.findElement(By.xpath("(//span[@class='title'])[34]"));
		action.moveToElement(register).click().build().perform();
		driver.findElement(By.id("input-firstname")).sendKeys("Bumble");
		driver.findElement(By.id("input-lastname")).sendKeys("Bee");
		driver.findElement(By.id("input-email")).sendKeys("Bumblebee22@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("1234567890");
		driver.findElement(By.id("input-password")).sendKeys("Bee12345.");
		driver.findElement(By.id("input-confirm")).sendKeys("Bee12345.");
		driver.findElement(By.xpath("(//label[@class='custom-control-label'])[2]")).click();
		driver.findElement(By.xpath("(//label[@class='custom-control-label'])[3]")).click();

	JavascriptExecutor jse = (JavascriptExecutor) driver;

		WebElement clickAllDetails = driver.findElement(By.linkText("input-agree"));	
	jse.executeScript("arguments[0].click();", clickAllDetails);

		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//a[@class='btn btn-primary']")).click();

		
			
		
		
		
		
		
		
		
	}

}
