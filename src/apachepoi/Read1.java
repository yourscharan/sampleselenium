package apachepoi;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//testdata//books.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheetAt(0);
		int rowcount = sh.getLastRowNum() + 1;
		int colcount = sh.getRow(0).getLastCellNum();
		System.out.println("No.Of rows " + rowcount);
		System.out.println("No.Of cols " + colcount);
		for (int i = 0; i < rowcount; i++) {
			for (int j = 0; j < colcount; j++) {
				Row row = sh.getRow(i);
				Cell cell = row.getCell(j);
				System.out.print(cell.toString() + "\t");
			}
			System.out.println();
		}
	}

}
