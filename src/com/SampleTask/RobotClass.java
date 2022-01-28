package com.SampleTask;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClass {
	
public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91984\\eclipse-workspace.Selenium\\SeleniumTask\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		WebElement button1 = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		
		Actions act = new Actions(driver);
		
		act.contextClick(button1).build().perform();
	
		Robot rob = new Robot();
		
//		rob.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//		rob.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);

		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		
        Thread.sleep(3000);
		
//		rob.keyPress(KeyEvent.VK_DOWN);
//		rob.keyRelease(KeyEvent.VK_DOWN);
//		
//		rob.keyPress(KeyEvent.VK_DOWN);
//		rob.keyRelease(KeyEvent.VK_DOWN);
		
        rob.keyPress(KeyEvent.VK_ENTER);
        rob.keyRelease(KeyEvent.VK_ENTER);
        
        WebElement ec = driver.findElement(By.xpath("//a[normalize-space()='Electronics']"));
		
		act.contextClick(ec).build().perform();
			
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		
        rob.keyPress(KeyEvent.VK_ENTER);
        rob.keyRelease(KeyEvent.VK_ENTER);
	
       WebElement home = driver.findElement(By.xpath("//a[text()='Fashion']"));
				
		act.contextClick(home).build().perform();
		    
		rob.keyPress(KeyEvent.VK_DOWN); 
		rob.keyRelease(KeyEvent.VK_DOWN);

		rob.keyPress(KeyEvent.VK_ENTER);
        rob.keyRelease(KeyEvent.VK_ENTER);
		
		String string = driver.getWindowHandle();
		
		System.out.println(string);
		
		Set<String> str = driver.getWindowHandles();
				
		for (String string2 : str) {
			
			String title = driver.switchTo().window(string2).getTitle();
			
			System.out.println(title);

		}
		
		
		
		
		
}

}


