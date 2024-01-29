package pages.button;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class ButtonDefaultFunctionality_Page extends BasePage {
    @FindBy(xpath = "//div[@class='widget mb-5']/button")
    private WebElement button1;
    @FindBy(xpath = "//div[@class='widget mb-5']//*[@role='button'][1]")
    private WebElement button2;
    @FindBy(xpath = "//div[@class='widget mb-5']//*[@role='button'][2]")
    private WebElement button3;
    public boolean isButton1Clickable(){
        return button1.isEnabled();
    }
    public boolean isButton2Clickable(){
        return button2.isEnabled();
    }
    public boolean isButton3Clickable(){
        return button3.isEnabled();
    }
    public boolean areAllButtonsClickable(){
        return isButton1Clickable()&&isButton2Clickable()&&isButton3Clickable();
    }
}
