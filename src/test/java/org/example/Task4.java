package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/jumai.tijani/Documents/TESTIFY/Testify_Automation_School/Module 4B/Task/src/main/chromedriver-mac-arm64");
        //To launch the browser
        WebDriver driver = new ChromeDriver();
        //maximize the browser
        driver.manage().window().maximize();
        //navigate to the url
        driver.get("https://demo.guru99.com/");
        Thread.sleep(5000);
        driver.findElement(By.linkText("Security Project")).click();
        Thread.sleep(5000);
        driver.findElement(By.name("uid")).sendKeys("stacy@sharklasers.com");
        Thread.sleep(5000);
        driver.findElement(By.name("password")).sendKeys("stacy@51#ten");
    }
}
