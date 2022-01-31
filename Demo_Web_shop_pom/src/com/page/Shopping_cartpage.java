package com.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import framework_utility.Utility_fun;

public class Shopping_cartpage extends Utility_fun{
	public Shopping_cartpage(WebDriver driver)
	{
			PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//input[@type='text'])[2]")
	public WebElement Quantity;
	
	
	public void change_Quantity(int value)
	{
		clearTextField(Quantity);
		enter_keys(Quantity, "0");
		sendKeyss(driver, Keys.ENTER );
	}
	@FindBy(xpath="//input[@name='discountcouponcode']")
	public WebElement coupon;
	
	
	public void enter_coupon(String value)
	{
		enter_keys(coupon,value);
	}
	@FindBy(xpath="(//input[@type='submit'])[4]")
	public WebElement click_coupon;
	
	
	public void Click_coupon()
	{
		click_action(click_coupon);
	}
	@FindBy(xpath="//input[@name='giftcardcouponcode']")
	public WebElement gift;
	
	
	public void enter_gift(String value)
	{
		enter_keys(gift,value);
	}
	@FindBy(xpath="(//input[@type='submit'])[5]")
	public WebElement gift_click;
	
	
	public void click_gift()
	{
		click_action(gift_click);
	}
	@FindBy(xpath="//select[@name='CountryId']")
	public WebElement country;
	
	
	public void select_country(String value1)
	{
		select_by_value(country,"India");
	}
	@FindBy(xpath="(//input[@type='submit'])[6]")
	public WebElement shipping;
	
	
	public void click_shapping()
	{
		click_action(shipping);
	}
	@FindBy(xpath="//select[@name='StateProvinceId']")
	public WebElement state;
	
	
	public void select_state(String state1)
	{
		select_by_value(state,state1);
	}
	
}
