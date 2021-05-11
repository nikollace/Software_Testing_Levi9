package seleniumtests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    public static WebDriver driver;
    public static String BASE_URL = "https://demoqa.com/";

    public static WebDriver setUpDriver() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    @BeforeAll
    static void startChromeDriver() {
        driver = setUpDriver();
        driver.manage().window().maximize();
        driver.get(BASE_URL);
    }

    @AfterAll
    static void stopChromeDriver() {
        driver.quit();
    }


}
