package com.test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.page.Contactus_page;
import com.page.Firstpage;

import framework_utility.Browser_setup;
import framework_utility.Utility_fun;

public class Contactus_msgTc018 extends Browser_setup{
	@DataProvider(name="testdata")
	public Object[][] Testdata() throws IOException
	{
		Object[][] data=Utility_fun.Test_data("Sheet2");
		return data;
	}
	@Test(dataProvider="testdata")
	public void test(String value,String Email,String enquiry) throws InterruptedException{
		
	Firstpage register=new Firstpage(driver);
	register.click_contactus();
	Contactus_page cp=new Contactus_page(driver);
	cp.Send_name(value);
	cp.Send_Email(Email);
	cp.Send_enquiry(enquiry);
	cp.submit();
	cp.msg();
	
}

}
