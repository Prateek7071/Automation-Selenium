// move to empty screen after running if using hyprland for fullscreen options to appear;

package com.mycompany.app;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleHiddenDropDown {
	public static void main(String[] args){
    WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    
   
    WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(5)); // declaration
   
    WebElement txtUser = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder ='Username']")));
    txtUser.sendKeys("Admin");
    WebElement txtPassword = mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder ='Password']")));
    txtPassword.sendKeys("admin123");
	
	WebElement loginBtn = mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(normalize-space(),'Login')]")));
	
	loginBtn.click();
	
	//clicking on PIM
	WebElement PIM = mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='PIM']")));
	PIM.click();
    driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1]")).click();
	List<WebElement> lis = driver.findElements(By.xpath("//div[@role='listbox']//span"));
	System.out.println(lis.size());
    // WebElement selected = mywait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Account Assistant']")));
    // selected.click();
	
    // driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
	}
}