package examples.developing;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Trying1 {

	public static void main(String[] args) {
		FileInputStream f=null;
		XSSFWorkbook excel=null;
		XSSFSheet sheet=null;
		ArrayList<String> list=new ArrayList<String>();
		XSSFWorkbook excelresult=null;
		XSSFSheet sheetresult=null;
		File k=null;
		try {
			f=new FileInputStream("C:\\Users\\manjunath k s\\Desktop\\mock.xlsx");
			
			excel=new XSSFWorkbook(f);
			k=new File("C:\\Users\\manjunath k s\\Desktop\\result.xlsx");
			
			excelresult=new XSSFWorkbook(k);
			
			sheet=excel.getSheetAt(0);
			sheetresult=excelresult.getSheetAt(0);
			
			Iterator<Row> rows = sheet.rowIterator();
			while(rows.hasNext())
			{
				Row r=rows.next();
				if(r.getCell(2).getStringCellValue().equalsIgnoreCase("p1"))
				{
					list.add(r.getCell(0).getStringCellValue());
					
				}
			}
			Iterator<String> i = list.iterator();
			Iterator<Row> rowresults = sheetresult.rowIterator();
			while(rowresults.hasNext() && i.hasNext())
			{
				String m=i.next();
				System.out.println(m);
				Row ro=rowresults.next();
				ro.createCell(1).setCellValue(m);
				
			}
			
			excelresult.close();
		} catch (IOException | InvalidFormatException e) {
			e.printStackTrace();
		}
	}

}
