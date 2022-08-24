package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Hook_StepDefinition {
	public static WebDriver driver;
	String url;
	
	/*@Before
	
	public void Beforehook()
	{
		System.out.println("------------executing Beforehook-------- " );
		System.setProperty("webdriver.chrome.driver", "./BrowserUtils/chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://the-internet.herokuapp.com/login");*/ /*disbaled this for the sake of Tag example execution
	}*/
	
@BeforeStep
	
	public void BeforeStephook()
	{
		System.out.println("------------executing BeforeStephook-------- " );
	}
	
	
	@Given("The user is on login page of Test Appln")
	public void the_user_is_on_login_page_of_test_appln() {
		
	    System.out.println("The user is on login page of Test Appln");
	    
	}

	@When("Clicks on that login button")
	public void clicks_on_that_login_button() {
		System.out.println("Clicks on that login button");
	    
	}

	
	
	 @When("^The user tries to  enter the credentialss  \"([^\"]*)\" and \"([^\"]*)\"$")
	    public void the_user_tries_to_enter_the_credentialss_something_and_something(String strArg1, String strArg2) throws Throwable {
		 System.out.println("The user enters the credentialss");
	    }
        
	@Then("Check if the user is able to login sucessfully to the appln")
	public void check_if_the_user_is_able_to_login_sucessfully_to_the_appln() {
		System.out.println("Check if the user is able to login sucessfully");
	}
	
@AfterStep
	
	public void AfterStephook()
	{
		System.out.println("------------executing AfterStephook-------- " );
	}
	
/*@After
	
	public void Afterhook()
	{
		System.out.println("------------executing Afterhook-------- " );
		/*driver.close();
	}*/

@Given("The user is on the login page")
public void the_user_is_on_the_login_page() {
	
	System.out.println("The user is on the login page");
	url = driver.getCurrentUrl();
	System.out.println(url);
}

@Then("Check if the page title is {string}")
public void check_if_the_page_title_is(String string) {
	System.out.println("Checking if the page title is {string}");
	System.out.println("the current page title:"+driver.getTitle());
	if(string.equalsIgnoreCase(driver.getTitle())) {
		System.out.println("The page titles are same");
	}
}

}
