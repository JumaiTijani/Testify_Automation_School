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

public class SauceCartPage {
    WebDriver Cdriver= null;
    public SauceCartPage(WebDriver driver){
        Cdriver = driver;
        PageFactory.initElements(Cdriver, this);

    }

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/a[1]/div[1]")
    private WebElement cartBackpack;
    public WebElement getCartBackpack(){
        return cartBackpack;
    }

    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[2]/a[1]/div[1]")
    private WebElement cartJacket;
    public WebElement getCartJacket(){
        return cartJacket;
    }

    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/div[2]/a[1]/div[1]")
    private WebElement cartOnesie;
    public WebElement getCartOnesie(){
        return cartOnesie;
    }
    @FindBy (xpath = "//button[@id='checkout']")
    private WebElement checkout;
    public WebElement getCheckout(){
        return checkout;
    }
    @FindBy (xpath = "//input[@id='first-name']")
    private WebElement firstName;
    public WebElement getFirstName(){
        return firstName;
    }

    @FindBy (xpath = "//input[@id='last-name']")
    private WebElement lastName;
    public WebElement getLastName(){
        return lastName;
    }

    @FindBy (xpath = "//input[@id='postal-code']")
    private WebElement postalCode;
    public WebElement getPostalCode(){
        return postalCode;
    }

    @FindBy (xpath = "//input[@id='continue']")
    private WebElement continueButton;
    public WebElement getContinueButton(){
        return continueButton;
    }

    @FindBy (xpath = "//button[@id='finish']")
    private WebElement finish;
    public WebElement getFinish(){
        return finish;
    }

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/a[1]/div[1]")
    private WebElement checkoutBackpack;
    public WebElement getCheckoutBackpack(){
        return checkoutBackpack;
    }

    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[4]/div[2]/a[1]/div[1]")
    private WebElement checkoutJacket;
    public WebElement getCheckoutJacket(){
        return checkoutJacket;
    }

    @FindBy (xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/div[2]/a[1]/div[1]")
    private WebElement checkoutOnesie;
    public WebElement getCheckoutOnesie() {
        return checkoutOnesie;
    }

    @FindBy (xpath = "//h2[contains(text(),'Thank you for your order!')]")
    private WebElement success;
    public WebElement getSuccess(){
        return success;
    }

}
//div[@id=''] - Sauce Labs Backpack
//div[@id=''] - Sauce Labs Fleece Jacket
//div[@id=''] - Sauce Labs Onesie
//button[@id='checkout'] - checkout
//input[@id='first-name'] - first-name
//input[@id='last-name'] - lastname
//input[@id='postal-code'] - postal code
//input[@id='continue'] - continue
//button[@id='finish'] - finish
//div[@id=''] - Sauce Labs Backpack
//div[@id=''] - Sauce Labs Fleece Jacket
//div[@id=''] - Sauce Labs Onesie
//h2[contains(text(),'Thank you for your order!')] - success

