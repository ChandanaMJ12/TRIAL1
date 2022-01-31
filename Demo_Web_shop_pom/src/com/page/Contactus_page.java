package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework_utility.Utility_fun;

public class Contactus_page extends Utility_fun{
	public Contactus_page(WebDriver driver)
	{
			PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='FullName']")
	public WebElement Fullname;
	
	public void Send_name(String value)
	{
		enter_keys(Fullname, value);
	}
	@FindBy(xpath="//input[@name='Email']")
	public WebElement Email;
	
	public void Send_Email(String value)
	{
		enter_keys(Email, value);
	}
	@FindBy(xpath="//textarea[@class='enquiry']")
	public WebElement enquiry;
	
	public void Send_enquiry(String value)
	{
		enter_keys(enquiry, value);
	}
	@FindBy(xpath="(//input[@type='submit'])[2]")
	public WebElement submit;
	
	public void submit()
	{
		click_action(submit);
	}
	@FindBy(xpath="//div[@class='result']")
	public WebElement msg;
	
	public void msg()
	{
		System.out.println(msg.getText());
	}
	
	
	
	
}
