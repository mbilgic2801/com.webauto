package sortableTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Test;

public class DisplayAsGrid_Test extends Hooks {
    @Test
    public void testDisplayAsGrid(){
        pages.getHomePage().clickOnWebAutomationLink();
        pages.getWebAutomationPage().clickOnSortableLink();
        pages.getWebAutomationPage().clickOnDisplayAsGridLink();

        pages.getDisplayAsGridPage().moveBoxToAnothersLocation(1,12);
        pages.getDisplayAsGridPage().moveBoxToAnothersLocation(12,1);
        System.out.println(pages.getDisplayAsGridPage().areBoxesIdentical());

        pages.getDisplayAsGridPage().moveBox(1,200,200);



    }
}
