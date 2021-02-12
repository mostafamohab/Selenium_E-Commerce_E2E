//Package that contains all project object classes
package Objects;

//Libraries Used
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountpage {

	// Create an Object from WebDriver Interface
	WebDriver driver;

	// Constructor for My Account Page
	public MyAccountpage(WebDriver driver) {
		this.driver = driver;
	}

	// Store Xpath for Women Button on Menu on an Object of By Class
	By Women = By.xpath("//a[@class='sf-with-ul'][contains(text(),'Women')]");

	// Store Xpath for Blouses Submenu Under Women Button on Menu on an Object of By Class
	By Blouses = By
			.xpath("//ul[@class='submenu-container clearfix first-in-line-xs']//ul//li//a[contains(text(),'Blouses')]");

	// Store Xpath for My Account containing username Label on upper right corner on
	// an Object of By Class
	By Account = By.xpath("//a[@class='account']");

	// Store Xpath for Order History and Details Button on an Object of By Class
	By History = By.xpath("//span[contains(text(),'Order history and details')]");

	// Function that returns xpath for Women Button on Menu
	public WebElement women() {
		return driver.findElement(Women);
	}

	// Function that returns xpath for Blouses Submenu Under Women Button on Menu
	public WebElement blouses() {
		return driver.findElement(Blouses);
	}

	// Function that returns xpath for My Account containing username Label on upper right corner
	public WebElement account() {
		return driver.findElement(Account);
	}

	// Function that returns xpath for Order History and Details Button
	public WebElement history() {
		return driver.findElement(History);
	}
}