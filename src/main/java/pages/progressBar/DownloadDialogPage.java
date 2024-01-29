package pages.progressBar;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class DownloadDialogPage extends BasePage {
    @FindBy(xpath = "//button[text()='Start Download']")
    private WebElement startDownloadButton;
    @FindBy(xpath = "//div[@id='dialog-container-download-dialog']/div/div[3]/div//button")
    private WebElement cancelDownloadButton;
    @FindBy(xpath = "//div[@id='progressbar-download-dialog']/div")
    private WebElement progressBar;

    public void clickOnStartDownloadButton() {
        startDownloadButton.click();
    }

    public void clickOnCancelDownloadButton() {
        cancelDownloadButton.click();
    }
    public String  getProgressBarValue(){
        return progressBar.getAttribute("style");
    }

}
