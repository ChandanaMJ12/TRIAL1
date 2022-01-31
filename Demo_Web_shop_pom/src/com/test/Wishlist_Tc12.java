package com.test;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.page.Firstpage;
import com.page.RegisterPage;

import framework_utility.Browser_setup;

public class Wishlist_Tc12 extends Browser_setup {
	@Test
	public void test()
	{
		Firstpage register=new Firstpage(driver);
		assertTrue(register.Wishlist.isEnabled(), "not enabled");
		register.Click_Wishlist();
		

	}
}
