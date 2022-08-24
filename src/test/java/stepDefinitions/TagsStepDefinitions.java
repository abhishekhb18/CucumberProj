package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TagsStepDefinitions {
	public static WebDriver driver;
	/*Disabled to execute conditional hooks concepts
@Before
	
	public void Beforehook()
	{
		System.out.println("------------executing Beforehook-------- " );
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedrivernew\\chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("http://automationpractice.com/index.php");
	}*/
	@When("^The user is on Automation Practice$")
    public void the_user_is_on_automation_practice() throws Throwable {
		 System.out.println("The Active URL:" +driver.getCurrentUrl());
        
    }

    @Then("^Click on Women Section$")
    public void click_on_women_section() throws Throwable {
 WebElement WomenLink = driver.findElement(By.xpath("//a[@title='Women']"));
        
        WomenLink.click();
        Thread.sleep(2000);
    }

    @Then("^Verify Women Page details$")
    public void verify_women_page_details() throws Throwable {
    	System.out.println("Women's page Title:" +driver.getTitle());
        
    }

    @Then("^Click on Dresses Section$")
    public void click_on_dresses_section() throws Throwable {
WebElement DressLink = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
        
   DressLink.click();
   Thread.sleep(2000);
    }

    @Then("^Verify Dressess Page Details$")
    public void verify_dressess_page_details() throws Throwable {
    	System.out.println("Dresses's page Title:" +driver.getTitle());
    }

    @Then("^Click on Tshirts section$")
    public void click_on_tshirts_section() throws Throwable {
WebElement tshirtLink = driver.findElement(By.xpath("(//a[@title='T-shirts'])[2]"));
        
        tshirtLink.click();
        Thread.sleep(2000);
    }

    @Then("^Verify Tshirts page details$")
    public void verify_tshirts_page_details() throws Throwable {
    	System.out.println("Tshirts page Title:" +driver.getTitle());
    }
    /*    
@After
	
public void Afterhook()
	{
		System.out.println("------------executing Afterhook-------- " );
		driver.close();
	}*/
}
