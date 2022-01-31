package com.test;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.page.RegisterPage;

import framework_utility.Browser_setup;
import framework_utility.Utility_fun;

public class RadioButton extends Browser_setup {
	@DataProvider(name="testdata")
	public Object[][] Testdata() throws IOException
	{
		Object[][] data=Utility_fun.Test_data("Sheet6");
		return data;
	}
	@Test(dataProvider="testdata")
	public void test(String Firstname,String lastname)
	{
		RegisterPage register=new RegisterPage(driver);
		assertTrue(register.Register.isEnabled(), "not enabled");
		register.Click_register();

		RegisterPage Fn=new RegisterPage(driver);
		Fn.First_name(Firstname);
		Fn.last_name(lastname);
		Fn.Click_radiobutton();
		
}
}
