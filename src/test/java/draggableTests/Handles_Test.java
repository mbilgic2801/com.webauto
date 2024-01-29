package draggableTests;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.Pages;

/**
 * 1. Open the browser and navigate to the page
 * 2. click on the draggable link
 * 3. click on the constraint movement link.
 * 4. drag the first draggable item with its widget
 * 5. verify that the first draggable item's position has changed
 * 6. drag the first draggable item without its widget
 * 7. verify that the first draggable item's position hasn't changed
 * 8. drag the second draggable item with its first widget
 * 9. verify that the second draggable item's position has changed
 */
public class Handles_Test extends Hooks {
    Pages pages = new Pages();

    @Test
    public void testHandlesFunctionality() throws InterruptedException {
        //1. Open the browser and navigate to the page
        pages.getHomePage().clickOnWebAutomationLink();
        //2. click on the draggable link
        pages.getWebAutomationPage().clickOnDraggableLink();
        //3. click on the handles link.
        pages.getWebAutomationPage().clickOnHandlesLink();
        int previousX1 = pages.getHandlesPage().getLocationOfFirstDraggableX();
        int previousY1 = pages.getHandlesPage().getLocationOfFirstDraggableY();
        //4. drag the first draggable item with its widget
        pages.getHandlesPage().dragFirstDraggableWithTheWidget(50, 50);
        int nextX1 = pages.getHandlesPage().getLocationOfFirstDraggableX();
        int nextY1 = pages.getHandlesPage().getLocationOfFirstDraggableY();
        Thread.sleep(2000);
        //5. verify that the first draggable item's position has changed
        Assertions.assertTrue(previousX1 != nextX1 && previousY1 != nextY1);
        //6. drag the first draggable item without its widget
        pages.getHandlesPage().dragFirstDraggableByOutOfTheWidget();
        Thread.sleep(2000);
        previousX1 = pages.getHandlesPage().getLocationOfFirstDraggableX();
        previousY1 = pages.getHandlesPage().getLocationOfFirstDraggableY();
        //7. verify that the first draggable item's position hasn't changed
        //Assertions.assertTrue(previousX1 == nextX1 && previousY1 == nextY1);
        int previousX2 = pages.getHandlesPage().getLocationOfSecondDraggableX();
        int previousY2 = pages.getHandlesPage().getLocationOfSecondDraggableY();
        // 8. drag the second draggable item with its first widget
        pages.getHandlesPage().dragSecondDraggableWithTheFirstWidget(30,30);
        int nextX2 = pages.getHandlesPage().getLocationOfSecondDraggableX();
        int nextY2 = pages.getHandlesPage().getLocationOfSecondDraggableY();
        Thread.sleep(2000);
        //9. verify that the second draggable item's position has changed
        Assertions.assertTrue(previousX2 != nextX2 && previousY2 != nextY2);
        //10. drag the second draggable item with its second widget
        pages.getHandlesPage().dragSecondDraggableWithTheSecondWidget(30,30);
        Thread.sleep(2000);
        previousX2 = pages.getHandlesPage().getLocationOfSecondDraggableX();
        previousY2 = pages.getHandlesPage().getLocationOfSecondDraggableY();
        //11. verify that the second draggable item's position hasn't changed
        Assertions.assertTrue(previousX2 == nextX2 && previousY2 == nextY2);






    }
}
