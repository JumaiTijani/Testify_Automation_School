// Using your knowledge of POM, organize your order item test case below:
//Navigate to saucedemo.com
//Login with the username and password on the Login screen.
//Add to items to cart. Click on the cart icon on the top right.
//assert that the items you clicked and added to cart are what are displayed on the "YOUR CART" page.
//Click on the checkout button. 6. Input first name last name and postal code and click on continue.
//Assert that the item showed on the CHECKOUT: OVERVIEW page is the item that was added to cart from the first page.
//Click on the "Finish" button. Assert that user sees an success message "THANK YOU FOR YOUR ORDER".

package org.example.Task18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;



public class SauceCartTest {

    WebDriver driver= null;

    @Test
    public void sauceTest(){
        System.setProperty("Webdriver.chrome.driver", "/Users/jumai.tijani/Documents/TESTIFY/Testify_Automation_School/Module 4B/Task/src/main/chromedriver-mac-arm64");
        //To launch the browser
        driver = new ChromeDriver();
        //maximize the browser
        driver.manage().window().maximize();
        //adding implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //navigate to saucedemo url
        driver.get("https://saucedemo.com");
        SauceLoginPage login = new SauceLoginPage(driver);
        login.getUsername().sendKeys("standard_user");
        login.getPassword().sendKeys("secret_sauce");
        login.getLogin().click();
        SauceProductPage addToCart = new SauceProductPage(driver);
        addToCart.getBackpack().click();
        addToCart.getJacket().click();
        addToCart.getOnesie().click();
        addToCart.getCart().click();
        SauceCartPage checkout = new SauceCartPage(driver);
        String cartItem1 =  "Sauce Labs Backpack";
        String cartItem2 =  "Sauce Labs Fleece Jacket";
        String cartItem3 =  "Sauce Labs Onesie";

        String labsBackpack = checkout.getCartBackpack().getText();
        String labsFleeseJacket = checkout.getCartJacket().getText();
        String labsOnesie = checkout.getCartOnesie().getText();

        SoftAssert cartItems = new SoftAssert();
        cartItems.assertEquals(cartItem1, labsBackpack);
        cartItems.assertEquals(cartItem2, labsFleeseJacket);
        cartItems.assertEquals(cartItem3, labsOnesie);
        cartItems.assertAll();

        checkout.getCheckout().click();
        checkout.getFirstName().sendKeys("Anthonia");
        checkout.getLastName().sendKeys("larey");
        checkout.getPostalCode().sendKeys("200543");
        checkout.getContinueButton().click();

        String checkoutItem1 = checkout.getCheckoutBackpack().getText();
        String checkoutItem2 = checkout.getCheckoutJacket().getText();
        String checkoutItem3 = checkout.getCheckoutOnesie().getText();

        SoftAssert checkoutItems = new SoftAssert();
        checkoutItems.assertEquals("Sauce Labs Backpack", checkoutItem1);
        checkoutItems.assertEquals("Sauce Labs Fleece Jacket", checkoutItem2);
        checkoutItems.assertEquals("Sauce Labs Onesie", checkoutItem3);
        checkoutItems.assertAll();

        checkout.getFinish().click();

        String  checkoutSuccess = checkout.getSuccess().getText();
        SoftAssert success = new SoftAssert();
        success.assertEquals("Thank you for your order!", checkoutSuccess);
        success.assertAll();


    }
}
