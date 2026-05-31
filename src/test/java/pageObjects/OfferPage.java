package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OfferPage {

	public WebDriver driver;

	public OfferPage(WebDriver driver) {
		this.driver = driver;

	}

	private By search = By.xpath("//input[@type='search']");
	private By productName = By.cssSelector("tbody tr td:nth-child(1)");

	public void searchItem(String Name) {

		driver.findElement(search).sendKeys(Name);
	}

	public String getProductName() throws InterruptedException {

		return driver.findElement(productName).getText();
	}
}
