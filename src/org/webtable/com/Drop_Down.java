package org.webtable.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {
	
  public static void main(String[] args) {
	  
	  System.setProperty("webdriver.chrome.driver", 
	"C:\\Users\\Daisy Rani\\eclipse-workspace\\SeleniumProject_1\\drivernew\\chromedriver.exe");
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("http://www.leafground.com/pages/Dropdown.html");
	  driver.manage().window().maximize();
	  //WebElement single = driver.findElement(By.xpath("//select[@id=\"dropdown1\"]"));
	   //Select s=new Select(single);
		 //  s.selectByIndex(2);
		   
  
  WebElement text = driver.findElement(By.xpath("//select[@name=\"dropdown2\"]"));
  Select s1=new Select(text);
  s1.selectByVisibleText("Loadrunner");
 
  
  WebElement value = driver.findElement(By.xpath("//select[@name=\"dropdown3\"]"));
  Select s2=new Select(value);
  s2.selectByValue("4");
  
  List<WebElement> getoptions = driver.findElements(By.xpath("//select[@class=\"dropdown\"]"));
  for (WebElement op : getoptions) {
	  
	  System.out.println(op.getText());
  }
	
}
		   
		   

	  
	  
	  
	


}
