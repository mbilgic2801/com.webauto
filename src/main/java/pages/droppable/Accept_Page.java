package pages.droppable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class Accept_Page extends BasePage {
    @FindBy(id = "draggable-nonvalid-accept")
    private WebElement undroppable;
    @FindBy(id = "draggable-accept")
    private WebElement droppable;
    @FindBy(id ="droppable-accept")
    private WebElement targetDroppable;

    public String getTargetDroppableText(){
        return targetDroppable.getText();
    }

    public void dragUndroppableToTargetDroppable(){
        actions.clickAndHold(undroppable).moveToElement(targetDroppable).release().build().perform();
    }
    public void dragDroppableToTargetDroppable(){
        actions.clickAndHold(droppable).moveToElement(targetDroppable).release().build().perform();
    }
}
