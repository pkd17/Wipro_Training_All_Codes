package LabSessionsTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LabSession14_08_25 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions chromeOptions = new ChromeOptions();
	    WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver(chromeOptions);
	    driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    WebElement firstName = driver.findElement(By.xpath("//input[@id='name']"));
	    firstName.sendKeys("Pratysh");
	    Thread.sleep(2000);
	    
	    WebElement emailField = driver.findElement(By.xpath("//input[@id='email']"));
	    emailField.sendKeys("daspratyush444@hotmail.com");
	    Thread.sleep(2000);
	    
	    WebElement genderRadio = driver.findElement(By.xpath("//input[@id='gender']"));
	    genderRadio.click();
	    Thread.sleep(2000);
	    
	    WebElement mobileField = driver.findElement(By.xpath("//input[@id='mobile']"));
	    mobileField.sendKeys("9556959930");
	    Thread.sleep(2000);
	    
	    WebElement datePickerBtn = driver.findElement(By.xpath("//*[@id=\"dob\"]"));
        datePickerBtn.sendKeys("14-07-2002");
        Thread.sleep(2000);
        
        WebElement subjectsField = driver.findElement(By.xpath("//input[@id='subjects']"));
        subjectsField.sendKeys("Selenium Java");
        Thread.sleep(2000);
        
        WebElement hobbiesCheckbox = driver.findElement(By.xpath("//input[@id='hobbies']"));
        hobbiesCheckbox.click();
        
        Thread.sleep(2000);
        
        WebElement uploadInput = driver.findElement(By.xpath("//*[@id='picture']"));
        uploadInput.sendKeys("C:/Users/Pratyush Kumar Das/Downloads/Screenshot 2025-08-11 120126.png");
        
        Thread.sleep(2000);
        
        WebElement addressField = driver.findElement(By.xpath("//textarea[@id='picture']"));
        addressField.sendKeys("Bhubaneswar, Odisha, India");
        Thread.sleep(2000);
       
        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        stateDropdown.selectByVisibleText("Uttar Pradesh");
        Thread.sleep(1500);
        
        Select cityDropdown = new Select(driver.findElement(By.xpath("//select[@id='city']")));
        cityDropdown.selectByVisibleText("Lucknow");
        Thread.sleep(2000);
        
        WebElement loginBtn = driver.findElement(By.xpath("//input[@value='Login']"));
        loginBtn.click();
        
	    
	}

}
