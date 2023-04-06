package org.amz;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowsHanding {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.Chrome.Driver", 
				"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(ops);
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("OPPO");
		
		WebElement btn = driver.findElement(By.xpath("//input[@type='submit']"));
		btn.click();
	
		WebElement OPPO = driver.findElement(By.xpath("//span[text()='Oppo A78 5G (Glowing Blue, 8GB RAM, 128 Storage) | 5000 mAh Battery with 33W SUPERVOOC Charger| 50MP AI Camera | 90Hz Refresh Rate | with No Cost EMI/Additional Exchange Offers']"));
		OPPO.click();
		
		//getWindowHandle Only one window
		String parantWindow = driver.getWindowHandle();
		System.out.println(parantWindow);
		
		
		// getWindowHandless for all windows
		Set<String> allwindow = driver.getWindowHandles();
		System.out.println(allwindow);
		
		// How to switch the child window
		for (String eachwindow : allwindow) {
			if (!parantWindow.equals(eachwindow)) {
				driver.switchTo().window(eachwindow);
				}
			}
		
		// how to switch the child window without using enhanced forloop
		
		List<String> listOfWindow = new ArrayList<String>();
		listOfWindow.addAll(allwindow);
		
		String currentWindow = listOfWindow.get(1);
		System.out.println(currentWindow);
		
		driver.switchTo().window(currentWindow);
		
		WebElement cartBtn = driver.findElement(By.id("submit.add-to-cart"));
		cartBtn.click();
		
		
		
		driver.switchTo().frame(18);
		WebElement checkout = driver.findElement(By.id("attach-sidesheet-checkout-button-announce"));
		checkout.click();
	}

}
