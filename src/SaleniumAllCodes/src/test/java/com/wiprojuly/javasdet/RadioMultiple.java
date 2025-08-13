package com.wiprojuly.javasdet;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioMultiple {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeOptions chromeOptions=new ChromeOptions();
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver(chromeOptions);
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		Thread.sleep(1000);
		driver.manage().window().maximize();
		List<WebElement> radioes=driver.findElements(By.xpath("//input[@type='radio']"));
		int size=radioes.size();
		System.out.println(size);
		for(int i=0;i<size;i++) {
			Thread.sleep(1000);
			radioes.get(i).click();
			
			Thread.sleep(1000);
		}
	}

}
