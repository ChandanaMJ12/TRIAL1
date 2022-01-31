package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework_utility.Utility_fun;

public class Addtocartpage extends Utility_fun{
	public Addtocartpage(WebDriver driver)
	{
			PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//input[@value='Add to cart'])[1]")
	public WebElement addtocart;
	
	
	public void Click_addtocart()
	{
		click_action(addtocart);
	}
}
