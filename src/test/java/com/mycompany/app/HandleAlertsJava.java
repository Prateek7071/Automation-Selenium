package com.mycompany.app;

import java.time.Duration;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandleAlertsJava {
 public static void main(String[] args) {
     WebDriver driver=new ChromeDriver();
     driver.get("https://the-internet.herokuapp.com/javascript_alerts");
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
     
     //1 Noraml alert with OK button
     // driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
     // Alert myalert = driver.switchTo().alert();
     // System.out.println(myalert.getText());
     // myalert.accept();
     //2) confirmation Alert - OK & Cancel
     // driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
     
     // driver.switchTo().alert().accept(); // close alert using OK button
     //driver.switchTo().alert().dismiss(); // close alert using Cancel button

     //3) Prompt alert- Input box
     driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
     Alert myalert=driver.switchTo().alert();
     System.out.println(myalert.getText());
     myalert.sendKeys("Hello");
     myalert.accept();
     

 }
}