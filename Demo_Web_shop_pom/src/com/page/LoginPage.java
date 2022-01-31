package com.page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.reporters.EmailableReporter;

import framework_utility.Utility_fun;

public class LoginPage extends Utility_fun{
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='Email']")
	public WebElement Email;
	

	public void Enter_email(String value)
	{
		enter_keys(Email, value);
		
	}
	@FindBy(xpath="//span[@for='Email']")
	public WebElement msg;
	public void print()
	{
		System.out.println(msg.getText());
	}
	
	@FindBy(xpath="//input[@name='Password']")
	WebElement Pwd;

	public void Enter_Pwd(String value)
	{
		enter_keys(Pwd, value);
	}
	@FindBy(xpath="//input[@value='Log in']")
	WebElement login1;

	public void login()
	{
		click_action(login1);
	}
}
