package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import utils.TestContextSetup;

public class LandingPageStepDefinition {

	public TestContextSetup testContextSetup;
	public LandingPage landingPage;
	public String LandingPageProductName;

	public LandingPageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.landingPage = testContextSetup.pageObjectManager.getLandingPage();
	}

	@Given("User is on GreentKart landing page")
	public void user_is_on_greent_kart_landing_page() {

	}

	@When("^User search for name (.+)$")
	public void user_search_for_name(String Name) throws InterruptedException {
		landingPage.searchItem(Name);
		Thread.sleep(2000);

		testContextSetup.LandingPageProductName = landingPage.getText().split("-")[0].trim();
		// System.out.println(LandingPageProductName);

	}
}