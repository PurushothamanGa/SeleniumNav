package org.amz;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTable {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("Webdriver.Chromedriver",
			"C:\\Users\\ELCOT\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	ChromeOptions ops = new ChromeOptions();
	ops.addArguments("--remote-allow-origins=*");
	
	WebDriver driver = new ChromeDriver(ops);
	
	driver.get("https://demo.guru99.com/test/web-table-element.php");
	driver.manage().window().maximize();
	Thread.sleep(1000);
	
	WebElement table = driver.findElement(By.xpath("//table[@class='dataTable']"));
	
	//To know number of row
	List<WebElement> tableRows = table.findElements(By.tagName("tr"));
	System.out.println(tableRows.size());
	
	//to know the number of columns
	List<WebElement> tablecolumn = table.findElements(By.tagName("th"));
	System.out.println(tablecolumn.size());
	
	// to know the number data
	List<WebElement> data = table.findElements(By.tagName("td"));
	System.out.println(data.size());
	
	WebElement row3 = tableRows.get(3);
	System.out.println(row3.getText());

	// to print a all the row data
	for (int i = 0; i < tableRows.size(); i++) {
		System.out.println(tableRows.get(i).getText());
		
	}
	






}	

}
