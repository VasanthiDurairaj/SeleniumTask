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
 
public class Project {
	
public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91984\\eclipse-workspace.Selenium\\SeleniumTask\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); 

		TakesScreenshot home= (TakesScreenshot) driver; 
		 File src0 = home.getScreenshotAs(OutputType.FILE); 
		 File dest0 = new File("C:\\Users\\91984\\eclipse-workspace.Selenium\\SeleniumTask\\Image\\img1.png"); 
		 FileUtils.copyFile(src0, dest0);
			
		WebElement user1 = driver.findElement(By.id("username"));
		user1.sendKeys("VasanthiVD");
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("Appa@2022");
		
		TakesScreenshot login1 = (TakesScreenshot) driver; 
		 File src1 = login1.getScreenshotAs(OutputType.FILE); 
		 File dest1 = new File("C:\\Users\\91984\\eclipse-workspace.Selenium\\SeleniumTask\\Image\\img2.png"); 
		 FileUtils.copyFile(src1, dest1);
		 
		 WebElement login5 = driver.findElement(By.id("login"));
			login5.click();
		
		WebElement loc = driver.findElement(By.id("location"));
		Select sel = new Select (loc);
        sel.selectByValue("London");
        
        WebElement place = driver.findElement(By.id("hotels"));
		Select sel1 = new Select (place);
        sel1.selectByValue("Hotel Sunshine");
        
        WebElement type = driver.findElement(By.id("room_type"));
		Select sel2 = new Select (type);
        sel2.selectByValue("Deluxe");
				
        WebElement num = driver.findElement(By.id("room_nos"));
		Select sel3 = new Select (num);
        sel3.selectByValue("3");
        
        WebElement checkin = driver.findElement(By.id("datepick_in"));
        checkin.sendKeys("25/12/21");
		
		WebElement checkout = driver.findElement(By.id("datepick_out"));
		checkout.sendKeys("27/12/21");
		
		WebElement adult = driver.findElement(By.id("adult_room"));
		Select sel4 = new Select (adult);
        sel4.selectByValue("2");
        
        WebElement child = driver.findElement(By.id("child_room"));
		Select sel5 = new Select (child);
        sel5.selectByValue("1");
        
        TakesScreenshot login2 = (TakesScreenshot) driver; 
		 File src2 = login2.getScreenshotAs(OutputType.FILE); 
		 File dest2 = new File("C:\\Users\\91984\\eclipse-workspace.Selenium\\SeleniumTask\\Image\\img3.png"); 
		 FileUtils.copyFile(src2, dest2);
        
        WebElement submit1 = driver.findElement(By.id("Submit"));
        submit1.click();
        
        WebElement radio = driver.findElement(By.id("radiobutton_0"));
        radio.click();
        
        TakesScreenshot login3 = (TakesScreenshot) driver; 
		 File src3 = login3.getScreenshotAs(OutputType.FILE); 
		 File dest3 = new File("C:\\Users\\91984\\eclipse-workspace.Selenium\\SeleniumTask\\Image\\img4.png"); 
		 FileUtils.copyFile(src3, dest3);
		 
        WebElement cont = driver.findElement(By.id("continue"));
        cont.click();
        
        WebElement frstname = driver.findElement(By.id("first_name"));
		frstname.sendKeys("Vasanthi");
		
		WebElement lastname = driver.findElement(By.id("last_name"));
		lastname.sendKeys("Durairaj");
		
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("154/189 Thomas St, Joymarket NSW 2100, Australia");
        
        WebElement ccnum = driver.findElement(By.id("cc_num"));
        ccnum.sendKeys("2536489125524533");
        
        WebElement cctype = driver.findElement(By.id("cc_type"));
		Select sel6 = new Select (cctype);
        sel6.selectByValue("VISA");
        
        WebElement type1 = driver.findElement(By.id("cc_exp_month"));
		Select sel7 = new Select (type1);
        sel7.selectByValue("6");
        
        WebElement year = driver.findElement(By.id("cc_exp_year"));
		Select sel8 = new Select (year);
        sel8.selectByValue("2022");
        
        WebElement cvv = driver.findElement(By.id("cc_cvv"));
        cvv.sendKeys("256");
        
        TakesScreenshot login4 = (TakesScreenshot) driver; 
		 File src4 = login4.getScreenshotAs(OutputType.FILE); 
		 File dest4 = new File("C:\\Users\\91984\\eclipse-workspace.Selenium\\SeleniumTask\\Image\\img5.png"); 
		 FileUtils.copyFile(src4, dest4);
        
         WebElement book = driver.findElement(By.id("book_now"));
         book.click();
		 
}

}
