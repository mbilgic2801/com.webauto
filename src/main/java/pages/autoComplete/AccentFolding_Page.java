package pages.autoComplete;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.ArrayList;
import java.util.List;

public class AccentFolding_Page extends BasePage {
    @FindBy(xpath = "//*[@id='developer-accentFolding']")
    private WebElement nameInputField;
    @FindBy(xpath = "//ul[@id='ui-id-40']/li")
    private List<WebElement> nameSuggestions;
    public void insertName(String name){
        clearNameInputField();
        nameInputField.sendKeys(name);}
    public void clearNameInputField(){nameInputField.clear();}
    public List<String> getNameSuggestions(){
        List<String> nameList=new ArrayList<>();
        for (WebElement nameSuggestion : nameSuggestions) {
            nameList.add(nameSuggestion.getText());
        }
        return nameList;
    }
}
