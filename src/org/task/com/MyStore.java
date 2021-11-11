package org.task.com;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyStore {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Daisy Rani\\eclipse-workspace\\SeleniumProject_1\\drivernew\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		WebElement women = driver.findElement(By.xpath("//a[text()='Women']"));
		Actions ac= new Actions(driver);
		ac.moveToElement(women).build().perform();
		
		//Thread.sleep(2000);
		
		WebElement tshirts = driver.findElement(By.xpath("(//a[text()='T-shirts'])[1]"));
		ac.doubleClick(tshirts).build().perform();
		WebElement scroll = driver.findElement(By.xpath("//span[@class='cat-name']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,600)", "");
		js.executeScript("argument[0].scrollintoview();",scroll); 
		//Thread.sleep(3000);

		WebDriverWait wait=new WebDriverWait(driver,30);
		WebElement imgview = driver.findElement(By.xpath("//div[@class=\"product-image-container\"]"));
		wait.until(ExpectedConditions.elementToBeClickable(imgview));
		imgview.click();
		
		driver.switchTo().frame(0);
		WebElement color = driver.findElement(By.id("color_14"));
		color.click();
		
		//Thread.sleep(2000);
		
		WebElement cart = driver.findElement(By.xpath("//span[text()='Add to cart']"));
		cart.click();
		
		driver.switchTo().defaultContent();
		//WebDriverWait wait=new WebDriverWait(driver,30);
		WebElement checkout = driver.findElement(By.xpath("//span[contains(text(),'Proceed')]"));
		wait.until(ExpectedConditions.elementToBeClickable(checkout));
		checkout.click();
		
		WebElement p = driver.findElement(By.xpath("(//span[contains(text(),'Proceed')])[2]"));
	    p.click();
	    
	    driver.findElement(By.id("email")).sendKeys("preci.pe7@gmail.com");
	    driver.findElement(By.id("passwd")).sendKeys("Prici@07");
	    driver.findElement(By.xpath("//button[@name='SubmitLogin']")).click();
	    WebElement checkout1 = driver.findElement(By.xpath("(//span[contains(text(),'Proceed')])[2]"));
	    checkout1.click();
	    driver.findElement(By.id("cgv")).click();
	    WebElement checkout2 = driver.findElement(By.xpath("(//span[contains(text(),'Proceed')])[2]"));
	    checkout2.click();
	    driver.findElement(By.xpath("//a[@class='cheque']")).click();
	    driver.findElement(By.xpath("//span[text()='I confirm my order']")).click();
	    
	    TakesScreenshot tc=(TakesScreenshot)driver;
	    File source = tc.getScreenshotAs(OutputType.FILE);
	    File destination=new File ("C:\\Users\\Daisy Rani\\eclipse-workspace\\SeleniumProject_1\\Screenshot1\\mail3.png");
	    FileUtils.copyFile(source, destination);
	   
	    
	
	    
	    
	
	}
}
