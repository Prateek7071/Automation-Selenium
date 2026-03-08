package com.mycompany.app;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSearchAutoSuggestDropDown {
 public static void main(String[] args) {
     WebDriver driver = new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
     driver.get("https://www.google.com/");
     driver.findElement(By.name("q")).sendKeys("selenium");
     WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(5));
     List<WebElement> options = mywait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//ul[@role='listbox']//li//div[@role='option']")));
     for(WebElement x:options){
         System.out.println(x.getText());
     }
 }
}