//Navigate to https://jqueryui.com/
//click on the dialog menu from the left pane
//click on the close icon to close the dialogue box in the middle

package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task10 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver", "/Users/jumai.tijani/Documents/TESTIFY/Testify_Automation_School/Module 4B/Task/src/main/chromedriver-mac-arm64");
        //To launch the browser
        WebDriver driver = new ChromeDriver();
        //maximize the browser
        driver.manage().window().maximize();
        //navigate to jquery url
        driver.get("https://jqueryui.com/dialog/");
        Thread.sleep(5000);
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//body/div[1]/div[1]/button[1]/span[1]")).click();
    }
}
