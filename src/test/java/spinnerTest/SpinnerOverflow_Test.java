package spinnerTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;
/**
 * 1. Open the browser and navigate to the page
 * 2. click on the Spinner link
 * 3. click on the Spinner Overflow Link
 * 4. Set the value to 10
 * 5. Click on increment button while the value is 10
 * 6. Verify that the value after increment is -10
 * 7. Set the value to -10
 * 8. Click on decrement button while the value is -10
 * 9. Verify that the value after decrement is 10
 */
public class SpinnerOverflow_Test extends Hooks {
    @Test
    public void testSpinnerOverflow(){
        //1. Open the browser and navigate to the page
        pages.getHomePage().clickOnWebAutomationLink();
        //2. click on the Spinner link
        BrowserUtils.scrollDownWithPageDown();
        pages.getWebAutomationPage().clickOnSpinnerLink();
        //3. click on the Spinner Overflow Link
        BrowserUtils.scrollUpWithPageUp();
        pages.getWebAutomationPage().clickOnSpinnerOverflowLink();
        //4. Set the value to 10
        pages.getSpinnerOverflowPage().setValue(10);
        //5. Click on increment button while the value is 10
        pages.getSpinnerOverflowPage().clickOnIncrementButton();
        //6. Verify that the value after increment is -10
        Assertions.assertEquals(pages.getSpinnerOverflowPage().getValueOfInputField(),-10);
        //7. Set the value to -10
        pages.getSpinnerOverflowPage().setValue(-10);
        //8. Click on decrement button while the value is -10
        pages.getSpinnerOverflowPage().clickOnDecrementButton();
        //9. Verify that the value after decrement is 10
        Assertions.assertEquals(pages.getSpinnerOverflowPage().getValueOfInputField(),10);


    }
}
