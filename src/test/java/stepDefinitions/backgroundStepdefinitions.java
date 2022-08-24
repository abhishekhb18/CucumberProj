package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class backgroundStepdefinitions {
	public static WebDriver driver;
	
/*@Before
	
	public void Beforehook()
	{
		System.out.println("------------executing Beforehook-------- " );
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedrivernew\\chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	
    	
    	
	}*/
	
	 @Given("^user is in homepage$")
	    public void user_is_in_homepage() throws Throwable {
		 driver.get("https://www.amazon.in/");
	    }

	
	@When("^The user  enter the  TestUserid and  TestPassword$")
    public void the_user_enter_the_testuserid_and_testpassword(DataTable dataTable) throws Throwable {
		WebElement signinElement = driver.findElement(By.xpath("(//span[text()='Sign in'])[2]"));
    	signinElement.click();
    	List<List<String>> TestData = dataTable.asLists(String.class);
		String username = TestData.get(0).get(0);
		String password = TestData.get(0).get(1);
		System.out.println(username);
		System.out.println(password);
		
		
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys(username);	
	    driver.findElement(By.xpath("//input[@id=\"continue\"]")).click();
	    driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(password);
	    driver.findElement(By.xpath("//input[@id=\"signInSubmit\"]")).click();
    }

    @When("^the user is on search page$")
    public void the_user_is_on_search_page() throws Throwable {
    	System.out.println("the user is on search page");
        
    }

    @Then("^check if user has  logged in succesfully$")
    public void check_if_user_has_logged_in_succesfully() throws Throwable {
       String Account_Name = driver.findElement(By.xpath("//span[@id=\"nav-link-accountList-nav-line-1\"]")).getText();
       System.out.println(Account_Name);
       
       
    }

    @Then("^gives the search term as \"([^\"]*)\"$")
    public void gives_the_search_term_as_something(String string) throws Throwable {
    	driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys(string);
    	
        
    }

    @And("^clicks on search icon$")
    public void clicks_on_search_icon() throws Throwable {
       driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
    }
    
/*@After
	
	public void Afterhook()
		{
			System.out.println("------------executing Afterhook-------- " );
			driver.close();
		}*/
}
