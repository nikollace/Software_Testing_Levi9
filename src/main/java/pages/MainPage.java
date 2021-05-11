package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
    private final WebDriver driver;

    public MainPage(WebDriver driver){
        this.driver = driver;
    }

    private WebElement getFormsElement() {
        return driver.findElement(By.xpath("//h5[text()='Forms']"));
    }

    public void clickOnFormsElement() {
        getFormsElement().click();
    }
}
