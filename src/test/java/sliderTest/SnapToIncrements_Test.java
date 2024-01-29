package sliderTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;
/**
 * 1. Open the browser and navigate to the page
 * 2. click on the Slider link
 * 3. click on the Snap To Increments Link
 * 4. Drag the slider to far left
 * 5. Verify the donation amount is zero
 * 6. Drag the slider to far right
 * 7. Verify the donation amount is 500$.
 * 8. Verify that the slider handle position doesn't change below 50$ increments.
 */
public class SnapToIncrements_Test extends Hooks {
    @Test
    public void testSnapToIcrements() {
        //1. Open the browser and navigate to the page
        pages.getHomePage().clickOnWebAutomationLink();
        //2. click on the Slider link
        BrowserUtils.scrollDownWithPageDown();
        pages.getWebAutomationPage().clickOnSliderLink();
        //3. click on the Snap To Increments Link
        BrowserUtils.scrollUpWithPageUp();
        pages.getWebAutomationPage().clickOnSnapToIncrementsLink();
        //4. Drag the slider to far left
        pages.getSnapToIncrementsPage().setSliderToZero();
        //5. Verify the donation amount is zero
        Assertions.assertEquals(pages.getSnapToIncrementsPage().getPrice(),0);
        //6. Drag the slider to far right
        pages.getSnapToIncrementsPage().setSliderToMax();
        //7. Verify the donation amount is 500$.
        Assertions.assertEquals(pages.getSnapToIncrementsPage().getPrice(),500);
        //8. Verify that the slider handle position doesn't change below 50$ increments.
        pages.getSnapToIncrementsPage().setSliderToZero();
        pages.getSnapToIncrementsPage().moveSliderHandleRight(30);
        Assertions.assertEquals(pages.getSnapToIncrementsPage().getPrice(),0);
//        for (int i = 0; i < 11; i++) {
//            pages.getSnapToIncrementsPage().moveSliderHandleLeftFiftyDollar();
//            BrowserUtils.wait(1);
//        }
//        for (int i = 0; i < 10; i++) {
//            pages.getSnapToIncrementsPage().moveSliderHandleRightFiftyDollar();
//            BrowserUtils.wait(1);
//        }


    }
}
