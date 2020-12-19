//Package that contains all project object classes
package Objects;

//Libraries Used
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Blousespage {

	// Create an Object from WebDriver Interface
	WebDriver driver;

	// Constructor for Blouses Page
	public Blousespage(WebDriver driver) {
		this.driver = driver;
	}

	// Store Xpath for Item on an Object of By Class
	By Item = By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]");

	// Store Xpath for More Button on an Object of By Class
	By More = By.xpath("//span[contains(text(),'More')]");

	// Store Xpath for Add to Cart Button on an Object of By Class
	By Addtocart = By.xpath("//span[contains(text(),'Add to cart')]");

	// Store Xpath for Proceed to Check Out First Button on an Object of By Class
	By Checkout1 = By.xpath("//span[contains(text(),'Proceed to checkout')]");

	// Store Xpath for Proceed to Check Out Second Button (Summary) on an Object of
	// By Class
	By Checkout2 = By.xpath(
			"//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]");

	// Store Xpath for Proceed to Check Out Third Button (Address) on an Object of
	// By Class
	By Checkout3 = By.xpath("//button[@name='processAddress']//span[contains(text(),'Proceed to checkout')]");

	// Store Xpath for agree to the terms and conditions Checkbox on
	// an Object of By Class
	By Checkbox = By.xpath("//input[@id='cgv']");

	// Store Xpath for Check Out Fourth Button (Shipping) on an Object of
	// By Class
	By Checkout4 = By.xpath("//button[@name='processCarrier']//span[contains(text(),'Proceed to checkout')]");

	// Store Xpath for Pay by Bank Wire Button (Payment) on an Object of
	// By Class
	By Bankwire = By.xpath("//a[@class='bankwire']");

	// Store Xpath for Confirm Order Button after Choosing payment Method (Payment)
	// on an Object of
	// By Class
	By Confirmorder = By.xpath("//span[contains(text(),'I confirm my order')]");

	// Store Xpath for Order Details (Plus) Button under order reference table label
	// on an Object of By Class
	By Details = By.xpath("//span[@class='footable-toggle']");

	// Store CSS for Product Decription Field content for order history on an Object
	// of By Class
	By Productdesc = By.cssSelector("#order-detail-content > table > tbody > tr > td.bold > label");

	// Store Xpath for Order Details Button on an Object of By Class
	By Details2 = By.xpath("//tbody/tr[1]/td[7]/a[1]/span[1]");

	// Store Xpath for Order Reference Text that contains Reorder Button and Order
	// Status on an Object of By Class
	By Orderplaced = By.xpath("//p[@class='dark']");

	// Function that returns xpath for Item
	public WebElement Item() {
		return driver.findElement(Item);
	}

	// Function that returns xpath for More Button
	public WebElement More() {
		return driver.findElement(More);
	}

	// Function that returns xpath for Add to Cart Button
	public WebElement Addtocart() {
		return driver.findElement(Addtocart);
	}

	// Function that returns xpath for Proceed to Check Out First Button
	public WebElement Checkout1() {
		return driver.findElement(Checkout1);
	}

	// Function that returns xpath for Proceed to Check Out Second Button (Summary)
	public WebElement Checkout2() {
		return driver.findElement(Checkout2);
	}

	// Function that returns xpath for Proceed to Check Out Third Button (Address)
	public WebElement Checkout3() {
		return driver.findElement(Checkout3);
	}

	// Function that returns xpath for agree to the terms and conditions Checkbox
	public WebElement Checkbox() {
		return driver.findElement(Checkbox);
	}

	// Function that returns xpath for Check Out Fourth Button (Shipping)
	public WebElement Checkout4() {
		return driver.findElement(Checkout4);
	}

	// Function that returns xpath for Pay by Bank Wire Button (Payment)
	public WebElement Bankwire() {
		return driver.findElement(Bankwire);
	}

	// Function that returns xpath for Confirm Order Button after Choosing payment
	// Method (Payment)
	public WebElement Confirmorder() {
		return driver.findElement(Confirmorder);
	}

	// Function that returns xpath for Order Details (Plus) Button under order
	// reference table label
	public WebElement Details() {
		return driver.findElement(Details);
	}

	// Function that returns CSS for Product Decription Field content for order
	// history
	public WebElement Productdesc() {
		return driver.findElement(Productdesc);
	}

	// Function that returns xpath for Order Details Button
	public WebElement Details2() {
		return driver.findElement(Details2);
	}

	// Function that returns xpath for Order Status text label
	public WebElement Orderplaced() {
		return driver.findElement(Orderplaced);
	}
}
