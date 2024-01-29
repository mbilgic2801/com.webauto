package autoCompleteTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

import java.util.List;

public class AccentFoldingTest extends Hooks {
    List<String> firstNameList;
    List<String> secondNameList;



    @Test
    public void testMultipleAndRemoteAutoComplete() {
        //1. Open the browser and navigate to the page
        //2. click on web automation link
        pages.getHomePage().clickOnWebAutomationLink();

        //3. click on the auto complete button
        pages.getWebAutomationPage().clickOnAutocompleteLink();

        pages.getWebAutomationPage().clickOnAccentFoldingLink();

        pages.getAccentFoldingPage().insertName("jo");
        firstNameList = pages.getAccentFoldingPage().getNameSuggestions();
        Assertions.assertTrue("Jörn Zaefferer".equals(firstNameList.get(0)) && "John Resig".equals(firstNameList.get(1)));
        BrowserUtils.wait(2);
        pages.getAccentFoldingPage().insertName("jö");
        BrowserUtils.wait(2);
        secondNameList = pages.getAccentFoldingPage().getNameSuggestions();
        System.out.println(secondNameList.get(0)+"------"+secondNameList.size());
        Assertions.assertTrue("Jörn Zaefferer".equals(secondNameList.get(0)) && secondNameList.size() == 1);



    }
}
