//Structure your TestNG file to run Navigate to google and search for testify.
//close the browser
//Navigate to https://www.mcdonalds.com/us/en-us.html .
//print out the colour - code of the order now button.
//All test should be done in one class and utilize your knowledge of tesNG annotation.

package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;

public class Task15 {
    WebDriver driver = null;
    @BeforeMethod
    public void openBrowser(){
        System.setProperty("Webdriver.chrome.driver", "/Users/jumai.tijani/Documents/TESTIFY/Testify_Automation_School/Module 4B/Task/src/main/chromedriver-mac-arm64");
        //To launch the browser
        driver = new ChromeDriver();
        //maximize the browser
        driver.manage().window().maximize();
        //adding implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }

    @Test
    public void testify(){
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("testify ltd");
        driver.findElement(By.xpath("//body")).click();

    }

    @Test
    public void mcDonalds(){
        driver.get("https://www.mcdonalds.com/us/en-us.html");
        WebElement orderNow = driver.findElement(By.xpath("//a[@id='button-ordernow']"));
        String colour = orderNow.getCssValue("background-color");
        System.out.println("Background Colour; " + colour);


    }

    @AfterMethod
    public void closeBrowser(){
        driver.quit();

    }
}
