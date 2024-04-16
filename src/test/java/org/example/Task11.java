//Go to google.
//search for "testify ltd"
//Click on the search that result with www.testifyltd.com
//scroll down the testify website and click on the linkedIn icon.
//Get the description text on the user-page.(image; https://i.imgur.com/PmrWDXa.png )

package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Task11 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver", "/Users/jumai.tijani/Documents/TESTIFY/Testify_Automation_School/Module 4B/Task/src/chromedriver-mac-arm64");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("testify ltd");
        driver.findElement(By.xpath("//body")).click();
        Thread.sleep(5000);
        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("window.scrollBy(0, 5000)");
        driver.findElement(By.xpath("//body/div[@id='__next']/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[1]/*[1]")).click();
        Thread.sleep(5000);
        //driver.switchTo().alert().dismiss();
        Set<String> window = driver.getWindowHandles();
        for(String linkedIn: window) {
            driver.switchTo().window(linkedIn);
            Thread.sleep(5000);
            if (driver.getCurrentUrl().equalsIgnoreCase("https://www.linkedin.com/company/testifyorg")) {
                System.out.println(driver.findElement(By.xpath("//span[contains(text(),'We are into everything that has to do with Softwar')]")).getText());
            }
        }

    }
}
