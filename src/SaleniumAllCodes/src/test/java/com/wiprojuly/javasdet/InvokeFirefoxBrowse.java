package com.wiprojuly.javasdet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvokeFirefoxBrowse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FirefoxOptions firefoxOptions=new FirefoxOptions();
		
		
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver=new FirefoxDriver(firefoxOptions);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		

	}

}
