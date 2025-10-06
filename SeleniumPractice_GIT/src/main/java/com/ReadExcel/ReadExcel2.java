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

public class ReadExcel2 {

	public static void main(String[] args) throws IOException {
		
		ReadExcel2 obj=new ReadExcel2();
		obj.ReadExcel3();
		
	}
		
	
	
//Using Loop to read data (Static)
public String[][] ReadExcel3() throws IOException {

	String filePath = "./src/test/resources/FileRead1.xlsx"; 

	
	XSSFWorkbook WorkBook= new XSSFWorkbook(filePath);
	XSSFSheet sheet=  WorkBook.getSheetAt(2);
	String[][] Inputs= new String [2][2];// 1 row 2 columns
	for(int i=1;i<=2;i++)
	{
	XSSFRow row=sheet.getRow(i);

	for(int j=0;j<2;j++)
	{

	XSSFCell cell= row.getCell(j);
	String Cell2=cell.getStringCellValue();
	
	System.out.println("Uname & Pwd "+Cell2);
	Inputs[i-1][j]=Cell2;
	
	}
	
	}

	WorkBook.close();
	return Inputs;
	
	
	
}



}
