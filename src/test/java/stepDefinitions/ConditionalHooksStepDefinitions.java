package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;

public class ConditionalHooksStepDefinitions {
	
@Before("@Chrome")
    
    public void openChrome()
    {
        System.out.println("Opening Chrome Browser");
    }
    
    @Before("@Firefox")
    
    public void openFirefox()
    {
        System.out.println("Opening Firefox Browser");
    }

@After("@Chrome")
    
    public void afterChrome()
    {
        System.out.println("After Chrome Browser");
    }
    
    @After("@Firefox")
    
    public void afterFirefox()
    {
        System.out.println("After Firefox Browser");
    }

    @Given("^Open the website in chromebrowser$")
    public void open_the_website_in_chromebrowser() throws Throwable {
        System.out.println("------Open website in  chromebrowser------");
    }

    @Given("^Open the website in firefoxbrowser$")
    public void open_the_website_in_firefoxbrowser() throws Throwable {
    	System.out.println("------Open website in firefoxbrowser------");
    }
}
