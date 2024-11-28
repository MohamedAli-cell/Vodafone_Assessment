package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ProductPage extends PageBase{

    By addToCartButton = By.cssSelector("button.add-to-cart");

    By searchBar = By.id("searchInput");

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void addProductToCart()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(addToCartButton)).click();
    }

    public void searchProduct(String productName)
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchBar)).sendKeys(productName);
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchBar)).sendKeys(Keys.RETURN);
    }
}
