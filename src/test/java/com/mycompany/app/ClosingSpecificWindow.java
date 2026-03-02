package com.mycompany.app;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingSpecificWindow {
 public static void main(String[] args) {
 WebDriver driver=new ChromeDriver();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
 driver.manage().window().maximize();
 driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
 Set<String> windowIDs=driver.getWindowHandles();
 for(String winID: windowIDs){
     String titleW = driver.switchTo().window(winID).getTitle();
     System.out.println(titleW);
     if(titleW.equals("OrangeHRM") || titleW.equals("Human Resources Management Software | HRMS | OrangeHRM")){
         driver.close();
     }
 }
 }
}