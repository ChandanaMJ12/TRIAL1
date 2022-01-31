package com.page;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import framework_utility.Browser_setup;
import framework_utility.Utility_fun;

public class Select_state_Tc26 extends Browser_setup{
	@DataProvider(name="testdata")
	public Object[][] Testdata() throws IOException
	{
		Object[][] data=Utility_fun.Test_data("Sheet9");
		return data;
	}
	@Test(dataProvider="testdata")
	public void test(String Email,String Pwd,String value,String country,String state1) throws InterruptedException{
		Firstpage register=new Firstpage(driver);
		assertTrue(register.Login.isEnabled(), "not enabled");
		register.Click_login();
		LoginPage email=new LoginPage(driver);
		email.Enter_email(Email);
		email.Enter_Pwd(Pwd);

		Search_Product s=new Search_Product(driver);
		s.Click_Search(value);
		Thread.sleep(7000);
		s.Click_Search1();
		Addtocartpage add=new Addtocartpage(driver);
		add.Click_addtocart();
		
		Shopping_cartpage sc=new Shopping_cartpage(driver);
		register.Click_shoppingcart();
		sc.select_country(country);
		sc.select_state(state1);
		sc.click_shapping();
		
} 

}
