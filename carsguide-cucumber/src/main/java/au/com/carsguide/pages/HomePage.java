package au.com.carsguide.pages;

import au.com.carsguide.utilities.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    public static final Logger log = LogManager.getLogger(HomePage.class.getName());
    public HomePage() {
        PageFactory.initElements(driver,this);

    }
    @CacheLookup
    @FindBy(xpath = "//a[@data-gtm-label='top nav car buy and sell']")
    WebElement buysell;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Search Cars']")
    WebElement searchCar;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Used']")
    WebElement usedCar;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Find a Dealer']")
    WebElement finddealer;

    public void mouseHoverONBuySell() throws InterruptedException {
        Thread.sleep(6000);
        mouseHoverToElement(buysell);
        log.info("Mouse Hover on name :"+ searchCar.toString());
            }


    public void clickOnSearchCar() throws InterruptedException {
        Thread.sleep(4000);
        clickOnElement(searchCar);
        log.info("click on search car :"+ searchCar.toString());
    }

    public void clickOnUsedCar(){
        clickOnElement(usedCar);
        log.info("click on used car :"+ usedCar);
    }

    public void clickOnFindDear(){
        clickOnElement(finddealer);
        log.info("click on find delaer");
    }
}
