package datePicker;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;


public class DisplayMultipleMonths_Test extends Hooks {
    @Test
    public void testDisplayMultipleMonthsFunctions(){
        pages.getHomePage().clickOnWebAutomationLink();
        BrowserUtils.scrollDownWithPageDown();
        pages.getWebAutomationPage().clickOnDatepickerLink();
        BrowserUtils.scrollUpWithPageUp();
        pages.getWebAutomationPage().clickOnDisplayMultipleMonthsLink();
        pages.getDisplayMultipleMonthsPage().clickOnDateTextField();
        pages.getDisplayMultipleMonthsPage().clickOnTodayButton();
        pages.getDisplayMultipleMonthsPage().clickOnDoneButton();
       // System.out.println("------"+pages.getDisplayMultipleMonthsPage().getDateText());
        pages.getDisplayMultipleMonthsPage().clickOnDateTextField();
        pages.getDisplayMultipleMonthsPage().clickOnDayWithIndex(66);
        pages.getDisplayMultipleMonthsPage().clickOnDateTextField();

        System.out.println("------"+pages.getDisplayMultipleMonthsPage().getSelectedDate());
        System.out.println("------"+pages.getDisplayMultipleMonthsPage().getDateInputFieldsText());
        System.out.println("------"+pages.getDisplayMultipleMonthsPage().getDateInputFieldsText2());
        BrowserUtils.wait(5);
        Assertions.assertTrue(pages.getDisplayMultipleMonthsPage().doesNextButtonFunctionsCorrectly());
        BrowserUtils.wait(2);
        Assertions.assertTrue(pages.getDisplayMultipleMonthsPage().doesPreviousButtonFunctionsCorrectly());
        BrowserUtils.wait(2);








    }
}
