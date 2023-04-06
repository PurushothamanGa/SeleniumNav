package org.amz;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;



public class MSEdgeTest {
	public static void main(String[] args) {
	System.setProperty("Webdriver.Edge.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Navigation\\Driver\\msedgedriver.exe");
	
	WebDriver driver = new EdgeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
		
		
		
		
	}

	
}
