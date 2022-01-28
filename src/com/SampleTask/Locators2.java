package com.SampleTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators2 {
public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91984\\eclipse-workspace.Selenium\\SeleniumTask\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
        WebElement fn = driver.findElement(By.name("firstname"));
		
        fn.sendKeys("Vasanthi");
        
        WebElement ln = driver.findElement(By.name("lastname"));
		
        ln.sendKeys("Durairaj");
        
        WebElement mobile = driver.findElement(By.name("reg_email__"));
		
        mobile.sendKeys("9658423751");
        
        
		
}
}
