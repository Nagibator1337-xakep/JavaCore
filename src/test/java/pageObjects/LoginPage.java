package pageObjects;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage {

    LoginPageLocators locate = new LoginPageLocators();

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private WebElement getUsernameField() {
        wait.until(ExpectedConditions.elementToBeClickable(locate.byLoginButton));
        return driver.findElement(locate.byUserNameField);
    }

    private WebElement getPasswordField() {
        wait.until(ExpectedConditions.elementToBeClickable(locate.byLoginButton));
        return driver.findElement(locate.byPasswordField);
    }

    private WebElement getLoginButton() {
        return driver.findElement(locate.byLoginButton);
    }

    public void enterUsername(String username) {
        getUsernameField().sendKeys(username);
        getLoginButton().click();
    }
    public void enterPassword(String password) {
        getPasswordField().sendKeys(password);
        getLoginButton().click();
    }

    public MainPage login(String username,String password) {
        enterUsername(username);
        enterPassword(password);
        wait.until(ExpectedConditions.urlToBe("https://passport.yandex.ru/profile"));
        driver.get("https://mail.yandex.ru");

        return new MainPage(driver);
    }

    public void open() {
        driver.get("https://passport.yandex.ru/auth");
        driver.manage().window().maximize();
    }

    public boolean isErrorState() {
        boolean error = false;
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(locate.byLoginErrorState));
            driver.findElement(locate.byLoginErrorState);
            error = true;
        } catch (NoSuchElementException ignored) {}
        return error;
    }
}
