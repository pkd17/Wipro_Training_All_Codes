package com.wiprojuly.javasdet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationCommands {

	public static void main(String[] args) throws InterruptedException {
        ChromeOptions chromeOptions=new ChromeOptions();
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver(chromeOptions);
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//maximize the window
		driver.manage().window().maximize();
		Thread.sleep(500);
		driver.navigate().back();
		
		Thread.sleep(500);
		driver.navigate().forward();
		
		Thread.sleep(500);
		driver.navigate().refresh();
		
		Thread.sleep(500);
		
	}

}
