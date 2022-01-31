package com.test;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.page.Firstpage;
import com.page.LoginPage;

import framework_utility.Browser_setup;
import framework_utility.Utility_fun;

public class Valid_Email_invalid_pwd extends Browser_setup{
	@DataProvider(name="testdata")
	public Object[][] Testdata() throws IOException
	{
		Object[][] data=Utility_fun.Test_data("Sheet2");
		return data;
	}
	@Test(dataProvider="testdata")
	public void test(String Email,String Pwd)
	{
		Firstpage register=new Firstpage(driver);
		assertTrue(register.Login.isEnabled(), "not enabled");
		register.Click_login();
		
		LoginPage email=new LoginPage(driver);
		email.Enter_email(Email);
	
		if(Email.contains("valid")){
			System.out.println("Email");
		}
		email.Enter_Pwd(Pwd);
		
}
}
