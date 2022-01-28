package com.SampleTask;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {
	
public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91984\\eclipse-workspace.Selenium\\SeleniumTask\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.javatpoint.com/java-tutorial");
		
		Thread.sleep(3000);
		List<WebElement> fe = driver.findElements(By.xpath("/html/body/div/div/div[6]/div[2]//div/table/tbody/tr/td/h2"));
		
		for (WebElement web : fe) {
			
			System.out.println(web.getText());

		}
        
    }
}
