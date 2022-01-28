package com.Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Project {
	
public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91984\\eclipse-workspace.Selenium\\SeleniumTask\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		
		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		signin.click();
		
		WebElement email = driver.findElement(By.xpath("//input[@class='is_required validate account_input form-control']"));
		email.sendKeys("vasanthivijayan@gmail.com");
		
		WebElement name = driver.findElement(By.name("SubmitCreate"));
		name.click();
		
		Thread.sleep(3000);
		WebElement firstname = driver.findElement(By.id("customer_firstname"));
		firstname.sendKeys("Vasanthi");
		
		WebElement lastname = driver.findElement(By.id("customer_lastname"));
		lastname.sendKeys("Durairaj");
		
		WebElement pwd = driver.findElement(By.id("passwd"));
		pwd.sendKeys("3652489");
		
		WebElement radio = driver.findElement(By.id("uniform-id_gender2"));
		radio.click();
		
		WebElement day = driver.findElement(By.id("days"));
		Select select = new Select (day);
		select.selectByValue("5");
		
		WebElement month = driver.findElement(By.id("months"));
		Select sel = new Select (month);
        sel.selectByValue("6");
        
        WebElement year = driver.findElement(By.id("years"));
		Select sell = new Select (year);
        sell.selectByValue("1995");
        
        WebElement NL = driver.findElement(By.id("newsletter"));
        NL.click();
        
        WebElement opt = driver.findElement(By.id("optin"));
        opt.click();
        
        WebElement Co = driver.findElement(By.name("company"));
		Co.sendKeys("CTS");
		
		WebElement add1 = driver.findElement(By.name("address1"));
		add1.sendKeys("No.2");
		
		WebElement add2 = driver.findElement(By.name("address2"));
		add2.sendKeys("george st");
		
		WebElement city = driver.findElement(By.name("city"));
		city.sendKeys("Juneau");
		
		WebElement state = driver.findElement(By.id("id_state"));
		Select st = new Select (state);
        st.selectByValue("2");
        
		WebElement pc = driver.findElement(By.name("postcode"));
		pc.sendKeys("99501");
		
		WebElement country = driver.findElement(By.id("id_country"));
		Select ct = new Select (country);
        ct.selectByValue("21");
        
        WebElement info = driver.findElement(By.name("other"));
		info.sendKeys("Desired Collections");

        WebElement phone = driver.findElement(By.name("phone"));
		phone.sendKeys("888 358 4714");
		
		WebElement mp = driver.findElement(By.name("phone_mobile"));
		mp.sendKeys("9500987545");
        Thread.sleep(5000);
        
//		WebElement acc = driver.findElement(By.name("submitAccount"));
//		acc.click();
		
}

}
