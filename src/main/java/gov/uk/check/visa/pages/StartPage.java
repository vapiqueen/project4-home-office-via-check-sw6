package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class StartPage extends Utility {

    private static final Logger log = LogManager.getLogger(StartPage.class.getName());

    public StartPage() {PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath ="//a[normalize-space()='Start now']" )
    WebElement  StartNowButton;

    public void clickStartNow(){
       clickOnElement(StartNowButton);
        log.info("Clicking on start now button : " + StartNowButton.toString());
    }
    }

