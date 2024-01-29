package utils;

import pages.HomePage;
import pages.WebAutomationPage;
import pages.accordion.CollapseContent_Page;
import pages.alerts.AlertTypes_Page;
import pages.autoComplete.AccentFolding_Page;
import pages.autoComplete.MultipleAndRemote_Page;
import pages.button.ButtonDefaultFunctionality_Page;
import pages.checkboxRadio.ProductSelector_Page;
import pages.controlGroup.Toolbar_Page;
import pages.datePicker.DisplayMultipleMonths_Page;
import pages.datePicker.SelectDateRange_Page;
import pages.dialog.ModalForm_Page;
import pages.draggable.AutoScrolling_Page;
import pages.draggable.ConstrainMovement_Page;
import pages.draggable.Draggable_DefFunc_Page;
import pages.draggable.Handles_Page;
import pages.droppable.Accept_Page;
import pages.droppable.Droppable_DefFunc_Page;
import pages.droppable.Revert_Draggable_Position_Page;
import pages.iframe.NestedIframe_Page;
import pages.iframe.Normal_IFrame_Page;
import pages.menu.IconsPage;
import pages.progressBar.DownloadDialogPage;
import pages.resizable.Animate_Page;
import pages.resizable.Resizable_DefFunc_Page;
import pages.resizable.Synchronus_Resize_Page;
import pages.resizable.Text_Area_Page;
import pages.selectable.Selectable_DefFunc_Page;
import pages.selectable.Serialize_Page;
import pages.slider.SnapToIncrements_Page;
import pages.sortable.DisplayAsGrid_Page;

import pages.sortable.IncludeExcludeItems_Page;
import pages.spinner.SpinnerOverflow_Page;

public class Pages {
    private AlertTypes_Page alertTypesPage;

    private Animate_Page animatePage;
    private AutoScrolling_Page autoScrollingPage;

    private Draggable_DefFunc_Page draggableDefFuncPage;

    private Droppable_DefFunc_Page droppableDefFuncPage;

    private HomePage homePage;

    private NestedIframe_Page nestedIframePage;
    private Normal_IFrame_Page normalIFramePage;

    private Resizable_DefFunc_Page resizableDefFuncPage;

    private Selectable_DefFunc_Page selectableDefFuncPage;

    private WebAutomationPage webAutomationPage;
    private ConstrainMovement_Page constrainMovementPage;
    private Handles_Page handlesPage;
    private Accept_Page acceptPage;
    private Revert_Draggable_Position_Page revertDraggablePositionPage;
    private Synchronus_Resize_Page synchronusResizePage;
    private Text_Area_Page textAreaPage;
    private Serialize_Page serializePage;
    private MultipleAndRemote_Page multipleAndRemotePage;
    private AccentFolding_Page accentFoldingPage;
    private IconsPage iconsPage;
    private DownloadDialogPage downloadDialogPage;
    private DisplayMultipleMonths_Page displayMultipleMonthsPage;
    private SelectDateRange_Page selectDateRangePage;
    private Toolbar_Page toolbarPage;
    private ModalForm_Page modalFormPage;
    private SnapToIncrements_Page snapToIncrementsPage;
    private SpinnerOverflow_Page spinnerOverflowPage;
    private DisplayAsGrid_Page displayAsGridPage;
    private IncludeExcludeItems_Page includeExcludeItemsPage;
    private CollapseContent_Page collapseContentPage;
    private ButtonDefaultFunctionality_Page buttonDefaultFunctionalityPage;
    private ProductSelector_Page productSelectorPage;

