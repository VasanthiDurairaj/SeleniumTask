package com.Tasks;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsHandling2 {
	
public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91984\\eclipse-workspace.Selenium\\SeleniumTask\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
		Actions act = new Actions(driver);
		act.click(button).build().perform(); 
		
		WebElement search = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
		search.sendKeys("iphone 7");
		Thread.sleep(3000);
		Robot rob = new Robot();
		
		rob.keyPress(KeyEvent.VK_ENTER);
        rob.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		
        WebElement phone = driver.findElement(By.xpath("//img[@alt='APPLE iPhone 7 (Jet Black, 32 GB)']"));
		act.click(phone).build().perform();
		Thread.sleep(3000);
			
		WebElement button1 = driver.findElement(By.xpath("//button[text()='NOTIFY ME']"));
		act.contextClick(button1).build().perform();

    	String string = driver.getWindowHandle();
	    System.out.println(string);
		     
}
}
