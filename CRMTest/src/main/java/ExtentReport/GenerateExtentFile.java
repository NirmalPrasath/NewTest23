package ExtentReport;

import java.io.File;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.crm.qa.Test_Base.TestBase;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class GenerateExtentFile extends TestBase{
	
	ExtentReports extend;
	ExtentTest extentTest;
	
	public void startReport()
	{
		extend=new ExtentReports(System.getProperty("user.dri")+"/test-output/Extend_Report.html", true);
		extend.addSystemInfo("HostName", "Rohith");
		extend.addSystemInfo("UserName", "Rohith");
		extend.addSystemInfo("Environment", "QA");
		extend.loadConfig(new File(System.getProperty("user.dri")+"src\\main\\java\\com\\crm\\qa\\Config\\extend-config.xml"));
	}
	
	@Test
	public void passTest()
	{
		extentTest=extend.startTest("passTest");
		Assert.assertTrue(true);
		extentTest.log(LogStatus.PASS, "Assert Pass Condition is true");
	}
	
	@Test
	public void failTest()
	{
		extentTest=extend.startTest("passTest");
		Assert.assertTrue(true);
		extentTest.log(LogStatus.FATAL, "Assert Pass Condition is false");
	}
	
	

}
