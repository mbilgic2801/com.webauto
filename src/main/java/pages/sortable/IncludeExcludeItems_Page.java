package pages.sortable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;
import java.util.stream.Stream;

public class IncludeExcludeItems_Page extends BasePage {
    @FindBy(xpath = "//*[@id=\"sortable-inc-exc-1\"]/li[text()='Item 1']")
    private WebElement table1_Item1;
    @FindBy(xpath = "//*[@id=\"sortable-inc-exc-1\"]/li[text()='Item 4']")
    private WebElement table1_Item4;
    @FindBy(xpath = "//*[@id=\"sortable-inc-exc-1\"]/li[contains(@class,'disabled')][1]")
    private WebElement notSortableDroppableTable1_Item2;
    @FindBy(xpath = "//*[@id=\"sortable-inc-exc-1\"]/li[contains(@class,'disabled')][2]")
    private WebElement notSortableDroppableTable1_Item3;
    @FindBy(xpath = "//*[@id=\"sortable-inc-exc-2\"]/li[text()='Item 1']")
    private WebElement table2_Item1;
    @FindBy(xpath = "//*[@id=\"sortable-inc-exc-2\"]/li[text()='Item 4']")
    private WebElement table2_Item4;
    @FindBy(xpath = "//*[@id=\"sortable-inc-exc-2\"]/li[contains(@class,'disabled')][1]")
    private WebElement notSortableTable2_Item2;
    @FindBy(xpath = "//*[@id=\"sortable-inc-exc-2\"]/li[contains(@class,'disabled')][2]")
    private WebElement notSortableTable2_Item3;
    List<WebElement> items= Stream.of(table1_Item1,notSortableDroppableTable1_Item2,notSortableDroppableTable1_Item3,table1_Item4,
            table2_Item1,notSortableTable2_Item2,notSortableTable2_Item3,table2_Item4).toList();
    public int[] getLocationOfItem(int index){
        return new int[]{items.get(index-1).getLocation().getX(),items.get(index-1).getLocation().getY()};
    }
    public void moveItemsOtherLocations(int index1,int index2){


        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i).getText());
        }
        int x=getLocationOfItem(index2)[0];
        int y=getLocationOfItem(index2)[1];
        System.out.println(x);
        System.out.println(y);
//        actions.dragAndDropBy(items.get(index1-1),0,y/2).build().perform();
//        actions.moveToElement(items.get(index1),0,(int)((3*y)/2.0)).build().perform();
        actions.moveToElement(items.get(index1)).clickAndHold().moveToLocation(x,y).release().build().perform();
    }

}
