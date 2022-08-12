package Practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteIntoExcel {

	public static void main(String[] args) throws Throwable, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("./Data/Book2.xlsx");
		Workbook wb =WorkbookFactory.create(fis);
		Sheet sh =wb.getSheet("Sheet1");
		Row row = sh.createRow(1);
		Cell cell =row.createCell(5);
		cell.setCellValue("Monika");
		FileOutputStream fos = new FileOutputStream("./Data/Book2.xlsx");
		wb.write(fos);
		wb.close();
		
	}

}
