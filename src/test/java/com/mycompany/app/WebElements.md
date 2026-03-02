// WebElements methods
// get methods
// conditional methods
// browser methods 
// navigational methods
// wait methods


//1 get
// get methods - we can access these methods through webdriver instance
// get(url) - opens the url on the browser
// getTitle() - returns title of the page
// getCurrentUrl() - retuns URL of the page
// getPageSource()- returns source code of the page
// getWindowHandle() - returns ID of the single Browser window
// getWindowHandles() - retuns ID's of the multiple browser windows


#conditional methods - access these commands thorugh WebElement
retuns boolean value( true/false)

isDisplayed() 
isEnabled()
isSelected()

// browser methods 
close() vs quit()
close() closes one at a time
quit() nutes all windows 

#wait commands
Synchronization
Thread.sleep() do not come under either its a java provided method and not a WebDriver \

1) implicit wait
2) explicit wait/fluent wait

NoSuchElementException - Element is not present on the page.Its a synchronization problem.
ElementNotFoundException - Locator is in-correct

#explicit wait

declaration
then useuse

adv:
1) Conditional based, it will work more effectively.
2) finding element is inclusive( for some conditions)
3) it will wait for condition to be true, then consider the time
4) we need to write multiple statements for multiple elements


fluentwait part of explicit wait
use: declare then use;

#navigational commands

navigate.to(url) same as .get()
navigate.back()
navigate.forward()
navigate.refresh()

driver.get() ---> accepts URL in string format only
driver.navigate().to() ---> accepts URL in the string format & URL object format.


driver.switchTo().window(windowID)
