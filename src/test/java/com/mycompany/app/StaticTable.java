package com.mycompany.app;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {
 public static void main(String[] args) {
     WebDriver driver = new ChromeDriver();
     
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
     driver.get("https://testautomationpractice.blogspot.com/");
     //find total number of rows in a table 
     List<WebElement>TableR = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
     System.out.println(TableR.size());
     
     // another method when only one table present use tagname 
     // driver.findElements(By.tagName("tr")).size();
     
     // find total number of columns 
     System.out.println(driver.findElements(By.xpath("//table[@name='BookTable']//th")).size()); 
     // can also write it like //table[@name='BookTable']//tr[1]//th
     
     //Read data from specific row and column
     System.out.println(driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText());
 
     //Getting all the data 
     for(int r = 2;r<8;r++){
         for(int c=1;c<5;c++){
             System.out.print(driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText()+"\t"); //this is the notation to pass variable inside xpath
         }
         System.out.println();
     }
     // conditional , find the books details written by a particylar authod
     System.out.println("------------------------------------------------");
     for(int r = 2;r<8;r++){
         String author = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
         if(author.equals("Amit")){
             for(int c=1;c<5;c++){
                 System.out.print(driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText()+"\t"); 
             }
             System.out.println();
         }
     }
     //find the price of every book 
     System.out.println("------------------------------------------------");
     
     int sum = 0;
     for(int r=2;r<8;r++){
         String costS = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
         int cost = Integer.parseInt(costS);
         sum+=cost;
     }
     System.out.println(sum);
     //assignment
     // blazedemo.com/reserve.php

 }  
}