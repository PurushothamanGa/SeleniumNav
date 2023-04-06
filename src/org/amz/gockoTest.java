package org.amz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gockoTest {
	public static void main(String[] args) {
		
		
		System.setProperty("Webdriver.gecko.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Navigation\\Driver\\geckodriver.exe");
		WebDriver  driver = new FirefoxDriver();
		
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement txtUserName = driver.findElement(By.id("email"));
		txtUserName.sendKeys("Greens OMR");
		
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("jkhakd");
		
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();
		
		
		
		
				
	}

}
