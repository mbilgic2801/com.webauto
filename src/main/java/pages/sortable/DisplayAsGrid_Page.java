package pages.sortable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utils.BrowserUtils;

import java.util.List;

public class DisplayAsGrid_Page extends BasePage {
    @FindBy(xpath = "//*[@id=\"sortable-disp-as-grid\"]/li")
    private List<WebElement> boxes;

    public void moveBoxToAnothersLocation(int firstBox,int secondBox){
        actions.clickAndHold(boxes.get(firstBox-1)).pause(1000)
                .moveToElement(boxes.get(secondBox-1)).pause(1000)
                .release()
                .perform();

        BrowserUtils.wait(5);
    }
    public void moveBox(int index,int XOffset,int YOffset){
        actions.clickAndHold(boxes.get(index)).moveByOffset(XOffset,YOffset).perform();
    }
    public boolean areBoxesIdentical(){
        for (WebElement box : boxes) {
            if (boxes.get(0).getSize().width != box.getSize().width ||
                    boxes.get(0).getSize().width != box.getSize().width)
                return false;
        }
        return true;
    }
}
