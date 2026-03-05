package com.mycompany.app;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//handle alert without using switchTo command and by using ExplicitWait
public class HandleAlertUsingExplicitWait {
 public static void main(String[] args) throws InterruptedException{
 WebDriver driver = new ChromeDriver();
 WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(10));
 
 driver.get("https://the-internet.herokuapp.com/javascript_alerts");
 driver.manage().window().maximize();
 driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
 Thread.sleep(5000);
 
 Alert myAlert = myWait.until(ExpectedConditions.alertIsPresent());
 myAlert.accept();
 }
}