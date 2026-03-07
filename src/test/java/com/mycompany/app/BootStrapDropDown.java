package com.mycompany.app;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropDown {
 public static void main(String[] args) {
  
    WebDriver driver=new ChromeDriver();
 
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
    
    driver.manage().window().maximize();
 
    driver.findElement(By.xpath("//button[contains(@class, ‘multiselect')]")).click(); // opens dropdown opti
    
    //1) Select single option    
    // driver.findElement(By.xpath("//input[@value='Java']")).click();
    
    //2) drop multiple options
    List<WebElement> option = driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label")); // //label is relative we skipped /li/a/label
    
    for(WebElement u : option){
        if(u.getText().equals("HTML")||u.getText().equals("C#")||u.getText().equals("Python")){
            u.click();
        }
    }
    
 }
}