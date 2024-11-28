package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends PageBase {

    By userNameTextbox = By.cssSelector("input#username");

    By passwordTextbox = By.cssSelector("input#password");

    By goToMyAccountButton = By.id("submitBtn");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void enterUserName(String username)
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(userNameTextbox)).sendKeys(username);
    }

    public void enterPassword(String password)
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordTextbox)).sendKeys(password);
    }

    public void clickOnGoToMyAccountButton()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(goToMyAccountButton)).click();
    }

}
