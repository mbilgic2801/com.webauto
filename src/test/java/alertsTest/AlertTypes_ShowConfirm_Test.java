package alertsTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.BrowserUtils;
import utils.Driver;


public class AlertTypes_ShowConfirm_Test extends Hooks {
    @Test
    public void testShowConfirm(){
        WebDriver driver = Driver.getDriver();
        pages.getHomePage().clickOnWebAutomationLink();
        BrowserUtils.scrollDownWithPageDown();
        pages.getWebAutomationPage().clickOnAlertsLink();
        BrowserUtils.scrollUpWithPageUp();
        pages.getAlertTypesPage().clickOnShowConfirmButton();
        BrowserUtils.wait(1);
        Assertions.assertEquals("Are you sure?",pages.getAlertTypesPage().getTextOfTheAlert());
        pages.getAlertTypesPage().confirmTheAlert();
        BrowserUtils.wait(1);
        Assertions.assertEquals("Confirmed!",pages.getAlertTypesPage().getTextOfTheAlert());
        BrowserUtils.wait(1);
        pages.getAlertTypesPage().confirmTheAlert();
        pages.getAlertTypesPage().clickOnShowConfirmButton();
        pages.getAlertTypesPage().cancelTheAlert();
        Assertions.assertNull(ExpectedConditions.alertIsPresent().apply(driver));



    }
}
