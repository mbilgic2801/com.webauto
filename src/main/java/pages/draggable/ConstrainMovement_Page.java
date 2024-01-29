package pages.draggable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class ConstrainMovement_Page extends BasePage {
    @FindBy(id = "draggable5")
    private WebElement firstDraggable;
    @FindBy(id = "draggable6")
    private WebElement secondDraggable;
    @FindBy(id = "draggable7")
    private WebElement thirdDraggable;
    @FindBy(id = "draggable8")
    private WebElement fourthDraggable;
    @FindBy(id = "containment-wrapper")
    private WebElement biggerContainmentWrapper;
    @FindBy(xpath = "//*[@id='containment-wrapper']/div[2]")
    private WebElement smallerContainmentWrapper;


    public void dragFirstDraggableByXAndYOffset(int xOffset, int yOffset) {
        actions.dragAndDropBy(firstDraggable, xOffset, yOffset).perform();

    }

    public void dragSecondDraggableByXAndYOffset(int xOffset, int yOffset) {
        actions.dragAndDropBy(secondDraggable, xOffset, yOffset).perform();
    }

    public void dragThirdDraggableByXAndYOffset(int xOffset, int yOffset) {
        //actions.dragAndDropBy(thirdDraggable, xOffset, yOffset).perform();
        actions.clickAndHold(thirdDraggable).moveByOffset(xOffset,yOffset).release().build().perform();
    }
    public void dragFourthDraggableByXAndYOffset(int xOffset, int yOffset) {
        //actions.dragAndDropBy(thirdDraggable, xOffset, yOffset).perform();
        actions.clickAndHold(fourthDraggable).moveByOffset(xOffset,yOffset).release().build().perform();
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

    public int getLocationOfThirdDraggableX() {
        return thirdDraggable.getLocation().getX();
    }

    public int getLocationOfThirdDraggableY() {
        return thirdDraggable.getLocation().getY();
    }
    public int getLocationOfFourthDraggableX() {
        return fourthDraggable.getLocation().getX();
    }

    public int getLocationOfFourthDraggableY() {
        return fourthDraggable.getLocation().getY();
    }

    public int getBiggerContainmentWrapperX() {
        return biggerContainmentWrapper.getLocation().getX();
    }

    public int getBiggerContainmentWrapperY() {
        return biggerContainmentWrapper.getLocation().getY();
    }
    public int getBiggerContainmentWrapperHeight(){
        return biggerContainmentWrapper.getSize().getHeight();
    }
    public int getBiggerContainmentWrapperWidth(){
        return biggerContainmentWrapper.getSize().getWidth();
    }
    public int getSmallerContainmentWrapperX() {
        return smallerContainmentWrapper.getLocation().getX();
    }

    public int getSmallerContainmentWrapperY() {
        return smallerContainmentWrapper.getLocation().getY();
    }
    public int getSmallerContainmentWrapperHeight(){
        return smallerContainmentWrapper.getSize().getHeight();
    }
    public int getSmallerContainmentWrapperWidth(){
        return smallerContainmentWrapper.getSize().getWidth();
    }


}
