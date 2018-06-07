package Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {

	public static void main(String[] args) throws Exception {
	
		
		File f=new File("C:\\Automation\\S3.8\\TestData.xlsx");
		
		FileInputStream fis=new FileInputStream(f);
	
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sh=wb.getSheetAt(0);
		sh.getRow(1).createCell(2).setCellValue("pass");
		sh.getRow(2).createCell(2).setCellValue("fail");
		FileOutputStream fos=new FileOutputStream(f);
		wb.write(fos);
		

	}

}
