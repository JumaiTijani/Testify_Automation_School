//Navigate to https://www.saucedemo.com/
//Login using username and password.
//Click on the login button,
//click on the "add to cart" button of any product (Add only one item)
//click the cart icon on the top right.
//Click on checkout.  USE ONLY XPATH LOCATION STRATEGY

package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver", "/Users/jumai.tijani/Documents/TESTIFY/Testify_Automation_School/Module 4B/Task/src/main/chromedriver-mac-arm64");
        //To launch the browser
        WebDriver driver = new ChromeDriver();
        //maximize the browser
        driver.manage().window().maximize();
        //navigate to saucedemo url
        driver.get("https://saucedemo.com");
        Thread.sleep(5000);
        //input username
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        Thread.sleep(5000);
        //input password
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("secret_sauce");
        Thread.sleep(5000);
        //click login button
        driver.findElement(By.xpath("//input[@data-test='login-button']")).click();
        Thread.sleep(5000);
        //add to cart
        driver.findElement(By.xpath("//button[@name='add-to-cart-sauce-labs-bolt-t-shirt']")).click();
        Thread.sleep(5000);
        //click on the cart icon
        driver.findElement(By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]")).click();
        Thread.sleep(5000);
        //click on checkout
        driver.findElement(By.xpath("//button[@id='checkout']")).click();
        Thread.sleep(5000);
        //input firstname
        driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Anthonia");
        Thread.sleep(5000);
        //input lastname
        driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("larey");
        Thread.sleep(5000);
        //input postal code
        driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("200543");
        Thread.sleep(5000);
        //click on continue
        driver.findElement(By.xpath("//input[@id='continue']")).click();
        Thread.sleep(5000);
        //click on finish
        driver.findElement(By.xpath("//button[@id='finish']")).click();
        Thread.sleep(5000);
        //click on back to product
        driver.findElement(By.xpath("//button[@id='back-to-products']")).click();
    }
}
