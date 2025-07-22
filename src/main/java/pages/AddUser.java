package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUser{
    private WebDriver driver;

    public AddUser(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); // initialize all the elements
    }

    @FindBy(xpath =  "//input[@placeholder='Username']")
    WebElement userfield;

    @FindBy(xpath = "//input[@placeholder='Orders']")
    WebElement orderfield;

    @FindBy(xpath = "//input[@placeholder='Revenue']")
    WebElement revenuefield;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement submitButton;

    @FindBy(className = "sidebar-item")
    WebElement sidebarItem;

    public void enterusername(String username) {
        userfield.sendKeys(username);
    }
    public void enterorder(String order) {
        orderfield.sendKeys(order);
    }
    public void enterrevenue(String revenue) {
        revenuefield.sendKeys(revenue);
    }
    public void clicksubmit() {
        submitButton.click();
    }

    public void clickSidebarItem() {
        sidebarItem.click();
    }

    public String getSuccessAlertText() {
    Alert alert = driver.switchTo().alert();  // switch to alert
    String alertText = alert.getText();       // get alert message
    alert.accept();                           // close the alert
    return alertText;
}
}