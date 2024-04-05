package org.example.Task2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "//Users/jumai.tijani/Documents/TESTIFY/Testify_Automation_School/Module 4B/Task/src/chromedriver-mac-x64");
        //To launch the browser
        WebDriver driver = new ChromeDriver();
        //maximize the browser
        driver.manage().window().maximize();
        //navigate to the url
        driver.get("www.google.com");
    }
}
