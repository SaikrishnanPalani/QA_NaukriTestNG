package com.utility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	public static String readParticularCellData(int rowval , int colval) throws IOException, InvalidFormatException {
		
		String data = null;
		
		File file = new File(FileReaderManager.getDataProperty("excelpath"));
		Workbook book = new XSSFWorkbook(file);
		Sheet sheet =  book.getSheet("Sheet1");
		Row row = sheet.getRow(rowval);
		Cell cell = row.getCell(rowval);
		DataFormatter dataformat  = new DataFormatter();
		String data1= dataformat.formatCellValue(cell);
		System.out.println(data1);
		return data1;
	}
		
		
		
}
