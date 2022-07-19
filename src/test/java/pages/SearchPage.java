package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.Random;

public class SearchPage extends BasePage {
    private final By addToCartButtons = By.xpath("//*[@class=\"add-to-cart\"]");

    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public void addProductToCart() {
        List<WebElement> addToCartButtonList = driver.findElements(addToCartButtons);
 //       int number = 4 + (int)(Math.random())*16;

        Random rnd = new Random();
        int number = rnd.nextInt(addToCartButtonList.size()-4);
        System.out.print(number+4);
        addToCartButtonList.get(number+4).click();
    }


}
