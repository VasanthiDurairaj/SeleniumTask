package com.SampleTask;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript1 {

public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91984\\eclipse-workspace.Selenium\\SeleniumTask\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("document.getElementById('email').value='SeleniumTesting.com';");        
		
		js.executeScript("document.getElementById('pass').value='2546187';"); 
		Thread.sleep(3000);
		WebElement button = driver.findElement(By.name("login"));
		js.executeScript("arguments[0].click();", button);
			
}	
}
