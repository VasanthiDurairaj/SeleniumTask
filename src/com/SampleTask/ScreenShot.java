package com.SampleTask;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

public class ScreenShot {
	
public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91984\\eclipse-workspace.Selenium\\SeleniumTask\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		
		 TakesScreenshot screen0= (TakesScreenshot) driver; 
		 File src0 = screen0.getScreenshotAs(OutputType.FILE); 
		 File dest0 = new File("C:\\Users\\91984\\eclipse-workspace.Selenium\\SeleniumTask\\Image\\snap.png"); 
		 FileUtils.copyFile(src0, dest0);
}
}
