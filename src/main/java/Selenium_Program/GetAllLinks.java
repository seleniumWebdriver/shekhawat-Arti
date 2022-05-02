package Selenium_Program;

import java.awt.Desktop.Action;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAllLinks {
	//WebDriver driver1 = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);

		driver.navigate().to("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement logbtn = driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
		WebElement usrnme = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		WebElement password = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
		usrnme.sendKeys("7517062966");
		password.sendKeys("Rathore@40");
		WebElement button = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		button.click();
		
	/*	List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		 for(WebElement link: allLinks)
		 {
			 System.out.println(link.getText() + " - " + link.getAttribute("href"));
			 }*/
		
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.xpath("//div[text()='Fashion']"));
		action.moveToElement(element).perform();
		Thread.sleep(10000);
		
		
		WebElement ele2 = driver.findElement(By.xpath("//a[text()='Women Footwear']"));
		Thread.sleep(5000);
		action.moveToElement(ele2).perform();
		Thread.sleep(5000);
		WebElement ele3 = driver.findElement(By.xpath("//a[text()='Women Heels']"));
		Thread.sleep(5000);
		action.moveToElement(ele3).perform();
		Thread.sleep(5000);
		action.click().build().perform();
		
		String Actual = driver.findElement(By.xpath("//h1[text()='Heels']")).getText();
		String Expected = "Heels";
		System.out.println("Actual String: "+Actual +" And Expected String: "+Expected);
//		Assert.assertEquals(Actual, Expected);
		driver.close();
		
		
		
	}

}
