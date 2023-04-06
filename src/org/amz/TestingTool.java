package org.amz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingTool {
	public static void main(String[] args) {

	System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Navigation\\Driver\\chromedriver.exe");
	
	WebDriver driv = new ChromeDriver();
	
	driv.get("https://demo.automationtesting.in/Register.html");
	driv.manage().window().maximize();
	
	WebElement fName = driv.findElement(By.xpath("(//input[@type='text'])[1]"));
	fName.sendKeys("Siva");
	
	WebElement lName = driv.findElement(By.xpath("(//input[@type='text'])[2]"));
	lName.sendKeys("Kumar");
	
	WebElement addr = driv.findElement(By.xpath("//textarea[@rows='3']"));
	addr.sendKeys("Chennai 600097");
	
	WebElement mail = driv.findElement(By.xpath("//input[@type='email']"));
	mail.sendKeys("sivakumar@1234");
	
	WebElement phn = driv.findElement(By.xpath("//input[@type='tel']"));
		phn.sendKeys("9876543210");
		
	WebElement gender = driv.findElement(By.xpath("(//input[@type='radio'])[1]"));
	gender.click();
	
	WebElement checkBox1 = driv.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
	checkBox1.click();
	
	WebElement checkBox2 = driv.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
	checkBox2.click();
	
	WebElement checkbox3 = driv.findElement(By.id("checkbox3"));
	checkbox3.click();
	
	WebElement languages = driv.findElement(By.id("msdd"));
	languages.isSelected();
	
	
	
	
	
	
	
	
	
	

		
		
	}

}
