package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WorkTypePage extends Utility {
    private static final Logger log = LogManager.getLogger(WorkTypePage.class.getName());


    public WorkTypePage() {

        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class='govuk-radios']//label")
    List<WebElement> planningToWorkTypes;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueButton;

    public void selectPlanningToWorkType(String workType) {
        log.info("Selecting planning to work type : " + planningToWorkTypes.toString());

        for (WebElement work : planningToWorkTypes) {
            if (work.getText().equalsIgnoreCase(workType)) {
                clickOnElement(work);

                break;
            }
        }
    }

    public void clickOnContinue() {
        log.info("Clicking on Continue : " + continueButton.toString());
        clickOnElement(continueButton);
    }

}
