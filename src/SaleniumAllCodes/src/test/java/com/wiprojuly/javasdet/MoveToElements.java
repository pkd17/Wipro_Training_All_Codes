package com.wiprojuly.javasdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElements {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
        driver.manage().window().maximize();
		
		//Action class is used to simulate the mouse related activities
		Actions act = new Actions(driver);
		
		WebElement prime = driver.findElement(By.xpath("//button[@id='mousehover']"));
        
	   act.moveToElement(prime).perform();
	   Thread.sleep(1000);
	   
	   WebElement joinnow = driver.findElement(By.xpath("//a[@href='#top']"));
	   act.click(joinnow).perform();
		
		Thread.sleep(2000);
		String cUrl = driver.getCurrentUrl();
		
		if(cUrl.contains("#top")) {
			System.out.println("Navigate to top");
			
		}else {
			System.out.println("no url change");
		}
		
		Thread.sleep(2000);
		driver.quit();
	
	}

}
