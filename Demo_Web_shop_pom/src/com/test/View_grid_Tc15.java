package com.test;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.page.Firstpage;
import com.page.View_grid;

import framework_utility.Browser_setup;
import framework_utility.Utility_fun;

public class View_grid_Tc15 extends Browser_setup {
	@DataProvider(name="testdata")
	public Object[][] Testdata() throws IOException
	{
		Object[][] data=Utility_fun.Test_data("Sheet1");
		return data;
	}
	@Test(dataProvider="testdata")
	public void test(String value){
		
	Firstpage register=new Firstpage(driver);
	assertTrue(register.books.isEnabled(), "not enabled");
	register.Click_book();
	View_grid grid=new View_grid(driver);
	grid.Click_Select(value);
}
}
