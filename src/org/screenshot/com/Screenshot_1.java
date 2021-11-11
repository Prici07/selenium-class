package org.screenshot.com;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_1 {


	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Daisy Rani\\eclipse-workspace\\SeleniumProject_1\\driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fevents%2Fgreatindianfestival%2F%3Fpf_rd_r%3DKPZ8SK4RN27H8HD3K381%26pf_rd_p%3D4a9b5245-6130-41f4-b3a6-95b9145da9a9%26pd_rd_r%3Dfc31d978-7468-4bdc-9ac7-df4b07a4befe%26pd_rd_w%3D1BTNj%26pd_rd_wg%3DLRpLJ%26ref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	
	driver.manage().window().maximize();
	
	WebElement create = driver.findElement(By.xpath("//a[@id='createAccountSubmit']"));
	
	create.click();
	
	Thread.sleep(3000);
	
	WebElement name = driver.findElement(By.xpath("//input[@type='text']"));
	
	name.sendKeys("pricilla");
	
	//WebElement mobnum = driver.findElement(By.xpath("//input[@placeholder='Mobile number']"));
	
	//mobnum.sendKeys("9992234455");
	
	WebElement Email = driver.findElement(By.xpath("//input[@type='email']"));
	
	 Email.sendKeys("prici.pi7@gmail.com");
	 
	 WebElement Password = driver.findElement(By.xpath("//input[@name='password']"));
	
	 Password.sendKeys("Tr@121#1");
	 
	 //******* ScreenShot********
	 
	 TakesScreenshot St=(TakesScreenshot)driver;// narrowing casting
	 
	 File source=St.getScreenshotAs(OutputType.FILE);
	 
	 File destination=new File("C:\\Users\\Daisy Rani\\eclipse-workspace\\SeleniumProject_1\\Screenshot\\mail1.png");
	 
	 FileUtils.copyFile(source, destination);
	 
	 System.out.println("sucess");
	
	
	}

}
