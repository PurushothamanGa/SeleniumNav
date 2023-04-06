package org.amz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sampl2 {
	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Navigation\\Driver\\chromedriver.exe");
	//	System.setProperty("Webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Navigation\\Driver\\chromedriver.exe");
		
		WebDriver driv = new ChromeDriver();
		
		// To load the URL :
		
		driv.get("https://www.amazon.in/");
		driv.manage().window().maximize();
		
		WebElement search = driv.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("shoes for men");
		
		WebElement SearchIcon = driv.findElement(By.id("nav-search-submit-button"));
		SearchIcon.click();
		
		driv.navigate().back();
		driv.navigate().forward();
		
		
		
	}

}
