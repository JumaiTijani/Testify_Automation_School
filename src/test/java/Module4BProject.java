import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
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
    public void parabank() {
        //visit  https://parabank.parasoft.com/
        driver.get("https://parabank.parasoft.com/");
        // Click on Register
        driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
        //Input First Name
        driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys("Beanie");
        //Input Last Name
        driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys("Adams");
        //Input Address
        driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys("M10 westside");
        //Input City
        driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys("Ikeja");
        //Input State
        driver.findElement(By.xpath("//input[@id='customer.address.state']")).sendKeys("Lagos");
        //Input Zip Code
        driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys("200367");
        //Input Phone Number
        driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys("8091726833");
        //Input SSN
        driver.findElement(By.xpath("//input[@id='customer.ssn']")).sendKeys("873562836");
        //Input Username
        driver.findElement(By.xpath("//input[@id='customer.username']")).sendKeys("beandams");
        //Input Password
        driver.findElement(By.xpath("//input[@id='customer.password']")).sendKeys("P@ssw0rd");
        //Confirm Password
        driver.findElement(By.xpath("//input[@id='repeatedPassword']")).sendKeys("P@ssw0rd");
        //Click Register
        driver.findElement(By.xpath("//tbody/tr[13]/td[2]/input[1]")).click();

        //Assert that the user sees the text ‘Welcome<Username>’ Your account was created successfully. You are now logged in.
        WebElement text = driver.findElement(By.xpath("//p[contains(text(),'Your account was created successfully. You are now')]"));

        String  welcomeText = text.getText();

       SoftAssert successMessage = new SoftAssert();
        successMessage.assertEquals("Your account was created successfully. You are now logged in.", welcomeText);
        successMessage.assertAll();

        //Click on Open New Account
        driver.findElement(By.xpath("//a[contains(text(),'Open New Account')]")).click();

        //Open a new savings account
        //Get Account list
        WebElement account = driver.findElement(By.xpath("//select[@id='type']"));
        //Select Savings
        Select accountType = new Select(account);
        accountType.selectByVisibleText("SAVINGS");
        //Click on Open New Account
        driver.findElement(By.xpath("//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='rightPanel']/div[1]/div[1]/form[1]/div[1]/input[1]")).click();

    }

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
    @AfterMethod
    public void closeBrowser() {
        driver.quit();

    }
}
