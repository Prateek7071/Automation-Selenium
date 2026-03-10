package com.mycompany.app;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPaginationTable {
 public static void main(String[] args) {
     WebDriver driver=new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     driver.get("https://demo.opencart.com/admin/index.php");
     //only thing to remember i guess
     //int total_pages=Integer.parseInt(text.substring(text.index0f("(")+1,text.index0f("Pages")-1));
     // all else straight forward

 }
}