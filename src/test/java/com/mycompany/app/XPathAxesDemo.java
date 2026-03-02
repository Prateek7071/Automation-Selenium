package com.mycompany.app;

import java.util.List;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAxesDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
        String text = driver.findElement(By.xpath("//a[contains(text(),'Voltas')]/self::a")).getText();
        System.out.println("Self: " + text);
        String parent = driver.findElement(By.xpath("//a[contains(text(),'Voltas')]/parent::*")).getText();
        System.out.println("Parent: " + parent);
        List<WebElement> ance = driver.findElements(By.xpath("//a[contains(text(),'Voltas')]/ancestor::tr"));
        System.out.println(ance.size());
        String BSE = driver.findElement(By.xpath("//a[contains(text(),'NSE')]/preceding::*")).getText();
        System.out.println("BSE: " + BSE);
        // TODO : more cases of other things
        // https://www.youtube.com/watch?v=BRzlyGXx13Q&list=PLUDwpEzHYYLut2OnS4GlY7fiSAabRmsz3
    }
}
