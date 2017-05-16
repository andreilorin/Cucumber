package stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Steps {
    
    WebDriver driver;

    @Given("^open andreilorin$")
    public void open_andreilorin() throws Throwable {
        
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://www.andreilorin.com");
    }
    
    @When("^I enter details and message$")
    public void I_enter_details_and_message() throws Throwable {
        
        driver.findElement(By.id("name")).sendKeys("Andrei");
    }

    @Then("^the message is sent$")
    public void the_message_is_sent() throws Throwable {
        
    }

}
