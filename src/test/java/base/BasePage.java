package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.CartPage;

import java.time.Duration;

public class BasePage {

    protected WebDriver driver;
    public static WebDriverWait wait;

    public static final By cartItems = By.id("cart-items");
    private final By goToCartButton = By.id("js-cart");
    public BasePage(WebDriver driver) {
        this.driver=driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public static String getNumberOfCartItems() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(cartItems)).getText();
    }

    public CartPage goToCart() {
        driver.findElement(cartItems).click();
        wait.until(ExpectedConditions.elementToBeClickable(goToCartButton)).click();
        return new CartPage(driver);
    }
}
