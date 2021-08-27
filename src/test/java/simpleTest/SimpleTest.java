package simpleTest;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

// https://passport.yandex.ru/auth
// Login        pavel.beloff1337
// Password     YandexPass1337
// WrongPass    WrongPass2021

public class SimpleTest {
    WebDriver driver;
    WebDriverWait wait;
    FluentWait<WebDriver> fluentWait;

    String url = "https://passport.yandex.ru/auth";
    String userName = "pavel.beloff1337";
    String correctPassword = "YandexPass1337";
    String wrongPassword = "WrongPass2021";

    @BeforeMethod
    public void startUp() {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        wait = new WebDriverWait(driver,10,100);
        fluentWait = new FluentWait<WebDriver>(driver)
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class)
                .ignoring(ElementClickInterceptedException.class)
                .pollingEvery(Duration.ofMillis(100))
                .withTimeout(Duration.ofSeconds(10));


        driver.get(url);

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='passp-field-login']")));
        WebElement emailField = driver.findElement(By.xpath("//*[@id='passp-field-login']"));
        emailField.sendKeys(userName);

        emailField.sendKeys(Keys.ENTER);

    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2500);
        driver.quit();
    }

    @Test
    public void loginTest_correctCredentials_loggedToApp() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='passp-field-passwd']")));
        WebElement passwdField = driver.findElement(By.xpath("//*[@id='passp-field-passwd']"));
        passwdField.sendKeys(correctPassword);
//        passwdField.sendKeys("WrongPass2021");

        passwdField.sendKeys(Keys.ENTER);

        boolean logged = false;
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("dheader-logo_id")));
            driver.findElement(By.className("dheader-logo_id"));
            logged = true;
        } catch (NoSuchElementException ignored) {}

        Assert.assertTrue(logged);

//        WebElement accName = driver.findElement(By.xpath("(//*[@class='user-account__name'])[1]"));
//        accName.click();

//        WebElement exitButton = driver.findElement(By.xpath("//*[text()='Выйти']"));
//        exitButton.click();

    }

    @Test
    public void loginTest_wrongCredentials_error() {
        // Home Work
//        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='passp-field-passwd']")));
        fluentWait.until(x -> x.findElement(By.xpath("//*[@id='passp-field-passwd']")));

        WebElement passwdField = driver.findElement(By.xpath("//*[@id='passp-field-passwd']"));
        passwdField.sendKeys(wrongPassword);
//        passwdField.sendKeys("YandexPass1337");

        passwdField.sendKeys(Keys.ENTER);

        boolean wrongPass = false;
        try {
//            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Неверный пароль']")));
            fluentWait.until(x -> x.findElement(By.xpath("//*[text()='Неверный пароль']")));
            driver.findElement(By.xpath("//*[text()='Неверный пароль']"));
            wrongPass = true;
        } catch (NoSuchElementException ignored) {}

        Assert.assertTrue(wrongPass);
    }

    @Test
    public void mailLoginTest_changeUITheme() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='passp-field-passwd']")));
        WebElement passwdField = driver.findElement(By.xpath("//*[@id='passp-field-passwd']"));
        passwdField.sendKeys(correctPassword);

        passwdField.sendKeys(Keys.ENTER);

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@class='user-account__name'])[1]")));
        WebElement accName = driver.findElement(By.xpath("(//*[@class='user-account__name'])[1]"));
        accName.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Почта']")));
        WebElement mailButton = driver.findElement(By.xpath("//*[text()='Почта']"));
        mailButton.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class,'control button2')]")));
        WebElement themesButton = driver.findElement(By.xpath("//button[contains(@class,'control button2')]"));
        themesButton.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='mail-ThemeOverlay-List-Item-Thumbnail js-theme-thumbnail' and contains(span,'Трава')]")));
        WebElement grassTheme = driver.findElement(By.xpath("//*[@class='mail-ThemeOverlay-List-Item-Thumbnail js-theme-thumbnail' and contains(span,'Трава')]"));
        grassTheme.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='mail-ThemeOverlay-Close js-close']")));
        WebElement closeButton = driver.findElement(By.xpath("//*[@class='mail-ThemeOverlay-Close js-close']"));
        closeButton.click();


        boolean isThemeGrass = false;
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//html[contains(@class,'theme-u2709')]")));
            driver.findElement(By.xpath("//html[contains(@class,'theme-u2709')]"));
            isThemeGrass = true;
        } catch (NoSuchElementException ignored) {}

        Assert.assertTrue(isThemeGrass);
    }
}
