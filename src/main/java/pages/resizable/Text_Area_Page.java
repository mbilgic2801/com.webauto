package pages.resizable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class Text_Area_Page extends BasePage {
    @FindBy(id = "resizable-text-area-res")
    private WebElement textAreaBox;
    @FindBy(xpath = "//*[@id='resizable-text-area-res']/../div[1]")
    WebElement horizontalHandle;

    @FindBy(xpath = "//*[@id='resizable-text-area-res']/../div[2]")
    WebElement verticalHandle;
    @FindBy(xpath = "//*[@id='resizable-text-area-res']/../div[3]")
    WebElement diagonalHandle;

    public void resizeHorizontally(){
        actions.dragAndDropBy(horizontalHandle,20,0).perform();
    }
    public void resizeVertically(){
        actions.dragAndDropBy(verticalHandle,0,20).perform();
    }
    public void resizeDiagonally(){
        actions.dragAndDropBy(diagonalHandle,20,20).perform();
    }
    public int[] getSizeOfTextArea(){
        return new int[]{textAreaBox.getSize().getHeight(),textAreaBox.getSize().getWidth()};
    }
    public boolean sizeIsDifferent(int[] initialSize,int[] finalSize){
        return initialSize[0]!=finalSize[0]||initialSize[1]!=finalSize[1];
    }
}
