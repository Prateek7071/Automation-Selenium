package com.mycompany.app;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitDemo {

	public static void main(String[] args){
    WebDriver driver=new ChromeDriver();
    
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3)); //implicit wait
    //write once at the start of the script and no need to wrrite again and it works, as for everyline of code this line will take care of it whenever there is any synchronisation problem. And it is active till the driver is closed.
    // adv over thread.sleep
    // smart wait,(so the time is the max time it waits) so no performance issue based on time;
    // disadv
    // timeout if the element is taking more than the specified time.
    
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
    
	}
}