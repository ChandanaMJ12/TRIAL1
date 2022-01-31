package com.test;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.page.Addtocartpage;
import com.page.Firstpage;
import com.page.LoginPage;
import com.page.Search_Product;

import framework_utility.Browser_setup;
import framework_utility.Utility_fun;

public class Addtocart_searchTc21 extends Browser_setup{
	@DataProvider(name="testdata")
	public Object[][] Testdata() throws IOException
	{
		Object[][] data=Utility_fun.Test_data("Sheet1");
		return data;
	}
	@Test(dataProvider="testdata")
	public void test(String Email,String Pwd,String value) throws InterruptedException{
		Firstpage register=new Firstpage(driver);
		assertTrue(register.Login.isEnabled(), "not enabled");
		register.Click_login();
		
		LoginPage email=new LoginPage(driver);
		email.Enter_email(Email);
		email.Enter_Pwd(Pwd);
		
		Search_Product s=new Search_Product(driver);
		s.Click_Search(value);
		s.Click_Search1();
		Addtocartpage add=new Addtocartpage(driver);
		add.Click_addtocart();
		
}
}