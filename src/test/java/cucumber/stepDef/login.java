package cucumber.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class login {

    WebDriver driver;

    String baseUrl = "https://www.saucedemo.com/";

    @Given("Halaman Login")
    public void halaman_login() {
        WebDriverManager.edgedriver().setup();


        driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    @When("user open link {string}")
    public void userOpenLinkSaucedemoCom(String fieldValue) {
        driver.get(fieldValue);
    }

    @And("user input valid password {string}")
    public void userInputValidPassword(String fieldValue) throws InterruptedException {
        driver.findElement(By.id("password")).sendKeys(fieldValue);
        Thread.sleep(2000);
    }


    @And("user input valid username {string}")
    public void userInputValidUsername(String fieldValue) throws InterruptedException {
        driver.findElement(By.id("user-name")).sendKeys(fieldValue);
        Thread.sleep(2000);
    }

    @Then("user click login button")
    public void userClickLoginButton() throws InterruptedException {
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(2000);
    }

    @And("user input invalid username {string}")
    public void userInputInvalidUsernameStandard_user(String fieldValue) {
        driver.findElement(By.id("user-name")).sendKeys(fieldValue);
    }

    @And("user input invalid password {string}")
    public void userInputInvalidPasswordInvalid(String fieldValue) {
        driver.findElement(By.id("password")).sendKeys(fieldValue);
    }

    @Given("user click add to cart button")
    public void userClickAddToCartButton() {
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
    }

    @Then("user click cart icon")
    public void userClickCartIcon() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
        Thread.sleep(5000);
    }

    @Then("user click checkout button")
    public void userClickCheckoutButton() {
        driver.findElement(By.id("checkout")).click();
    }

    @And("user input personal information")
    public void userInputPersonalInformation() throws InterruptedException {
        driver.findElement(By.id("first-name")).sendKeys("Haendy");
        Thread.sleep(1000);
        driver.findElement(By.id("last-name")).sendKeys("Safira");
        Thread.sleep(1000);
        driver.findElement(By.id("postal-code")).sendKeys("12345");
    }

    @And("user click continue button")
    public void userClickContinueButton() {
        driver.findElement(By.id("continue")).click();
    }

    @And("user click finish button")
    public void userClickFinishButton() {
        driver.findElement(By.id("finish")).click();
    }

    @Then("user choose price low to high")
    public void userChoosePriceLowToHigh() {
        driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[3]")).click();
    }
}

