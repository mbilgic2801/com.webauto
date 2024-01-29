package pages.menu;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class IconsPage extends BasePage {
    @FindBy(xpath = "//ul[@id='menu-w-icons']/li")
    private List<WebElement> mainMenu;
    @FindBy(xpath = "//ul[@id='menu-w-icons']//ul[@role='menu']/li")
    private List<WebElement> subMenu;
    @FindBy(xpath = "//ul[@id='menu-w-icons']/li[1]")
    private WebElement unclickable;

    public void clickOnUnclickable(){
        unclickable.click();
    }

}
