package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.nio.charset.StandardCharsets;

public class CartPage extends BasePage {

    private final By quantityField = By.xpath("//*[@name=\"quantity\"]");
    private final By refreshButton = By.cssSelector("i[title='Güncelle']");
    private final By alertRefreshingText = By.id("swal2-title");
    private final By cancelButton = By.cssSelector("i[title='Kaldır']");


    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void increaseQuantityByOne() {
        WebElement e = driver.findElement(quantityField);
        e.clear();
        e.sendKeys("2");
        driver.findElement(refreshButton).click();

    }
    public String getAlertText(){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(alertRefreshingText)).getText();
    }
    public void clickCancelButton(){
        driver.findElement(cancelButton).click();
    }
}
