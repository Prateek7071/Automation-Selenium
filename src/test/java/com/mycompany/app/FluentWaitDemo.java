package com.mycompany.app;

import java.time.Duration;
import org.openqa.selenium.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitDemo {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        Wait<WebDriver> mywait = new FluentWait<WebDriver>(driver)
                                                                .withTimeout(Duration.ofSeconds(10))
                                                                .pollingEvery(Duration.ofMillis(500))
                                                                .ignoring(NoSuchElementException.class);
        
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        WebElement txtUser = mywait.until(new Function<WebDriver,WebElement>() {
            public WebElement apply(WebDriver driver){
                return driver.findElement(By.xpath("//input[@placeholder='Username']"));
            }
        });
        txtUser.sendKeys("Admin");
        WebElement txtPass = mywait.until(new Function<WebDriver,WebElement>() {
            public WebElement apply(WebDriver driver){
                return driver.findElement(By.xpath("//input[@placeholder='Password']"));
            }
        });
        txtPass.sendKeys("admin123");
        WebElement loginBtn =driver.findElement(By.xpath("//button[contains(normalize-space(),'Login')]"));
	
        loginBtn.click();
        
    }
}