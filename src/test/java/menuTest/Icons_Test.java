package menuTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

public class Icons_Test extends Hooks {

    @Test
    public void testDroppableAcceptance()  {
        pages.getHomePage().clickOnWebAutomationLink();
        BrowserUtils.scrollDownWithPageDown();
        pages.getWebAutomationPage().clickOnMenuLink();
        BrowserUtils.scrollUpWithPageUp();
        pages.getWebAutomationPage().clickOnIconsLink();
        BrowserUtils.wait(1);
        pages.getIconsPage().clickOnUnclickable();
        BrowserUtils.wait(2);


    }
}
