package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends PageBase {

    By englishLanguageButton = By.id("home-button-1");
    By cookiesAcceptanceButton = By.id("onetrust-accept-btn-handler");
    By TVsPage = By.xpath("/html/body/vf-root/main/section[1]/vf-categories-navbar/nav/div/button[4]/span");
    By smartPhonesPage = By.xpath("/html/body/vf-root/main/section[1]/vf-categories-navbar/nav/div/button[3]/span");
    By accountIcon = By.xpath("//*[@id=\"userProfileMenu\"]/button/img");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void chooseEnglish ()
    {
        driver.findElement(englishLanguageButton).click();
    }

    public void acceptAllCookies()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(cookiesAcceptanceButton)).click();
    }

    public void loginPage()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(accountIcon)).click();

    }
    public void openTVsPage()     {
        wait.until(ExpectedConditions.visibilityOfElementLocated(TVsPage)).click();
    }


    public void openSmartPhonesPage()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(smartPhonesPage)).click();
    }


}
