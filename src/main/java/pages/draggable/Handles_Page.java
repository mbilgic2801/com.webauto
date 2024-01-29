package pages.draggable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class Handles_Page extends BasePage {
    @FindBy(id = "draggable13")
    private WebElement firstDraggable;
    @FindBy(id = "draggable14")
    private WebElement secondDraggable;

    @FindBy(css = ".ui-widget-header.fs-5.p-3.ui-draggable-handle")
    private WebElement firstDraggablesWidget;

    @FindBy(xpath = "//p[contains(text(),'You can drag me around…')]")
    private WebElement secondDraggablesFirstWidget;
    @FindBy(xpath = "//p[@class='ui-widget-header']")
    private WebElement secondDraggablesSecondWidget;
    public void dragFirstDraggableWithTheWidget(int xOffset,int yOffset){
        actions.dragAndDropBy(firstDraggablesWidget,xOffset,yOffset).perform();
    }

    public void dragFirstDraggableByOutOfTheWidget(){

    }
    public void dragSecondDraggableWithTheFirstWidget(int xOffset,int yOffset){
        actions.dragAndDropBy(secondDraggablesFirstWidget,xOffset,yOffset).perform();
    }
    public void dragSecondDraggableWithTheSecondWidget(int xOffset,int yOffset){
        actions.dragAndDropBy(secondDraggablesSecondWidget,xOffset,yOffset).perform();
    }
    public int getLocationOfFirstDraggableX() {
        return firstDraggable.getLocation().getX();
    }

    public int getLocationOfFirstDraggableY() {
        return firstDraggable.getLocation().getY();
    }
    public int getLocationOfSecondDraggableX() {
        return secondDraggable.getLocation().getX();
    }

    public int getLocationOfSecondDraggableY() {
        return secondDraggable.getLocation().getY();
    }

}
