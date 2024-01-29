package progressBarTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

public class Download_Dialog_Test extends Hooks {
    @Test
    public void testDownloadDialofFunctionality(){
        pages.getHomePage().clickOnWebAutomationLink();
        BrowserUtils.scrollDownWithPageDown();
        pages.getWebAutomationPage().clickOnProgressBarLink();
        BrowserUtils.scrollUpWithPageUp();
        pages.getWebAutomationPage().clickOnDownloadDialogLink();
        pages.getDownloadDialogPage().clickOnStartDownloadButton();
        System.out.println("---------------"+pages.getDownloadDialogPage().getProgressBarValue());
        BrowserUtils.wait(2);
        System.out.println("---------------"+pages.getDownloadDialogPage().getProgressBarValue());
        System.out.println("---------------"+pages.getDownloadDialogPage().getProgressBarValue());

        BrowserUtils.scrollDownWithPageDown();
        pages.getDownloadDialogPage().clickOnCancelDownloadButton();
        System.out.println("---------------"+pages.getDownloadDialogPage().getProgressBarValue());


    }
}
