package org.amz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 {
	public static void main(String[] args) {
		
	System.setProperty("Webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Navigation\\Driver\\chromedriver.exe");
	
	WebDriver dri = new ChromeDriver();
	
	dri.get("https://netbanking.hdfcbank.com/");
	dri.manage().window().maximize();
	
	WebElement txtUserId = dri.findElement(By.name("fldLoginUserId"));
	txtUserId.sendKeys("28276549");
	
	WebElement btnContinue = dri.findElement(By.className("btn btn-primary login-btn"));
	btnContinue.click();
		
	}

}
