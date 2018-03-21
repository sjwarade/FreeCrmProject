package com.crm.qa.util;

import java.awt.List;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelop {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		getExcelValues("s","D:\\TestData.xlsx");

	}
	public static Iterator<Row> readExcel(String filepath) throws Exception {
		FileInputStream fin=new FileInputStream(filepath);
		XSSFWorkbook wb=new XSSFWorkbook(fin);
		XSSFSheet sheet=wb.getSheetAt(0);
		Iterator<Row>  itrrow= sheet.rowIterator();
		return itrrow;
		}		


public static void getExcelValues(String str,String filepath) throws Exception {
	Iterator<Row> itrrow=readExcel(filepath);
	while(itrrow.hasNext()) {	
	XSSFRow row=(XSSFRow) itrrow.next();
	Iterator<Cell> itrcell=row.cellIterator();	
 
	while(itrcell.hasNext())
	{
		XSSFCell cell=(XSSFCell) itrcell.next();
		if(cell.getCellType()==cell.CELL_TYPE_NUMERIC) {
			System.out.print(cell.getNumericCellValue()+" ");
		}else if(cell.getCellType()==cell.CELL_TYPE_STRING){
		System.out.print(cell.getStringCellValue()+" ");
		}
	}
	System.out.println();
}


}
}
