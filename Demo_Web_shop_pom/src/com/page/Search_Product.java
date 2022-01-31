
package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework_utility.Utility_fun;

public class Search_Product extends Utility_fun{
	public Search_Product(WebDriver driver)
	{
			PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='q']")
	public WebElement search;
	
	
	public void Click_Search(String value)
	{
		enter_keys(search, "computing and internet");
	}
	@FindBy(xpath="//input[@value='Search']")
	public WebElement search1;
	
	
	public void Click_Search1()
	{
		click_action(search1);
	}
}
