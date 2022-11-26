 package automationlearningoct2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lambdatestcase3 {
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
		WebElement login = driver.findElement(By.xpath("(//span[@class='title'])[32]"));
		action.moveToElement(login).click().build().perform();
		driver.findElement(By.id("input-email")).sendKeys("Bumblebee22@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Bee12345.");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		

		WebElement Myvoucher = driver.findElement(By.xpath("(//span[@class='title'][37]"));
		action.moveToElement(Myvoucher).click().build().perform();

}
}
