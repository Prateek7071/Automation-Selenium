package com.mycompany.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//test cases:
// 1. open browser
// 2. open site https://demo.opencart.com/
// 3. validate title should be "Your Store"
// 4. close browser

public class FirstTestCase {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver(); //open browser
        
        try{
            driver.get("https://demo.opencart.com/"); //open the test website
            Thread.sleep(10000);
        }catch(Exception e){
            e.printStackTrace();
        }
        
        String actual_title = driver.getTitle(); //get the title
        if(actual_title.equals("Your Store")){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }
        driver.close(); //method 1 to close or use driver.quit();
    }
}
