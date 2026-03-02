package com.mycompany.app;

// import java.util.List;
// import java.util.ArrayList;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindow {

	public static void main(String[] args){
	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));    
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
	Set<String> windowIds = driver.getWindowHandles();
	//approach 1: converting set to list. Doing this cause we cant use get for the set.

	// List<String> windowList = new ArrayList(windowIds);
	// String parentId = windowList.get(0);
	// String childId = windowList.get(1);
	// System.out.println(driver.getTitle()); //this will post the title of parent cause the driver is still at the parent;
	// driver.switchTo().window(childId);
	// System.out.println(driver.getTitle());
	// driver.switchTo().window(parentId);
	// System.out.println(driver.getTitle());
	
	
	//approach 2: using loops, recommended for when we have multiple windows in like of more than 4 
	
	for(String winId:windowIds){
	    System.out.println(driver.switchTo().window(winId).getTitle());
	}
	
	}
}