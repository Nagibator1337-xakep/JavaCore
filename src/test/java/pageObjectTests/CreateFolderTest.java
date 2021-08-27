package pageObjectTests;

import helpers.TestObjectGenerator;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

public class CreateFolderTest extends BaseTest {
    /**
     * Insert Folder Name generator here.
     * Do not use Strings longer than 30 symbols.
     * Do not use Strings containing symbols « » for a Folder Name, there is a RegEx check in place.
     */
//    String folderName = TestObjectGenerator.randomFakerString();
    String folderName = "123nananananananananananana";
                      // 123nananananana…      anana

    @Test
    public void createFolderTest_correctFolderName_successfullyCreated() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login(username,password);
        mainPage.createFolder(folderName);

        Assert.assertTrue(mainPage.isFolderCreated());
    }

    @Test
    public void deleteFolderTest_correctFolderName_successfullyDeleted() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login(username,password);
        mainPage.deleteFolder(folderName);
        Assert.assertTrue(mainPage.isFolderDeleted(folderName));
    }
}
