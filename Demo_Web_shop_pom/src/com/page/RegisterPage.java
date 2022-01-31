
package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework_utility.Utility_fun;

public class RegisterPage extends Utility_fun{
	public RegisterPage(WebDriver driver)
	{
			PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Register']")
	public WebElement Register;
	
	
	public void Click_register()
	{
		click_action(Register);
	}
	@FindBy(xpath="//input[@name='FirstName']")
	WebElement Firstname;

	public void First_name(String value)
	{
		enter_keys(Firstname, value);
	}
	@FindBy(xpath="//input[@name='LastName']")
	WebElement lastname;

	public void last_name(String value)
	{
		enter_keys(lastname, value);
	}
	@FindBy(xpath="(//input[@name='Gender'])[2]")
	WebElement radiobutton;
	
	public void Click_radiobutton()
	{
		click_action(radiobutton);
	}
	
}
