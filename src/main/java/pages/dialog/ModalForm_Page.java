package pages.dialog;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utils.BrowserUtils;

import java.util.List;

public class ModalForm_Page extends BasePage {
    @FindBy(xpath = "//button[text()='Create Account']")
    private WebElement createAccountButton;
    @FindBy(xpath = "//div[@id='dialog-container-modalForm-sbt']//span[contains(@class,'closethick')]")
    private WebElement dialogFormCloseButton;
    @FindBy(xpath = "//button[text()='Submit']")
    private WebElement dialogFormSubmitButton;
    @FindBy(xpath = "//div/input[@id='name']")
    private WebElement dialogFormNameField;
    @FindBy(xpath = "//div/input[@id='surname']")
    private WebElement dialogFormSurnameField;
    @FindBy(xpath = "//div/input[@id='email']")
    private  WebElement dialogFormEmailField;
    @FindBy(xpath = "//table[contains(@class,'mb-4')]/tbody/tr")
    private List<WebElement>  tableRow;
    public void insertName(String name){
        dialogFormNameField.clear();
        dialogFormNameField.sendKeys(name);
    }
    public void insertSurname(String surname){
        dialogFormSurnameField.clear();
        dialogFormSurnameField.sendKeys(surname);
    }
    public void insertEmail(String email){
        dialogFormEmailField.clear();
        dialogFormEmailField.sendKeys(email);
    }
    public void createAccount(String name,String surname,String email){
        BrowserUtils.scrollUpWithPageUp();
        createAccountButton.click();
        insertName(name);
        insertSurname(surname);
        insertEmail(email);
        BrowserUtils.scrollDownWithPageDown();
        dialogFormSubmitButton.click();
    }
    public String getRow(int index) {
       return tableRow.get(index).getText();
    }
}
