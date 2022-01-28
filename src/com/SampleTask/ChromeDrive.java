package com.SampleTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDrive {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91984\\eclipse-workspace.Selenium\\SeleniumTask\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://web.whatsapp.com/");
		String str = driver.getCurrentUrl();
		System.out.println(str);
		
		String tle = driver.getTitle();
		System.out.println(tle);
		
		driver.navigate().to("https://www.google.com/");
		
		driver.navigate().refresh();		
		
	}

}
