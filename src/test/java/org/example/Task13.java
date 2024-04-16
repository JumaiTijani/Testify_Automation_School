//Go to https://selenium08.blogspot.com/
//search for "Demo dropdown" form the search field.
//on the drop-down page, select Nigeria from the country list and select january february and march from the moths list.

package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Task13 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver", "/Users/jumai.tijani/Documents/TESTIFY/Testify_Automation_School/Module 4B/Task/src/main/chromedriver-mac-arm64");
        //To launch the browser
        WebDriver driver = new ChromeDriver();
        //maximize the browser
        driver.manage().window().maximize();
        //navigate to selenium08 url
        driver.get("https://selenium08.blogspot.com/");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[contains(text(),'Search')]")).click();
        Thread.sleep(3000);
        Actions search = new Actions(driver);
        search.sendKeys("Demo dropdown").sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[2]/div[1]/div[1]/article[1]/div[1]/div[2]/div[4]/div[2]/a[1]")).click();
        WebElement selectCountry = driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[3]/div[1]/div[1]/select[1]"));
        WebElement selectMonths = driver.findElement(By.xpath("//body/div[1]/div[2]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/select[1]"));


        Select country = new Select(selectCountry);
        country.selectByVisibleText("Nigeria");
        Thread.sleep(5000);

        Select months = new Select(selectMonths);
        months.selectByIndex(1);
        months.selectByIndex(2);
        months.selectByIndex(3);


    }
}
