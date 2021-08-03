package Pageobect;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPageObject {
	public WebDriver driver;
	AddCustomerPageObject(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='Email']")
	WebElement email;

	@FindBy(xpath="//input[@id='Password']")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement Login;
	
	@FindBy(linkText="Logout")
	WebElement Logout;
	
	public WebElement email()
	{
		return email ;
	}

	
	

}
