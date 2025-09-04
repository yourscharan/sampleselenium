package apachepoi;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataInExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream(System.getProperty("user.dir") + "\\testdata\\myExcelFile.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sh = wb.createSheet("mysheet");
		XSSFRow row1=sh.createRow(0);
		row1.createCell(0).setCellValue("Name");
		row1.createCell(1).setCellValue("Age");
		//
		XSSFRow row2=sh.createRow(1);
		row2.createCell(0).setCellValue("Nag");
		row2.createCell(1).setCellValue("24");
		//
		XSSFRow row3=sh.createRow(2);
		row3.createCell(0).setCellValue("uma");
		row3.createCell(1).setCellValue("26");
		//
		wb.write(fos);
		wb.close();
		fos.close();
		System.out.println("Excel file created");
	}

}
