package checkboxRadioTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * 1. Open the browser and navigate to the page
 * 2. click on the Checkbox Radio link
 * 3. click on the Productor Selector Link
 * 4. Create a product using radio and checkbox buttons.
 * 5. Verify that the preview of the product is the same with the expected
 */
public class ProductSelector_Test extends Hooks {
    @Test
    public void testProductSelector(){
        //1. Open the browser and navigate to the page
        pages.getHomePage().clickOnWebAutomationLink();
        //2. click on the Checkbox Radio link
        pages.getWebAutomationPage().clickOnCheckboxRadioLink();
        //3. click on the Productor Selector Link
        pages.getWebAutomationPage().clickOnProductSelectorLink();
        //4. Create a product using radio and checkbox buttons.
        pages.getProductSelectorPage().createProduct(1,1,true,true,true);
        //5. Verify that the preview of the product is the same with the expected
        Assertions.assertTrue(pages.getProductSelectorPage().isOutputCorrect());

    }
}
