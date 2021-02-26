package com.hrms.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.hrms.utils.Constants;

public class excelTest {

	public static void main(String[] args) throws IOException {
		
		DataFormatter objDefaultFormat = new DataFormatter();
		// Path of the excel file
		FileInputStream fs = new FileInputStream(Constants.Path_TestData);
		// Creating a workbook
		XSSFWorkbook workbook = new XSSFWorkbook(fs);
		XSSFSheet sheet = workbook.getSheetAt(1);

//		Row row = sheet.getRow(0);
//		Cell cell = row.getCell(0);
		System.out.println("1 - " + sheet.getRow(0).getCell(0));

//		Row row1 = sheet.getRow(1);
//		Cell cell1 = row1.getCell(1);
		System.out.println("2 - " + sheet.getRow(0).getCell(1));

//		Row row2 = sheet.getRow(1);
//		Cell cell2 = row2.getCell(1);
		System.out.println("3 - " + sheet.getRow(1).getCell(0));

//		Row row3 = sheet.getRow(1);
//		Cell cell3 = row3.getCell(1);
		System.out.println("4 - " + sheet.getRow(1).getCell(1));

//		 String cellval = cell.getStringCellValue();
//		 System.out.println("5 - " + cellval);
//		

		System.out.println("\n\nIterating over Rows and Columns using for-each loop\n");
        for (Row row: sheet) {
            for(Cell cell: row) {
                String cellValue = objDefaultFormat.formatCellValue(cell);
                System.out.print(cellValue + "\t");
            }
            System.out.println();
        }
        
        
        //example
        
       Cell userName =  sheet.getRow(1).getCell(0);
       String orderID1=userName.toString();
        
       
        
        
        

	}

}
