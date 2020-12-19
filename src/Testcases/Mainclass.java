//Package that contains all test cases classes
package Testcases;

//Libraries Used
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

import Objects.Blousespage;
import Objects.CreateAccountpage;
import Objects.Homepage;
import Objects.MyAccountpage;

//Main Class initialization as public class
public class Mainclass {

	WebDriver driver;

	@BeforeSuite
	public void setUp() {

		// Setup an instance from chrome driver from web driver manager dependency
		WebDriverManager.chromedriver().setup();

		// Create new object for chromedriver
		driver = new ChromeDriver();

		// Using Implicit wait for all elements as a standard behaviour for script
		// unless otherwise
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

		// Enter Website needed in driver credentials
		driver.get("http://automationpractice.com/index.php");

		// Setting Chrome Window Size to be maximized
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void signUp() {

		// Create an object from Homepage Class
		Homepage homepage = new Homepage(driver);

		// Create an object from javascript executor class
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Use java script in order to scroll by mouse till elements appearing
		js.executeScript("window.scrollBy(0,500)", "");

		// Click on Sign Up Button
		homepage.Signup().click();

		// Use java script in order to scroll by mouse till elements appearing
		js.executeScript("window.scrollBy(0,100)", "");

		// Enter Valid Email Address
		// Please change this Email as it is a Dummy Data
		homepage.Emailsignup().sendKeys("Mostafa-Mohab12mmmm@gmail.com");

		// Press Enter Key
		homepage.Emailsignup().sendKeys(Keys.ENTER);
	}

	@Test(priority = 2)
	public void createAccount() {
		// Create an object from CreateAccountPage Class
		CreateAccountpage createaccount = new CreateAccountpage(driver);

		// Click on Male Radio Button as a Gender
		createaccount.Male().click();

		// Enter First Name as Mostafa
		createaccount.Firstname().sendKeys("mostafa");

		// Enter Last Name as Mohab
		createaccount.Lastname().sendKeys("mohab");

		// Enter Password as 123456
		createaccount.Password().sendKeys("123456");

		// Select Day as 7 from Calendar
		createaccount.Day().sendKeys("7");

		// Select Month as May from Calendar
		createaccount.Month().sendKeys("May");

		// Select Year as 2020
		createaccount.Year().sendKeys("2020");

		// Click on Sign Up for News Letter Checkbox
		createaccount.Checkbox1().click();

		// Click on Recieve Offers Checkbox
		createaccount.Checkbox2().click();

		// Enter Company as Codelab
		createaccount.Company().sendKeys("Codelab");

		// Enter Address as Cairo,11111,egypt
		createaccount.Address().sendKeys("Cairo,11111,egypt");

		// Select City as Cairo
		createaccount.City().sendKeys("Cairo");

		// Select State as California
		createaccount.State().sendKeys("California");

		// Enter Postal Code as 11757
		createaccount.Postcode().sendKeys("11757");

		// Enter Additional Information as no other info
		createaccount.Other().sendKeys("no other info");

		// Enter Homephone as 0226330123
		createaccount.Homephone().sendKeys("0226330123");

		// Enter Mobile Number as 01263301234
		createaccount.Mobilephone().sendKeys("01263301234");

		// Press on Register Button after filling all required data
		createaccount.Submit().click();

		// Click on Sign out Button
		createaccount.Signout().click();
	}

	@Test(priority = 3)
	public void signIn() {

		// Create an object from Homepage Class
		Homepage homepage = new Homepage(driver);

		// Enter Valid Email
		// Please change this Email as it is a Dummy Data
		homepage.Emailsignin().sendKeys("Mostafa-Mohab12mmmm@gmail.com");

		// Enter Valid Password
		homepage.Passwordsignin().sendKeys("123456");

		// Press on Sign in Button
		homepage.Signin().click();
	}

	@Test(priority = 4)
	public void addtoCart() {

		// Create an object from javascript executor class
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Create an object from MyAccountPage Class
		MyAccountpage myaccount = new MyAccountpage(driver);

		// Create an object of Mouse Actions Class
		Actions Action = new Actions(driver);

		// Hover on Women Button on Menu
		Action.moveToElement(myaccount.Women()).perform();

		// Click on Blouse Sub Menu under Women Button from Menu Section
		Action.moveToElement(myaccount.Blouses()).click().perform();

		// Create an object from Blouses Page Class
		Blousespage blouses = new Blousespage(driver);

		// Use java script in order to scroll by mouse till elements appearing
		js.executeScript("window.scrollBy(0,500)", "");

		// Hover on Item by Mouse Action
		Action.moveToElement(blouses.Item()).perform();

		// Hover on Item by Mouse Action and Click on More Button
		Action.moveToElement(blouses.More()).click().perform();

		// Use java script in order to scroll by mouse till elements appearing
		js.executeScript("window.scrollBy(0,350)", "");

		// Hover on Add to Cart Button and Click on It
		Action.moveToElement(blouses.Addtocart()).click().perform();

	}

	@Test(priority = 5)
	public void cartCheckout() {

		// Create an object from javascript executor class
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Create an object from Blouses Page Class
		Blousespage blouses = new Blousespage(driver);

		// Create an object of Mouse Actions Class
		Actions Action = new Actions(driver);

		// Create new object of Webdriver wait class for a certain Usage in an
		// explicit wait
		WebDriverWait Wait = new WebDriverWait(driver, 20);

		// Use Explicit Wait in order for First Checkout button to appear in Screen
		Wait.until(ExpectedConditions.visibilityOf(blouses.Checkout1()));

		// Move and Click by Mouse on First Checkout Button Element
		Action.moveToElement(blouses.Checkout1()).click().perform();

		// Move and Click by Mouse on Second Checkout Button Element
		Action.moveToElement(blouses.Checkout2()).click().perform();

		// Use java script in order to scroll by mouse till elements appearing
		js.executeScript("window.scrollBy(0,500)", "");

		// Move and Click by Mouse on Third Checkout Button Element
		Action.moveToElement(blouses.Checkout3()).click().perform();

		// Hover and Click by Mouse on agree to the terms and conditions Checkbox
		Action.moveToElement(blouses.Checkbox()).click().perform();

		// Use java script in order to scroll by mouse till elements appearing
		js.executeScript("window.scrollBy(0,500)", "");

		// Hover and Click by Mouse on Check Out Fourth Button (Shipping)
		Action.moveToElement(blouses.Checkout4()).click().perform();

		// Use java script in order to scroll by mouse till elements appearing
		js.executeScript("window.scrollBy(0,500)", "");

		// Hover and Click by Mouse on Pay by Bank Wire Button (Payment)
		Action.moveToElement(blouses.Bankwire()).click().perform();

		// Use java script in order to scroll by mouse till elements appearing
		js.executeScript("window.scrollBy(0,500)", "");

		// Hover and Click by Mouse on Confirm Order Button after Choosing payment
		// Method (Payment)
		Action.moveToElement(blouses.Confirmorder()).click().perform();
	}

	@Test(priority = 6)
	public void checkOrderDetails() {

		// Create an object from Blouses Page Class
		Blousespage blouses = new Blousespage(driver);

		// Create an object from MyAccountPage Class
		MyAccountpage myaccount = new MyAccountpage(driver);

		// Create an object of Mouse Actions Class
		Actions Action = new Actions(driver);

		// Hover and Click by Mouse on My Account that contains username Label on
		// upper right corner
		Action.moveToElement(myaccount.Account()).click().perform();

		// Use java script in order to scroll by mouse till elements appearing
		// js.executeScript("window.scrollBy(0,500)", "");

		// Hover and Click by Mouse on Order History and Details Button
		Action.moveToElement(myaccount.History()).click().perform();

		// Hover and Click by Mouse on Order Details Button under order reference
		// table label
		Action.moveToElement(blouses.Details()).click().perform();

		// Hover and Click by Mouse on Order Details Button
		Action.moveToElement(blouses.Details2()).click().perform();

		// Hover on Product Description Field for order history
		Action.moveToElement(blouses.Productdesc()).perform();

		// Assertion with JUnit in order to check if order is placed or not and checking
		// if keyword "placed"
		// exists in order history to check if order was placed successfully or not
		// and printing Order is Successfully Placed in case of success
		String Expectedproductstatus = "placed";
		try {
			// Compare Variable for Order Status with the Status Placed
			Assert.assertTrue(blouses.Orderplaced().getText().contains(Expectedproductstatus));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Order is Successfully Placed");
		}
	}

	@AfterSuite
	public void tearDown() {
		driver.quit();
	}

}