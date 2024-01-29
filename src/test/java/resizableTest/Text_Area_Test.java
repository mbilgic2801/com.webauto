package resizableTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

public class Text_Area_Test extends Hooks {
    @Test
    public void testTextAreasResizablity(){
        pages.getHomePage().clickOnWebAutomationLink();
        pages.getWebAutomationPage().clickOnResizableLink();
        pages.getWebAutomationPage().clickOnTextAreaLink();
        int[][] sizeOfTextArea = new int[4][2];
        sizeOfTextArea[0]=pages.getTextAreaPage().getSizeOfTextArea();
        pages.getTextAreaPage().resizeHorizontally();
        BrowserUtils.wait(2);
        sizeOfTextArea[1]=pages.getTextAreaPage().getSizeOfTextArea();
        Assertions.assertTrue(pages.getTextAreaPage().sizeIsDifferent(sizeOfTextArea[0],sizeOfTextArea[1]));
        pages.getTextAreaPage().resizeVertically();
        BrowserUtils.wait(2);
        sizeOfTextArea[2]=pages.getTextAreaPage().getSizeOfTextArea();
        Assertions.assertTrue(pages.getTextAreaPage().sizeIsDifferent(sizeOfTextArea[1],sizeOfTextArea[2]));
        pages.getTextAreaPage().resizeDiagonally();
        BrowserUtils.wait(2);
        sizeOfTextArea[3]=pages.getTextAreaPage().getSizeOfTextArea();
        Assertions.assertTrue(pages.getTextAreaPage().sizeIsDifferent(sizeOfTextArea[2],sizeOfTextArea[3]));

    }
}
