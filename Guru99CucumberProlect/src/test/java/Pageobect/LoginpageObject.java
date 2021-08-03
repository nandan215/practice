package Pageobect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.base3;

public class LoginpageObject extends base3 {
	public WebDriver ldriver;
	public LoginpageObject(WebDriver rdriver)
	{
		this.ldriver=rdriver;
		
		
	}


	


	//we can achieve page object model in two ways
	//normal
	//pagefactory
	//normal
	By username=By.xpath("");
	By password=By.xpath("");
	By click =By.xpath("");
	
	public WebElement username()
	{
	return ldriver.findElement(username);

	
	}
	
	public void password()
	{
		ldriver.findElement(password);
		
	}
	public void click()
	{
		ldriver.findElement(click);
		
	}

}
