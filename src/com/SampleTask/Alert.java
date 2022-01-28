package com.SampleTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91984\\eclipse-workspace.Selenium\\SeleniumTask\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		
		WebElement button1 = driver.findElement(By.id("alertButton"));
		button1.click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        
        WebElement button2 = driver.findElement(By.id("confirmButton"));
		button2.click();
        Thread.sleep(3000);
        driver.switchTo().alert().dismiss();
        
        WebElement button3 = driver.findElement(By.id("promtButton"));
		button3.click();
        Thread.sleep(3000);
        driver.switchTo().alert().sendKeys("Vasanthi");
        driver.switchTo().alert().accept();
			
		
}	

}
