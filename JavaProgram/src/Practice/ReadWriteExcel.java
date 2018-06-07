package Practice;

import org.testng.annotations.Test;

public class ReadWriteExcel {
	ExcelRead erw;
	@Test
	public void readData()
	{
		erw=new ExcelRead("C:\\Automation\\S3.8\\TestData.xlsx");
		
	System.out.println(erw.getData("Sheet1", 1, 0));
	System.out.println(erw.getData("Sheet1", 1, 1));
	}
//@Test
	/*public void writeData()
	{
		erw=new ExcelRead("C:\\Automation\\S3.8\\TestData.xlsx");
		erw.setData("Sheet1", 1, 2, "pass");
		erw.setData("Sheet1", 2, 2, "pass");
	
	}*/
}
