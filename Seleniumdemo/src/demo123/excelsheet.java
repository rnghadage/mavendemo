package demo123;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelsheet {
	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream excel =new FileInputStream("C://Users//ats//OneDrive//Desktop//demoexl.xls/");
		
		Sheet a= WorkbookFactory.create(excel).getSheet("Sheet1");
		String b= a.getRow(0).getCell(0).getStringCellValue();
		String c = a.getRow(1).getCell(1).getStringCellValue();
		String d = a.getRow(2).getCell(2).getCellFormula();
		Thread.sleep(3000);
		
		
		System.out.println(b);
		
		System.out.println(c);
		System.out.println(d);
		
	}
	

}
