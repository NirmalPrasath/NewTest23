package com.crm.qa.Test_Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.crm.qa.Listener.WebEventListener;





public class TestBase {
	
	public static WebDriver driver;
	
	public static Properties prop;
	
	public static EventFiringWebDriver eventFireDriver;
	public static  WebEventListener eventLiatener;
	
	public TestBase() 
	{
		try {
		prop=new Properties();
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com/crm/qa/Config/config.properties");
	
			prop.load(ip);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void initialization()
	{
		String browesrname=prop.getProperty("browser");
		if(browesrname.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:/Automation/S3.8/Drivers/chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		if(browesrname.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:/Automation/S3.8/Drivers/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		//Listener
		eventFireDriver=new EventFiringWebDriver(driver);
		eventLiatener=new WebEventListener();
		//Register
		eventFireDriver.register(eventLiatener);
		driver = eventFireDriver;
		
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get(prop.getProperty("url"));
	}
	
	

}
