package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class LandingPage {
	public WebDriver driver;

	public LandingPage(WebDriver driver) {
		this.driver = driver;

	}

	private By search = By.xpath("//input[@type='search']");
	private By productName = By.cssSelector("h4.product-name");
	private By topDeals = By.linkText("Top Deals");
	private By increment = By.cssSelector("a.increment");
	private By addToCart = By.cssSelector(".product-action button");

	public void searchItem(String Name) {

		driver.findElement(search).sendKeys(Name);
		System.out.println("Hello first commit");
	}

	public String getText() {
		return driver.findElement(productName).getText();

	}

	public void SelectTopDealsPage() {

		driver.findElement(topDeals).click();
	}
}
