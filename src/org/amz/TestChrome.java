package org.amz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestChrome {
public static void main(String[] args) {
	
	System.setProperty("Webdriver.Chrome.drive", "C:\\Users\\ELCOT\\eclipse-workspace\\Navigation\\Driver\\chromedriver.exe");
	
	ChromeOptions opt = new ChromeOptions();
	opt.addArguments("--remote-allow-origins=*");
	
	WebDriver driver = new ChromeDriver(opt);
	
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
			
	
	
}
}
