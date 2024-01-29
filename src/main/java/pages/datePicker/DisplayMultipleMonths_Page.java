package pages.datePicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DisplayMultipleMonths_Page extends BasePage {
    Date date=new Date();
    List<String> months= new ArrayList<>(List.of(new String[]{"january","february","march","april","may","june","july","august","september","october","november","december"}));


    @FindBy(xpath = "//input[@id='datepicker-multiple-months']")
    private WebElement dateTextField;
    @FindBy(xpath = "//*[@id=\"datepicker-multiple-months\"]")
    private WebElement dateTextField2;
    @FindBy(className = "hasDatepicker")
    private WebElement datepickerElement;
    @FindBy(xpath = "//button[normalize-space()='Today']")
    private WebElement todayButtton;
    @FindBy(xpath = "//button[normalize-space()='Done']")
    private WebElement doneButtton;
    @FindBy(xpath = "//a[@class='ui-state-default']")
    private List<WebElement> dates;
    @FindBy(xpath = "//*[@aria-current='true']")
    private WebElement selectedDate;


    @FindBy(xpath = "//a[@title='Prev']")
    private WebElement previousButton;
    @FindBy(xpath = "//a[@title='Next']")
    private WebElement nextButton;
    @FindBy(xpath = "//span[contains(@class,'month')]")
    private List<WebElement> shownMonths;
    public String getDateInputFieldsText(){return dateTextField.getText();}
    public String getDateInputFieldsText2(){return dateTextField2.getText();}
    public String getSelectedDate(){

        return getSelectedMonth()+"/"+getSelectedDay()+"/"+getSelectedYear();
}
    public String getSelectedDay(){
        String day=selectedDate.getAttribute("data-date");
        return (day.length()>1)?day:"0"+day;
    }
    public String getSelectedMonth(){
        WebElement dateInfo=selectedDate.findElement(By.xpath(".."));
        String month=""+ (Integer.parseInt(dateInfo.getAttribute("data-month"))+1);
        return  (month.length()>1)?month:"0"+month;
    }
    public String getSelectedYear(){
        WebElement dateInfo=selectedDate.findElement(By.xpath(".."));
        return dateInfo.getAttribute("data-year");

    }
    public void clickOnDateTextField(){dateTextField.click();}
    public void clickOnTodayButton(){todayButtton.click();}
    public void clickOnDoneButton(){doneButtton.click();}
    public void clickOnDayWithIndex(int index){
        dates.get(index).click();
    }
    public void clickOnPreviousButton(){previousButton.click();}
    public void clickOnNextButton(){nextButton.click();}
    public boolean doesNextButtonFunctionsCorrectly(){
        clickOnDateTextField();
        String month = shownMonths.get(0).getText().toLowerCase();
        int index = months.indexOf(month);
        clickOnNextButton();
        month = shownMonths.get(0).getText().toLowerCase();
        return month.equals(months.get((index==11)?0:index+1));
    }
    public boolean doesPreviousButtonFunctionsCorrectly(){
        clickOnDateTextField();
        String month = shownMonths.get(0).getText().toLowerCase();
        int index = months.indexOf(month);
        clickOnPreviousButton();
        month = shownMonths.get(0).getText().toLowerCase();
        return month.equals(months.get((index==0)?11:index-1));

    }

}
