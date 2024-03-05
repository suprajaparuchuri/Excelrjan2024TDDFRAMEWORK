package com.ohrm.base;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangehrmbase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public void intialization() {
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	public void teardown() {
		driver.quit();
	}
	
	public void propertyfileconfiguration() {
		String configfilepath = "./EXCELRBATCH2024TDDFramework/src/main/java/orangehrm/config/config.properties";
		prop=new Properties();
		FileReader reader;
		try {
			reader = new FileReader(configfilepath);
			prop.load(reader);
		}catch(IOException e) {
			System.out.println("unable to find the file");
		}
	}

}
