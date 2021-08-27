package pageObjects;

import org.openqa.selenium.By;

public class MainPageLocators {

    public By byComposeMailButton = By.xpath("//a[contains(@class,'mail-ComposeButton')]");
    public By byCreateFolderButton_foldersExist = By.xpath("//span[contains(@class,'js-add-folder')]");
    public By byCreateFolderButton_noFoldersYet = By.xpath("//span[contains(@class,'mail-FolderList-Setup_link')]");
    public By byFolderNameField = By.xpath("//input[contains(@class,'js-input-name')]");
    public By byCreateFolderSubmitButton = By.xpath("//button[contains(@data-dialog-action,'dialog.submit')]");
    public By byDeleteNotEmptyFolderSubmitButton = By.xpath("//button[@data-dialog-action='dialog.submit']");
    public By byDeleteFolderContextMenuItem = By.xpath("//div[@data-id='3']");
    public By byEmptyFolderPlaceholder = By.cssSelector(".b-messages__placeholder-item");
    public By byFolderAlreadyExistsMessage = By.xpath("//span[contains(text(),'уже существует')]");
    public By byLoadedMailWindow = By.xpath("//*[@class='mail-Layout-ContentWrapper']");

    public By getFolderMenuItem_byName(String folderName) {
        return By.xpath("//a[@data-title='" + folderName + "']/span");
    }

    public By getFolderMenuItem_byId(String id) {
        return By.xpath("//a[@data-fid='" + id + "']/span");
    }

}
