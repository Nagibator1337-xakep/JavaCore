package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends BasePage {

    MainPageLocators locate = new MainPageLocators();

    public MainPage(WebDriver driver) {
        super(driver);
    }

/**
 * Checking if there is a Create Folder button for a list of already created folders, if so - return it.
 * If folder list is empty - return different Create Folder Button
 */
    private WebElement getCreateFolderButton() {
        wait.until(ExpectedConditions.elementToBeClickable(locate.byComposeMailButton));
        if (driver.findElements(locate.byCreateFolderButton_foldersExist).size() == 1) {
            return driver.findElement(locate.byCreateFolderButton_foldersExist);
        }
        return driver.findElement(locate.byCreateFolderButton_noFoldersYet);
    }

    private WebElement getFolderNameField() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locate.byFolderNameField));
        return driver.findElement(locate.byFolderNameField);
    }

    private WebElement getDialogCreateFolderButton() {
        wait.until(ExpectedConditions.elementToBeClickable(locate.byCreateFolderSubmitButton));
        return driver.findElement(locate.byCreateFolderSubmitButton);
    }

    private WebElement getCreatedFolderMenuItem(String folderName) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locate.getFolderMenuItem_byName(folderName))) ;
        return driver.findElement(locate.getFolderMenuItem_byName(folderName));
    }

    private WebElement getDeleteNotEmptyFolderButton() {
        wait.until(ExpectedConditions.elementToBeClickable(locate.byDeleteNotEmptyFolderSubmitButton));
        return driver.findElement(locate.byDeleteNotEmptyFolderSubmitButton);
    }

    private WebElement getDeleteFolderMenuItem() {
        wait.until(ExpectedConditions.elementToBeClickable(locate.byDeleteFolderContextMenuItem));
        return driver.findElement(locate.byDeleteFolderContextMenuItem);
    }

    private String getEmptyNewFolderName() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locate.byEmptyFolderPlaceholder));
        // Getting a New Folder name from the empty folder page text between « »
        return driver.findElement(locate.byEmptyFolderPlaceholder).getText().split("«|»")[1];
    }

    private String getEmptyNewFolderId() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locate.byEmptyFolderPlaceholder));
        String url = driver.getCurrentUrl();
        return url.split("/")[4];
    }

    /**
     * If folderName is 22 symbols or less - returns folderName
     * else returns first 15 symbols + … + last 5 symbols
     * For example VeryVeryVeryLongFolderName (26 symbols long) becomes VeryVeryVeryLon…rName
     * but JustRegularLengthName (21 symbols long) stays as is.
     */
    private String compactedName(String folderName) {
        if (folderName.length()<23) return folderName;
        return folderName.substring(0,14) + "…" + folderName.substring(folderName.length()-5);
    }

    public void createFolder(String folderName) {
        getCreateFolderButton().click();
        getFolderNameField().sendKeys(folderName);
        getDialogCreateFolderButton().click();
        getCreatedFolderMenuItem(folderName).click();

        // If a Folder with that name already exists we add another 0-10 index
        try {
            driver.findElement(locate.byFolderAlreadyExistsMessage);
            int index = (int) (Math.random() * 10);
            getFolderNameField().sendKeys("_" + index);
            getDialogCreateFolderButton().click();
            getCreatedFolderMenuItem(folderName + "_" + index).click();
        } catch (NoSuchElementException ignored) {
        }
    }

    public void deleteFolder(String folderName) {
        WebElement folderToDelete = getCreatedFolderMenuItem(folderName);
        Actions builder = new Actions(driver);
        Action contextClickFolder = builder
                .contextClick(folderToDelete)
                .pause(200)
                .build();
        contextClickFolder.perform();
        getDeleteFolderMenuItem().click();
        wait.until(ExpectedConditions.stalenessOf(folderToDelete));

        try {
            driver.findElement(locate.getFolderMenuItem_byName(folderName));
            getDeleteNotEmptyFolderButton().click();
        } catch (NoSuchElementException ignored) {}
    }

    public boolean isOpen() {
        boolean logged = false;
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(locate.byLoadedMailWindow));
            driver.findElement(locate.byLoadedMailWindow);
            logged = true;
        } catch (NoSuchElementException ignored) {}

        return logged;
    }

    public boolean isFolderCreated() throws InterruptedException {
        String id = getEmptyNewFolderId();
        wait.until(ExpectedConditions.visibilityOfElementLocated(locate.getFolderMenuItem_byId(id)));
        WebElement newFolderMenuItem = driver.findElement(locate.getFolderMenuItem_byId(id));
        return newFolderMenuItem.getText().equals(getEmptyNewFolderName());
    }

    public boolean isFolderDeleted(String folderName) {
        boolean deleted = false;
        try {
            driver.findElement(locate.getFolderMenuItem_byName(folderName));

        } catch (NoSuchElementException e) {
            deleted = true;
        }

        return deleted;
    }
}