package pages.checkboxRadio;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utils.BrowserUtils;

import java.util.List;

public class ProductSelector_Page extends BasePage {
    @FindBy(xpath = "//div[@class='brand-options']//input")
    public List<WebElement> brandOptions;
    @FindBy(xpath = "//div[@class='shape-options']//input")
    private List<WebElement> shapeOptions;
    @FindBy(xpath = "//div[@class='toggle-options']//input")
    private List<WebElement> styleOptions;
    @FindBy(xpath = "//div[@class='preview']/div")
    private WebElement preview;
    public void selectBrand(int index){
        brandOptions.get(index).click();
    }
    public void selectShape(int index){
        shapeOptions.get(index).click();
    }
    public void selectShadow(){
        styleOptions.get(0).click();
    }
    public void selectBorder(){
        styleOptions.get(1).click();
    }
    public void selectColor(){
        styleOptions.get(2).click();
    }
    public void createProduct(int brand,int shape,boolean shadow,boolean border,boolean red){
        selectBrand(brand);
        selectShape(shape);
        BrowserUtils.scrollDownWithPageDown();
        if(shadow) selectShadow();
        if(border) selectBorder();
        if(red) selectColor();
    }
    public String getSelectedBrandName(){
        String str="";
        for (WebElement brandOption : brandOptions) {
            if (brandOption.isSelected())
                str = brandOption.getAttribute("value");
        }
        return str;
    }
    public String getSelectedShape(){
        String str="";
        for (WebElement shapeOption : shapeOptions) {
            if (shapeOption.isSelected()) {
                str = shapeOption.getAttribute("value");
            }
        }
        return str;
    }
    public String getStyle(){
        String str="";
        if (!styleOptions.get(0).isSelected()){
            str=str+"there is no shadow";
        }
        if (styleOptions.get(1).isSelected()){
            str=str+"\nthere is a border";
        }
        if (styleOptions.get(2).isSelected()){
            str=str+"\nbackground-color is red";
        }
        return str;
    }
    public boolean isOutputCorrect(){
        String str=getStyle();
        boolean shadow=str.contains("shadow")==preview.getAttribute("class").contains("shadow");
        boolean border=str.contains("border")==preview.getAttribute("class").contains("border");
        boolean color=str.contains("background-color")==preview.getAttribute("class").contains("background-color");
        return shadow&&border&&color;

    }
}
