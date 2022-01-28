package com.Project;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select; 

public class MiniProject {
	
public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91984\\eclipse-workspace.Selenium\\SeleniumTask\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); 
		
		 TakesScreenshot home= (TakesScreenshot) driver; 
		 File src0 = home.getScreenshotAs(OutputType.FILE); 
		 File dest0 = new File("C:\\Users\\91984\\eclipse-workspace.Selenium\\SeleniumTask\\Image\\home.png"); 
		 FileUtils.copyFile(src0, dest0);
		 
		WebElement title = driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']"));
		title.click();
		
		TakesScreenshot Tshirt= (TakesScreenshot) driver; 
		 File src1 = Tshirt.getScreenshotAs(OutputType.FILE); 
		 File dest1 = new File("C:\\Users\\91984\\eclipse-workspace.Selenium\\SeleniumTask\\Image\\Tshirt.png"); 
		 FileUtils.copyFile(src1, dest1);

		WebElement dress = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		dress.click();
		
		WebElement size = driver.findElement(By.id("group_1"));
		Select ct = new Select (size);
        ct.selectByValue("3");
        
        WebElement submit = driver.findElement(By.name("Submit"));
        submit.click();
        
        WebElement PC = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
        PC.click();
        
        TakesScreenshot image = (TakesScreenshot) driver; 
		 File src2 = image.getScreenshotAs(OutputType.FILE); 
		 File dest2 = new File("C:\\Users\\91984\\eclipse-workspace.Selenium\\SeleniumTask\\Image\\image.png"); 
		 FileUtils.copyFile(src2, dest2);
		
        WebElement PC1 = driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']"));
        PC1.click();
        
        TakesScreenshot image1 = (TakesScreenshot) driver; 
		 File src3 = image1.getScreenshotAs(OutputType.FILE); 
		 File dest3 = new File("C:\\Users\\91984\\eclipse-workspace.Selenium\\SeleniumTask\\Image\\image1.png"); 
		 FileUtils.copyFile(src3, dest3);
        
		WebElement email = driver.findElement(By.xpath("//input[@class='is_required validate account_input form-control']"));
		email.sendKeys("vasanthivj0506@gmail.com");
		
		WebElement name = driver.findElement(By.name("SubmitCreate"));
		name.click();
		
		TakesScreenshot submit1 = (TakesScreenshot) driver; 
		 File src4 = submit1.getScreenshotAs(OutputType.FILE); 
		 File dest4 = new File("C:\\Users\\91984\\eclipse-workspace.Selenium\\SeleniumTask\\Image\\image2.png"); 
		 FileUtils.copyFile(src4, dest4);
		
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
        
        TakesScreenshot submit2 = (TakesScreenshot) driver; 
		 File src5 = submit2.getScreenshotAs(OutputType.FILE); 
		 File dest5 = new File("C:\\Users\\91984\\eclipse-workspace.Selenium\\SeleniumTask\\Image\\image3.png"); 
		 FileUtils.copyFile(src5, dest5);
		 
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
		Select ct1 = new Select (country);
        ct1.selectByValue("21");
        
        WebElement info = driver.findElement(By.name("other"));
		info.sendKeys("Desired Collections");

        WebElement phone = driver.findElement(By.name("phone"));
		phone.sendKeys("888 358 4714");
		
		WebElement mp = driver.findElement(By.name("phone_mobile"));
		mp.sendKeys("9500987545");
       
        WebElement acc = driver.findElement(By.name("submitAccount"));
		acc.click();
		
		TakesScreenshot submit3 = (TakesScreenshot) driver; 
		 File src6 = submit3.getScreenshotAs(OutputType.FILE); 
		 File dest6 = new File("C:\\Users\\91984\\eclipse-workspace.Selenium\\SeleniumTask\\Image\\image3.png"); 
		 FileUtils.copyFile(src6, dest6);
		 
		WebElement PC2 = driver.findElement(By.name("processAddress"));
		PC2.click();
		
		TakesScreenshot submit4 = (TakesScreenshot) driver; 
		 File src7 = submit4.getScreenshotAs(OutputType.FILE); 
		 File dest7 = new File("C:\\Users\\91984\\eclipse-workspace.Selenium\\SeleniumTask\\Image\\image4.png"); 
		 FileUtils.copyFile(src7, dest7);
				
		WebElement CB = driver.findElement(By.id("cgv"));
		CB.click();
		
		TakesScreenshot submit5 = (TakesScreenshot) driver; 
		 File src8 = submit5.getScreenshotAs(OutputType.FILE); 
		 File dest8 = new File("C:\\Users\\91984\\eclipse-workspace.Selenium\\SeleniumTask\\Image\\image5.png"); 
		 FileUtils.copyFile(src8, dest8);
		 
		WebElement PC3 = driver.findElement(By.name("processCarrier"));
		PC3.click();
		
		TakesScreenshot submit6 = (TakesScreenshot) driver; 
		 File src9 = submit6.getScreenshotAs(OutputType.FILE); 
		 File dest9 = new File("C:\\Users\\91984\\eclipse-workspace.Selenium\\SeleniumTask\\Image\\image6.png"); 
		 FileUtils.copyFile(src9, dest9);
}
}
