package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ReasonForTravelPage extends Utility {
    private static final Logger log = LogManager.getLogger(ReasonForTravelPage.class.getName());
    public ReasonForTravelPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class='govuk-radios']//label")
    List<WebElement> reasonForVisit;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement coninueButton;

    public void selectReasonForVisit(String reason) {
        log.info("selecting Reason for visit : " + reasonForVisit.toString());
        for (WebElement selectReason : reasonForVisit) {
            if (selectReason.getText().equalsIgnoreCase(reason)) {
                clickOnElement(selectReason);
                break;
            }

        }

    }
    public void clickNextStepButton(){
        log.info("Clicking on next Step Button : " );
    }
}
