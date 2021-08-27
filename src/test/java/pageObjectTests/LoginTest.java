package pageObjectTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoginPage;
import pageObjects.MainPage;

public class LoginTest extends BaseTest {
    String wrongUsername = "WrongUsername-99w9999asdf9999";
    String wrongPassword = "WrongPassword";

    @Test
    public void loginTest_correctCredentials_successfulLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.login(username,password);
        Assert.assertTrue(mainPage.isOpen());
    }

    @Test
    public void loginTest_wrongUsername_alertLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.enterUsername(wrongUsername);
        Assert.assertTrue(loginPage.isErrorState());
    }

    @Test
    public void loginTest_wrongPassword_alertLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        loginPage.enterUsername(username);
        loginPage.enterPassword(wrongPassword);
        Assert.assertTrue(loginPage.isErrorState());
    }
}
