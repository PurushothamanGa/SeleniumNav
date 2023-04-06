package org.amz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Navigation\\Driver\\chromedriver.exe");
		
		// To Create an  object for webDriver
		WebDriver d = new ChromeDriver();
		
		d.get("https://www.google.com/");
		d.manage().window().maximize();
		
		WebElement txtName = d.findElement(By.name("q"));
		txtName.sendKeys("GreensTechnology");
		
	}

}
