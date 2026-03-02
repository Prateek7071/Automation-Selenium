package com.mycompany.app;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {
 public static void main(String[] args) {
     WebDriver driver = new ChromeDriver();
     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
     
     // try{
     //     Thread.sleep(10000);
     // }catch(Exception e){
     //     e.getStackTrace();
     // }
     // 
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     // System.out.println(driver.getPageSource());
     System.out.println(driver.getTitle());
     System.out.println(driver.getCurrentUrl());
     // System.out.println(driver.getWindowHandle());
     driver.findElement(By.linkText("OrangeHRM, Inc")).click();
     // driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click(); 
     Set<String> windowIds = driver.getWindowHandles();
     System.out.println("WindowId: "+windowIds);
     driver.quit(); 
     
 }
}