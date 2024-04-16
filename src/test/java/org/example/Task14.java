//Navigate to https://www.toolsqa.com/
//close the dialogue box that pops up after a few seconds
//Click on the tutorial button in the top left corner of the page

package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Task14 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver", "/Users/jumai.tijani/Documents/TESTIFY/Testify_Automation_School/Module 4B/Task/src/main/chromedriver-mac-arm64");
        //To launch the browser
        WebDriver driver = new ChromeDriver();
        //maximize the browser
        driver.manage().window().maximize();
        //navigate to toolsqa url
        driver.get("https://www.toolsqa.com/");
        Thread.sleep(5000);
        Wait<WebDriver> waitTime = new WebDriverWait(driver, Duration.ofSeconds(5));
        waitTime.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//header/nav[1]/div[1]/div[1]/div[4]/a[1]")));
        driver.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/div[4]/a[1]")).click();
    }
}
