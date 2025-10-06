package com.ReadExcel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel1 {

	public static void main(String[] args) throws IOException {
		
		ReadExcel1 obj=new ReadExcel1();
		obj.ReadExcel22();
		
	}
		
	
	//Simple Excel data read	but without using XSSF
	public void ReadExcel22() throws IOException {
		
		String filePath1 = "./src/test/resources/FileRead1.xlsx"; 
		
		 FileInputStream fis = new FileInputStream((filePath1));
	     Workbook workbook = WorkbookFactory.create(fis);  

			 Sheet sheet= workbook.getSheetAt(1);
			 Row row= sheet.getRow(1);
			
		    Cell cell= row.getCell(0);
			String Cell2=cell.getStringCellValue();
			
			System.out.println(Cell2);
		
			workbook.close();
		}
	
		
 
//Simple Excel data read but using XSSF
public void ReadExcel2() throws IOException {
	
	
		String filePath = "./src/test/resources/FileRead1.xlsx"; 

		
		XSSFWorkbook WorkBook= new XSSFWorkbook(filePath);
		
		XSSFSheet sheet=  WorkBook.getSheetAt(1);
		
		
		XSSFRow row=sheet.getRow(1);


		XSSFCell cell= row.getCell(0);
		String Cell2=cell.getStringCellValue();
		
		System.out.println(Cell2);
	
		WorkBook.close();
	}
	
	
//Using Loop to read data (Static)
public void ReadExcel3() throws IOException {

	String filePath = "./src/test/resources/FileRead1.xlsx"; 

	
	XSSFWorkbook WorkBook= new XSSFWorkbook(filePath);
	
	XSSFSheet sheet=  WorkBook.getSheetAt(1);
	
	for(int i=1;i<=2;i++)
	{
	XSSFRow row=sheet.getRow(i);
	

	for(int j=0;j<2;j++)
	{

	XSSFCell cell= row.getCell(j);
	String Cell2=cell.getStringCellValue();
	
	System.out.println(Cell2);
	}
	
	}
	
	
	WorkBook.close();
}

//Using Loop to read data (Dynamic)
public void ReadExcel4() throws IOException {

	String filePath = "./src/test/resources/FileRead1.xlsx"; 
	
	
	XSSFWorkbook WorkBook= new XSSFWorkbook(filePath);
	
	XSSFSheet sheet=  WorkBook.getSheetAt(0);
	
	int lastrownum=sheet.getLastRowNum();
	System.out.println("Last row num "+lastrownum);
	
	
	for(int i=1;i<=lastrownum;i++)
	{
	XSSFRow row=sheet.getRow(i);
	
	short lastcellnum=sheet.getRow(0).getLastCellNum();
	for(int j=0;j<lastcellnum;j++)
	{

	XSSFCell cell= row.getCell(j);
	//String Cell2=cell.getStringCellValue();// it will not print Integer value so we proceed with below two lines
	DataFormatter form=new DataFormatter();
	String Cell2= form.formatCellValue(cell);
	System.out.println(Cell2);
	}
	
	}

	WorkBook.close();


}

}
