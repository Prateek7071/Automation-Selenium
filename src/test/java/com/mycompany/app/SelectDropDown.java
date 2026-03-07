package com.mycompany.app;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {
 public static void main(String[] args) {
     WebDriver driver = new ChromeDriver();
     driver.get("https://testautomationpractice.blogspot.com/");
     WebElement drop = driver.findElement(By.xpath("//select[@id='country']"));
     Select SelectDrp = new Select(drop);
     SelectDrp.selectByValue("india");
     // SelectDrp.selectByIndex(3);
     // SelectDrp.selectByVisibleText("France");
     List<WebElement> options = SelectDrp.getOptions();
     System.out.println(options.size());
     
     for(int i = 0; i<options.size();i++){
         System.out.println(options.get(i).getText());
     }
 }
}