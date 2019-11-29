package reuseablePackage.feature;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class JavaMethods {

	
	public boolean StringEquals(String actual, String expected)
	{
		boolean value=actual.equals(expected);
		return value;
	}
	
	public int ExcelRowCount(String xlPath,String sheetName) throws Exception, IOException
	{
	FileInputStream fis=new FileInputStream(xlPath);
	Workbook w1= WorkbookFactory.create(fis);
	Sheet s1=w1.getSheet(sheetName);
	int rowCount = s1.getLastRowNum();
	return rowCount;
	}
	

	}


