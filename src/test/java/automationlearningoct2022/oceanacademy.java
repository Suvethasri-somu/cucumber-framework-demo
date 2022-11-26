package automationlearningoct2022;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class oceanacademy {
	@Test
	public void Createacc() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://oceanacademy.co.in");

		WebElement courses = driver.findElement(By.id("courses"));
		Actions actionObj = new Actions(driver);
		actionObj.moveToElement(courses).perform();

		WebElement courseType = driver.findElement(By.xpath("//a[text()='Offline Courses']"));
		actionObj.moveToElement(courseType).click().build().perform();
		
		
//		Thread.sleep(5000);
//		
//		String value = driver.findElement(By.xpath("(//p[@class='title'])[1]")).getText();
//		//System.out.println(value);
//		
//		List<WebElement> courseList =driver.findElements(By.xpath("//p[@class='title']"));
//		System.out.println(courseList.size());
//		for (WebElement abc : courseList) {
//			String courseName = abc.getText();
//		
//			System.out.println(courseName);
//		}
//		
		
		
		
       
		
	
	

}
}