package com.test;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.page.Addtocartpage;
import com.page.Firstpage;

import framework_utility.Browser_setup;

public class AddtoCart_test10 extends Browser_setup{
	@Test
	public void test(){
		
	Firstpage register=new Firstpage(driver);
	assertTrue(register.books.isEnabled(), "not enabled");
	register.Click_book();
	
	
	Addtocartpage add=new Addtocartpage(driver);
	add.Click_addtocart();
	}
	
}
