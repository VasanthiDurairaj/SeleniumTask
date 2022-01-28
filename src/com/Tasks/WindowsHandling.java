package com.Tasks;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsHandling {
	
public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91984\\eclipse-workspace.Selenium\\SeleniumTask\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		
		Thread.sleep(3000);
		
		WebElement button1 = driver.findElement(By.xpath("//div[text()='Mobile & Tablets']"));
		Actions act = new Actions(driver);
 		act.contextClick(button1).build().perform();
		
		Robot rob = new Robot();
				
		rob.keyPress(KeyEvent.VK_DOWN);
     	rob.keyRelease(KeyEvent.VK_DOWN);
		
		rob.keyPress(KeyEvent.VK_ENTER);
        rob.keyRelease(KeyEvent.VK_ENTER);
//		
//        Thread.sleep(3000);		
//		WebElement mobiles = driver.findElement(By.xpath("//span[text()='Smartphones']"));
//		
//		act.contextClick(mobiles).build().perform();
		
		String string = driver.getWindowHandle();
        System.out.println(string);
        
        Set<String> str = driver.getWindowHandles();
        System.out.println(str);
        
        
		
}

}
