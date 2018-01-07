package com.hybrid.com.hybridtest;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadWrite {
	
	
	public static String ExcelRead(int row, int cell) throws Exception
	{
		File src=new File(".//testdata//MyLogin.xlsx");
		 
		  // Load the file
		 
		  FileInputStream fis=new FileInputStream(src);
		 
		   // load the workbook
		 
		   XSSFWorkbook wb=new XSSFWorkbook(fis);
		 
		  // get the sheet which you want to modify or create
		 
		   XSSFSheet sh1= wb.getSheetAt(0);
		 
		 // getRow specify which row we want to read and getCell which column
		 
		 String c= sh1.getRow(row).getCell(cell).getStringCellValue();
		 wb.close();
		 return c;
		
	}

	
	public static void ExcelWrite(int row, int cell, String value) throws Exception
	{
		File src=new File(".//testdata//MyLogin.xlsx");
		 
		  // Load the file
		 
		  FileInputStream fis=new FileInputStream(src);
		 
		   // load the workbook
		 
		   XSSFWorkbook wb=new XSSFWorkbook(fis);
		 
		  // get the sheet which you want to modify or create
		 
		   XSSFSheet sh1= wb.getSheetAt(0);
		   sh1.getRow(row).createCell(cell).setCellValue(value);
		   FileOutputStream fout=new FileOutputStream(new File(".//testdata//MyLogin.xlsx"));
		   
		   
		// finally write content 
		 
		 wb.write(fout);
		 fout.close();
		 wb.close();
	}
}
