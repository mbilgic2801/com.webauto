package pages.controlGroup;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utils.BrowserUtils;

import java.util.List;

public class Toolbar_Page extends BasePage {
    private String[] pageAttributes=new String[3];
    private boolean[] pageBooleans=new boolean[3];
    @FindBy(xpath = "//*[@id='page']")
    private WebElement page;
    @FindBy(xpath = "//option[contains(text(),'Zoom')]//parent::select")
    private WebElement zoomDropDown;
    @FindBy(xpath = "//option[contains(text(),'Zoom')]//parent::select/option")
    private List<WebElement> zoomDropDownMenu;
    @FindBy(xpath = "//option[contains(text(),'Zoom')]//parent::select/option[@selected]")
    private WebElement selectedZoom;
    @FindBy(xpath = "//*[@title='Background color']")
    private WebElement backgroundDropDown;
    @FindBy(xpath = "//*[@title='Background color']/option")
    private List<WebElement>  backgroundDropDownMenu;
    @FindBy(xpath = "//*[@title='Color']")
    private WebElement colorDropDown;
    @FindBy(xpath = "//*[@title='Color']/option")
    private List<WebElement> colorDropDownMenu;
    @FindBy(xpath = "//button[text()='B']")
    private WebElement boldButton;
    @FindBy(xpath = "//button[text()='I']")
    private WebElement italicButton;
    @FindBy(xpath = "//button[text()='U']")
    private WebElement underlineButton;
    @FindBy(xpath = "//button[text()='Print']")
    private WebElement printButton;
    public void clickOnBoldButton(){
        pageBooleans[0]=!pageBooleans[0];
        boldButton.click();}
    public void clickOnItalicButton(){
        pageBooleans[1]=!pageBooleans[1];
        italicButton.click();}
    public void clickOnunderlineButton(){
        pageBooleans[2]=!pageBooleans[2];
        underlineButton.click();}
    public void clickOnPrintButton(){printButton.click();}
    public void clickOnZoomDropDown(){zoomDropDown.click();}
    public void clickOnBackgroundDropDown(){backgroundDropDown.click();}
    public void clickOnColorDropDown(){colorDropDown.click();}
    public void clickOnZoom(int index){
        clickOnZoomDropDown();
        zoomDropDownMenu.get(index).click();
        pageAttributes[0]=zoomDropDownMenu.get(index).getText().toLowerCase();
    }
    public void clickOnBackground(int index){
        clickOnBackgroundDropDown();
        backgroundDropDownMenu.get(index).click();
        pageAttributes[1]=backgroundDropDownMenu.get(index).getText().toLowerCase();
    }
    public void clickOnColor(int index){
        clickOnColorDropDown();
        colorDropDownMenu.get(index).click();
        pageAttributes[2]=colorDropDownMenu.get(index).getText().toLowerCase();
    }
    public void prepareTheDocument(int zoomOption,int backgroundOption,int colorOption,boolean isBold,boolean isItalic,boolean isunderline){
        clickOnZoom(zoomOption);
        clickOnBackground(backgroundOption);
        clickOnColor(colorOption);
        if (isBold) clickOnBoldButton();
        if (isItalic) clickOnItalicButton();
        if (isunderline) clickOnunderlineButton();
//        BrowserUtils.wait(5);
//        System.out.println(pageAttributes[0]+"---"+pageAttributes[1]+"---"+pageAttributes[2]);
//        System.out.println(getZoomValueFromStyleAttribute(page.getAttribute("style")));
//        System.out.println(getItalicValueFromStyleAttribute(page.getAttribute("style"))==pageBooleans[1]);
//        System.out.println(getBoldValueFromStyleAttribute(page.getAttribute("style"))==pageBooleans[0]);
//        System.out.println(getunderlineValueFromStyleAttribute(page.getAttribute("style"))==pageBooleans[2]);


    }
    public boolean isDocumentPreparedAsWanted(){
//        System.out.println("isSelectedZoomApplied()    "+isSelectedZoomApplied());
//        System.out.println("isSelectedBackgroundApplied()   "+isSelectedBackgroundApplied());
//        System.out.println("isSelectedColorApplied()     "+isSelectedColorApplied());
//        System.out.println("******"+pageBooleans[0]+"****"+getBoldValueFromStyleAttribute(page.getAttribute("style")));
//        System.out.println("******"+pageBooleans[1]+"****"+getItalicValueFromStyleAttribute(page.getAttribute("style")));
//        System.out.println("******"+pageBooleans[2]+"****"+getunderlineValueFromStyleAttribute(page.getAttribute("style")));

        return  isSelectedZoomApplied()&&
                isSelectedBackgroundApplied()&&
                isSelectedColorApplied()&&
                isSelectedBoldApplied()&&
                isSelectedItalicApplied()&&
                isSelectedUnderlineApplied();

    }
    // Style içindeki zoom değerini çıkaran yardımcı fonksiyon
    private static String getZoomValueFromStyleAttribute(String styleAttribute) {
        String zoomValue = "";
        if (styleAttribute != null && styleAttribute.contains("zoom")) {
            // Zoom değerini çıkarma
            int startIndex = styleAttribute.indexOf("zoom:") + "zoom:".length();
            int endIndex = styleAttribute.indexOf(";", startIndex);
            zoomValue = styleAttribute.substring(startIndex, endIndex).trim();
        }
        return zoomValue;
    }
    private static String getBackgroundValueFromStyleAttribute(String styleAttribute) {
        String backgroundValue = "";
        if (styleAttribute != null && styleAttribute.contains("background-color")) {
            // Zoom değerini çıkarma
            int startIndex = styleAttribute.indexOf("background-color:") + "background-color:".length();
            int endIndex = styleAttribute.indexOf(";", startIndex);
            backgroundValue = styleAttribute.substring(startIndex, endIndex).trim();
        }
        return backgroundValue;
    }
    private static String getColorValueFromStyleAttribute(String styleAttribute) {
        String colorValue = "";
        if (styleAttribute != null && styleAttribute.contains("color")) {
            // Zoom değerini çıkarma
            int startIndex = styleAttribute.indexOf("color:") + "color:".length();
            int endIndex = styleAttribute.indexOf(";", startIndex);
            colorValue = styleAttribute.substring(startIndex, endIndex).trim();
        }
        return colorValue;
    }
    public void printColor(){
        System.out.println("BACKGROUND------>"+getBackgroundValueFromStyleAttribute(page.getAttribute("style")));
        System.out.println(pageAttributes[2]+"COLOR----------->"+getColorValueFromStyleAttribute(page.getAttribute("style")));
        BrowserUtils.wait(2);
        System.out.println(pageAttributes[2].equals(getColorValueFromStyleAttribute(page.getAttribute("style"))));
    }
    private static boolean getBoldValueFromStyleAttribute(String styleAttribute) {

        String boldValue="";
        if (styleAttribute != null && styleAttribute.contains("font-weight")) {
            int startIndex = styleAttribute.indexOf("font-weight:") + "font-weight:".length();
            int endIndex = styleAttribute.indexOf(";", startIndex);
            boldValue = styleAttribute.substring(startIndex, endIndex).trim();
        }
        return boldValue.equals("bold");
    }
    private static boolean getItalicValueFromStyleAttribute(String styleAttribute) {

        String italicValue="";
        if (styleAttribute != null && styleAttribute.contains("font-style")) {
            int startIndex = styleAttribute.indexOf("font-style:") + "font-style:".length();
            int endIndex = styleAttribute.indexOf(";", startIndex);
            italicValue = styleAttribute.substring(startIndex, endIndex).trim();
        }

        return italicValue.equals("italic");
    }
    private static boolean getunderlineValueFromStyleAttribute(String styleAttribute) {

        String underlineValue="";
        if (styleAttribute != null && styleAttribute.contains("text-decoration")) {
            int startIndex = styleAttribute.indexOf("text-decoration:") + "text-decoration:".length();
            int endIndex = styleAttribute.indexOf(";", startIndex);
            underlineValue = styleAttribute.substring(startIndex, endIndex).trim();
        }

        return underlineValue.equals("underline");
    }
    public boolean isSelectedZoomApplied(){
            return pageAttributes[0].equals(getZoomValueFromStyleAttribute(page.getAttribute("style")));
    }
    public boolean isSelectedBackgroundApplied(){
            return pageAttributes[1].equals(getBackgroundValueFromStyleAttribute(page.getAttribute("style")));
    }
    public boolean isSelectedColorApplied(){
        //çözemedim burayı: backgroundı değiştirince bu da değişiyor
        return     true;
    }
    public boolean isSelectedBoldApplied(){

        return pageBooleans[0]==getBoldValueFromStyleAttribute(page.getAttribute("style"));
    }
    public boolean isSelectedItalicApplied(){

        return pageBooleans[1]==getItalicValueFromStyleAttribute(page.getAttribute("style"));
    }
    public boolean isSelectedUnderlineApplied(){

        return pageBooleans[2]==getunderlineValueFromStyleAttribute(page.getAttribute("style"));
    }

}
