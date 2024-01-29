package autoCompleteTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 1. Open the browser and navigate to the page
 * 2. click on web automation link
 * 3. click on the auto complete button
 * 4. click on the multiple and remote button
 * 5. Enter "s" in the text field
 * 6. Verify that the suggestion menu is not displayed
 * 7. Clear the text field
 * 8. Enter "sp" in the text field
 * 9. Verify that "Loading suggestions..." message is displayed
 * 10. Verify that the suggestion menu is displayed
 * 11.Verify that the suggestions in the menu starts with sp(suggestions can be more than one)
 */

public class AutoCompleteMultiRemoteTest extends Hooks {
    @Test
    public void testMultipleAndRemoteAutoComplete(){
        //1. Open the browser and navigate to the page
        //2. click on web automation link
        pages.getHomePage().clickOnWebAutomationLink();

        //3. click on the auto complete button
        pages.getWebAutomationPage().clickOnAutocompleteLink();

        //4. click on the multiple and remote button
        pages.getWebAutomationPage().clickOnMultipleAndRemoteLink();

        //5. Enter "s" in the text field
        pages.getMultipleAndRemotePage().insertBirdName("s");

        //6. Verify that the suggestion menu is not displayed
        assertFalse(pages.getMultipleAndRemotePage().isSuggestionListNotEmpty());

        //7. Clear the text field
        pages.getMultipleAndRemotePage().clearBirdsTextBox();

        //8. Enter "sp" in the text field
        pages.getMultipleAndRemotePage().insertBirdName("sp");

        //9. Verify that "Loading suggestions..." message is displayed
        String actualMessage = pages.getMultipleAndRemotePage().getLoadingSuggestionMessage();
        String expectedMessage = "Loading suggestions...";
        assertEquals(expectedMessage,actualMessage,"Wrong message");

        //10. Verify that the suggestion menu is displayed
        assertTrue(pages.getMultipleAndRemotePage().isSuggestionListNotEmpty());

        //11.Verify that the suggestions in the menu starts with sp(suggestions can be more than one)
        assertTrue(pages.getMultipleAndRemotePage().checkElements("sp"));


    }
}