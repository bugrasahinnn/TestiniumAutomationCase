package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.FileNotFoundException;

import static utils.FileReader.getLineFromCSV;

public class HomePage extends BasePage {

    private final By searchField = By.id("search-input");
    private final By searchButton = By.cssSelector(".common-sprite.button-search");

    public HomePage(WebDriver driver){
        super(driver);
    }

    public SearchPage searchForProduct(String productName) {
        WebElement searchFld = driver.findElement(searchField);
        searchFld.clear();
        searchFld.sendKeys(productName);
        driver.findElement(searchButton).click();
        return new SearchPage(driver);
    }

}
