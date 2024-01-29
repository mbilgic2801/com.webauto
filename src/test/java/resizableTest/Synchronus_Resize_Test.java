package resizableTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

public class Synchronus_Resize_Test extends Hooks {
    @Test
    public void testSynchrousResizeTest() {
        pages.getHomePage().clickOnWebAutomationLink();
        pages.getWebAutomationPage().clickOnResizableLink();
        BrowserUtils.wait(2);
        pages.getWebAutomationPage().clickOnSynchronusResizeLink();
        int[] boxAboveInitial = pages.getSynchronusResizePage().sizeOfBoxAbove();
        int[] boxBelowInitial = pages.getSynchronusResizePage().sizeOfBoxBelow();
        pages.getSynchronusResizePage().resizeDiagonallyBoxAbove(50, 50);
        BrowserUtils.wait(2);
        int[] boxAboveFinal = pages.getSynchronusResizePage().sizeOfBoxAbove();
        int[] boxBelowFinal = pages.getSynchronusResizePage().sizeOfBoxBelow();
        Assertions.assertTrue(pages.getSynchronusResizePage().isDifferenceSameDiagonal(boxAboveInitial,boxAboveFinal,boxBelowInitial,boxBelowFinal));
        /*BrowserUtils.wait(2);
        pages.getSynchronusResizePage().resizeHorizontallyBoxAbove(5);
        BrowserUtils.wait(2);
        boxAboveInitial = pages.getSynchronusResizePage().sizeOfBoxAbove();
        boxBelowInitial = pages.getSynchronusResizePage().sizeOfBoxBelow();
        Assertions.assertTrue(pages.getSynchronusResizePage().isDifferenceSameHorizontal(boxAboveFinal,boxAboveInitial,boxBelowFinal,boxBelowInitial));
        BrowserUtils.wait(2);
        pages.getSynchronusResizePage().resizeDiagonallyBoxAbove(50, 50);
        boxAboveFinal = pages.getSynchronusResizePage().sizeOfBoxAbove();
        boxBelowFinal = pages.getSynchronusResizePage().sizeOfBoxBelow();
        Assertions.assertTrue(pages.getSynchronusResizePage().isDifferenceSameDiagonal(boxAboveInitial,boxAboveFinal,boxBelowInitial,boxBelowFinal));
        BrowserUtils.wait(2);*/
    }
}
