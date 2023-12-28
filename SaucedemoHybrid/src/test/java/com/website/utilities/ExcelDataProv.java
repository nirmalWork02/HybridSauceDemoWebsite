package com.website.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProv {
	XSSFWorkbook wb;
	public ExcelDataProv() {
		File src = new File("C:\\Users\\Aravind Raj\\Documents\\TestData.xlsx");
		try {
			FileInputStream fis = new FileInputStream(src);
			wb= new XSSFWorkbook(fis);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("File Not Found "+e.getMessage());
			e.printStackTrace();
		}
		
	}
	
	public String getStringData(int SheetIndex, int row, int col) {
		return wb.getSheetAt(SheetIndex).getRow(row).getCell(col).getStringCellValue();
	}
	
	//Method Overloading
	public String getStringData(String SheetName, int row, int col) {
		return wb.getSheet(SheetName).getRow(row).getCell(col).getStringCellValue();
	}
	
	public double getNumericData(int SheetIndex, int row, int col) {
		return wb.getSheetAt(SheetIndex).getRow(row).getCell(col).getNumericCellValue();
	}

}
