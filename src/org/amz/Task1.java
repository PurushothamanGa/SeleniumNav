package org.amz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Task1 {
	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Navigation\\Driver\\chromedriver.exe");
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		
		// To create an object for WebDriver
		WebDriver driver = new ChromeDriver(opt);
		
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
