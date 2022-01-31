package com.test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.page.Addtocartpage;
import com.page.Firstpage;
import com.page.Shopping_cartpage;

import framework_utility.Browser_setup;
import framework_utility.Utility_fun;

public class Removefrom_cartTc20 extends Browser_setup {
	@DataProvider(name="testdata")
	public Object[][] Testdata() throws IOException
	{
		Object[][] data=Utility_fun.Test_data("Sheet7");
		return data;
	}
	@Test(dataProvider="testdata")
	public void test(String value) throws InterruptedException{
		
	Firstpage register=new Firstpage(driver);
	register.Click_book();
	Addtocartpage add=new Addtocartpage(driver);
	add.Click_addtocart();
	Thread.sleep(20000);
	
	register.Click_shoppingcart();
	
	Shopping_cartpage sc=new Shopping_cartpage(driver);
	sc.change_Quantity(Integer.parseInt(value));
}
}
