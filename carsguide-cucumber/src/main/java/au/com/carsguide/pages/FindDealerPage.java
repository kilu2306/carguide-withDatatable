package au.com.carsguide.pages;

import au.com.carsguide.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class FindDealerPage extends Utility {
    public FindDealerPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class=\"dealerListing--name\"]/child::a")
    List<WebElement> dealerlist;
    @CacheLookup
    @FindBy(xpath = "//span[@data-gtm-label=\"next\"]")
    WebElement nextButton;

    public String getAllDealerList(String name) {
    log.info("selecting dealer "+ dealerlist.toString());
        for (WebElement list : dealerlist) {
            String listOfDealer = list.getText();
            System.out.println(list.getText());
            if (listOfDealer.equalsIgnoreCase(name)) {
                return listOfDealer;
            }
        }
        return null;
    }

    public void clickOnNextButton() {
        clickOnElement(nextButton);
        log.info("clicking on next button "+ nextButton);
    }
}