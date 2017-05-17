package stepdef;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class FormPage {

    public FormPage() {
        
    }

    private final static Logger logger = LogManager.getLogger(FormPage.class);

    private final WebDriver driver = new ChromeDriver();

    @FindBy(id = "name")
    private WebElement nameField;

    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(id = "phone")
    private WebElement phoneField;

    @FindBy(id = "message")
    private WebElement messageField;

    public void fillName(String name) {
        logger.info("Filling name: " + name);
        nameField.clear();
        nameField.sendKeys(name);
    }

    public void fillEmail(String email) {
        logger.info("Filling email: " + email);
        emailField.clear();
        emailField.sendKeys(email);
    }

    public void fillPhone(String phone) {
        logger.info("Filling phone: " + phone);
        phoneField.clear();
        phoneField.sendKeys(phone);
    }

    public void fillMessage(String message) {
        logger.info("Filling message: " + message);
        messageField.clear();
        messageField.sendKeys(message);
    }

    public void accessGoogle() {
        logger.info("Go to google");
        driver.navigate().to("https://google.com");
    }

    public void backPage() {
        driver.navigate().back();
    }

    public void forwardPage() {
        driver.navigate().forward();
    }

    public void refresh() {
        driver.navigate().refresh();
    }
}
