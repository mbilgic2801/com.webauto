package accordionTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;
/**
 * 1. Open the browser and navigate to the page
 * 2. click on the Accordion link
 * 3. click on the Collapse Content Link
 * 4. Click on Tab 1
 * 5. Verify that the clicked tab is opened and other tabs are closed.
 * 6. Click on the opened tab.
 * 7. Verify that the all tabs are closed
 * 8. Click on a tab and then another.
 * 9. Verify that the first opened tab is closed and the second one opened
 */
public class CollapseContent_Test extends Hooks {
    @Test
    public void testCollapseContent(){
        //1. Open the browser and navigate to the page
        pages.getHomePage().clickOnWebAutomationLink();
        //2. click on the Accordion link
        pages.getWebAutomationPage().clickOnAccordionLink();
        //3. click on the Collapse Content Link
        pages.getWebAutomationPage().clickOnCollapseContentLink();
        BrowserUtils.wait(2);
        //4. Click on Tab 1
        pages.getCollapseContentPage().clickOnTab(1);
        //5.Verify that the clicked tab is opened and other tabs are closed.
        Assertions.assertTrue(pages.getCollapseContentPage().isOnlyClickedTabOpened(1));
        //6.Click on the opened tab.
        pages.getCollapseContentPage().clickOnTab(1);
        //7. Verify that the all tabs are closed
        Assertions.assertTrue(pages.getCollapseContentPage().areAllTabsClosed());
        //8. Click on a tab and then another.
        pages.getCollapseContentPage().clickOnTab(1);
        pages.getCollapseContentPage().clickOnTab(2);
        //9. Verify that the first opened tab is closed and the second one opened
        Assertions.assertTrue(pages.getCollapseContentPage().isOnlyClickedTabOpened(2));


    }
}
