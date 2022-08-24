package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SwiggyStepDefinition {
	
	public static WebDriver driver;
@Before
	
	public void Beforehook()
	{
		System.out.println("------------executing Beforehook-------- " );
		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedrivernew\\chromedriver.exe");
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	
    		
	}

@After

public void Afterhook()
	{
		System.out.println("------------executing Afterhook-------- " );
		driver.close();
	}
	
@Given("user is in  swiggy homepage")
public void user_is_in_swiggy_homepage() {
	driver.get("https://www.swiggy.com/");
}

@When("The user enters the location as {string} in search bar")
public void the_user_enters_the_location_as_in_search_bar(String string) throws InterruptedException {
    driver.findElement(By.id("location")).sendKeys(string);
    Thread.sleep(2000);
}


@Then("Selects the first option")
public void selects_the_first_option() throws InterruptedException {
    driver.findElement(By.xpath("//div[@class=\"_1oLDb\"]//button[@tabindex=\"2\"]")).click();
    Thread.sleep(5000);
}

@Then("User is in restaurant list page")
public void user_is_in_restaurant_list_page() {
    
   System.out.println("The user is in Restaurant list page");
}


@When("The user starts to  enter the {string} location and navigates to restaurant list page")
public void the_user_starts_to_enter_the_location_and_navigates_to_restaurant_list_page(String string) throws InterruptedException {
	driver.get("https://www.swiggy.com/");
	driver.findElement(By.id("location")).sendKeys(string);
    Thread.sleep(2000);
    driver.findElement(By.xpath("//div[@class=\"_1oLDb\"]//button[@tabindex=\"2\"]")).click();
    Thread.sleep(5000);
}

@Then("Selects and clicks on  the first restaurant from the restaurant list")
public void selects_and_clicks_on_the_restaurant_from_the_restaurant_list() throws InterruptedException {
	Thread.sleep(5000);
    driver.findElement(By.xpath("//div[@class=\"_3XX_A\"]")).click();
    System.out.println("clicks on first restaurant");
}

@Then("User is in restaurant homepage")
public void user_is_nandhini_deluxe_restaurant_homepage() throws InterruptedException {
	Thread.sleep(5000);
    System.out.println(driver.findElement(By.xpath("//h1[@title]")).getText());
    System.out.println("The user is in desried restaurant homepage");
}
	
	
	
}
