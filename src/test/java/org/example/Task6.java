//Navigate to https://www.saucedemo.com/
//Login using username and password.
//Click on the login button,
//click on the "add to cart" button of any product (Add only one item)
//click the cart icon on the top right.
//Click on checkout.  USE ONLY CSS LOCATION STRATEGY


package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task6 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver", "/Users/jumai.tijani/Documents/TESTIFY/Testify_Automation_School/Module 4B/Task/src/main/chromedriver-mac-arm64");
        //To launch the browser
        WebDriver driver = new ChromeDriver();
        //maximize the browser
        driver.manage().window().maximize();
        //navigate to the url
        driver.get("https://saucedemo.com");
        Thread.sleep(5000);
        //input username
        driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
        Thread.sleep(5000);
        //input password
        driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
        Thread.sleep(5000);
        //click login button
        driver.findElement(By.cssSelector("input[data-test*='login']")).click();
        Thread.sleep(5000);
        //add to cart
        driver.findElement(By.cssSelector("button[name$='onesie']")).click();
        Thread.sleep(5000);
        //click on the cart icon
        driver.findElement(By.cssSelector("a[data-test^='shopping']")).click();
        Thread.sleep(5000);
        //click on checkout
        driver.findElement(By.cssSelector("button.btn.btn_action.btn_medium.checkout_button")).click();
        Thread.sleep(5000);
        //input firstname
        driver.findElement(By.cssSelector("input#first-name")).sendKeys("Anthonia");
        Thread.sleep(5000);
        //input lastname
        driver.findElement(By.cssSelector("input#last-name")).sendKeys("larey");
        Thread.sleep(5000);
        //input postal code
        driver.findElement(By.cssSelector("input#postal-code")).sendKeys("200543");
        Thread.sleep(5000);
        //click on continue
        driver.findElement(By.cssSelector("input#continue")).click();
        Thread.sleep(5000);
        //click on finish
        driver.findElement(By.cssSelector("button#finish")).click();
        Thread.sleep(5000);
        //click on back to product
        driver.findElement(By.cssSelector("button#back-to-products")).click();
    }
}
