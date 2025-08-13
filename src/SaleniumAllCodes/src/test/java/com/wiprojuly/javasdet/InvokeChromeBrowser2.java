package com.wiprojuly.javasdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvokeChromeBrowser2 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions chromeOptions=new ChromeOptions();
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver(chromeOptions);
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		 WebElement radio3=driver.findElement(By.xpath("//input[@value='radio3']"));
		    radio3.click();
		    Thread.sleep(2000);
		   
	}

}
