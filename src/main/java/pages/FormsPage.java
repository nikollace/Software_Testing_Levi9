package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormsPage {
    private WebDriver driver;

    public FormsPage(WebDriver driver) {
        this.driver = driver;
    }

    private WebElement getPracticeForm() {
        return driver.findElement(By.xpath("//span[text()='Practice Form']"));
    }

    private WebElement getFirstName() {
        return driver.findElement(By.id("firstName"));
    }

    private WebElement getLastName() {
        return driver.findElement(By.id("lastName"));
    }

    private WebElement getEmail() {
        return driver.findElement(By.id("userEmail"));
    }

    private WebElement getMaleGender() {
        return driver.findElement(By.cssSelector("label[for='gender-radio-1']"));
    }

    private WebElement getPhoneNumber() {
        return driver.findElement(By.id("userNumber"));
    }

    private WebElement getDatePicker() {
        return driver.findElement(By.id("dateOfBirthInput"));
    }

    private WebElement getYearDropdown() {
        return driver.findElement(By.cssSelector(".react-datepicker__year-select"));
    }

    private WebElement getSpecificYear() {
        return driver.findElement(By.xpath("//option[text()='1998']"));
    }

    private WebElement getMonthDropdown() {
        return driver.findElement(By.cssSelector(".react-datepicker__month-select"));
    }

    private WebElement getSpecificMonth() {
        return driver.findElement(By.xpath("//option[text()='December']"));
    }

    private WebElement getSpecificDayOfBirth() {
        return driver.findElement(By.cssSelector(".react-datepicker__day--015"));
    }

    private WebElement getHobbySports() {
        return driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
    }

    private WebElement getHobbyReading() {
        return driver.findElement(By.cssSelector("label[for='hobbies-checkbox-2']"));
    }

    private WebElement getAddress() {
        return driver.findElement(By.id("currentAddress"));
    }

    private WebElement getState() {
        return driver.findElement(By.id("state"));
    }

    private WebElement getSpecificState() {
        return driver.findElement(By.xpath("//div[text()='NCR']"));
    }

    private WebElement getCity() {
        return driver.findElement(By.id("city"));
    }

    private WebElement getSpecificCity() {
        return driver.findElement(By.xpath("//div[text()='Delhi']"));
    }

    private WebElement getSubmitButton() {
        return driver.findElement(By.id("submit"));
    }

    private WebElement getFormIsSubmittedMessage() {
        return driver.findElement(By.xpath("//div[text()='Thanks for submitting the form']"));
    }

    public boolean isFormIsSubmittedMessageDisplayed() {
        return getFormIsSubmittedMessage().isDisplayed();
    }

    //Pozivi

    public void clickOnPracticeForm() {
        getPracticeForm().click();
    }

    public void fillInName(String firstName, String lastName) {
        getFirstName().sendKeys(firstName);
        getLastName().sendKeys(lastName);
    }

    public void enterEmail(String email) {
        getEmail().sendKeys(email);
    }

    public void chooseMaleGender() {
        getMaleGender().click();
    }

    public void enterPhoneNumber(String phoneNumber) {
        getPhoneNumber().sendKeys(phoneNumber);
    }

    public void selectDateOfBirth() throws InterruptedException {
        getDatePicker().click();
        Thread.sleep(1000);
        getYearDropdown().click();
        Thread.sleep(1000);
        getSpecificYear().click();
        Thread.sleep(1000);
        getMonthDropdown().click();
        Thread.sleep(1000);
        getSpecificMonth().click();
        Thread.sleep(1000);
        getSpecificDayOfBirth().click();
    }

    public void selectHobbies() {
        getHobbySports().click();
        getHobbyReading().click();
    }

    public void enterAddress(String address) {
        getAddress().sendKeys(address);
    }

    public void chooseStateAndCity() {
        getState().click();
        getSpecificState().click();
        getCity().click();
        getSpecificCity().click();
    }

    public void clickOnSubmit() {
        getSubmitButton().click();
    }
}
