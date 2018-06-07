package Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteLib {
	XSSFWorkbook wb;
	FileInputStream fis;
	XSSFSheet sh;
	File f;
	public WriteLib(String path) throws Exception{
		
	
		f=new File(path);
	
		fis=new FileInputStream(f);

		wb=new XSSFWorkbook(fis);
	}
	
	public void setData(int sheetno, int rowno, int colno, String val) throws Exception
	{
	sh=wb.getSheetAt(sheetno);
	sh.getRow(rowno).createCell(colno).setCellValue(val);
	
	FileOutputStream fos=new FileOutputStream(f);
	wb.write(fos);
	
	}
}

