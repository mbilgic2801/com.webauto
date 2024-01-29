package pages.droppable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class Revert_Draggable_Position_Page extends BasePage {
    @FindBy(id = "draggable-revert-draggable")
    private WebElement boxRevertWhenDropped;
    @FindBy(id = "draggable2-revert-draggable")
    private WebElement boxRevertWhenDroppedOut;

    @FindBy(id ="droppable-revert-draggable")
    private WebElement targetDroppable;

    public void dragBoxRevertWhenDroppedToTargetDroppable(){
        actions.clickAndHold(boxRevertWhenDropped).moveToElement(targetDroppable).release().build().perform();
    }
    public void dragBoxRevertWhenDroppedOutToTargetDroppable(){
        actions.clickAndHold(boxRevertWhenDroppedOut).moveToElement(targetDroppable).release().build().perform();
    }
    public void dragBoxRevertWhenDroppedOutOfFromTargetDroppable(){
        actions.clickAndHold(boxRevertWhenDroppedOut).moveToElement(boxRevertWhenDropped).release().build().perform();
    }
    public int[] getBoxRevertWhenDroppedXAndY(){
        return new int[]{boxRevertWhenDropped.getLocation().getX(), boxRevertWhenDropped.getLocation().getY()};
    }
    public int[] getBoxRevertWhenDroppedOutXAndY(){
        return new int[]{boxRevertWhenDroppedOut.getLocation().getX(), boxRevertWhenDroppedOut.getLocation().getY()};
    }
}
