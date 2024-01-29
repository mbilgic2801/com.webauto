package dialogTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

public class ModalForm_Test extends Hooks {
    @Test
    public void testModalForm(){
        pages.getHomePage().clickOnWebAutomationLink();
        BrowserUtils.scrollDownWithPageDown();
        pages.getWebAutomationPage().clickOnDialogLink();
        BrowserUtils.scrollUpWithPageUp();
        pages.getWebAutomationPage().clickOnModalFormLink();
        pages.getModalFormPage().createAccount("Mehmet","Bilgiç","mb@icloud.com");
        pages.getModalFormPage().createAccount("Nurdan","Bilgiç","nb@icloud.com");
        Assertions.assertTrue(pages.getModalFormPage().getRow(2).equals("Nurdan Bilgiç nb@icloud.com"));
        Assertions.assertTrue(pages.getModalFormPage().getRow(1).equals("Mehmet Bilgiç mb@icloud.com"));
    }
}