//Navigate to saucedemo.com
//Login with username and password
//navigate back to login screen from the homepage
//print out the Login button attribute "VALUE" to verify that you are back on the login screen
//navigate forward to the homepage, print out a name of a product to verify that you are back on the homepage

package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task9 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver", "/Users/jumai.tijani/Documents/TESTIFY/Testify_Automation_School/Module 4B/Task/src/main/chromedriver-mac-arm64");
        //To launch the browser
        WebDriver driver = new ChromeDriver();
        //maximize the browser
        driver.manage().window().maximize();
        //navigate to saucedemo url
        driver.get("https://saucedemo.com");
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
        //input password
        driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
        Thread.sleep(2000);
        //click login button
        driver.findElement(By.cssSelector("input[data-test*='login']")).click();
        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(5000);
        System.out.println(driver.findElement(By.cssSelector("input[data-test*='login']")).isDisplayed());
        Thread.sleep(5000);
        driver.navigate().forward();
        Thread.sleep(5000);
        System.out.println(driver.findElement(By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='inventory_container']/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]")).isDisplayed());
    }
}
