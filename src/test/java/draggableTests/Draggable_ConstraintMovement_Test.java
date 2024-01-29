package draggableTests;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.Pages;

/**
 * 1. Open the browser and navigate to the page
 * 2. click on the draggable link
 * 3. click on the constraint movement link.
 * 4. Drag the four draggable elements by 100 pixels to the right and 100 pixels to the down.
 * 5. Verify that the first draggable element is just moved to down by 100 pixels.
 * 6. Verify that the second draggable element is just moved to right by 100 pixels.
 * 7. Verify that the third draggable element is still inside the bigger containment wrapper.
 * 8. Verify that the fourth draggable element is still inside the smaller containment wrapper.
 */
public class Draggable_ConstraintMovement_Test extends Hooks {
    Pages pages = new Pages();

    @Test
    public void testHorizontallyAndVerticallyConstrainedElements() {
        //1. Open the browser and navigate to the page
        pages.getHomePage().clickOnWebAutomationLink();
        //2. click on the draggable link
        pages.getWebAutomationPage().clickOnDraggableLink();
        //3. click on the constraint movement link.
        pages.getWebAutomationPage().clickOnConstrainMovementLink();
        int previousX1 = pages.getConstrainMovementPage().getLocationOfFirstDraggableX();
        int previousY1 = pages.getConstrainMovementPage().getLocationOfFirstDraggableY();
        int previousX2 = pages.getConstrainMovementPage().getLocationOfSecondDraggableX();
        int previousY2 = pages.getConstrainMovementPage().getLocationOfSecondDraggableY();
        int wrapper1X = pages.getConstrainMovementPage().getBiggerContainmentWrapperX();
        int wrapper1Y = pages.getConstrainMovementPage().getBiggerContainmentWrapperY();
        int wrapper1Height = pages.getConstrainMovementPage().getBiggerContainmentWrapperHeight();
        int wrapper1Width = pages.getConstrainMovementPage().getBiggerContainmentWrapperWidth();
        int wrapper2X = pages.getConstrainMovementPage().getBiggerContainmentWrapperX();
        int wrapper2Y = pages.getConstrainMovementPage().getBiggerContainmentWrapperY();
        int wrapper2Height = pages.getConstrainMovementPage().getBiggerContainmentWrapperHeight();
        int wrapper2Width = pages.getConstrainMovementPage().getBiggerContainmentWrapperWidth();
        //4. Drag the four draggable elements by 100 pixels to the right and 100 pixels to the down.
        pages.getConstrainMovementPage().dragFirstDraggableByXAndYOffset(100, 100);
        pages.getConstrainMovementPage().dragSecondDraggableByXAndYOffset(100, 100);
        pages.getConstrainMovementPage().dragThirdDraggableByXAndYOffset(100, 5);
        pages.getConstrainMovementPage().dragFourthDraggableByXAndYOffset(1,1);
        int nextX1 = pages.getConstrainMovementPage().getLocationOfFirstDraggableX();
        int nextY1 = pages.getConstrainMovementPage().getLocationOfFirstDraggableY();
        int nextX2 = pages.getConstrainMovementPage().getLocationOfSecondDraggableX();
        int nextY2 = pages.getConstrainMovementPage().getLocationOfSecondDraggableY();
        int nextX3 = pages.getConstrainMovementPage().getLocationOfThirdDraggableX();
        int nextY3 = pages.getConstrainMovementPage().getLocationOfThirdDraggableY();
        int nextX4 = pages.getConstrainMovementPage().getLocationOfFourthDraggableX();
        int nextY4 = pages.getConstrainMovementPage().getLocationOfFourthDraggableY();
        //5. Verify that the first draggable element is just moved to down by 100 pixels.
        Assertions.assertEquals(previousX1, nextX1);
        Assertions.assertEquals(previousY1 + 100, nextY1);
        //6. Verify that the second draggable element is just moved to right by 100 pixels.
        Assertions.assertEquals(previousY2, nextY2);
        Assertions.assertEquals(previousX2 + 100, nextX2);
        //7. Verify that the third draggable element is still inside the bigger containment wrapper.
        Assertions.assertTrue(nextX3 >= wrapper1X && nextX3 <= wrapper1X + wrapper1Width);
        Assertions.assertTrue(nextY3 >= wrapper1Y && nextY3 <= wrapper1Y + wrapper1Height);
        //8. Verify that the fourth draggable element is still inside the smaller containment wrapper.
        Assertions.assertTrue(nextX4 >= wrapper2X && nextX4 <= wrapper2X + wrapper2Width);
        Assertions.assertTrue(nextY4 >= wrapper2Y && nextY4 <= wrapper2Y + wrapper2Height);

    }

}
