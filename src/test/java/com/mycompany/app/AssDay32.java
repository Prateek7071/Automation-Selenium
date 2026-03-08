// blazedemo.com/ go to this find cheapest flight and book, confirm using thankyou page.
package com.mycompany.app;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssDay32 {
 public static void main(String[] args) {
     WebDriver driver = new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
     driver.get("https://blazedemo.com/");
     driver.findElement(By.xpath("//select[@name='fromPort']")).click();
     driver.findElement(By.xpath("//option[@value='Paris']")).click();
     driver.findElement(By.xpath("//select[@name='toPort']")).click();
     driver.findElement(By.xpath("//option[@value='Buenos Aires']")).click();
     driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
     double min=5000;
     
     for(int i =1;i<6;i++){
         String s = driver.findElement(By.xpath("//tbody//tr["+i+"]//td[6]")).getText();
         s=s.replace("$", "");
         double dollar = Double.parseDouble(s);
         if(dollar<min){
             min = dollar;
         }
     }
     driver.findElement(By.xpath("//td[contains(text(),'"+min+"')]/preceding-sibling::td/child::input")).click();
     
     driver.findElement(By.name("inputName")).sendKeys("Test Passenger");
     driver.findElement(By.id("address")).sendKeys("123 Sojo Island");
     driver.findElement(By.name("city")).sendKeys("China Town");
     driver.findElement(By.name("state")).sendKeys("Los Polos");
     driver.findElement(By.name("zipCode")).sendKeys("562697");
     driver.findElement(By.name("creditCardNumber")).sendKeys("165878545");
     driver.findElement(By.name("nameOnCard")).sendKeys("James");
     driver.findElement(By.xpath("//input[@id='rememberMe']")).click();
     driver.findElement(By.xpath("//input[@value='Purchase Flight']")).click();
     
     Boolean result = driver.findElement(By.xpath("//h1[normalize-space()='Thank you for your purchase today!']")).isDisplayed();
     if(result){
         System.out.println("Success!");
     }else{
         System.out.println("Failed!");
     }
     
 }
}