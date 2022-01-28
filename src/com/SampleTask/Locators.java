package com.SampleTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91984\\eclipse-workspace.Selenium\\SeleniumTask\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);

		WebElement user = driver.findElement(By.name("username"));
		
        user.sendKeys("vasanthidurairaj@gmail.com");
		
		WebElement pass = driver.findElement(By.name("password"));
		
		pass.sendKeys("254879");
	    
		WebElement log = driver.findElement(By.xpath("//div[text()='Log In']"));
		
		log.click();
		
	}

}
