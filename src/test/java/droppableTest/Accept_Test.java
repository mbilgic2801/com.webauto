package droppableTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

public class Accept_Test extends Hooks {
    @Test
    public void testDroppableAcceptance()  {
        pages.getHomePage().clickOnWebAutomationLink();
        pages.getWebAutomationPage().clickOnDroppableLink();
        pages.getWebAutomationPage().clickOnAcceptLink();
        BrowserUtils.wait(1);
        String beforeDrop=pages.getAcceptPage().getTargetDroppableText();
        pages.getAcceptPage().dragUndroppableToTargetDroppable();
        BrowserUtils.wait(1);
        String afterDrop=pages.getAcceptPage().getTargetDroppableText();
        BrowserUtils.wait(1);
        Assertions.assertEquals(beforeDrop,afterDrop);
        pages.getAcceptPage().dragDroppableToTargetDroppable();
        BrowserUtils.wait(1);
        afterDrop=pages.getAcceptPage().getTargetDroppableText();
        Assertions.assertNotEquals(beforeDrop,afterDrop);

    }
}
