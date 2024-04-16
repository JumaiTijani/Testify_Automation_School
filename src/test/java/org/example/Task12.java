//Navigate to https://jqueryui.com/
//.click on the "resize" menu from the left pane
//Drag the box to be bigger.(Resize the box to be bigger)

package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task12 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver", "/Users/jumai.tijani/Documents/TESTIFY/Testify_Automation_School/Module 4B/Task/src/main/chromedriver-mac-arm64");
        //To launch the browser
        WebDriver driver = new ChromeDriver();
        //maximize the browser
        driver.manage().window().maximize();
        //navigate to jquery url
        driver.get("https://jqueryui.com/resizable/");
        Thread.sleep(5000);
        driver.switchTo().frame(0);
        Thread.sleep(5000);
        WebElement resizeBox = driver.findElement(By.xpath("//body/div[@id='resizable']/div[3]"));
        Actions resize = new Actions(driver);
        resize.dragAndDropBy(resizeBox, 356,209).build().perform();
    }
}
