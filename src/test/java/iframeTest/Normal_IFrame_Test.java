package iframeTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

public class Normal_IFrame_Test extends Hooks {
    @Test
    public void testNormalIFrameFunctionality(){
        pages.getHomePage().clickOnWebAutomationLink();
        BrowserUtils.scrollDownWithPageDown();
        pages.getWebAutomationPage().clickOnIframeLink();
        BrowserUtils.scrollUpWithPageUp();
        pages.getWebAutomationPage().clickOnNormalIFrameLink();
        Assertions.assertEquals("Inar academy",pages.getNormalIFramePage().getHeaderTextOfNormalIFrame());
    }
}
