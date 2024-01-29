package sortableTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;
import utils.JSUtils;

import java.util.Arrays;

public class IncludeExcludeItems_Test extends Hooks {
    @Test
    public void testIncludeExcludeItems(){
        pages.getHomePage().clickOnWebAutomationLink();
        pages.getWebAutomationPage().clickOnSortableLink();
        pages.getWebAutomationPage().clickOnIncludeExcludeItemsLink();
        BrowserUtils.wait(5);
        BrowserUtils.scrollDownWithPageDown();
        System.out.println(Arrays.toString(pages.getIncludeExcludeItemsPage().getLocationOfItem(5)));
        System.out.println(Arrays.toString(pages.getIncludeExcludeItemsPage().getLocationOfItem(7)));
//        pages.getIncludeExcludeItemsPage().moveItemsOtherLocations(4,6);
        System.out.println("-----------------------------------");
        BrowserUtils.wait(8);
        System.out.println(Arrays.toString(pages.getIncludeExcludeItemsPage().getLocationOfItem(5)));
        System.out.println(Arrays.toString(pages.getIncludeExcludeItemsPage().getLocationOfItem(7)));


        BrowserUtils.wait(5);
    }
}
