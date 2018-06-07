package com.crm.qa.testcases;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.Pages.HomePage;
import com.crm.qa.Pages.LoginPage;
import com.crm.qa.Test_Base.TestBase;

public class LoginPageTest extends TestBase{
	
	LoginPage loginpage;
	HomePage homePage;
	public LoginPageTest()
	{
		super();
	}
	
@BeforeMethod
	public void setUp()
	{
		initialization();
		loginpage=new LoginPage();
		
	}
@Test(priority=1)
	public void titleTest()
	{
		String title=loginpage.verifyloginPageTitle();
		Assert.assertEquals(title, "Nirmal");
		//Free CRM software in the cloud powers sales and customer service
	}
@Test(priority=2)	
	public void logoTest() throws InterruptedException
	{
	boolean statuc=loginpage.verifyCRMLogo();
			if(statuc)
			{
				System.out.println("Click on");
			}
			else{
				System.out.println("Invalid");
				throw new InterruptedException("Login is invalid");
			}
	}
@Test(priority=3)
	public void signBtnTest()
	{
	boolean statusBtn=loginpage.verifySignButton();
	Assert.assertTrue(statusBtn);
	}

@Test(priority=4)
	public void loginTest()
	{
	loginpage.verifyLogin(prop.getProperty("username"), prop.getProperty("password"));
	
	String homePageTitle=driver.getTitle();
	Assert.assertEquals(homePageTitle, "homepage");
	
	
	}

@AfterMethod
public void tearDown() throws Exception
{
	Thread.sleep(8000);
	driver.quit();
}


}
