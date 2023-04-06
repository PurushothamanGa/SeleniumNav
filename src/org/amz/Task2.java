package org.amz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
	public static void main(String[] args) {
	System.setProperty("Webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Navigation\\Driver\\chromedriver.exe");
	WebDriver dri = new ChromeDriver();
	
	dri.get("https://www.redbus.in/");
	dri.manage().window().maximize();
	
	WebElement txtFrom = dri.findElement(By.className("db"));
	txtFrom.sendKeys("Chennai");
	
	WebElement txtTo = dri.findElement(By.id("dest"));
	txtTo.sendKeys("Thiruchi");
	
	WebElement txtDate = dri.findElement(By.id("onward_cal"));
	txtDate.sendKeys("03/03/23");
	
		
	}	

}
