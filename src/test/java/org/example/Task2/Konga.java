//Create three different classes and launch any three websites of your choice from each of them

package org.example.Task2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Konga {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver", "/Users/jumai.tijani/Documents/TESTIFY/Testify_Automation_School/Module 4B/Task/src/main/chromedriver-mac-arm64");
        //To launch the browser
        WebDriver driver = new ChromeDriver();
        //maximize the browser
        driver.manage().window().maximize();
        //navigate to konga url
        driver.get("https://www.konga.com/");
    }
}
