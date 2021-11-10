package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

    public class LoginStepDefinition {
        WebDriver driver;

        @Given("User launch browser")

        public void User_launch_browser() throws Throwable {
            System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\selenium web drivers\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
  /*  ChromeOptions browserOptions = new ChromeOptions();
    browserOptions.setCapability("platformName", "Windows 10");
    browserOptions.setCapability("browserVersion", "latest");
    Map<String, Object> sauceOptions = new HashMap<>();
    browserOptions.setCapability("sauce:options", sauceOptions);
    WebDriver driver =new RemoteWebDriver(new URL("https://oauth-radhika.attaluri-b5841:d8825faf-f6aa-42bf-b342-7e2adf0685d5@ondemand.us-west-1.saucelabs.com:443/wd/hub"));
      */
            driver.get("https://www.saucedemo.com/");
            driver.manage().window().maximize();
        }

        @When("User enter username and password")
        public void User_enter_username_and_password() throws Throwable {
            WebElement username = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
            username.sendKeys("standard_user");
            WebElement Password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
            Password.sendKeys("secret_sauce");
        }

       @When("User enters valid username and invalid password")
        public void User_enters_valid_username_and_invalid_password() throws Throwable {
            WebElement username = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
            username.sendKeys("standard_user");
            WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
            password.sendKeys("secret");
        }

        @Then("User should be able to login successfully")
        public void User_should_be_able_to_login_successfully() throws Throwable {
            WebElement Login = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
            Login.click();
            // driver.quit();
            driver.close();

        }
       @Then("User should not be able to login successfully")
        public void User_should_not_be_able_to_login_successfully() throws Throwable {
            WebElement Login = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
            Login.click();
           //  driver.quit();
           driver.close();

        }

        }




