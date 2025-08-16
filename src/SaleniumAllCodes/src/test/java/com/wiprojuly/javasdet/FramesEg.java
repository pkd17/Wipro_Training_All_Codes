package com.wiprojuly.javasdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesEg {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions chromeOptions = new ChromeOptions();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("https://jqueryui.com/droppable/");
		
        driver.manage().window().maximize();
        Actions act=new Actions(driver);
        Thread.sleep(2000);
        
       /* WebElement Frame=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        driver.switchTo().frame(Frame);*/
        
        driver.switchTo().frame(0);        
        WebElement drag= driver.findElement(By.id("draggable"));
        WebElement drop= driver.findElement(By.id("droppable"));
        Thread.sleep(4000);
        
        act.dragAndDrop(drag,drop).perform();
        Thread.sleep(2000);
        
        driver.quit();
        
	}

}



