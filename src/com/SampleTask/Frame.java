package com.SampleTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	
public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91984\\eclipse-workspace.Selenium\\SeleniumTask\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		WebElement click = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		
		click.click();
		
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
     	
     	driver.switchTo().frame(1);
     	
     	//WebElement inner = driver.findElement(By.xpath("(//iframe[@style='float: left;height: 300px;width:600px'])"));
     	driver.switchTo().frame(0);

     	Thread.sleep(3000);
     	
     	WebElement find = driver.findElement(By.xpath("//input[@type='text']"));
        find.sendKeys("Success");
     		
		
//		driver.switchTo().frame(0);		
//		WebElement findElement = driver.findElement(By.xpath("//input[@type='text']"));
//		findElement.sendKeys("Frame");
}
}
