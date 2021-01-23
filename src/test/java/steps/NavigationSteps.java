package steps;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HomePage;

public class NavigationSteps {

  HomePage homePage = new HomePage();

  @When("user navigate to homePage")
  public void userNavigateToHomePage() {
    System.out.println("step1");
    homePage.navigate();
  }

  @Then("title of homePage is {string}")
  public void titleOfHomePageIs(String title) {
    System.out.println("step2");
    assertEquals(title, homePage.getTitle());
  }

  @And("login form is present")
  public void loginFormIsPresent() {
    System.out.println("step3");
    assertTrue(homePage.isLoginFormPresent());
  }

  @Given("user is on homePage")
  public void userIsOnHomePage() {
    throw new ArithmeticException("Failed step");
  }

  @When("user click on newToursButton")
  public void userClickOnNewToursButton() {
  }

  @Then("title of newToursPage is {string}")
  public void titleOfNewToursPageIs(String arg0) {
  }

  @And("main fragment is present")
  public void mainFragmentIsPresent() {
  }

}
