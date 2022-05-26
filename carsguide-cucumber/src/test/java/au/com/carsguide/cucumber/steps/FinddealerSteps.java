package au.com.carsguide.cucumber.steps;

import au.com.carsguide.pages.FindDealerPage;
import au.com.carsguide.pages.HomePage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

public class FinddealerSteps {

    @When("^I mouse hover on 'buy\\+sell' tab$")
    public void iMouseHoverOnBuySellTab() throws InterruptedException {
        new HomePage().mouseHoverONBuySell();
    }

    @And("^I click ‘Find a Dealer’$")
    public void iClickFindADealer() {
        new HomePage().clickOnFindDear();
    }

    @Then("^I navigate to ‘car-dealers’ page$")
    public void iNavigateToCarDealersPage() {
    }

    @And("^I should see the dealer names <dealersName> are display on page$")
    public void iShouldSeeTheDealerNamesDealersNameAreDisplayOnPage(DataTable table) {
        List<String> list = table.asList(String.class);
        String actualList = "";
        for (String e : list) {
            while (new FindDealerPage().getAllDealerList(e) == null) {
                new FindDealerPage().clickOnNextButton();
                break;

            }
        }

    }
}


