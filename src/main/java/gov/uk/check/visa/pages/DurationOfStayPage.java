package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class DurationOfStayPage extends Utility {
    private static final Logger log = LogManager.getLogger(DurationOfStayPage.class.getName());

    public DurationOfStayPage() {
        PageFactory.initElements(driver, this);

    }

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement nextStepButton;

    @CacheLookup
    @FindBy(id = "response-0")
    WebElement lessThanSixMonth;

    @CacheLookup
    @FindBy(id = "response-1")
    WebElement moreThanSixMonth;

    public void selectLengthOfStay(String moreOrLess) {
        switch (moreOrLess) {
            case "longer than 6 months":
                clickOnElement(moreThanSixMonth);
                break;
            case "6 months or less":
                clickOnElement(lessThanSixMonth);
                break;
            default:
                //System.out.println("Selection is wrong");
        }

    }

    public void clickNextStepButton() {
        clickOnElement(nextStepButton);
        log.info("Clicking on Next Step Button : " + nextStepButton.toString());
    }
}
