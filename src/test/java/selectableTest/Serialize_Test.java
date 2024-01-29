package selectableTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

public class Serialize_Test extends Hooks {
    @Test
    public void testSerializeSelectability(){
        pages.getHomePage().clickOnWebAutomationLink();
        pages.getWebAutomationPage().clickOnSelectableLink();
        pages.getWebAutomationPage().clickOnSelectableLink();
        BrowserUtils.wait(3);

        //pages.getSerializePage().clickOnAnElement();
        BrowserUtils.wait(3);
    }
}
