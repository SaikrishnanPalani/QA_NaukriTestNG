package com.utility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ReadExcelData {

	
	public static void readParticularCellData() throws IOException, InvalidFormatException{
		
		File file = new File(FileReaderManager.getDataProperty("excelpath"));
		Workbook book = new XSSFWorkbook(file);
		Sheet sheet =  book.getSheet("Sheet1");
		Row row = sheet.getRow(2);
		Cell cell = row.getCell(0);
		DataFormatter dataformat  = new DataFormatter();
		String data= dataformat.formatCellValue(cell);
		System.out.println(data);
		
		
		
	}
	
	public static void readrow() throws IOException, InvalidFormatException {
		
		File file = new File(FileReaderManager.getDataProperty("excelpath"));
		Workbook books = new XSSFWorkbook(file);
		//Sheet sheet =  books.getSheet("Sheet1");
		Row row = books.getSheet("Sheet1").getRow(2);
		short lastCellNum = row.getLastCellNum();
		for(int i=0; i<lastCellNum;i++) {
			
		
		Cell cell = row.getCell(i);
		
		DataFormatter dataformat  = new DataFormatter();
		String data= dataformat.formatCellValue(cell); 
		System.out.println(data);
		}
		
}
	
	public static void entirerow() throws IOException, InvalidFormatException {
		File file = new File(FileReaderManager.getDataProperty("excelpath"));
		Workbook books = new XSSFWorkbook(file);
		Sheet sheet =  books.getSheet("Sheet1");
		int lastrow = books.getSheet("Sheet1").getLastRowNum();
		
		for(int i=0; i<=lastrow;i++) {
			Row row = sheet.getRow(i);
		
			short lastCellNum = row.getLastCellNum();
				for(int j=0; j<=lastCellNum;j++) {
					Cell cell = row.getCell(j);
				
		
		DataFormatter dataformat  = new DataFormatter();
		String data= dataformat.formatCellValue(cell);
		System.out.println(data);
		}
		}
		
	}
	
	public static void main(String[]args) throws InvalidFormatException, IOException {
		
		//readParticularCellData();
		//readrow();
		entirerow();
	}
	
	

}