    public Pages() {
        homePage = new HomePage();
        webAutomationPage = new WebAutomationPage();
        draggableDefFuncPage = new Draggable_DefFunc_Page();
        autoScrollingPage = new AutoScrolling_Page();
        droppableDefFuncPage = new Droppable_DefFunc_Page();
        resizableDefFuncPage = new Resizable_DefFunc_Page();
        selectableDefFuncPage = new Selectable_DefFunc_Page();
        nestedIframePage = new NestedIframe_Page();
        normalIFramePage = new Normal_IFrame_Page();
        alertTypesPage = new AlertTypes_Page();
        animatePage = new Animate_Page();
        constrainMovementPage = new ConstrainMovement_Page();
        handlesPage = new Handles_Page();
        acceptPage = new Accept_Page();
        revertDraggablePositionPage = new Revert_Draggable_Position_Page();
        synchronusResizePage = new Synchronus_Resize_Page();
        textAreaPage = new Text_Area_Page();
        serializePage = new Serialize_Page();
        multipleAndRemotePage = new MultipleAndRemote_Page();
        accentFoldingPage = new AccentFolding_Page();
        iconsPage = new IconsPage();
        downloadDialogPage = new DownloadDialogPage();
        displayMultipleMonthsPage = new DisplayMultipleMonths_Page();
        selectDateRangePage = new SelectDateRange_Page();
        toolbarPage = new Toolbar_Page();
        modalFormPage = new ModalForm_Page();
        snapToIncrementsPage = new SnapToIncrements_Page();
        spinnerOverflowPage = new SpinnerOverflow_Page();
        displayAsGridPage = new DisplayAsGrid_Page();
        includeExcludeItemsPage = new IncludeExcludeItems_Page();
        collapseContentPage = new CollapseContent_Page();
        buttonDefaultFunctionalityPage = new ButtonDefaultFunctionality_Page();
        productSelectorPage = new ProductSelector_Page();
    }

    public HomePage getHomePage() {
        return homePage;
    }

    public WebAutomationPage getWebAutomationPage() {
        return webAutomationPage;
    }

    public Draggable_DefFunc_Page getDraggableDefFuncPage() {
        return draggableDefFuncPage;
    }

    public AutoScrolling_Page getAutoScrollingPage() {
        return autoScrollingPage;
    }

    public Droppable_DefFunc_Page getDroppableDefFuncPage() {
        return droppableDefFuncPage;
    }

    public Resizable_DefFunc_Page getResizableDefFuncPage() {
        return resizableDefFuncPage;
    }

    public Selectable_DefFunc_Page getSelectableDefFuncPage() {
        return selectableDefFuncPage;
    }

    public NestedIframe_Page getNestedIframePage() {
        return nestedIframePage;
    }

    public Normal_IFrame_Page getNormalIFramePage() {
        return normalIFramePage;
    }

    public AlertTypes_Page getAlertTypesPage() {
        return alertTypesPage;
    }

    public Animate_Page getAnimatePage() {
        return animatePage;
    }

    public ConstrainMovement_Page getConstrainMovementPage() {
        return constrainMovementPage;
    }

    public Handles_Page getHandlesPage() {
        return handlesPage;
    }

    public Accept_Page getAcceptPage() {
        return acceptPage;
    }

    public Revert_Draggable_Position_Page getRevertDraggablePositionPage() {
        return revertDraggablePositionPage;
    }

    public Synchronus_Resize_Page getSynchronusResizePage() {
        return synchronusResizePage;
    }

    public Text_Area_Page getTextAreaPage() {
        return textAreaPage;
    }

    public Serialize_Page getSerializePage() {
        return serializePage;
    }

    public MultipleAndRemote_Page getMultipleAndRemotePage() {
        return multipleAndRemotePage;
    }

    public AccentFolding_Page getAccentFoldingPage() {
        return accentFoldingPage;
    }

    public IconsPage getIconsPage() {
        return iconsPage;
    }

    public DownloadDialogPage getDownloadDialogPage() {
        return downloadDialogPage;
    }

    public DisplayMultipleMonths_Page getDisplayMultipleMonthsPage() {
        return displayMultipleMonthsPage;
    }

    public SelectDateRange_Page getSelectDateRangePage() {
        return selectDateRangePage;
    }

    public Toolbar_Page getToolbarPage() {
        return toolbarPage;
    }

    public ModalForm_Page getModalFormPage() {
        return modalFormPage;
    }

    public SnapToIncrements_Page getSnapToIncrementsPage() {
        return snapToIncrementsPage;
    }

    public SpinnerOverflow_Page getSpinnerOverflowPage() {
        return spinnerOverflowPage;
    }

    public DisplayAsGrid_Page getDisplayAsGridPage() {
        return displayAsGridPage;
    }

    public IncludeExcludeItems_Page getIncludeExcludeItemsPage() {
        return includeExcludeItemsPage;
    }

    public CollapseContent_Page getCollapseContentPage() {
        return collapseContentPage;
    }
    public ButtonDefaultFunctionality_Page getButtonDefaultFunctionalityPage(){
        return buttonDefaultFunctionalityPage;
    }
    public ProductSelector_Page getProductSelectorPage(){
        return productSelectorPage;
    }
}
