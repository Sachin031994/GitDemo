package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

	public LandingPage landingPage;
	public WebDriver driver;
	public OfferPage offerPage;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public LandingPage getLandingPage() {
		landingPage = new LandingPage(driver);
		return landingPage;

	}

	public OfferPage getOfferPage() {
		offerPage = new OfferPage(driver);
		return offerPage;

	}

}
