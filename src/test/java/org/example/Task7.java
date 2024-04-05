//Navigate to https://worldweather.wmo.int/en/home.html.
//Search for your city in the search field. When the result loads,
//print the days and weather description for each of the days shown in a readable and understandable manner.

package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task7 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver", "/Users/jumai.tijani/Documents/TESTIFY/Testify_Automation_School/Module 4B/Task/src/main/chromedriver-mac-arm64");
        //To launch the browser
        WebDriver driver = new ChromeDriver();
        //maximize the browser
        driver.manage().window().maximize();
        //navigate to the url
        driver.get("https://worldweather.wmo.int/en/home.html");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='q_search']")).sendKeys("Lagos,Nigeria");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//body/div[1]/div[4]/div[1]/div[2]/div[1]/form[1]/input[3]")).click();
        Thread.sleep(5000);
        //getDate1
        String date1 = driver.findElement(By.xpath("//body/div[1]/div[6]/div[5]/div[2]/div[2]/div[1]/div[1]/div[1]")).getText();
        //get Description1
        String description1 = driver.findElement(By.xpath("//body/div[1]/div[6]/div[5]/div[2]/div[2]/div[1]/div[1]/div[4]")).getText();
        //getDate2
        String date2 = driver.findElement(By.xpath("//body/div[1]/div[6]/div[5]/div[2]/div[2]/div[1]/div[2]/div[1]")).getText();
        //get Description2
        String description2 = driver.findElement(By.xpath("//body/div[1]/div[6]/div[5]/div[2]/div[2]/div[1]/div[2]/div[4]")).getText();
        //getDate3
        String date3 = driver.findElement(By.xpath("//body/div[1]/div[6]/div[5]/div[2]/div[2]/div[1]/div[3]/div[1]")).getText();
        //get Description3
        String description3 = driver.findElement(By.xpath("//body/div[1]/div[6]/div[5]/div[2]/div[2]/div[1]/div[3]/div[4]")).getText();
        //getDate4
        String date4 = driver.findElement(By.xpath("//body/div[1]/div[6]/div[5]/div[2]/div[2]/div[1]/div[4]/div[1]")).getText();
        //get Description4
        String description4 = driver.findElement(By.xpath("//body/div[1]/div[6]/div[5]/div[2]/div[2]/div[1]/div[4]/div[4]")).getText();
        //getDate5
        String date5 = driver.findElement(By.xpath("//body/div[1]/div[6]/div[5]/div[2]/div[2]/div[1]/div[5]/div[1]")).getText();
        //get Description5
        String description5 = driver.findElement(By.xpath("//body/div[1]/div[6]/div[5]/div[2]/div[2]/div[1]/div[5]/div[4]")).getText();


        System.out.println("Day1 : Date- " + date1 + "|| Description- "+ description1);
        System.out.println("Day2 : Date- " + date2 + "|| Description- "+ description2);
        System.out.println("Day3 : Date- " + date3 + "|| Description- "+ description3);
        System.out.println("Day4 : Date- " + date4 + "|| Description- "+ description4);
        System.out.println("Day5 : Date- " + date5 + "|| Description- "+ description5);

    }
}
