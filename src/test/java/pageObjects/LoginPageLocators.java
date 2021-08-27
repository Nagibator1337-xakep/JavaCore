package pageObjects;

import org.openqa.selenium.By;

public class LoginPageLocators {
    public By byLoginButton = By.xpath("//button[@id='passp:sign-in']");
    public By byUserNameField = By.xpath("//*[@id='passp-field-login']");
    public By byPasswordField = By.xpath("//*[@id='passp-field-passwd']");
    public By byLoginErrorState = By.xpath("//*[contains(@id,'field:input-login:hint') or contains(@id,'field:input-passwd:hint')]");

}
