package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework_utility.Browser_setup;
import framework_utility.Utility_fun;

public class Firstpage extends Utility_fun{
	public Firstpage(WebDriver driver)
	{
			PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Register']")
	public WebElement Register;
	
	
	public void Click_register()
	{
		click_action(Register);
	}
	@FindBy(xpath="//a[text()='Log in']")
	public WebElement Login;

	public void Click_login()
	{
		click_action(Login);
	}
	@FindBy(xpath="(//a[contains(text(),'Books')])[1]")
	public WebElement books;

	public void Click_book()
	{
		click_action(books);
	}
	@FindBy(xpath="//span[text()='Shopping cart']")
	public WebElement shoppingcart;

	public void Click_shoppingcart()
	{
		click_action(shoppingcart);
	}
	@FindBy(xpath="//span[text()='Wishlist']")
	public WebElement Wishlist;

	public void Click_Wishlist()
	{
		click_action(Wishlist);
	}
	@FindBy(xpath="//a[@href='/contactus']")
	public WebElement contactus;
	public void click_contactus()
	{
		click_action(contactus);
	}
	
}
