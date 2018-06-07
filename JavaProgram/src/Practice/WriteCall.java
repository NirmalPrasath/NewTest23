package Practice;

import org.testng.annotations.Test;

public class WriteCall {
	WriteLib erw;
	@Test
	public void readData() throws Exception
	{
		erw=new WriteLib("C:\\Automation\\S3.8\\TestData.xlsx");
		
	erw.setData(0, 3, 2, "Nirmal");

	
	}
}
