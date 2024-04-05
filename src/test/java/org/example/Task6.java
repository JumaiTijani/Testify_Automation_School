package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task6 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/jumai.tijani/Documents/TESTIFY/Testify_Automation_School/Module 4B/Task/src/main/chromedriver-mac-arm64");
        //To launch the browser
        WebDriver driver = new ChromeDriver();
        //maximize the browser
        driver.manage().window().maximize();
        //navigate to the url
        driver.get("www.saucedemo.com");
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("input[data-test*='login']")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("button[name$='onesie']")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("a[data-test^='shopping']")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("button.btn.btn_action.btn_medium.checkout_button")).click();
    }
}
