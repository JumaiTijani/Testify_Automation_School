// Using your knowledge of POM, organize your order item test case below:
//Navigate to saucedemo.com
//Login with the username and password on the Login screen.
//Add to items to cart. Click on the cart icon on the top right.
//assert that the items you clicked and added to cart are what are displayed on the "YOUR CART" page.
//Click on the checkout button. 6. Input first name last name and postal code and click on continue.
//Assert that the item showed on the CHECKOUT: OVERVIEW page is the item that was added to cart from the first page.
//Click on the "Finish" button. Assert that user sees an success message "THANK YOU FOR YOUR ORDER".

package org.example.Task18;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceLoginPage {

    WebDriver Sdriver= null;
    public SauceLoginPage(WebDriver driver){
        Sdriver = driver;
        PageFactory.initElements(Sdriver, this);

    }

    @FindBy (xpath = "//input[@id='user-name']")
    private WebElement username;
    public WebElement getUsername(){
        return username;
    }

    @FindBy (xpath = "//input[@id='password']")
    private WebElement password;
    public WebElement getPassword(){
        return password;
    }

    @FindBy (xpath = "//input[@id='login-button']")
    private WebElement login;
    public WebElement getLogin(){
        return login;
    }
}

