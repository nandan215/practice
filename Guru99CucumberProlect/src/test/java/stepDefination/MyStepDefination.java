package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pageobect.LoginpageObject;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.base3;

public class MyStepDefination extends base3{
	//public WebDriver driver;
	LoginpageObject lp=new LoginpageObject(driver);
	@Given("^browser is launch$")
	public void browser_is_launch()
	{
		System.setProperty("webdriver.chrome.driver", "E://Guru99CucumberProlect//Drivers//chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("");
		
		System.out.println("browser is launch");
		
	}

@When("^user enter <\"([^\"]*)\"> and <\"([^\"]*)\">$")
public void user_enter_and(String arg1, String arg2)  {
    System.out.println("Enter user id and password");
    //driver.findElement(By.xpath("")).sendKeys(arg1);
    lp.username().click();
    
    driver.findElement(By.xpath("")).sendKeys(arg2);
}


@And("^user click the submit button$")
public void user_click_the_submit_button()
{
    System.out.println("user click the submit button");
    driver.findElement(By.name(""));

	
}

@Then("^user can view the dashboard webpage")
public void user_can_view_thedashboard()
{
    System.out.println("user can view the dashboard");
    String title= driver.getTitle();
    if(title=="")
    {
    	System.out.println("test is passed");
    }
    else
    {
    	System.out.println("test is failed");
    	
    }
	
}


@Then("^a browser is close$")
public void a_browser_is_close() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("browser is close");
    driver.close();
   
}

@Given("^iam nandan$")
public void iam_nandan()  {
    System.out.println("I am nandan");


}


@Given("^user is adding all detail$")
public void user_is_adding_all_detail() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("hi iam");
    
}

@Then("^user save it$")
public void user_save_it()  {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("a smoke test");
    
}





}
