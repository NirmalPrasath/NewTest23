package com.crm.qa.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.Test_Base.TestBase;

public class LoginPage extends TestBase{

// pagefactory
	@FindBy(name="username")
	WebElement uname;
	
	@FindBy(name="password")
	WebElement pword;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(xpath="//button[text()='Sign Up']")
	WebElement signBtn;
	
	@FindBy(xpath="//img[contains(@class,'img-responsive')]")
	WebElement crmLogo;
	
	//constructor Initialization pagefactory
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public Boolean verifySignButton()
	{
		boolean SignButton=signBtn.isDisplayed();
		return SignButton;
		
	}
	
	public Boolean verifyCRMLogo()
	{
		boolean logo=crmLogo.isDisplayed();
		return logo;
	}
	
	public String verifyloginPageTitle()
	{
		String title=driver.getTitle();
		return title;
	}
	
	public String verifyLogin(String usname, String poword)
	{
		uname.sendKeys(usname);
		pword.sendKeys(poword);
		crmLogo.click();
		String homePagetitle=driver.getTitle();
		return homePagetitle;
		
	}
	
}
