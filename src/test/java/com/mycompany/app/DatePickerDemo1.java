package com.mycompany.app;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo1{
 public static void main(String[] args) {
     WebDriver driver=new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     driver.get("https://jqueryui.com/datepicker/");
     
     driver.switchTo().frame(0);
     //method 1: sending keys directly
     // driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("03/10/2026");
     
     // method 2: using date picker
     String TDate= "03" ;
     String TMonth="January";
     String TYear="2025";
     
     driver.findElement(By.xpath("//input[@id='datepicker']")).click();
     
     while(true){
        String Month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
        String Year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
        if(Month.equals(TMonth) && Year.equals(TYear)){
         break;
        }
        driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
     }
     driver.findElement(By.xpath("//a[normalize-space()="+TDate+"]")).click();
     //Below is the implementation of smart picker with a bug that month is MAY, JUNE and not 5,6 so need to find numerical value corresponding to months then compare so yeah but the logic is there for the other parts!
     // also add break statements inside loop when necessary!
 //     int aMonth = Integer.parseInt(driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText());
 //     int aYear = Integer.parseInt(driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText());
 //     int bMonth = Integer.parseInt(TMonth);
 //     int bYear = Integer.parseInt(TYear);
     
 //     if(aYear>bYear){
 //             while(true){
 //                String Month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
 //                String Year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
 //                if(Month.equals(TMonth) && Year.equals(TYear)){
 //                 break;
 //                }
 //                driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
 //             }
 //     }else if(aYear<bYear){
 //         while(true){
 //            String Month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
 //            String Year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
 //            if(Month.equals(TMonth) && Year.equals(TYear)){
 //             break;
 //            }
 //            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
 //         }
 //     }else if(aYear == bYear){
 //         if(aMonth>bMonth){
 //             while(true){
 //                String Month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
 //                String Year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
 //                if(Month.equals(TMonth) && Year.equals(TYear)){
 //                 break;
 //                }
 //                driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
 //             }
 //         }else if(bMonth>aMonth){
 //             while(true){
 //                String Month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
 //                String Year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
 //                if(Month.equals(TMonth) && Year.equals(TYear)){
 //                 break;
 //                }
 //                driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
 //             }
 //     }
 //     }
    
 //     driver.findElement(By.xpath("//a[normalize-space()="+TDate+"]")).click();
 }
}