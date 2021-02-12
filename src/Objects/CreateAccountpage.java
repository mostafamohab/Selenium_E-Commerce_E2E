//Package that contains all project object classes
package Objects;

//Libraries Used
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateAccountpage {

	// Create an Object from WebDriver Interface
	WebDriver driver;

	// Constructor for Create Account Page
	public CreateAccountpage(WebDriver driver) {
		this.driver = driver;
	}

	// Store Xpath for Male Radio Button Field on an Object of By Class
	By Male = By.xpath("//input[@name='id_gender'][@id='id_gender1']");

	// Store Xpath for Female Radio Button Field on an Object of By Class
	By Female = By.xpath("//input[@name='id_gender'][@id='id_gender2']");

	// Store Xpath for First Name Text Field on an Object of By Class
	By Firstname = By.xpath("//input[@id='customer_firstname']");

	// Store Xpath for Last Name Text Field on an Object of By Class
	By Lastname = By.xpath("//input[@id='customer_lastname']");

	// Store Xpath for Password Text Field on an Object of By Class
	By Password = By.xpath("//input[@id='passwd']");

	// Store Xpath for Day Drop Down List Field on an Object of By Class
	By Day = By.xpath("//select[@id='days']");

	// Store Xpath for Month Drop Down List Field on an Object of By Class
	By Month = By.xpath("//select[@id='months']");

	// Store Xpath for Year Drop Down List Field on an Object of By Class
	By Year = By.xpath("//select[@id='years']");

	// Store Xpath for Sign Up for News Letter Checkbox on an Object of By Class
	By Checkbox1 = By.xpath("//input[@id='newsletter']");

	// Store Xpath for Recieve Special Offers Checkbox on an Object of By Class
	By Checkbox2 = By.xpath("//input[@id='optin']");

	// Store Xpath for Company Text Field on an Object of By Class
	By Company = By.xpath("//input[@id='company']");

	// Store Xpath for Address Text Field on an Object of By Class
	By Address = By.xpath("//input[@id='address1']");

	// Store Xpath for City Text Field on an Object of By Class
	By City = By.xpath("//input[@id='city']");

	// Store Xpath for State Drop Down List Field on an Object of By Class
	By State = By.xpath("//select[@id='id_state']");

	// Store Xpath for Postcode Text Field on an Object of By Class
	By Postcode = By.xpath("//input[@id='postcode']");

	// Store Xpath for Additional Information Text Field on an Object of By Class
	By Other = By.xpath("//textarea[@id='other']");

	// Store Xpath for Home phone Text Field on an Object of By Class
	By Homephone = By.xpath("//input[@id='phone']");

	// Store Xpath for Mobile phone Text Field on an Object of By Class
	By Mobilephone = By.xpath("//input[@id='phone_mobile']");

	// Store Xpath for Register Button after filling all required data on an Object
	// of By Class
	By Submit = By.xpath("//button[@id='submitAccount']");

	// Store Xpath for Signout Button on an Object of By Class
	By Signout = By.xpath("//a[@class='logout']");

	// Function that returns xpath for Male Radio Button Field
	public WebElement male() {
		return driver.findElement(Male);
	}

	// Function that returns xpath for First Name Text Field
	public WebElement firstName() {
		return driver.findElement(Firstname);
	}

	// Function that returns xpath for Last Name Text Field
	public WebElement lastName() {
		return driver.findElement(Lastname);
	}

	// Function that returns xpath for Password Text Field
	public WebElement password() {
		return driver.findElement(Password);
	}

	// Function that returns xpath for Day Drop Down List Field
	public WebElement day() {
		return driver.findElement(Day);
	}

	// Function that returns xpath for Month Drop Down List Field
	public WebElement month() {
		return driver.findElement(Month);
	}

	// Function that returns xpath for Year Drop Down List Field
	public WebElement year() {
		return driver.findElement(Year);
	}

	// Function that returns xpath for Sign Up for News Letter Checkbox
	public WebElement checkBox1() {
		return driver.findElement(Checkbox1);
	}

	// Function that returns xpath for Recieve Special Offers Checkbox
	public WebElement checkBox2() {
		return driver.findElement(Checkbox2);
	}

	// Function that returns xpath for Company Text Field
	public WebElement company() {
		return driver.findElement(Company);
	}

	// Function that returns xpath for Address Text Field
	public WebElement address() {
		return driver.findElement(Address);
	}

	// Function that returns xpath for City Text Field
	public WebElement city() {
		return driver.findElement(City);
	}

	// Function that returns xpath for State Drop Down List Field
	public WebElement state() {
		return driver.findElement(State);
	}

	// Function that returns xpath for Postcode Text Field
	public WebElement postCode() {
		return driver.findElement(Postcode);
	}

	// Function that returns xpath for Additional Information Text Field
	public WebElement other() {
		return driver.findElement(Other);
	}

	// Function that returns xpath for Home phone Text Field
	public WebElement homePhone() {
		return driver.findElement(Homephone);
	}

	// Function that returns xpath for Mobile phone Text Field
	public WebElement mobilePhone() {
		return driver.findElement(Mobilephone);
	}

	// Function that returns xpath for Register Button after filling all required
	// data
	public WebElement submit() {
		return driver.findElement(Submit);
	}

	// Function that returns xpath for Sign Out button
	public WebElement signOut() {
		return driver.findElement(Signout);
	}
}