package org.amz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class samp {
	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Navigation\\Driver\\chromedriver.exe");
		
		// To Create an  object for webDriver
		WebDriver driver = new ChromeDriver();
		
		// To load the URL :
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("iphone");
		
		WebElement SearchIcon = driver.findElement(By.id("nav-search-submit-button"));
		SearchIcon.click();
		
		driver.navigate().back();
		driver.navigate().forward();
		
		driver.navigate().refresh(); 
		driver.navigate().to("http://greenstech.in/selenium-course-content.html");
		driver.navigate().back();
		
	}

}
