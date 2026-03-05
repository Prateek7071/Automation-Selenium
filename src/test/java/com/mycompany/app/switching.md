3 types of switching methods

1) browser windows
driver.swichTo().window(windowID/window handle)

2) alerts
driver.swichTo().alert()
driver.swichTo().accept()
driver.swichTo().dismiss()

3) frames

driver.switchTo().frame(id);

driver.switchTo().frame(name);

driver.switchTo().frame(WebElement);
