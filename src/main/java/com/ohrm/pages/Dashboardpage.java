package com.ohrm.pages;

import org.openqa.selenium.By;
import com.ohrm.base.orangehrmbase;

public class Dashboardpage extends orangehrmbase {
    
    public boolean getDashboardLabel() {
        return driver.findElement(By.xpath("//h6[text()='Dashboard']")).isDisplayed(); 
    }

    public boolean gettimeworksection() {
        return driver.findElement(By.xpath("//p[text()='Time at work']")).isDisplayed();
    }
    public boolean getMyActionSection() {
    	 return driver.findElement(By.xpath("//p[text()='My'")).isDisplayed();
    }
}
