package com.ecom.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public static String projectPath = System.getProperty("user.dir");
	public static WebDriver driver;
	
	public void initDriver() {
		//System.out.println("Project Path "+projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/V1/index.php");
		
	}

}
