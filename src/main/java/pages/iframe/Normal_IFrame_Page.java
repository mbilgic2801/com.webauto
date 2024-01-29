package pages.iframe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utils.Driver;

public class Normal_IFrame_Page extends BasePage {
    WebDriver driver = Driver.getDriver();
    @FindBy(id = "nestedIframe")
    WebElement normalIFrame;
    @FindBy(css = "div > h1")
    WebElement normalIFrameHeader;
    public void switchToIframe() {
        driver.switchTo().frame(normalIFrame);
    }
    public String getHeaderTextOfNormalIFrame(){
        switchToIframe();
        return normalIFrameHeader.getText();
    }
}
