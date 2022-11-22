package com.ecom.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.ecom.base.BaseClass;

public class ExcelReader extends BaseClass {
	
	FileInputStream fis;
	
	public ExcelReader() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream(projectPath+"\\src\\test\\resources\\data\\ProjectFramework.xlsx");
	}

	public Sheet getSheet(String sheetName) throws EncryptedDocumentException, IOException {
		
		Sheet sh = WorkbookFactory.create(fis).getSheet(sheetName);
		return sh;
	} 
	
	public Object[][] getData(Sheet sh) {
		
		int rowCount = sh.getLastRowNum();
		
		Map<String, Object> finalData = new HashMap<>();
		
		Object [][] excelData = new Object[rowCount][];
		
		for(int i=0; i<rowCount; i++) {
			
			Map<String, Object> data = new HashMap<>();
			
			int colNum = sh.getRow(i).getLastCellNum();
			
			for(int j=0; j<colNum; j++) {
				
				if(sh.getRow(i).getCell(j).getCellType().toString().equalsIgnoreCase("string")) {
				data.put(sh.getRow(j).getCell(colNum).getStringCellValue(), 
						sh.getRow(i).getCell(j).getStringCellValue());
				}
				else if(sh.getRow(i).getCell(j).getCellType().toString().equalsIgnoreCase("numeric")) {
					data.put(sh.getRow(j).getCell(colNum).getStringCellValue(), 
							sh.getRow(i).getCell(j).getNumericCellValue());
				}
			}
			excelData[i][0] = data;
			data.forEach(finalData::put);
		}
		return excelData;
	}
	
	public Object getSingleData(Sheet sh, int row, int col) {
		
		if(sh.getRow(row).getCell(col).getCellType().toString().equalsIgnoreCase("string")) {
			return sh.getRow(row).getCell(col).getStringCellValue();
		}
		else if(sh.getRow(row).getCell(col).getCellType().toString().equalsIgnoreCase("numeric")) {
			return sh.getRow(row).getCell(col).getNumericCellValue();
		}
		else {
			return null;
		}
	}
	
	public int getRowCount(Sheet sh) {
		
		return sh.getLastRowNum();
	}
		 

	

}