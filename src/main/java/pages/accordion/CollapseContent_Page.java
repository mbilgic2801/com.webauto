package pages.accordion;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.Arrays;
import java.util.List;

public class CollapseContent_Page extends BasePage {
    @FindBy(xpath = "//div[@id='accordion-2-cc']/h3")
    private List<WebElement> tabs;
    private boolean[] isTabSelected;
    public void clickOnTab(int index){
        isTabSelectedOrNot();
        tabs.get(index).click();
        System.out.println(Arrays.toString(isTabSelected));
    }
    public void isTabSelectedOrNot(){
        isTabSelected = new boolean[tabs.size()];
        for (int i = 0; i < 4; i++) {
            isTabSelected[i]=tabs.get(i).getAttribute("aria-selected").equals("true");
        }
    }

    public boolean isOnlyClickedTabOpened(int index){
        isTabSelectedOrNot();
        for (int i = 0; i < isTabSelected.length; i++) {
            if(i!=index&&isTabSelected[i]){
                    return false;
            }
        }
        return isTabSelected[index];
    }
    public boolean areAllTabsClosed(){
        isTabSelectedOrNot();
        for (boolean b : isTabSelected) {
            if (b) {
                return false;
            }
        }
        return true;
    }
}
