package com.mycompany.app;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {
	public static void main(String[] args){
    WebDriver driver = new ChromeDriver();
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    driver.manage().window().maximize();
   
    WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(5)); // declaration
    
    WebElement txtUser = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder ='Username']")));
    txtUser.sendKeys("Admin");
    WebElement txtPassword = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder ='Password']")));
    txtPassword.sendKeys("admin123");
	
	WebElement loginBtn = mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(normalize-space(),'Login')]")));
	
	loginBtn.click();
	
	}
}