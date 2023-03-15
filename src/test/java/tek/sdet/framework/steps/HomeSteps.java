package tek.sdet.framework.steps;

import org.junit.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import tek.sdet.framework.pages.POMFactory;
import tek.sdet.framework.utilities.CommonUtility;

public class HomeSteps extends CommonUtility {

	POMFactory factory = new POMFactory();

	@Given("User is on retail website")
	public void userIsOnRetailWebsite() {
		String actualTitle = getTitle();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String expectedTitle = "React App";
		Assert.assertEquals(actualTitle, expectedTitle);
		Assert.assertTrue(isElementDisplayed(factory.homePage().tekshoolLogo));
		logger.info("User is on retail website");
		logger.info("Actual title  " + actualTitle + " Equals expected title " + expectedTitle);
	}

	@When("User search for {string} item")
	public void userSearchForItem(String value) {
		sendText(factory.homePage().searchBarInput, value);
		click(factory.homePage().searchButton);
		logger.info("User searched for " + value + " item");
	}

	@Then("Product should be displayed")
	public void productShouldBeDisplayed() {
		Assert.assertTrue(isElementDisplayed(factory.homePage().pokemonImage));
		logger.info("Product is displayed");

	}

}
