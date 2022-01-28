package com.SampleTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsTask {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91984\\eclipse-workspace.Selenium\\SeleniumTask\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		
		Thread.sleep(3000);
		
		WebElement button1 = driver.findElement(By.xpath("(//button[text()='Click Me'])"));
		
		Actions act = new Actions(driver);
		
		act.click(button1).build().perform();
				
		WebElement button2 = driver.findElement(By.xpath("(//button[text()='Right Click Me'])"));
		
		act.click(button2).contextClick().build().perform();
		
		WebElement button3 = driver.findElement(By.xpath("(//button[text()='Double Click Me'])"));
 
		act.click(button3).doubleClick().build().perform();
		
		
		
		
		
}
}
