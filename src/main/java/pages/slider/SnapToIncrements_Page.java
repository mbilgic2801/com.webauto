package pages.slider;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class SnapToIncrements_Page extends BasePage {
    @FindBy(xpath = "//input[@id='amount-snap-to-increments']")
    private WebElement input;
    @FindBy(xpath = "//div[@id='slider-snap-to-increments']")
    private WebElement slider;
    @FindBy(xpath = "//div[@id='slider-snap-to-increments']/span")
    private WebElement sliderHandle;
    public void printInput(){
        System.out.println(input.getAttribute("value"));
    }
    public int getPrice(){
        return Integer.parseInt(input.getAttribute("value").substring(1));
    }
    public void moveSliderHandleLeftFiftyDollar(){
        actions.dragAndDropBy(sliderHandle,-1*slider.getSize().width/10,0).perform();
        printInput();

    }
    public void moveSliderHandleRightFiftyDollar(){
        actions.dragAndDropBy(sliderHandle,slider.getSize().width/10,0).perform();
        printInput();
    }
    public void moveSliderHandleRight(int dollar){
        actions .dragAndDropBy(sliderHandle,dollar,0).perform();
    }
    public void moveSliderHandleLeft(int dollar){
        actions .dragAndDropBy(sliderHandle,dollar,0).perform();
    }
    public void setSliderToZero(){
        actions.moveToElement(slider,-1*slider.getSize().width/2,0).click().perform();
    }
    public void setSliderToMax(){
        actions.moveToElement(slider,slider.getSize().width/2,0).click().perform();
    }

}
