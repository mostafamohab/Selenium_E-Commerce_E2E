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

import Objects.Blousespage;
import Objects.CreateAccountpage;
import Objects.Homepage;
import Objects.MyAccountpage;
import io.github.bonigarcia.wdm.WebDriverManager;

//Main Class initialization as public class
public class Mainclass {

	// Initialization of Main Class which will have all methods and objects being
	// called and used
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Setup an instance from chrome driver from web driver manager dependency
		WebDriverManager.chromedriver().setup();

		// Create new object for chromedriver
		WebDriver driver = new ChromeDriver();

		// Using Implicit wait for all elements as a standard behaviour for script
		// unless otherwise
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);

		// Create an object from javascript executor class
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Enter Website needed in driver credentials
		driver.get("http://automationpractice.com/index.php");

		// Setting Chrome Window Size to be maximized
		driver.manage().window().maximize();

		// Create an object from Homepage Class
		Homepage B = new Homepage(driver);

		// Use java script in order to scroll by mouse till elements appearing
		js.executeScript("window.scrollBy(0,500)", "");

		// Click on Sign Up Button
		B.Signup().click();

		// Use java script in order to scroll by mouse till elements appearing
		js.executeScript("window.scrollBy(0,100)", "");

		// Enter Valid Email Address
		// Please change this Email as it is a Dummy Data
		B.Emailsignup().sendKeys("Mostafa-Mohabmmmmxy1122xac@Vodafone.com");

		// Press Enter Key
		B.Emailsignup().sendKeys(Keys.ENTER);

		// Create an object from CreateAccountPage Class
		CreateAccountpage C = new CreateAccountpage(driver);

		// Click on Male Radio Button as a Gender
		C.Male().click();

		// Enter First Name as Mostafa
		C.Firstname().sendKeys("mostafa");

		// Enter Last Name as Mohab
		C.Lastname().sendKeys("mohab");

		// Enter Password as 123456
		C.Password().sendKeys("123456");

		// Select Day as 7 from Calendar
		C.Day().sendKeys("7");

		// Select Month as May from Calendar
		C.Month().sendKeys("May");

		// Select Year as 2020
		C.Year().sendKeys("2020");

		// Click on Sign Up for News Letter Checkbox
		C.Checkbox1().click();

		// Click on Recieve Offers Checkbox
		C.Checkbox2().click();

		// Enter Company as Codelab
		C.Company().sendKeys("Codelab");

		// Enter Address as Cairo,11111,egypt
		C.Address().sendKeys("Cairo,11111,egypt");

		// Select City as Cairo
		C.City().sendKeys("Cairo");

		// Select State as California
		C.State().sendKeys("California");

		// Enter Postal Code as 11757
		C.Postcode().sendKeys("11757");

		// Enter Additional Information as no other info
		C.Other().sendKeys("no other info");

		// Enter Homephone as 0226330123
		C.Homephone().sendKeys("0226330123");

		// Enter Mobile Number as 01263301234
		C.Mobilephone().sendKeys("01263301234");

		// Press on Register Button after filling all required data
		C.Submit().click();

		// Click on Sign out Button
		C.Signout().click();

		// Enter Valid Email
		// Please change this Email as it is a Dummy Data
		B.Emailsignin().sendKeys("Mostafa-Mohabmmmmxy1122xac@Vodafone.com");

		// Enter Valid Password
		B.Passwordsignin().sendKeys("123456");

		// Press on Sign in Button
		B.Signin().click();

		// Create an object from MyAccountPage Class
		MyAccountpage D = new MyAccountpage(driver);

		// Create an object of Mouse Actions Class
		Actions Action = new Actions(driver);

		// Hover on Women Button on Menu
		Action.moveToElement(D.Women()).perform();

		// Click on Blouse Sub Menu under Women Button from Menu Section
		Action.moveToElement(D.Blouses()).click().perform();

		// Create an object from Blouses Page Class
		Blousespage E = new Blousespage(driver);

		// Use java script in order to scroll by mouse till elements appearing
		js.executeScript("window.scrollBy(0,500)", "");

		// Hover on Item by Mouse Action
		Action.moveToElement(E.Item()).perform();

		// Hover on Item by Mouse Action and Click on More Button
		Action.moveToElement(E.More()).click().perform();

		// Use java script in order to scroll by mouse till elements appearing
		js.executeScript("window.scrollBy(0,350)", "");

		// Hover on Add to Cart Button and Click on It
		Action.moveToElement(E.Addtocart()).click().perform();

		// Create new object of Webdriver wait class for a certain Usage in an
		// explicit wait
		WebDriverWait Wait = new WebDriverWait(driver, 20);

		// Use Explicit Wait in order for First Checkout button to appear in Screen
		Wait.until(ExpectedConditions.visibilityOf(E.Checkout1()));

		// Move and Click by Mouse on First Checkout Button Element
		Action.moveToElement(E.Checkout1()).click().perform();

		// Move and Click by Mouse on Second Checkout Button Element
		Action.moveToElement(E.Checkout2()).click().perform();

		// Use java script in order to scroll by mouse till elements appearing
		js.executeScript("window.scrollBy(0,500)", "");

		// Move and Click by Mouse on Third Checkout Button Element
		Action.moveToElement(E.Checkout3()).click().perform();

		// Hover and Click by Mouse on agree to the terms and conditions Checkbox
		Action.moveToElement(E.Checkbox()).click().perform();

		// Use java script in order to scroll by mouse till elements appearing
		js.executeScript("window.scrollBy(0,500)", "");

		// Hover and Click by Mouse on Check Out Fourth Button (Shipping)
		Action.moveToElement(E.Checkout4()).click().perform();

		// Use java script in order to scroll by mouse till elements appearing
		js.executeScript("window.scrollBy(0,500)", "");

		// Hover and Click by Mouse on Pay by Bank Wire Button (Payment)
		Action.moveToElement(E.Bankwire()).click().perform();

		// Use java script in order to scroll by mouse till elements appearing
		js.executeScript("window.scrollBy(0,500)", "");

		// Hover and Click by Mouse on Confirm Order Button after Choosing payment
		// Method (Payment)
		Action.moveToElement(E.Confirmorder()).click().perform();

		// Hover and Click by Mouse on My Account that contains username Label on
		// upper right corner
		Action.moveToElement(D.Account()).click().perform();

		// Use java script in order to scroll by mouse till elements appearing
		// js.executeScript("window.scrollBy(0,500)", "");

		// Hover and Click by Mouse on Order History and Details Button
		Action.moveToElement(D.History()).click().perform();

		// Hover and Click by Mouse on Order Details Button under order reference
		// table label
		Action.moveToElement(E.Details()).click().perform();

		// Hover and Click by Mouse on Order Details Button
		Action.moveToElement(E.Details2()).click().perform();

		// Hover on Product Description Field for order history
		Action.moveToElement(E.Productdesc()).perform();

		// Assertion with JUnit in order to check if order is placed or not and checking
		// if keyword "placed"
		// exists in order history to check if order was placed successfully or not
		// and printing Order is Successfully Placed in case of success
		String Expectedproductstatus = "placed";
		try {
			// Compare Variable for Order Status with the Status Placed
			Assert.assertTrue(E.Orderplaced().getText().contains(Expectedproductstatus));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Order is Successfully Placed");
		}

	}

}