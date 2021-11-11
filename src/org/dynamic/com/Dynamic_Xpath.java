package org.dynamic.com;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Xpath {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Daisy Rani\\eclipse-workspace\\SeleniumProject_1\\driver\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.flipkart.com/");
		 //driver.get("https://www.ajio.com/s/clothing-4461-74582");
		 driver.manage().window().maximize();
		 //following
		  // WebElement following = driver.findElement(By.xpath("//a[text()='MEN']//following::div[1]"));
		//System.out.println(following.getText());
		//following-sibling
		//WebElement Fb = driver.findElement(By.xpath("//a[text()='MEN']//following-sibling::div[2]"));
		//System.out.println(Fb.getText());
		//preceding
		//WebElement preceding = driver.findElement(By.xpath("//a[text()='MEN']//preceding::div[2]"));
	    //System.out.println(preceding.getText());
	    //preceding-sibling
		 //following
		//span[@class='price  ']//following::div[1]
		 
		 WebElement following = driver.findElement(By.xpath("//div[text()='Grocery']//following::div[1]"));
		 
		 WebElement preceding = driver.findElement(By.xpath("//div[text()='Grocery']//preceding::div[6]"));
	    
	
	
	}

}
