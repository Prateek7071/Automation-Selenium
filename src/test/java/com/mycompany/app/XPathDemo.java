package com.mycompany.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//syntax for relative xpath:
//tagname[@attribute="value']
//*[@attribute="value']
public class XPathDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        //xpath with relative single attribute path
        // driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("adidas");
        //xpath with multiple attribute
        //driver.findElement(By.xpath("//input[@name=\"q\"][@placeholder=\"Search store\"]")).sendKeys("Arch");
        //xpath with and and or operator
        //driver.findElement(By.xpath("//input[@name=\"q\" and @placeholder=\"Search store\"]")).sendKeys("Arch");
        // xpath with inner text - text()
        // //a[text()="Desktops']
        // //a[text()="MacBook']
        // boolean isDisplay = driver.findElement(By.xpath("//h2[text()=\"Welcome to our store\"]")).isDisplayed();
        // System.out.println(isDisplay);
        
        // ## inner text and linked text
        // <a href="https://xyz.com"> Click Me </a>
        // linktext = yes
        // inner text = yes
        // <div>welcome</div>
        // linktext= no
        // innertext= yes 
        // 
        //driver.findElement(By.xpath("//*[text()=\"Electronics\" and @title=\"Show products in category Electronics\"]")).click();  // <---- dont work for some reason idk why!
        
        //xpath with contains and starts-with
        // can use when working with dynamic elements
        // contains needs two args attribute and "some part of the stirng"
        // driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("args"); 
        driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("args"); 
        
        
        //chained xpath
        boolean isDisplay = driver.findElement(By.xpath("//div[@class=\"header-logo\"]/a/img")).isDisplayed();
        System.out.println(isDisplay);
        //this works
        // <div></div>
        // //div[contains (text(),"")]
        // //div[contains (.,"")] can also use . in place of text
        
        
        // difference betweeen xpath and cssSelector is that css is top down approach where as xpath can go from anywhere to anywhere
        // xpath axes
        // self
        // child
        // ancestor
        // descendent
        // following
        // preceding
        // following-sibling
        // preceding-sibling
    }
}