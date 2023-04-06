package org.amz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextContains {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Webdriver.Chrome.driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\Navigation\\Driver\\chromedriver.exe");
		
		WebDriver driv = new ChromeDriver();
		driv.get("http://www.greenstechnologys.com/");
		driv.manage().window().maximize();
		
		Thread.sleep(1000);
		WebElement CloseBtn = driv.findElement(By.xpath("//button[@type='button']"));
		CloseBtn.click();
		
		Thread.sleep(1000);
		WebElement containsText = driv.findElement(By.xpath("//p[contains(text(),'We undertake')]"));
		String contex = containsText.getText();
		System.out.println(contex);
			
		
	}

}
