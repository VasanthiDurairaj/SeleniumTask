package com.SampleTask;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {
	
public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91984\\eclipse-workspace.Selenium\\SeleniumTask\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window,scrollBy(0,9000);");
		System.out.println("Greens Overall Reviews");
		
		 Thread.sleep(3000);
		js.executeScript("window,scrollBy(0,-9000);");
		
	
}
}
