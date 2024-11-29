package com.rituraj1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class M13_ReadingExcelData {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		// TODO Auto-generated method stub
		String empName = getExcelData("C:\\Users\\mani2\\OneDrive\\Desktop\\EmpData.xlsx", "sheet1", 1, 0);
		System.out.println(empName);
		System.out.println(getExcelData("C:\\Users\\mani2\\OneDrive\\Desktop\\EmpData.xlsx", "sheet1", 1, 1));
		System.out.println(getExcelData("C:\\Users\\mani2\\OneDrive\\Desktop\\EmpData.xlsx", "sheet1", 1, 2));
		
	}
	
	public static String getExcelData(String fileName, String sheetName, int rowIndex, int columnIndex) throws InvalidFormatException, IOException {
		String data = null;
		File file1 = new File(fileName);
		FileInputStream fis = new FileInputStream(file1);
		
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row row = sh.getRow(rowIndex);
		Cell cell = row.getCell(columnIndex);
		data = cell.toString();
		return data;
		
	}

}
