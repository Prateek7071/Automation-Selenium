package com.mycompany.app;
//session 23
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        //using tag id;
        // driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Apple MacBook Pro");
        // // driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirt"); //also works without input
        // // using tag class;
        // driver.findElement(By.cssSelector("button.button-1")).click();
        //tag attribute
        
        // driver.findElement(By.cssSelector("input[placeholder=\"Search store\"]")).sendKeys("adidas"); //cant use "" inside of "" so either use \"\" or ''
        // driver.findElement(By.cssSelector("button.button-1")).click();
        
        // tag class attribute
        // use when want to differentiate when class and tag name are same use attribute to differentiate.
        driver.findElement(By.cssSelector("input.search-box-text[name=\"q\"]")).sendKeys("adidas");
        driver.findElement(By.cssSelector("button.button-1")).click();
    }
}               

