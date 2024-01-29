package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WebAutomationPage extends BasePage {
    @FindBy(linkText = "Draggable")
    private WebElement draggableLink;
    @FindBy(linkText = "Default Functionality")
    private WebElement defaultFunctionalityLink;
    @FindBy(linkText = "Accept")
    private WebElement acceptLink;
    @FindBy(linkText = "Revert draggable position")
    private WebElement revertDraggablePosition;
    @FindBy(linkText = "Auto Scrolling")
    private WebElement autoScrollingLink;
    @FindBy(linkText = "Constrain Movement")
    private WebElement constrainMovementLink;
    @FindBy(linkText = "Handles")
    private WebElement handlesLink;
    @FindBy(linkText = "Droppable")
    private WebElement droppableLink;
    @FindBy(linkText = "Resizable")
    private WebElement resizableLink;
    @FindBy(linkText = "Synchronus Resize")
    private WebElement synchronusResizeLink;
    @FindBy(linkText = "Textarea")
    private WebElement textAreaLink;
    @FindBy(linkText = "Serialize")
    private WebElement serializeLink;
    @FindBy(linkText = "Selectable")
    private WebElement selectableLink;
    @FindBy(linkText = "Iframe")
    private WebElement iframeLink;
    @FindBy(linkText = "Nested Iframe")
    private WebElement nestedIframeLink;
    @FindBy(linkText = "Normal Iframe")
    private WebElement normalIFrameLink;
    @FindBy(linkText = "Alerts")
    private WebElement alertsLink;
    @FindBy(linkText = "Animate")
    private WebElement animateLink;
    @FindBy(linkText = "Autocomplete")
    private WebElement autocompleteLink;
    @FindBy(linkText = "Multiple & Remote")
    private WebElement multipleRemoteLink;
    @FindBy(linkText = "Accent Folding")
    private WebElement accentFoldingLink;
    @FindBy(linkText = "Menu")
    private WebElement menuLink;
    @FindBy(linkText = "Icons")
    private WebElement iconsLink;
    @FindBy(linkText = "Progress Bar")
    private WebElement progressBarLink;
    @FindBy(linkText = "Download Dialog")
    private WebElement downloadDialogLink;
    @FindBy(linkText = "Datepicker")
    private WebElement datepickerLink;
    @FindBy(linkText = "Display Multiple Months")
    private WebElement displayMultipleMonthsLink;
    @FindBy(linkText = "Select Date Range")
    private WebElement selectDateRangeLink;
    @FindBy(linkText = "Control Group")
    private WebElement controlGroupLink;
    @FindBy(linkText = "Toolbar")
    private WebElement toolbarLink;
    @FindBy(linkText = "Dialog")
    private WebElement dialogLink;
    @FindBy(linkText = "Modal Form")
    private WebElement modalFormLink;
    @FindBy(linkText = "Slider")
    private WebElement sliderLink;

    @FindBy(linkText = "Snap to increments")
    private WebElement snapToIncrementsLink;
    @FindBy(linkText = "Spinner Overflow")
    private WebElement spinnerOverflowLink;
    @FindBy(linkText = "Spinner")
    private WebElement spinnerLink;
    @FindBy (linkText = "Sortable")
    private WebElement sortableLink;
    @FindBy (linkText = "Display as Grid")
    private WebElement displayAsGridLink;
    @FindBy(linkText = "Include / exclude items")
    private WebElement includeExcludeItemsLink;
    @FindBy(linkText = "Accordion")
    private WebElement accordionLink;
    @FindBy(linkText = "Collapse Content")
    private WebElement collapseContentLink;
    @FindBy(linkText = "Button")
    private WebElement buttonLink;
    @FindBy(linkText = "Default Functionality")
    private WebElement buttonDefaultFunctionalityLink;
    @FindBy(linkText = "Checkbox Radio")
    private WebElement checkboxRadioLink;
    @FindBy(linkText = "Product Selector")
    private WebElement productSelectorLink;


    public void clickOnDraggableLink() {
        draggableLink.click();
    }

    public void clickOnRevertDraggablePosition() {
        revertDraggablePosition.click();
    }

    public void clickOnConstrainMovementLink() {
        constrainMovementLink.click();
    }

    public void clickOnHandlesLink() {
        handlesLink.click();
    }

    public void clickOnAcceptLink() {
        acceptLink.click();
    }

    public void clickOnSynchronusResizeLink() {
        synchronusResizeLink.click();
    }

    public void clickOnDraggableDefaultFunctionalityLink() {
        defaultFunctionalityLink.click();
    }

    public void clickOnDroppableDefaultFunctionalityLink() {
        defaultFunctionalityLink.click();
    }

    public void clickOnDroppableLink() {
        droppableLink.click();
    }

    public void clickOnAutoScrollingLink() {
        autoScrollingLink.click();
    }

    public void clickOnResizableLink() {
        resizableLink.click();
    }

    public void clickOnResizableDefaultFuncLink() {
        defaultFunctionalityLink.click();
    }

    public void clickOnSelectableLink() {
        selectableLink.click();
    }

    public void clickOnDefaultFunctionality() {
        defaultFunctionalityLink.click();
    }

    public void clickOnIframeLink() {
        iframeLink.click();
    }

    public void clickOnNestedIframe() {
        nestedIframeLink.click();
    }

    public void clickOnAlertsLink() {
        alertsLink.click();
    }

    public void clickOnAnimateLink() {
        animateLink.click();
    }

    public void clickOnTextAreaLink() {textAreaLink.click();}

    public void clickOnSerializeLink() {serializeLink.click();}

    public void clickOnNormalIFrameLink() {normalIFrameLink.click();}

    public void clickOnAutocompleteLink() {autocompleteLink.click();}

    public void clickOnMultipleAndRemoteLink() {multipleRemoteLink.click();}

    public void clickOnAccentFoldingLink() {accentFoldingLink.click();}

    public void clickOnMenuLink() {menuLink.click();}

    public void clickOnIconsLink() {iconsLink.click();}

    public void clickOnProgressBarLink() {progressBarLink.click();}

    public void clickOnDownloadDialogLink() {downloadDialogLink.click();}

    public void clickOnDatepickerLink() {datepickerLink.click();}

    public void clickOnDisplayMultipleMonthsLink() {displayMultipleMonthsLink.click();}

    public void clickOnSelectDateRangeLink() {selectDateRangeLink.click();}

    public void clickOnControlGroupLink() {controlGroupLink.click();}

    public void clickOnToolbarLink() {toolbarLink.click();}

    public void clickOnDialogLink() {dialogLink.click();}

    public void clickOnModalFormLink() {modalFormLink.click();}

    public void clickOnSliderLink() {sliderLink.click();}

    public void clickOnSnapToIncrementsLink() {snapToIncrementsLink.click();}

    public void clickOnSpinnerLink() {spinnerLink.click();}

    public void clickOnSpinnerOverflowLink() {spinnerOverflowLink.click();}
    public void clickOnDisplayAsGridLink(){displayAsGridLink.click();}
    public void clickOnSortableLink(){sortableLink.click();}
    public void clickOnIncludeExcludeItemsLink(){includeExcludeItemsLink.click(); }
    public void clickOnAccordionLink(){accordionLink.click();}
    public void clickOnCollapseContentLink(){collapseContentLink.click();}
    public void clickOnButtonLink(){buttonLink.click();}
    public void clickOnButtonDefaultFunctionalityLink(){buttonDefaultFunctionalityLink.click();}
    public void clickOnCheckboxRadioLink(){checkboxRadioLink.click();}
    public void clickOnProductSelectorLink(){productSelectorLink.click();}


}
