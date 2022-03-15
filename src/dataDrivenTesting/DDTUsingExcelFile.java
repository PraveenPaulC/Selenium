package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDTUsingExcelFile {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {		
		//DDT using Excel file, We will get "NoSuchMethodError" in java project. Use same script in Maven Project, it will work
		FileInputStream f = new FileInputStream("./Excel/SeleniumExcelData.xlsx"); 
		Workbook wb = WorkbookFactory.create(f);
		
		String s = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println(s);

	}
}
