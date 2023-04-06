package org.amz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextAndContains {
public static void main(String[] args) {
	
	System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Navigation\\Driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	WebElement text = driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
	String text2 = text.getText();
	System.out.println(text2);
	
	WebElement contan = driver.findElement(By.xpath("//h2[contains(text(),'helps you')]"));
	String text3 = contan.getText();
	System.out.println(text3);
	
}
	
}
