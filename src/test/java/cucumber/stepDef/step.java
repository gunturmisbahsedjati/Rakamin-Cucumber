package cucumber.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class step {
   WebDriver driver;
   String baseUrl = "https://www.saucedemo.com/";


    @Given("login page")
    public void login_page(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get(baseUrl);

        String loginPageAssert = driver.findElement(By.className("login_logo")).getText();
        Assert.assertEquals(loginPageAssert, "Swag Labs");

//        WebElement inputUsername = driver.findElement(By.id("user-name")).getText();
    }
    @Then("user input username")
    public void user_input_username(){
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
    }

    @Then("user input problem username")
    public void user_input_problem_username(){
        driver.findElement(By.id("user-name")).sendKeys("problem_user");
    }

    @Then("user input locked username")
    public void user_input_locked_username(){
        driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
    }

    @And("user input password")
    public void user_input_password(){
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }

    @And("user tap login button")
    public void user_tap_login_button(){
        driver.findElement(By.id("login-button")).click();
    }

    @Then("user in on dashboard page")
    public void user_in_on_dashboard_page() {
        String getTitle = driver.findElement(By.className("title")).getText();
        Assert.assertEquals(getTitle, "Products");
//        driver.close();
    }
    @Then("user get alert text")
    public void user_get_alert_text() {
        String getTitle = driver.findElement(By.xpath("//h3[contains(text(),'Epic sadface: Sorry, this user has been locked out.')]")).getText();
        Assert.assertEquals(getTitle, "Epic sadface: Sorry, this user has been locked out.");
        driver.close();
    }
    @Then("user click hamburger")
    public void user_click_hamburger(){
        driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select")).getText();
    }

    @And("user click all items")
    public void user_click_all_items(){ driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[3]")).click(); }

    @Then("user see all product sale")
    public void user_see_all_product_sale() {
        String getTitle = driver.findElement(By.xpath("//div[contains(text(),'Sauce Labs Onesie')]")).getText();
        Assert.assertEquals(getTitle, "Sauce Labs Onesie");
//        driver.close();
    }
    @Then("user click add to cart")
    public void user_click_add_to_cart(){
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
    }

    @And("user go to shopping cart")
    public void user_go_to_shopping_cart(){
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
    }
    @And("user click checkout")
    public void user_click_checkout(){
        driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
    }

    @And("user fill first name")
    public void user_fill_first_name(){
        driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys("aaaa");
    }

    @And("user fill last name")
    public void user_fill_last_name(){
        driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys("bbbb");
    }

    @And("user fill postal code")
    public void user_fill_postal_code(){
        driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys("1234");
    }

    @And("user click continue")
    public void user_click_continue(){
        driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
    }

    @And("user click finish")
    public void user_click_finish(){
        driver.findElement(By.xpath("//*[@id=\"finish\"]")).click();
    }

    @Then("order success")
    public void order_success() {
        String getTitle = driver.findElement(By.xpath("//*[@id=\"checkout_complete_container\"]/h2")).getText();
        Assert.assertEquals(getTitle, "Thank you for your order!");
//        driver.close();
    }

    @And("user click one of the products")
    public void user_click_one_of_the_products(){
        driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div")).click();
    }
    @Then("user see product is not the same as the details")
    public void user_see_product_is_not_the_same_as_the_details() {
        String getTitle = driver.findElement(By.xpath("//div[contains(text(),'Sauce Labs Fleece Jacket')]")).getText();
        Assert.assertEquals(getTitle, "Sauce Labs Fleece Jacket");
//        driver.close();
    }
}
