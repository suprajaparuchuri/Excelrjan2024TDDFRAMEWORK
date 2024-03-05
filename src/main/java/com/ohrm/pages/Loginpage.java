package com.ohrm.pages;

import org.openqa.selenium.By;


import com.ohrm.base.orangehrmbase;


public class Loginpage extends orangehrmbase {
	 
    public String getTitle() {
		return driver.getTitle();
	}
	public Dashboardpage login() {
		driver.findElement(By.name("username")).sendKeys(prop.getProperty("username"));
     	driver.findElement(By.name("password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		return new Dashboardpage();
	}

}
