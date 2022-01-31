package com.test;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.page.Firstpage;
import com.page.LoginPage;
import com.page.Search_Product;

import framework_utility.Browser_setup;
import framework_utility.Utility_fun;

public class Searchtextfield_test extends Browser_setup{
	@DataProvider(name="testdata")
	public Object[][] Testdata() throws IOException
	{
		Object[][] data=Utility_fun.Test_data("Sheet2");
		return data;
	}
	@Test(dataProvider="testdata")
	public void test(String Email,String Pwd,String value)
	{
		Firstpage register=new Firstpage(driver);
		assertTrue(register.Login.isEnabled(), "not enabled");
		register.Click_login();
		
		LoginPage email=new LoginPage(driver);
		email.Enter_email(Email);
		email.Enter_Pwd(Pwd);
		email.login();
		Search_Product sp=new Search_Product(driver);
		sp.Click_Search(value);
		sp.Click_Search1();
		
		
		
	}
		
		
}
