package pages.autoComplete;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.ArrayList;
import java.util.List;



public class MultipleAndRemote_Page extends BasePage{
    @FindBy(id = "tags-multipleremotes")
    private WebElement birdsTextBox;

    @FindBy(xpath = "//input[@id='tags-multipleremotes']/../span")
    private WebElement loadingTextMessage;

    @FindBy(css = "#ui-id-43 > li > div")
    private List<WebElement> suggestionMenu;

    public void insertBirdName(String birdName){
        birdsTextBox.sendKeys(birdName);
    }
    public String getLoadingSuggestionMessage(){
        return loadingTextMessage.getText();
    }
    ArrayList<String> suggestionMenuList= new ArrayList<>();
    public ArrayList<String> createSuggestionMenuList(List<WebElement> suggestionMenu){
        for (WebElement menu : suggestionMenu) {
            suggestionMenuList.add(menu.getText());
        }
        return suggestionMenuList;
    }
    public boolean isSuggestionListNotEmpty(){
        return suggestionMenu.size() > 0;
    }
    public void clearBirdsTextBox(){
        birdsTextBox.clear();
    }

    public boolean checkElements(String text) {
        for (String element : suggestionMenuList) {
            if (!element.toLowerCase().startsWith(text.toLowerCase())) {
                return false;
            }
        }
        return true;
    }

}