package com.mycompany.app;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlertsJava {
 public static void main(String[] args) {
     WebDriver driver=new ChromeDriver();
     driver.get("https://the-internet.herokuapp.com/javascript_alerts");
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
     
     //Noraml alert with OK button
     driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
     driver.switchTo().alert().accept();

 }
}