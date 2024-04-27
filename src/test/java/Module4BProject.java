import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class Module4BProject {
    WebDriver driver = null;
    @BeforeMethod
    public void openBrowser(){
        System.setProperty("Webdriver.chrome.driver", "/Users/jumai.tijani/Documents/TESTIFY/Testify_Automation_School/Module 4B/Task/src/main/chromedriver-mac-arm64");
        //To launch the browser
        driver = new ChromeDriver();
        //maximize the browser
        driver.manage().window().maximize();
        //adding implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

    }
    @Test
    public void automationExercise() {
        //visit  automationexercise
        driver.get("https://www.automationexercise.com/");
        // Click on the signup/login button
        driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]")).click();
        //Input Name
        driver.findElement(By.xpath("//body/section[@id='form']/div[1]/div[1]/div[3]/div[1]/form[1]/input[2]")).sendKeys("Beanie");
        //Input email address
        driver.findElement(By.xpath("//body/section[@id='form']/div[1]/div[1]/div[3]/div[1]/form[1]/input[3]")).sendKeys("Beanieadams@sharklasers.com");
        //Click on signup
        driver.findElement(By.xpath("//button[contains(text(),'Signup')]")).click();

        //Input Select Title
        driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/label[1]/div[1]/span[1]/input[1]")).click();
        //Input Password
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("P@ssw0rd");

        //get day list
        WebElement dayList = driver.findElement(By.xpath("//select[@id='days']"));
        //get month list
        WebElement monthList = driver.findElement(By.xpath("//select[@id='months']"));
        //get year list
        WebElement yearList = driver.findElement(By.xpath("//select[@id='years']"));
        //Select day
        Select day = new Select(dayList);
        day.selectByVisibleText("10");
        //Select month
        Select month = new Select(monthList);
        month.selectByVisibleText("April");
        //Select year
        Select year = new Select(yearList);
        year.selectByVisibleText("1993");

        //click "Sign up for our newsletter!" checkbox
        driver.findElement(By.xpath("//input[@id='newsletter']")).click();
        //click "Receive special offers from our partners!" checkbox
        driver.findElement(By.xpath("//input[@id='optin']")).click();


        //Input Firstname
        driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Beanie");
        //Input Lastname
        driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Adams");

        //Scroll down
        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("window.scrollBy(0, 2000)");

        //Input Company
        driver.findElement(By.xpath("//input[@id='company']")).sendKeys("Nobul");
        //input Address
        driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/p[4]/input[1]")).sendKeys("130 King St W, Toronto, ON M5X 1E3, Canada");
        //input Address2
        driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/p[5]/input[1]")).sendKeys("No 1 Silk Street, Ancoats, Manchester, M4 6AG");

        //get country list
        WebElement countryList = driver.findElement(By.xpath("//select[@id='country']"));
        //Select country
        Select country = new Select(countryList);
        country.selectByVisibleText("Canada");
        //input State
        driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Ontario");
        //input City
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Toronto");
        //input Zipcode
        driver.findElement(By.xpath("//input[@id='zipcode']")).sendKeys("M3C");
        //input Mobile Number
        driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("4168273645");
        //Click Create account
        driver.findElement(By.xpath("//button[contains(text(),'Create Account')]")).click();

        //Assert that your account was successfully created
        WebElement text = driver.findElement(By.xpath("//b[contains(text(),'Account Created!')]"));

        String  welcomeText = text.getText();

       SoftAssert successMessage = new SoftAssert();
        successMessage.assertEquals("ACCOUNT CREATED!", welcomeText);
        successMessage.assertAll();

        //Click on Continue
        driver.findElement(By.xpath("//a[contains(text(),'Continue')]")).click();

        //Click on women category
        driver.findElement(By.xpath("//body/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/h4[1]/a[1]/span[1]/i[1]")).click();
        //Click on tops
        driver.findElement(By.xpath("//body/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]")).click();

        //Click on view product
        driver.findElement(By.xpath("//body/section[1]/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div[2]/ul[1]/li[1]/a[1]")).click();
        //Click on add to cart
        driver.findElement(By.xpath("//body/section[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/span[1]/button[1]")).click();

        //Click on view cart
        driver.findElement(By.xpath("//u[contains(text(),'View Cart')]")).click();

        //Assert that the item has been successfully added to the cart.
        WebElement top = driver.findElement(By.xpath("//a[contains(text(),'Summer White Top')]"));

        String  cart = top.getText();

        SoftAssert cartItem = new SoftAssert();
        cartItem.assertEquals("Summer White Top", cart);
        cartItem.assertAll();

        //Click on Proceed to Checkout
        driver.findElement(By.xpath("//a[contains(text(),'Proceed To Checkout')]")).click();

        //Scroll down
        scroll.executeScript("window.scrollBy(0, 2000)");

        //Click on Place Order
        driver.findElement(By.xpath("//a[contains(text(),'Place Order')]")).click();

        //input Name on Card
        driver.findElement(By.xpath("//body/section[@id='cart_items']/div[1]/div[3]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]")).sendKeys("Beanie Adams");
        //input Card Number
        driver.findElement(By.xpath("//body/section[@id='cart_items']/div[1]/div[3]/div[1]/div[2]/form[1]/div[2]/div[1]/input[1]")).sendKeys("5399421583440796");
        //input CVC
        driver.findElement(By.xpath("//body/section[@id='cart_items']/div[1]/div[3]/div[1]/div[2]/form[1]/div[3]/div[1]/input[1]")).sendKeys("419");
        //input Expiration Month
        driver.findElement(By.xpath("//body/section[@id='cart_items']/div[1]/div[3]/div[1]/div[2]/form[1]/div[3]/div[2]/input[1]")).sendKeys("06");
        //input Expiration year
        driver.findElement(By.xpath("//body/section[@id='cart_items']/div[1]/div[3]/div[1]/div[2]/form[1]/div[3]/div[3]/input[1]")).sendKeys("2027");

        //Click on Pay and confirm order
        driver.findElement(By.xpath("//button[@id='submit']")).click();

        //Assert that order is placed
        WebElement order = driver.findElement(By.xpath("//b[contains(text(),'Order Placed!')]"));

        String  success = order.getText();

        SoftAssert orderPlaced = new SoftAssert();
        orderPlaced.assertEquals("ORDER PLACED!", success);
        orderPlaced.assertAll();

        //Click on Continue
        driver.findElement(By.xpath("//a[contains(text(),'Continue')]")).click();



    }

    //Section B
    @Test
    public void blazedemo() {
        //visit https://blazedemo.com/
        driver.get("https://blazedemo.com/");
        //get departure city list
        WebElement departureCity = driver.findElement(By.xpath("//body/div[3]/form[1]/select[1]"));
        //get destination city list
        WebElement destinationCity = driver.findElement(By.xpath("//body/div[3]/form[1]/select[2]"));
        //Select departure city
        Select departure = new Select(departureCity);
        departure.selectByVisibleText("Boston");
        //Select destination city
        Select destination = new Select(destinationCity);
        destination.selectByVisibleText("Rome");
        //Click on “FindFlights”
        driver.findElement(By.xpath("//body/div[3]/form[1]/div[1]/input[1]")).click();
        //Select Flight
        driver.findElement(By.xpath("//tbody/tr[3]/td[1]/input[1]")).click();

        // Find Flight Number
        WebElement flightNumber = driver.findElement(By.xpath("//p[contains(text(),'Flight Number: UA954')]"));
        // Get the text from flightNumber
        String flight = flightNumber.getText();
        // Find the zip code field
        WebElement zipCode = driver.findElement(By.xpath("//input[@id='zipCode']"));
        //paste flight number into the Zip code field
        zipCode.sendKeys(flight);


        //input name
        driver.findElement(By.xpath("//input[@id='inputName']")).sendKeys("Jamie");
        //input Address
        driver.findElement(By.xpath("//input[@id='address']")).sendKeys("St. Anthony");
        //input City
        driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Abuja");
        //Input State
        driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Lagos");
        //Select Card Type
        WebElement cardType = driver.findElement(By.xpath("//select[@id='cardType']"));
        Select card = new Select(cardType);
        card.selectByVisibleText("American Express");
        //Input Credit Card Number
        driver.findElement(By.xpath("//input[@id='creditCardNumber']")).sendKeys("9827863864864782");
        //Input Credit Card Month
        driver.findElement(By.xpath("//input[@id='creditCardMonth']")).sendKeys("10");
        //Input Credit Card Year
        driver.findElement(By.xpath("//input[@id='creditCardYear']")).sendKeys("2025");
        //Input Credit Card Name
        driver.findElement(By.xpath("//input[@id='nameOnCard']")).sendKeys("Jamie Smith");
        //Tick the‘RememberMe’checkbox
        driver.findElement(By.xpath("//input[@id='rememberMe']")).click();
        //Click on Purchase Flight
        driver.findElement(By.xpath("//body/div[2]/form[1]/div[11]/div[1]/input[1]")).click();


    }
//    @AfterMethod
//    public void closeBrowser() {
//        driver.quit();
//
//    }
}
