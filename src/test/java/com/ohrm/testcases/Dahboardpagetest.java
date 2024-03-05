package com.ohrm.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ohrm.pages.Dashboardpage;
import com.ohrm.pages.Loginpage;

public class Dahboardpagetest {
	
	Dashboardpage dp;
	Loginpage lp;
	
	@BeforeMethod
	public void browsersetup() {
		lp=new Loginpage();
		lp.intialization();
	}
	
   @Test
   public void validatetimeworksectiontest() {
	   dp=lp.login();
	   Assert.assertTrue(dp.gettimeworksection());
	   
    }
   @Test
   
   public void  myActionSectionTest() {
	dp=lp.login();
	Assert.assertTrue(dp.getMyActionSection());
}
   @AfterMethod
	public void closeBrowser () {
	  dp.teardown();
	}
}
