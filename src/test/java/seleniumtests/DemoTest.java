package seleniumtests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.MainPage;

public class DemoTest extends BaseTest {

    MainPage mainPage = new MainPage(driver);

    @Test
    void start() {
        Assertions.assertEquals("ToolsQA", driver.getTitle());
    }

    @Test
    void goToFormsPage() {
        mainPage.clickOnFormsElement();
        Assertions.assertEquals("https://demoqa.com/test", driver.getCurrentUrl(), "Expected URL is different than the actual");
    }
}
