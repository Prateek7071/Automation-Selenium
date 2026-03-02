package com.mycompany.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class LocatorsDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        // driver.get("https://student-management-system-kwh.pages.dev/");
        // driver.manage().window().maximize();
        // // name 
        // driver.findElement(By.id("searchBar")).sendKeys("Ayre"); 
        // boolean logoDisplayed = driver.findElement(By.id("sortAZ")).isDisplayed();
        // System.out.println(logoDisplayed);
        // driver.close();
        // driver.get("https://hire-ready.pages.dev/");
        // driver.findElement(By.linkText("Companies")).click();
        
        //parial linked text
        //driver.get("https://hire-ready.pages.dev/");
        // driver.findElement(By.partialLinkText("Jo")).click();
        
        // tagname and class we use this for geting group of elements 
        // List<WebElement> headerLinks= driver.findElements(By.className("mobile-nav-item")); //using findElement(s)
        // System.out.println(headerLinks.size());
        // List<WebElement> links = driver.findElements(By.tagName("a"));
        // System.out.println(links.size());
        // driver.close();
        
        driver.get("https://student-management-system-kwh.pages.dev/");
        List<WebElement> links=driver.findElements(By.tagName("img"));
        System.out.println(links.size());
        driver.close();
        // differences between findELement and findElements
        // Scenario 1: Locator matching with single web element findElement(loc) ----> single web element returns:WebElement ,findElements(loc) ---> singe! web element returns:List<WebElement> 
        //Scenario2: Locator is matching with multi web elements findElement(loc) --- single web element WebElement findElements(loc) --- multiple web elements List<WebElement> 
        //Scenario 3: Locator is not matching with any element/s. findElement(loc) ---- No Such Element Exception findElements(loc) -3- will not throw any exception. Returns 0 
    }
}