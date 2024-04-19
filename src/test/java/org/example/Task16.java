//Navigate to https://testifyltd.com/ .
//Assert that Our contact column at the footer of the homepage has the following correct details,
//EMAIL: info@testifyltd.co.uk
//LOCATION: Nigeria
//PHONE: (+234)904-882-0971

package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class Task16 {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver", "/Users/jumai.tijani/Documents/TESTIFY/Testify_Automation_School/Module 4B/Task/src/main/chromedriver-mac-arm64");
        //To launch the browser
        WebDriver driver = new ChromeDriver();
        //maximize the browser
        driver.manage().window().maximize();
        Wait<WebDriver> waitTime = new WebDriverWait(driver, Duration.ofSeconds(5));
        //navigate to testify url
        driver.get("https://testifyltd.com/");
        //Scroll to the end off the page
        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("window.scrollBy(0, 6000)");

        String email =  "info@testifyltd.co.uk";
        String location = "Nigeria";
        String phone = "(+234)904-882-0971";

        WebElement phoneNumber = driver.findElement(By.xpath("//p[contains(text(),' (+234)905-882-0971')]"));
        WebElement testifyEmail = driver.findElement(By.xpath("//p[contains(text(),'info@testifyltd.com')]"));
        WebElement testifyLocation = driver.findElement(By.xpath("//body/div[@id='__next']/section[1]/div[1]/div[1]/div[1]/div[1]"));



        SoftAssert contact = new SoftAssert();
        contact.assertEquals(email, testifyEmail.getText());
        contact.assertEquals(location, testifyLocation.getText());
        contact.assertEquals(phone, phoneNumber.getText());
        contact.assertAll();
    }

}
