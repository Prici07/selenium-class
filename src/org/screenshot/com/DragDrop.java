package org.screenshot.com;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Daisy Rani\\eclipse-workspace\\SeleniumProject_1\\driver\\chromedriver.exe");
		
        WebDriver  driver=new ChromeDriver();
        
        driver.manage().window().maximize();
		
		driver.get("http://automationpractice.com/index.php");
		
	Thread.sleep(2000);
		
		WebElement women = driver.findElement(By.xpath("//a[@title='Women']"));
		
		Actions A= new Actions(driver);
		
		//A.moveToElement(women).build().perform();
		
		//WebElement tshirt = driver.findElement(By.xpath("(//a[@title='T-shirts'])[1]"));
		
		//tshirt.click();
		
		//System.out.println("moved");
		
		A.contextClick(women).build().perform();
		
		System.out.println("sucess");
		
		
		
		
		
		
		
		
	}

}
