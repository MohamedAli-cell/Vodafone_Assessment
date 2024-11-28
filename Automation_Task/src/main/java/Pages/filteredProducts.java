package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class filteredProducts extends PageBase {
    By product1 = By.xpath("/html/body/vf-root/main/section[2]/vf-product-list-page/div/div/div[2]/div[5]/vf-product-box-featured[1]/div/div/div[3]/div/div[1]/p");


    public filteredProducts(WebDriver driver) {
        super(driver);
    }
    public void openProduct1Page()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(product1)).click();
    }

}
