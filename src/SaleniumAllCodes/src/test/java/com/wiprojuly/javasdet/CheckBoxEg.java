package com.wiprojuly.javasdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxEg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeOptions chromeOptions=new ChromeOptions();
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver(chromeOptions);
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(2000);
		 WebElement checkbox=driver.findElement(By.xpath("//*[@id=\"checkBoxOption1\"]"));
		    checkbox.click();
		    Thread.sleep(2000);
	}

}
