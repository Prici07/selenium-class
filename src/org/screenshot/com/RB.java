package org.screenshot.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RB {
	
	

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Daisy Rani\\eclipse-workspace\\SeleniumProject_1\\driver\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.amazon.in/events/greatindianfestival?tag=msn2020deskstd1-21");
		 driver.manage().window().maximize();
		 
		Thread.sleep(2000);
		 
		WebElement mobile = driver.findElement(By.xpath("(//a[@class='nav-a  '])[1]"));
		Actions ac=new Actions(driver);
		ac.contextClick(mobile).build().perform();
		
      Robot r= new Robot();
      r.keyPress(KeyEvent.VK_DOWN);
      r.keyRelease(KeyEvent.VK_DOWN);
      r.keyPress(KeyEvent.VK_ENTER);
      r.keyRelease(KeyEvent.VK_ENTER);
      
      WebElement electronics = driver.findElement(By.xpath("(//a[@class='nav-a  '])[3]"));
      ac.contextClick(electronics).build().perform();
      r.keyPress(KeyEvent.VK_DOWN);
      r.keyRelease(KeyEvent.VK_DOWN);
      r.keyPress(KeyEvent.VK_ENTER);
      r.keyRelease(KeyEvent.VK_ENTER);
      
      WebElement fashion = driver.findElement(By.xpath("(//a[@class='nav-a  '])[4]"));
      ac.contextClick(fashion).build().perform();
      r.keyPress(KeyEvent.VK_DOWN);
      r.keyRelease(KeyEvent.VK_DOWN);
      r.keyPress(KeyEvent.VK_ENTER);
      r.keyRelease(KeyEvent.VK_ENTER);
      
      //window Handling s
      
     Set<String> allwindows = driver.getWindowHandles();
     for(String name:allwindows)
     {
    	String title = driver.switchTo().window(name).getTitle();
    	System.out.println(title);
      
     
      String windowTitle="Buy Electronics products Online at Best Prices in India at Amazon.in";
     Iterator<String> iterator = allwindows.iterator();
     
    //if (title.equals("Buy Electronics products Online at Best Prices in India at Amazon.in")) {
		
    	//break;
	//}}
      
      
   while(iterator.hasNext()){
    	 if(driver.switchTo().window(iterator.next()).getTitle().equals(windowTitle)) {
    		  
    		break;
    	  }
     }}
      
    // TakesScreenshot t=(TakesScreenshot)driver;
      
      //File source = t.getScreenshotAs(OutputType.FILE);
     // File destination=new File("C:\\Users\\Daisy Rani\\eclipse-workspace\\SeleniumProject_1\\Screenshot\\mail2.png");
     // FileUtils.copyFile(source, destination);
      
    	  }
    	  
      
      
      
      
      
      
      
      
      
      
      
      
       
       
		

	}
