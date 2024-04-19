//Run the following tests on https://demoqa.com   as a Testsuite (All test must be in diffrent classes)
//Navigate to the homepage and click on the Elements tile
// Assert that you are on the Elements page
//Navigate to the homepage and click on the Forms tile
//Assert that you are on the Forms page
//Navigate to the homepage and click on the Widgets tile
//Assert that you are on the Widgets page
//Navigate to the homepage and click on the Interactions tile
//Assert that you are on the Interactions page


package org.example.Task17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class Task17D {

    @Test
    public void interactions(){
        System.setProperty("Webdriver.chrome.driver", "/Users/jumai.tijani/Documents/TESTIFY/Testify_Automation_School/Module 4B/Task/src/main/chromedriver-mac-arm64");
        //To launch the browser
        WebDriver driver = new ChromeDriver();
        //maximize the browser
        driver.manage().window().maximize();
        //navigate to demoqa url
        driver.get("https://demoqa.com");
        //adding implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[5]")).click();

        String demoqaElement =  "Sortable";

        WebElement sortable = driver.findElement(By.xpath("//span[contains(text(),'Sortable')]"));

        SoftAssert contact = new SoftAssert();
        contact.assertEquals(demoqaElement, sortable.getText());
        contact.assertAll();
    }
}
