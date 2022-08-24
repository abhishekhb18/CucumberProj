package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTableStepdefinitions {
	
	public WebDriver driver;
	//disabled this for Background example execution
/*@Before
	
	public void Beforehook()
	{
		System.out.println("------------executing Beforehook-------- " );
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedrivernew\\chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://www.amazon.in/");
    	WebElement signinElement = driver.findElement(By.xpath("(//span[text()='Sign in'])[2]"));
    	signinElement.click();
    	
	}*/
	
	@When("The user starts to enter the valid amazon uderid and amazon password")
	public void the_user_starts_to_enter_the_valid_amazon_uderid_and_amazon_password(DataTable dataTable) {
	    
		/*no header*/
		List<List<String>> TestData = dataTable.asLists(String.class);
		String username = TestData.get(0).get(0);
		String password = TestData.get(0).get(1);
		System.out.println(username);
		System.out.println(password);
		
		
		driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys(username);	
	    driver.findElement(By.xpath("//input[@id=\"continue\"]")).click();
	    driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(password);
	}

	@Then("user has logged into amazon app succesfully")
	public void user_has_logged_into_amazon_app_succesfully() {
	    System.out.println("the user has entered both the credentials");
	}
	
	 @When("^The user progress to enter the valid amazon useridn and amazon passcode$")
	    public void the_user_progress_to_enter_the_valid_amazon_useridn_and_amazon_passcode(DataTable dataTable) throws InterruptedException{
	       List<Map<String,String>> TestData = dataTable.asMaps(String.class,String.class);
	       //String usernameA = TestData.get(0).get("userid"); disabled to run multiple data from multiple rows
			//String passwordA = TestData.get(0).get("Password");
	       for(Map<String,String> table:TestData) {
	    	   
	    	   
	       String usernameA = table.get("userid");
	       String passwordA = table.get("Password");
			System.out.println(usernameA);
			System.out.println(passwordA);
			
			
			WebElement  inputname = driver.findElement(By.xpath("//input[@name=\"email\"]"));
			inputname.clear();
			inputname.sendKeys(usernameA);
		    driver.findElement(By.xpath("//input[@id=\"continue\"]")).click();
		    driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(passwordA);
		    Thread.sleep(5000);
		    driver.navigate().back();
	       }
	       
	    }

	    @Then("^user has finally logged into amazon app succesfully$")
	    public void user_has_finally_logged_into_amazon_app_succesfully(){
	    	System.out.println("the user has entered both the credentials- using header datatable inputs");
	    }
	
	/*@After
	
	public void Afterhook()
		{
			System.out.println("------------executing Afterhook-------- " );
			driver.close();
		}*/


}
