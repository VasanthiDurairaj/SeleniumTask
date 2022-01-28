package com.Tasks;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynaminXpath {
	
public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91984\\eclipse-workspace.Selenium\\SeleniumTask\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		
		WebElement Register = driver.findElement(By.xpath("//a[text()='New User Register Here']"));
		Register.click();
		
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("VasanthiRajuswami");
		
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("Appa@2022");
		
		WebElement repass = driver.findElement(By.id("re_password"));
		repass.sendKeys("Appa@2022");
		
		WebElement fullname = driver.findElement(By.id("full_name"));
		fullname.sendKeys("VasanthiDurairaj");
		
		WebElement email = driver.findElement(By.id("email_add"));
		email.sendKeys("Vasanthidurairaj86@gmail.com");
		
		String str = JOptionPane.showInputDialog("Enter Captcha");
		
		WebElement captcha = (WebElement) driver.findElement(By.id("captcha-form"));
		captcha.sendKeys(str);
		
		WebElement check = driver.findElement(By.id("tnc_box"));
		check.click();
		
		WebElement submit = driver.findElement(By.id("Submit"));
		submit.click();

		WebElement login = driver.findElement(By.xpath("//a[text()='Click here to login']"));
		login.click();
		
}
}
