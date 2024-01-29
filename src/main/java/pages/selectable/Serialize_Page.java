package pages.selectable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class Serialize_Page extends BasePage {
    @FindBy(id = "feedback-serialize")
    WebElement feedbackText;
    @FindBy(css = "p#feedback-serialize > span#select-result")
    WebElement selectedItemsText;

    @FindBy(xpath = "//ol[@id='selectable-serialize']/li")
    WebElement selectableElement1;
    public void clickOnAnElement(){
        selectableElement1.click();
    }
}
