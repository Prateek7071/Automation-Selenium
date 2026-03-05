package com.mycompany.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAuthenticationPopup {
 public static void main(String[] args) {
     WebDriver driver  = new ChromeDriver();
     driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
 }
}