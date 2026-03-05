// driver.switchTo().frame(name)
// driver.switchTo().frame(id)
// driver.switchTo().frame(WebElement)
// driver.switch().frame(index)

package com.mycompany.app;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HandleFrames {
 public static void main(String[] args) throws InterruptedException{
     WebDriver driver=new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     driver.get("https://ui.vision/demo/webtest/frames/");
     WebElement frame = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
     driver.switchTo().frame(frame);
     driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("This is frame 1");
     
     driver.switchTo().defaultContent();// go back to default page VERY IMPORTANT cant go from frame to frame
     
     //Frame2
     WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
     driver.switchTo().frame(frame2);
     driver.findElement(By.xpath( "//input[@name='mytext2']")).sendKeys("selenium");
     
     driver.switchTo().defaultContent();
     WebElement frame3 =driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
     driver.switchTo().frame(frame3);
     driver.findElement(By.xpath( "//input[@name='mytext3']")).sendKeys("Frame 3");
     driver.switchTo().frame(0);
     //driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']")).click();
     // another method to click on the radio button using js executor;
     WebElement rdButton = driver.findElement(By.xpath("//div[@id='i9']//div[@class='AB7Lab Id5V1']"));
     JavascriptExecutor js = (JavascriptExecutor) driver;
     js.executeScript("arguments[0].click()",rdButton);
     
     
     driver.findElement(By.xpath("//div[@id='i21']//div[@class='uHMk6b fsHoPb']")).click();
     driver.findElement(By.xpath("//div[@id='i27']//div[@class='uHMk6b fsHoPb']")).click();
     
     WebElement dropDownElement = driver.findElement(By.xpath("//div[@role='listbox']"));
     dropDownElement.click();
     
     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
     WebElement yesOption = wait.until(ExpectedConditions.elementToBeClickable(
         By.xpath("//div[@role='option']//span[text()='Yes']")
     ));
     yesOption.click();
     Thread.sleep(5000);
     
     driver.findElement(By.xpath("//div[@class='uArJ5e UQuaGc YhQJj zo8FOc ctEux']//span[@class='l4V7wb Fxmcue']")).click();
     WebElement shortText = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='text']")));
     shortText.sendKeys("a short text");
     driver.findElement(By.xpath("//textarea[@aria-label='Your answer']")).sendKeys("a long text");
     driver.findElement(By.xpath("//div[@aria-label='Submit']//span[@class='l4V7wb Fxmcue']")).click();
     
     
     driver.switchTo().defaultContent();
     WebElement frame5 =driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
     driver.switchTo().frame(frame5);
     driver.findElement(By.xpath( "//input[@name='mytext5']")).sendKeys("Frame 5");
     
     driver.findElement(By.partialLinkText("a9t9")).click();
     
     WebDriverWait longerWait = new WebDriverWait(driver, Duration.ofSeconds(10));
     
     WebElement logo = longerWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='Ui.Vision by a9t9 software - Image-Driven Automation']")));
     System.out.println(logo.isDisplayed());
     driver.findElement(By.partialLinkText("Browser Automation")).click();
     
     
     
     
     //ignore this attempt below i tried doing idk what.
     // 
     // WebDriverWait longerWait = new WebDriverWait(driver, Duration.ofSeconds(10));
     // for(String x : handles){
     //     driver.switchTo().window(x);
     //     System.out.println(driver.getTitle());
     //     if(driver.getTitle().contains("RPA Software")){
     //         longerWait.until(ExpectedConditions.titleContains("RPA Software"));
     //         System.out.println("Bingo!`");
     //         break;
     //     }
     // }
     // System.out.println(driver.getTitle());
     // // WebElement logo = longerWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='Ui.Vision by a9t9 software - Image-Driven Automation']")));
     // // System.out.println(logo.isDisplayed());
     
     
}
}