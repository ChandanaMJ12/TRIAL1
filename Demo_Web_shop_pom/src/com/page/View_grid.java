package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework_utility.Utility_fun;

public class View_grid extends Utility_fun{
	public View_grid(WebDriver driver)
	{
			PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//select[@id='products-viewmode']")
	public WebElement view;
	
	
	public void Click_Select(String value)
	{
		select_by_value(view,value);
	}
}
