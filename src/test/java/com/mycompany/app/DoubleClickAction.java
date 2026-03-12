package com.mycompany.app;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {
 public static void main(String[] args) {
     WebDriver driver = new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
     driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
     WebElement frame = driver.findElement(By.id("iframeResult"));
     driver.switchTo().frame(frame);
     // or directly do 
     // driver.switchTo().frame("iframeResult");
     WebElement b1 = driver.findElement(By.xpath("//input[@id='field1']"));
     WebElement b2 = driver.findElement(By.xpath("//input[@id='field2']"));
     WebElement cButton = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
     b1.clear(); // clear returns void so cant perform sendKeys with clear
     b1.sendKeys("Meow");
     Actions act = new Actions(driver);
     act.doubleClick(cButton).perform();
     // System.out.println(b2.getText());// wont work as no text attribute
     System.out.println(b2.getAttribute("value"));
 }
}