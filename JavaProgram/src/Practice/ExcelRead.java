package Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	XSSFWorkbook wb;
	XSSFSheet sh;
	File fi;
	
	public ExcelRead(String expath){
		
		try {
		fi=new File(expath);
			FileInputStream fid=new FileInputStream(fi);
			
		 wb=new XSSFWorkbook(fid);
		 
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
		public String getData(String sheetname, int row, int col)
		{
		sh=wb.getSheet(sheetname);
		int i=sh.getLastRowNum();
		int c=sh.getRow(0).getLastCellNum();
		System.out.println(i + " " + c);
			String data=sh.getRow(row).getCell(col).getStringCellValue();
		
			return data;
			
			
		}
		
	/*	public void setData(String sheetName1, int rowval, int colval, String valu)
		{ 
			sh=wb.getSheet(sheetName1);
		
			sh.getRow(rowval).createCell(colval).setCellValue(valu);
			
			try {
				
				FileOutputStream fos=new FileOutputStream(fi);
				
				wb.write(fos);
				
			
			} catch (IOException e) {
				
				e.printStackTrace();
			}*/
	
		
			
			
		}
		
	


