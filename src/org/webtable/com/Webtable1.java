package org.webtable.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable1 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Daisy Rani\\eclipse-workspace\\SeleniumProject_1\\drivernew\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		
		driver.manage().window().maximize();
		
		List<WebElement> alldatas = driver.findElements(By.xpath("//table/tbody/tr/td"));
		
		System.out.println("******All Datas******");
		
		for (WebElement data : alldatas) {
			
			System.out.println(data.getText());
			
		}
		
		System.out.println("******Row Data******");
		
		List<WebElement> rowdata = driver.findElements(By.xpath("//table/tbody/tr[3]/td"));
		
		for (WebElement data1 : rowdata) {
			
			System.out.println(data1.getText());
			
			
		}
		
		System.out.println("******Column Data*****");
		
	 List<WebElement> columndata = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
		
		for (WebElement data3 : columndata) {
			
			System.out.println(data3.getText());
			
		}
		
		System.out.println("*******Specific data******");
		
		WebElement Spdata = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]"));
		
		System.out.println(Spdata.getText());
				
	}
	
	
	
	

	
	
	

	
}
