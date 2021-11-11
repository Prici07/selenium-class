package org.screenshot.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Daisy Rani\\eclipse-workspace\\SeleniumProject_1\\driver\\chromedriver.exe");

		WebDriver  driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Frames.html");
		
		driver.manage().window().maximize();
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='singleframe']"));
		
		driver.switchTo().frame("singleframe");	//using id or name of the frame
		
	WebElement inputbox = driver.findElement(By.xpath("//input[@type='text']"));
	
	inputbox.sendKeys("hello");
	
	driver.switchTo().defaultContent();
	
	//nested frame
	
	WebElement singleframe1 = driver.findElement(By.xpath("(//a[@class='analystic'])[2]"));
	
	singleframe1.click();
	
	WebElement outterframe = driver.findElement(By.xpath("//iframe[@style='float: left;height: 300px;width:600px']"));
	
	driver.switchTo().frame("outterframe");
	
	WebElement innerframe = driver.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));
	
	driver.switchTo().frame("innerframe");
	
	WebElement inputbox1 = driver.findElement(By.xpath("//input[@type='text']"));
	
	inputbox1.sendKeys("Java");
	
	System.out.println("sucess");
	
	
	
	
	
	
	
	
	
		
		
		
		
	}

}
