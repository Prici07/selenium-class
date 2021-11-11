package org.screenshot.com;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Handeling {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Daisy Rani\\eclipse-workspace\\SeleniumProject_1\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Alerts.html");
	driver.manage().window().maximize();
	
	/// simple alert
	
	WebElement button = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
	button.click();
	Alert A = driver.switchTo().alert();
	A.accept();
	//Thread.sleep(2000);
	
	/// confirm alert
	
	WebElement alertwithok = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
	alertwithok.click();
	WebElement Button1 = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
	Button1.click();
	driver.switchTo().alert().dismiss();
	
	/// prompt alert
	
	WebElement alertwithtext = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
	alertwithtext.click();
	WebElement button2 = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
	button2.click();
	
	Alert prompt= driver.switchTo().alert();
	String text = prompt.getText();
	
	System.out.println("AlertText");
	prompt.sendKeys("prici");
	prompt.accept();
	
	TakesScreenshot st=(TakesScreenshot)driver;
	
	File source= st.getScreenshotAs(OutputType.FILE);
	
	File destination=new File("C:\\Users\\Daisy Rani\\eclipse-workspace\\SeleniumProject_1\\Screenshot1\\mail2.png");
	
	FileUtils.copyFile(source,destination);
	
	
	
	
	
	
	}

}
