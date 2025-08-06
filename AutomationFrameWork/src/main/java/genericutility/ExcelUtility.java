package genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

/**
 * @author Poornima
 */

public class ExcelUtility {
	
	/**
	 * This method will read String from excel
	 * @param sheetname
	 * @param rowIndex
	 * @param colIndex
	 * @return String
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	
	public String getStringDataFromExcel(String sheetname,int rowIndex,int colIndex) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(sheetname).getRow(rowIndex).getCell(colIndex).getStringCellValue();
		
	}
	
	/**
	 * This method will read Boolean from excel
	 * @param sheetname
	 * @param rowIndex
	 * @param colIndex
	 * @return Boolean
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
public boolean getBoolenDataFromExcel(String sheetname,int rowIndex,int colIndex) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		boolean value = wb.getSheet(sheetname).getRow(rowIndex).getCell(colIndex).getBooleanCellValue();
		return value;
	}

/**
 * This method will read Numeric from excel
 * @param sheetname
 * @param rowIndex
 * @param colIndex
 * @return Double
 * @throws EncryptedDocumentException
 * @throws IOException
 */

public Double getDoubleDataFromExcel(String sheetname,int rowIndex,int colIndex) throws EncryptedDocumentException, IOException {
	
	FileInputStream fis=new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	double value = wb.getSheet(sheetname).getRow(rowIndex).getCell(colIndex).getNumericCellValue();
	return null;
}

/**
 * This method will read Date and time from excel
 * @param sheetname
 * @param rowIndex
 * @param colIndex
 * @return date
 * @throws EncryptedDocumentException
 * @throws IOException
 */

public Date getDateDataFromExcel(String sheetname,int rowIndex,int colIndex) throws EncryptedDocumentException, IOException {
	
	FileInputStream fis=new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Date value = (Date) wb.getSheet(sheetname).getRow(rowIndex).getCell(colIndex).getDateCellValue();
	return null;
	
}

}
