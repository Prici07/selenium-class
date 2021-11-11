package org.screenshot.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Daisy Rani\\eclipse-workspace\\SeleniumProject_1\\driver\\chromedriver.exe");
		
        WebDriver  driver=new ChromeDriver();
        
        driver.manage().window().maximize();
		
		driver.get("http://www.leafground.com/pages/drop.html");
		
	Thread.sleep(2000);
	
	WebElement drag = driver.findElement(By.xpath("//*[@id='draggable']"));
	
	WebElement drop = driver.findElement(By.xpath("//*[@id='droppable']"));
	
	Actions Ac= new Actions(driver);
	
	Ac.dragAndDrop(drag, drop).build().perform();
	
	System.out.println("sucess");
	
	
	
	
}
        
        

}
