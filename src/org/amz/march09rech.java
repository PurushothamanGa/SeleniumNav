package org.amz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class march09rech {
public static void main(String[] args) throws InterruptedException {

System.setProperty("Webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Navigation\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	Thread.sleep(1000);
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	WebElement userName = driver.findElement(By.id("email"));
	userName.sendKeys("Purushoth");
	WebElement password = driver.findElement(By.id("pass"));
	password.sendKeys("Purus");
	Thread.sleep(1000);
	WebElement clkBtn = driver.findElement(By.name("login"));
	clkBtn.click();
	
		
		
		
		
		
		
		
		
		
		
	}

}
