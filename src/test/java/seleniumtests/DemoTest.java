package seleniumtests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.FormsPage;
import pages.MainPage;

public class DemoTest extends BaseTest {

    MainPage mainPage = new MainPage(driver);
    FormsPage formsPage = new FormsPage(driver);

    @Test
    void start() {
        Assertions.assertEquals("ToolsQA", driver.getTitle());
    }

    @Test
    void goToFormsPage() {
        mainPage.clickOnFormsElement();
        Assertions.assertEquals("https://demoqa.com/test", driver.getCurrentUrl(), "Expected URL is different than the actual");
    }

    @Test
    void goToRegistrationForm() throws InterruptedException {
        mainPage.clickOnFormsElement();
        formsPage.clickOnPracticeForm();
        formsPage.fillInName("Nikola", "Djordjevic");
        formsPage.enterEmail("nikoladjordjevicfon@gmail.com");
        formsPage.chooseMaleGender();
        formsPage.enterPhoneNumber("1234567899");
        formsPage.selectDateOfBirth();
        formsPage.selectHobbies();
        formsPage.enterAddress("Jurija Gagarina 52");
        formsPage.chooseStateAndCity();
        formsPage.clickOnSubmit();
        Assertions.assertTrue(formsPage.isFormIsSubmittedMessageDisplayed());
        Thread.sleep(5000);
    }

}
