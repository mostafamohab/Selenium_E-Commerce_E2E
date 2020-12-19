//Package that contains all project object classes
package Objects;

//Libraries Used
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {

	// Create an Object from WebDriver Interface
	WebDriver driver;

	// Constructor for Homepage
	public Homepage(WebDriver driver) {
		this.driver = driver;
	}

	// Store Xpath for Signin button in the Upper Right Corner for Homepage on an
	// Object of By
	// Classt
	By Signup = By.xpath("//a[@class='login']");

	// Store Xpath for Email Text Field above Sign Up Button on an Object of By
	// Class
	By Emailsignup = By.xpath("//input[@id='email_create']");

	// Store Xpath for Email Text Field above Password Text Field and Sign In Button
	// on an Object of By
	// Class
	By Emailsignin = By.xpath("//input[@id='email']");

	// Store Xpath for Password Text Field above Sign In Button on an Object of By
	// Class
	By Passwordsignin = By.xpath("//input[@id='passwd']");

	// Store Xpath for Sign In Button on an Object of By
	// Class
	By Signin = By.xpath("//p[@class='submit']//span[1]");

	// Function that returns xpath for Signin button in the Upper Right Corner for
	// Homepage
	public WebElement Signup() {
		return driver.findElement(Signup);
	}

	// Function that returns xpath for Email Text Field in Create New Account
	// Section
	public WebElement Emailsignup() {
		return driver.findElement(Emailsignup);
	}

	// Function that returns xpath for Email Text Field above Password Text Field
	// and Sign In Button
	public WebElement Emailsignin() {
		return driver.findElement(Emailsignin);
	}

	// Function that returns xpath for Password Field above Sign In Button
	public WebElement Passwordsignin() {
		return driver.findElement(Passwordsignin);
	}

	// Function that returns xpath for Signin button if user is already registered
	public WebElement Signin() {
		return driver.findElement(Signin);
	}
}