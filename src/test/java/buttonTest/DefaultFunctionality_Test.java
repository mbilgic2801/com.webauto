package buttonTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DefaultFunctionality_Test extends Hooks {
    @Test
    public void testButtonDefaultFunctionality(){
        pages.getHomePage().clickOnWebAutomationLink();
        pages.getWebAutomationPage().clickOnButtonLink();
        pages.getWebAutomationPage().clickOnButtonDefaultFunctionalityLink();
        Assertions.assertTrue(pages.getButtonDefaultFunctionalityPage().areAllButtonsClickable());
    }
}
