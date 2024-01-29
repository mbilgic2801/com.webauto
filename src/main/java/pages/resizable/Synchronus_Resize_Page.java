package pages.resizable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class Synchronus_Resize_Page extends BasePage {
    @FindBy(id = "resizable-synchr-resize")
    private WebElement boxAbove;
    @FindBy(id = "also-synchr-resize")
    private WebElement boxBelow;
    @FindBy(xpath = "//div[@id='resizable-synchr-resize']//div[@class='ui-resizable-handle ui-resizable-s']")
    private WebElement boxAbovesVerticalHandle;
    @FindBy(xpath = "//div[@id='resizable-synchr-resize']//div[@class='ui-resizable-handle ui-resizable-e']")
    private WebElement boxAbovesHorizontalHandle;
    @FindBy(xpath = "//div[@id='resizable-synchr-resize']//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']")
    private WebElement boxAbovesDiagonalHandle;

    public void resizeVerticallyBoxAbove(int YOffset) {

        actions.dragAndDropBy(boxAbovesVerticalHandle,0,YOffset).perform();
    }

    public void resizeHorizontallyBoxAbove(int XOffset) {
        actions.dragAndDropBy(boxAbovesHorizontalHandle,XOffset,0).perform();    }

    public void resizeDiagonallyBoxAbove(int XOffset, int YOffset) {
        actions.dragAndDropBy(boxAbovesDiagonalHandle, XOffset, YOffset).perform();
    }

    public int[] sizeOfBoxAbove() {
        return new int[]{boxAbove.getSize().getHeight(), boxAbove.getSize().getWidth()};
    }

    public int[] sizeOfBoxBelow() {
        return new int[]{boxBelow.getSize().getHeight(), boxBelow.getSize().getWidth()};
    }

    public boolean isDifferenceSameDiagonal(int[] boxAboveInitial, int[] boxAboveFinal, int[] boxBelowInitial, int[] boxBelowFinal) {
        int differenceAboveX = boxAboveFinal[0] - boxAboveInitial[0];
        int differenceAboveY = boxAboveFinal[1] - boxAboveInitial[1];
        int differenceBelowX = boxBelowFinal[0] - boxBelowInitial[0];
        int differenceBelowY = boxBelowFinal[1] - boxBelowInitial[1];
        return differenceAboveX == differenceBelowX && differenceAboveY == differenceBelowY;
    }
    public boolean isDifferenceSameHorizontal(int[] boxAboveInitial, int[] boxAboveFinal, int[] boxBelowInitial, int[] boxBelowFinal) {
        int differenceAboveX = boxAboveFinal[0] - boxAboveInitial[0];
        int differenceBelowX = boxBelowFinal[0] - boxBelowInitial[0];

        return differenceAboveX == differenceBelowX;
    }
    public boolean isDifferenceSameVertical(int[] boxAboveInitial, int[] boxAboveFinal, int[] boxBelowInitial, int[] boxBelowFinal) {
        int differenceAboveY = boxAboveFinal[1] - boxAboveInitial[1];
        int differenceBelowY = boxBelowFinal[1] - boxBelowInitial[1];

        return differenceAboveY == differenceBelowY;
    }
}
