package com.crm.qa.Util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.crm.qa.Test_Base.TestBase;

public class TestUtil extends TestBase {

	public static long IMPLITITLY_WAIT=30;
	public static long PAGE_LOAD_TIMEOUT=30;
	public static long SET_SCRIPT_TIMEOUT=30;
	
	
	
	
	
	public static void takeScreenshotAtEndOfTest() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		
		FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
		
		}
	
	public static String takeScreenshot(long l) throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String destFile = System.getProperty("user.dir")+ "/errorScreenNG/" + l + System.currentTimeMillis()+ ".png";
		File destination=new File(destFile);
		FileUtils.copyFile(scrFile, destination);
		return destFile;
		
		}
	
	
}
