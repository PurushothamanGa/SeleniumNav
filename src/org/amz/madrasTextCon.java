package org.amz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class madrasTextCon {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdrive.chrome.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\Navigation\\Driver\\chromedriver.exe");
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=&");
		
		WebDriver madr = new ChromeDriver(ops);
		
		madr.get("http://www.ideunom.ac.in/");
		madr.manage().window().maximize();
		
		Thread.sleep(2000);
		WebElement closeBtn = madr.findElement(By.className("close"));
		closeBtn.click();
		
		Thread.sleep(2000 );
		WebElement contTxt = madr.findElement(By.xpath("//p[contains(text(),'Madras has developed')]"));
		String contains = contTxt.getText();
		System.out.println(contains);
	
	
	
	
	}

}
