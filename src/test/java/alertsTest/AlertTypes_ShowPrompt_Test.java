package alertsTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

public class AlertTypes_ShowPrompt_Test extends Hooks {
    @Test
    public void testShowPrompt() {
        pages.getHomePage().clickOnWebAutomationLink();
        BrowserUtils.scrollDownWithPageDown();
        pages.getWebAutomationPage().clickOnAlertsLink();
        BrowserUtils.scrollUpWithPageUp();
        pages.getAlertTypesPage().clickOnShowPromptButton();
        BrowserUtils.wait(1);
        String name = "Mehmet";
        pages.getAlertTypesPage().enterInputIntoAlert(name);
        pages.getAlertTypesPage().confirmTheAlert();
        Assertions.assertEquals(pages.getAlertTypesPage().getTextOfTheAlert(),("Hello, "+name+"!"));
        BrowserUtils.wait(2);
    }
}
