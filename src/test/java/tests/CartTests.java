package tests;

import base.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import pages.CartPage;
import pages.HomePage;
import pages.SearchPage;

import java.io.FileNotFoundException;

import static base.BasePage.getNumberOfCartItems;
import static utils.FileReader.getLineFromCSV;

public class CartTests extends BaseTest {
    @Test
    public void deleteProductFromCart() throws FileNotFoundException, InterruptedException {
        goHome();
        Assert.assertEquals("https://www.kitapyurdu.com/", driver.getCurrentUrl());
        HomePage homePage = new HomePage(driver);
        SearchPage searchPage = homePage.searchForProduct(getLineFromCSV());
        searchPage.addProductToCart();
        Thread.sleep(3000);
        Assert.assertEquals(String.valueOf(1),getNumberOfCartItems());
        CartPage cartPage = searchPage.goToCart();
        cartPage.increaseQuantityByOne();
        Assert.assertEquals("Sepetiniz güncelleniyor!", cartPage.getAlertText());
        cartPage.clickCancelButton();
        Thread.sleep(3000);
        Assert.assertEquals(String.valueOf(0),getNumberOfCartItems());

    }
}
