package apachepoi;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\testdata\\books.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet("Sheet1"); // or wb.getsheetAt(0);
		int rowCount = sh.getLastRowNum() + 1; // row index starts with 0 so we need to add +1 to get all rows count in
												// excel sheet
		int cellCount = sh.getRow(0).getLastCellNum();
		System.out.println("No.Of Rows " + rowCount);
		System.out.println("No.Of Cells " + cellCount);
		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < cellCount; j++) {
				XSSFRow row = sh.getRow(i); // row index starts with 0
				XSSFCell cell = row.getCell(j);
				System.out.print(cell.toString() + "\t");
			}
			System.out.println();
		}
		wb.close();
		fis.close();
	}
}
