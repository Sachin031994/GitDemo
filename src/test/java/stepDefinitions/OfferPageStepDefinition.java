package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import pageObjects.OfferPage;
import utils.TestContextSetup;

public class OfferPageStepDefinition {

	public TestContextSetup testContextSetup;
	public LandingPage landingPage;
	public OfferPage offerPage;
	public String OfferPageProductName;

	public OfferPageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.landingPage = testContextSetup.pageObjectManager.getLandingPage();
		this.offerPage = testContextSetup.pageObjectManager.getOfferPage();
	}

	@When("^User serach for the same name (.+) on Offers page$")
	public void user_serach_for_the_same_name_tom_on_offers_page(String name) throws InterruptedException {
		testContextSetup.pageObjectManager.landingPage.SelectTopDealsPage();
		testContextSetup.genericutils.SwitchWindowChild();
		Thread.sleep(3000);
		offerPage.searchItem(name);

	}

	@Then("User comepares the product")
	public void user_comepares_the_product() throws InterruptedException {
		Thread.sleep(2000);
		OfferPageProductName = offerPage.getProductName();
		System.out.println(OfferPageProductName);
		System.out.println(testContextSetup.LandingPageProductName);
		Assert.assertEquals(OfferPageProductName, testContextSetup.LandingPageProductName);
		testContextSetup.genericutils.SwitchwindowParent();
		// LandingPageProductName;
	}
}
