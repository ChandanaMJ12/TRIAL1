package com.test;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.page.RegisterPage;

import framework_utility.Browser_setup;

public class Registertest extends Browser_setup{
@Test
public void test()
{
	RegisterPage register=new RegisterPage(driver);
	assertTrue(register.Register.isEnabled(), "not enabled");
	register.Click_register();
	
	
}
}