// package com.mycompany.app;

// import java.time.Duration;
// import java.time.Month;
// import java.util.HashMap;

// import org.openqa.selenium.By;
// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.chrome.ChromeDriver;

// public class DatePickerDemo1{

//  static Month ChangeMonth(String month){
//      HashMap<String,Month> monthanator = new HashMap<String,Month>();
//      monthanator.put("January", Month.JANUARY);
//      monthanator.put("February",Month.FEBRUARY);
//      monthanator.put("March",Month.MARCH);
//      monthanator.put("April", Month.APRIL);
//      monthanator.put("May", Month.MAY);
//      monthanator.put("June", Month.JUNE);
//      monthanator.put("July", Month.JULY);
//      monthanator.put("August", Month.AUGUST);
//      monthanator.put("September", Month.SEPTEMBER);
//      monthanator.put("October", Month.OCTOBER);
//      monthanator.put("November",Month.NOVEMBER);
//      monthanator.put("December",Month.DECEMBER);
     
//      Month expMonth = monthanator.get(month);
//      if(expMonth==null){
//          System.out.println("Invalid arg");
//      }
     
//      return expMonth;
//  }
 
//  public static void main(String[] args) {
//      WebDriver driver=new ChromeDriver();
//      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//      driver.get("https://jqueryui.com/datepicker/");
     
//      driver.switchTo().frame(0);
//      //method 1: sending keys directly
//      // driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("03/10/2026");
     
//      // method 2: using date picker
//      String TDate= "03" ;
//      String TMonth="March";
//      String TYear="2026";
     
//      driver.findElement(By.xpath("//input[@id='datepicker']")).click();
     
//      //this below part if for manual like only goes forward or backward
//      // while(true){
//      //    String Month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
//      //    String Year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
//      //    if(Month.equals(TMonth) && Year.equals(TYear)){
//      //     break;
//      //    }
//      //    driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
//      // }
//      //method 1 for date
//      // driver.findElement(By.xpath("//a[normalize-space()="+TDate+"]")).click();
//      //method 2 for date
//      //select the date
//      // List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//td//a"));
//      // for(WebElement dt:allDates)
//      // {
//      //     if(dt.getText().equals(TDate))
//      //     {
//      //         dt.click();
//      //         break;
//      //     }
//      // }

     
//      String aMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
     
//      Month currMonth = ChangeMonth(aMonth);
//      Month expMonth = ChangeMonth(TMonth);
     
//      int aYear = Integer.parseInt(driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText());
//      int bYear = Integer.parseInt(TYear);
     
//      int result = expMonth.compareTo(currMonth); // returns 0 <0 and >0
//      if(aYear>bYear){
//              while(true){
//                 String Month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
//                 String Year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
//                 if(Month.equals(TMonth) && Year.equals(TYear)){
//                  break;
//                 }
//                 driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
//              }
//      }else if(aYear<bYear){
//          while(true){
//             String Month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
//             String Year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
//             if(Month.equals(TMonth) && Year.equals(TYear)){
//              break;
//             }
//             driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
//          }
//      }else if(aYear == bYear){
//          if(result<0){
//              while(true){
//                 String Month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
//                 String Year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
//                 if(Month.equals(TMonth) && Year.equals(TYear)){
//                  break;
//                 }
//                 driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
//              }
//          }else if(result>0){
//              while(true){
//                 String Month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
//                 String Year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
//                 if(Month.equals(TMonth) && Year.equals(TYear)){
//                  break;
//                 }
//                 driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
//              }
//          }
//      }
    
//      driver.findElement(By.xpath("//a[normalize-space()="+TDate+"]")).click();
//  }
// }



//better way below
package com.mycompany.app;

import java.time.Duration;
import java.time.Month;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerDemo1 {
    
    static Month changeToMonth(String month){
        return Month.valueOf(month);
    }
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://jqueryui.com/datepicker/");
        
        driver.switchTo().frame(0);
        // method 2: using date picker
        String TDate= "03" ;
        String TMonth="March";
        String TYear="2028";
        
        driver.findElement(By.xpath("//input[@id='datepicker']")).click();
        
        while(true){
            // just write this part and it should be all no need to get 100 loops
        }
    }
}