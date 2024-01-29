package controlGroupTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ToolbarTest extends Hooks {
    @Test
    public void testToolbarFunctions(){
        pages.getHomePage().clickOnWebAutomationLink();
        pages.getWebAutomationPage().clickOnControlGroupLink();
        pages.getWebAutomationPage().clickOnToolbarLink();
//        pages.getToolbarPage().clickOnZoom(2);
        pages.getToolbarPage().prepareTheDocument(2,4,4,true,true,true);
//        BrowserUtils.wait(5);
//        Assertions.assertTrue(pages.getToolbarPage().isDocumentPreparedAsWanted());
        for (int i = 1; i < 8 ; i++) {
            pages.getToolbarPage().clickOnColor(i);
            pages.getToolbarPage().clickOnBackground(i);
            pages.getToolbarPage().printColor();
        }
        Assertions.assertTrue(pages.getToolbarPage().isDocumentPreparedAsWanted());
    }
}
