package com.ohrm.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ohrm.pages.Dashboardpage;
import com.ohrm.pages.Loginpage;

public class LoginPageTest {
	
    Dashboardpage dp;
	Loginpage lp;
	
	
	@BeforeMethod
	public void browserSetup() {
		lp=new Loginpage();
		lp.intialization();
	}

	@Test
    public void ValidateTitleTest() {
    	String exptitle= "OrangeHRM";
    	String acttitle = lp.getTitle();
    	Assert.assertEquals(acttitle,exptitle);
    }
	
	//TC2:validate login
	  @Test
     public void validateLoginTest() {
		  dp = lp.login();
          Assert.assertTrue(dp.getDashboardLabel());
   }
	
	@AfterMethod
	public void closeBrowser () {
	  lp.teardown();
	}
}

