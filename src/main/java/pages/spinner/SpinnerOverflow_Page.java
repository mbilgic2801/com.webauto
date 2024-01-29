package pages.spinner;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class SpinnerOverflow_Page extends BasePage {
    @FindBy(xpath = "//*[@id='spinner-overflow']")
    private WebElement inputField;
    @FindBy(xpath = "//div[contains(@id,'pane-5')]//a/span[contains(@class,'triangle-1-n')]")
    private WebElement incrementButton;
    @FindBy(xpath = "//div[contains(@id,'pane-5')]//a/span[contains(@class,'triangle-1-s')]")
    private WebElement decrementButton;
    public int getValueOfInputField(){
        return Integer.parseInt(inputField.getAttribute("value"));
    }
    public void clickOnIncrementButton(){incrementButton.click();}
    public void clickOnDecrementButton(){decrementButton.click();}

    public void setValue(int value) {
       int currentValue=getValueOfInputField();
       if(value>currentValue){
           for (int i = currentValue; i <value ; i++) {
               clickOnIncrementButton();
           }
       }
       else {
           for (int i = currentValue; i < value ; i--) {
               clickOnDecrementButton();
           }
       }
    }
}
