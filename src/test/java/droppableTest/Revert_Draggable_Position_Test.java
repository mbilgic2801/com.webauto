package droppableTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

public class Revert_Draggable_Position_Test extends Hooks {
    @Test
    public void testRevertFunctionality() throws InterruptedException {
        pages.getHomePage().clickOnWebAutomationLink();
        pages.getWebAutomationPage().clickOnDroppableLink();
        pages.getWebAutomationPage().clickOnRevertDraggablePosition();
        int[] formerCoordinates = pages.getRevertDraggablePositionPage().getBoxRevertWhenDroppedXAndY();
        pages.getRevertDraggablePositionPage().dragBoxRevertWhenDroppedToTargetDroppable();
        BrowserUtils.wait(2);
        int[] finalCoordinates = pages.getRevertDraggablePositionPage().getBoxRevertWhenDroppedXAndY();

        Assertions.assertEquals(formerCoordinates[0], finalCoordinates[0]);

        pages.getRevertDraggablePositionPage().dragBoxRevertWhenDroppedOutToTargetDroppable();

        formerCoordinates = pages.getRevertDraggablePositionPage().getBoxRevertWhenDroppedOutXAndY();
        pages.getRevertDraggablePositionPage().dragBoxRevertWhenDroppedOutOfFromTargetDroppable();
        BrowserUtils.wait(2);
        finalCoordinates = pages.getRevertDraggablePositionPage().getBoxRevertWhenDroppedOutXAndY();
        Assertions.assertEquals(formerCoordinates[0], finalCoordinates[0]);

    }
}
