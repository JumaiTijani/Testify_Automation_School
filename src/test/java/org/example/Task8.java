//Navigate to https://idorenyinankoh.github.io/loginPage/
//check if the " create account" button is enabled"
//fill all the fields
//check if the "create account"is enabled


package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task8 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver", "/Users/jumai.tijani/Documents/TESTIFY/Testify_Automation_School/Module 4B/Task/src/main/chromedriver-mac-arm64");
        //To launch the browser
        WebDriver driver = new ChromeDriver();
        //maximize the browser
        driver.manage().window().maximize();
        //navigate to KodeCamp url
        driver.get("https://idorenyinankoh.github.io/loginPage/");
        Thread.sleep(5000);
        System.out.println("1. " + driver.findElement(By.xpath("//button[@id='create']")).isEnabled());
        driver.findElement(By.cssSelector("input#firstName")).sendKeys("Anthonia");
        driver.findElement(By.cssSelector("input#lastName")).sendKeys("larey");
        driver.findElement(By.cssSelector("input#email")).sendKeys("waterman@sharklasers.com");
        driver.findElement(By.cssSelector("input#female")).click();
        driver.findElement(By.cssSelector("input#password")).sendKeys("kgig7fvr#A");
        driver.findElement(By.cssSelector("input#confirmPass")).sendKeys("kgig7fvr#A");
        driver.findElement(By.cssSelector("input#xpLevel")).sendKeys("About me");
        System.out.println("2. " + driver.findElement(By.xpath("//button[@id='create']")).isEnabled());
    }
}
