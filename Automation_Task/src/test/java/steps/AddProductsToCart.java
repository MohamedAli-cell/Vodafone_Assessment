package steps;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.ProductPage;
import Pages.filteredProducts;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import tests.TestBase;

public class AddProductsToCart extends TestBase {
    HomePage home ;
    ProductPage product;
    LoginPage login;
    filteredProducts filteredProductsPage;
    @Given("Browser open on home page")
    public void browser_open_on_home_page() {

        home = new HomePage(driver);
        product = new ProductPage(driver);
        login = new LoginPage(driver);
        filteredProductsPage = new filteredProducts(driver);
        Assert.assertEquals(driver.getCurrentUrl(),"https://eshop.vodafone.com.eg/shop/home");
    }
    @When("Choose English language and accept the cookies")
    public void choose_english_language_and_accept_the_cookies() {
        home.chooseEnglish();
        home.acceptAllCookies();
    }
    @When("Login with your account using {string} , {string}")
    public void login_with_your_account_using(String mobileNumber, String password) {
        home.loginPage();
        login.enterUserName(mobileNumber);
        login.enterPassword(password);
        login.clickOnGoToMyAccountButton();
    }
    @When("Filter the products to show only TVs")
    public void filter_the_products_to_show_only_TVs() {
        home.openTVsPage();
        Assert.assertEquals(driver.getCurrentUrl(),"https://eshop.vodafone.com.eg/en/list?categoryUrls=%2Ftv");
    }
    @When("Choose the required TV and open it's page")
    public void choose_the_required_tv_and_open_it_s_page() {
        filteredProductsPage.openProduct1Page();
        Assert.assertEquals(driver.getCurrentUrl(),"https://eshop.vodafone.com.eg/en/prod/samsung-smart-tv-50-inch-crystal-4k-uhd---50du7000");
    }
    @When("add it to card")
    public void add_it_to_card() {
        product.addProductToCart();
    }
    @When("Filter the products to show only Smartphones")
    public void filter_the_products_to_show_only_smartphones() {
        home.openSmartPhonesPage();
    }
    @When("Choose the required smartphone and open it's page")
    public void choose_the_required_smartphone_and_open_it_s_page() {
        filteredProductsPage.openProduct1Page();
        product.addProductToCart();
    }
    @When("Search about {string} you want")
    public void search_about_you_want(String productName) {
        product.searchProduct(productName);
    }
    @When("Choose the required product and open it's page")
    public void choose_the_required_product_and_open_it_s_page() {
        filteredProductsPage.openProduct1Page();
    }
    @When("add this product to card")
    public void add_this_product_to_card() throws InterruptedException {
        product.addProductToCart();
        Thread.sleep(1000);
    }
    @Then("you have added three products to cart")
    public void you_have_added_three_products_to_cart() {

    }
}
