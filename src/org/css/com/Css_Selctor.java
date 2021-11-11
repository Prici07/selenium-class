package org.css.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_Selctor {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Daisy Rani\\eclipse-workspace\\SeleniumProject_1\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com/accounts/login/");
	driver.manage().window().maximize();
	
	Thread.sleep(4000);
	
	//WebElement username = driver.findElement(By.cssSelector("input._2hvTZ pexuQ zyHYP"));
	//username.sendKeys("Prici_o7");
	//WebElement pass = driver.findElement(By.cssSelector("input[type='password']"));
	//pass.sendKeys("12345");
	//WebElement login = driver.findElement(By.cssSelector("button.'sqdOP  L3NKy   y3zKF     '"));
	//login.click();
	

	//WebElement sufix = driver.findElement(By.cssSelector("input[username^='te'])"));
    //System.out.println(sufix.getText());   

	
	
}}
