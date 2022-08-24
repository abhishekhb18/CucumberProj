package stepDefinitions;

import static org.testng.Assert.assertEquals;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class Login1StepDefinition {
	public static WebDriver driver;
	

    @Given("^The user is in Login Page$")
    public void the_user_is_in_login_page() throws Throwable {
    	System.setProperty("webdriver.chrome.driver", "./BrowserUtils/chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://the-internet.herokuapp.com/login");
    	System.out.println("user is in login page");
    }

    @When("^The user enters the credentials$")
    public void the_user_enters_the_credentials() throws Throwable {
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        System.out.println("Entering userid and password");
    }
    
    @When("^The user enters the \"([^\"]*)\" and \"([^\"]*)\"$")
    public void the_user_enters_the_something_and_something(String userid, String password) throws Throwable {
    	driver.findElement(By.id("username")).sendKeys(userid);
        driver.findElement(By.id("password")).sendKeys(password);
        System.out.println("Entering userid and password by passing parameters from feature file");
    }
    
    @When("^The user enters the (.+) and (.+)$")
    public void the_user_enters_the_and(String username, String passcode) throws Throwable {
    	driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(passcode);
        System.out.println("Entering userid and password by passing parameters from DataTable of  feature file");
    }
    
    
    @When("^The user tries to enter the user name as (.+) and password as (.+)$")
    public void the_user_tries_to_enter_the_user_name_as_and_password_as(String usernaming, String passwording) throws Throwable  {
    	driver.findElement(By.id("username")).sendKeys(usernaming);
        driver.findElement(By.id("password")).sendKeys(passwording);
        driver.findElement(By.className("radius")).click();
        System.out.println("Entering userid and password by passing parameters from DataTable for diff scenarios");
    }

    @Then("^The user should able to see the appropriate message (.+)$")
    public void the_user_should_able_to_see_the_appropriate_message(String message) throws Throwable {
       String Actualmessage = driver.findElement(By.id("flash")).getAttribute("class");
       assertEquals(message, Actualmessage);
       
    }

    @When("^Clicks on login$")
    public void clicks_on_login() throws Throwable {
        driver.findElement(By.className("radius")).click();
        System.out.println("clicks on login button");
    }

    @Then("^Check if the Home page is displayed$")
    public void check_if_the_home_page_is_displayed() throws Throwable {
    	System.out.println("Checking if Homepage is Displayed");
    	String Homepagetext = driver.findElement(By.id("flash")).getText();
    	System.out.println(Homepagetext);
    	
    	
        
    }
    
    @When("^The user clicks on logout button$")
    public void the_user_clicks_on_logout_button() throws Throwable {
        driver.findElement(By.xpath("//a[@class='button secondary radius']")).click();
        System.out.println("clicks on logout button");
    }

    @Then("^Url should return back to login page$")
    public void url_should_return_back_to_login_page() throws Throwable {
    	System.out.println("Checking if returned to login page");
    	String loginpagetext = driver.findElement(By.id("flash")).getText();
    	System.out.println(loginpagetext);
    }
}
