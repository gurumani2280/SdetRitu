package com.rituraj1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.streaming.SXSSFRow.CellIterator;

public class M13_ReadingExcelData2 {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		// TODO Auto-generated method stub
		System.out.println(getExcelData("C:\\Users\\mani2\\OneDrive\\Desktop\\EmpData.xlsx", "sheet1"));
	}
	
	public static Map<Integer, List<String>> getExcelData(String fileName, String sheetName) throws InvalidFormatException, IOException {
		Map< Integer, List<String>> data = new LinkedHashMap<Integer, List<String>>();
		File file1 = new File(fileName);
		FileInputStream fis = new FileInputStream(file1);
		
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Iterator<Row> rowIterator = sh.iterator();
		int index = 0;
		while(rowIterator.hasNext()) {
			Row row = rowIterator.next();
			Iterator<Cell> cellIterator = row.iterator();
			List<String> rowData= new ArrayList<String>();
			while(cellIterator.hasNext()) {
				Cell cell = cellIterator.next();
				rowData.add(cell.toString());
				
			}
			data.put(index++, rowData);
		}
		
		return data;
		
	}

}
