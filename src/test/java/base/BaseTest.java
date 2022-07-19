package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;

import java.time.Duration;

public class BaseTest {

    public WebDriver driver;
    public HomePage homePage;
    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    public void goHome(){
        driver.get("https://www.kitapyurdu.com/");
        homePage = new HomePage(driver);
    }

    @After
    public void quitDriver() {
        driver.quit();
    }
}
