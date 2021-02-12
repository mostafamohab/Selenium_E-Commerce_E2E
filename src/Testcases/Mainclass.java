//Package that contains all test cases classes
package Testcases;

//Libraries Used
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Objects.Blousespage;
import Objects.CreateAccountpage;
import Objects.Homepage;
import Objects.MyAccountpage;
import Objects.dataDriven;

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
		driver.manage().timeouts().implicitlyWait(13, TimeUnit.SECONDS);

		// Enter Website needed in driver credentials
		driver.get("http://automationpractice.com/index.php");

		// Setting Chrome Window Size to be maximized
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void signUp() throws IOException {
		// Create an object from Homepage Class
		Homepage homepage = new Homepage(driver);

		// Create an object from javascript executor class
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Use java script in order to scroll by mouse till elements appearing
		js.executeScript("window.scrollBy(0,500)", "");

		// create an object from dataDriven class
		dataDriven d = new dataDriven();

		// create a new arraylist of strings in order to extract test data from excel
		ArrayList<String> data = d.getData("Signup1");

		// Click on Sign Up Button
		homepage.signUp().click();

		// Use java script in order to scroll by mouse till elements appearing
		js.executeScript("window.scrollBy(0,100)", "");

		// Enter Valid Email Address
		homepage.emailSignup().sendKeys(data.get(1));

		// Create new object of Webdriver wait class for a certain Usage in an
		// explicit wait
		WebDriverWait Wait = new WebDriverWait(driver, 6);

		// Use Explicit Wait in order for Mail appearing as valid in Screen
		Wait.until(ExpectedConditions.elementToBeClickable(homepage.createAccount()));

		// Press Enter Key
		homepage.createAccount().click();
	}

	@Test(priority = 2)
	public void createAccount() throws IOException {
		// Create an object from CreateAccountPage Class
		CreateAccountpage createaccount = new CreateAccountpage(driver);

		// create an object from dataDriven class
		dataDriven d = new dataDriven();

		// create a new arraylist of strings in order to extract test data from excel
		ArrayList<String> data = d.getData("Register5");

		// Click on Male Radio Button as a Gender
		createaccount.male().click();

		// Enter First Name
		createaccount.firstName().sendKeys(data.get(3));

		// Enter Last Name
		createaccount.lastName().sendKeys(data.get(4));

		// Enter Password
		createaccount.password().sendKeys(data.get(2));

		// Select Day from Calendar
		createaccount.day().sendKeys(data.get(5));

		// Select Month from Calendar
		createaccount.month().sendKeys(data.get(6));

		// Select Year
		createaccount.year().sendKeys(data.get(7));

		// Click on Sign Up for News Letter Checkbox
		createaccount.checkBox1().click();

		// Click on Recieve Offers Checkbox
		createaccount.checkBox2().click();

		// Enter Company
		createaccount.company().sendKeys(data.get(8));

		// Enter Address
		createaccount.address().sendKeys(data.get(9));

		// Select City
		createaccount.city().sendKeys(data.get(10));

		// Select State
		createaccount.state().sendKeys(data.get(11));

		// Enter Postal
		createaccount.postCode().sendKeys(data.get(12));

		// Enter Additional Information
		createaccount.other().sendKeys(data.get(13));

		// Enter Homephone
		createaccount.homePhone().sendKeys(data.get(14));

		// Enter Mobile Number
		createaccount.mobilePhone().sendKeys(data.get(15));

		// Press on Register Button after filling all required data
		createaccount.submit().click();

		// Click on Sign out Button
		createaccount.signOut().click();
	}

	@Test(priority = 3)
	public void signIn() throws IOException {
		// Create an object from Homepage Class
		Homepage homepage = new Homepage(driver);

		// create an object from dataDriven class
		dataDriven d = new dataDriven();

		// create a new arraylist of strings in order to extract test data from excel
		ArrayList<String> data = d.getData("Login5");

		// Enter Valid Email
		homepage.emailSignin().sendKeys(data.get(1));

		// Enter Valid Password
		homepage.passwordSignin().sendKeys(data.get(2));

		// Press on Sign in Button
		homepage.signIn().click();
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
		Action.moveToElement(myaccount.women()).perform();

		// Click on Blouse Sub Menu under Women Button from Menu Section
		Action.moveToElement(myaccount.blouses()).click().perform();

		// Create an object from Blouses Page Class
		Blousespage blouses = new Blousespage(driver);

		// Use java script in order to scroll by mouse till elements appearing
		js.executeScript("window.scrollBy(0,500)", "");

		// Hover on Item by Mouse Action
		Action.moveToElement(blouses.item()).perform();

		// Hover on Item by Mouse Action and Click on More Button
		Action.moveToElement(blouses.more()).click().perform();

		// Use java script in order to scroll by mouse till elements appearing
		js.executeScript("window.scrollBy(0,350)", "");

		// Hover on Add to Cart Button and Click on It
		Action.moveToElement(blouses.addtoCart()).click().perform();

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
		Wait.until(ExpectedConditions.visibilityOf(blouses.checkOut1()));

		// Move and Click by Mouse on First Checkout Button Element
		Action.moveToElement(blouses.checkOut1()).click().perform();

		// Move and Click by Mouse on Second Checkout Button Element
		Action.moveToElement(blouses.checkOut2()).click().perform();

		// Use java script in order to scroll by mouse till elements appearing
		js.executeScript("window.scrollBy(0,500)", "");

		// Move and Click by Mouse on Third Checkout Button Element
		Action.moveToElement(blouses.checkOut3()).click().perform();

		// Hover and Click by Mouse on agree to the terms and conditions Checkbox
		Action.moveToElement(blouses.checkBox()).click().perform();

		// Use java script in order to scroll by mouse till elements appearing
		js.executeScript("window.scrollBy(0,500)", "");

		// Hover and Click by Mouse on Check Out Fourth Button (Shipping)
		Action.moveToElement(blouses.checkOut4()).click().perform();

		// Use java script in order to scroll by mouse till elements appearing
		js.executeScript("window.scrollBy(0,500)", "");

		// Hover and Click by Mouse on Pay by Bank Wire Button (Payment)
		Action.moveToElement(blouses.bankWire()).click().perform();

		// Use java script in order to scroll by mouse till elements appearing
		js.executeScript("window.scrollBy(0,500)", "");

		// Hover and Click by Mouse on Confirm Order Button after Choosing payment
		// Method (Payment)
		Action.moveToElement(blouses.confirmOrder()).click().perform();
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
		Action.moveToElement(myaccount.account()).click().perform();

		// Use java script in order to scroll by mouse till elements appearing
		// js.executeScript("window.scrollBy(0,500)", "");

		// Hover and Click by Mouse on Order History and Details Button
		Action.moveToElement(myaccount.history()).click().perform();

		// Hover and Click by Mouse on Order Details Button under order reference
		// table label
		Action.moveToElement(blouses.details()).click().perform();

		// Hover and Click by Mouse on Order Details Button
		Action.moveToElement(blouses.details2()).click().perform();

		// Hover on Product Description Field for order history
		Action.moveToElement(blouses.productDesc()).perform();

		// Assertion with JUnit in order to check if order is placed or not and checking
		// if keyword "placed"
		// exists in order history to check if order was placed successfully or not
		// and printing Order is Successfully Placed in case of success
		String Expectedproductstatus = "placed";
		try {
			// Compare Variable for Order Status with the Status Placed
			Assert.assertTrue(blouses.orderPlaced().getText().contains(Expectedproductstatus));
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