package Revision;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExelReading {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("D:\\Karishma\\ExelSheet.xlsx");
	    Sheet mySheet=WorkbookFactory.create(file).getSheet("Sheet1");
	    String value=mySheet.getRow(0).getCell(0).getStringCellValue();
	    System.out.println(value);
	    
	    
		
	}

}

