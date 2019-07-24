package objectrepo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TelecomBase {

	public static WebDriver driver;

	public static ArrayList<HashMap<String,String>> mdata;
	
public static ArrayList<HashMap<String,String>> ReadDataFromExcel(String filepath,String sheetname) throws IOException
	
	{
		 mdata = new ArrayList<HashMap<String,String>>();
		 FileInputStream fis = new FileInputStream(filepath);
		 Workbook w= new XSSFWorkbook(fis);
	     Sheet s = w.getSheet(sheetname);
	    Row HeaderRow=s.getRow(0);
	    
	    for (int i = 1; i < s.getPhysicalNumberOfRows(); i++) {
	    	
	    	HashMap<String, String> currentHash = new HashMap<String,String>();
	    	Row currentRow = s.getRow(i);
	    	for(int j=0;j<HeaderRow.getPhysicalNumberOfCells();j++)
	    	{
	    		currentHash.put(HeaderRow.getCell(j).getStringCellValue(), currentRow.getCell(j).getStringCellValue());
	    	
	    	}
			mdata.add(currentHash);
		}
	    System.out.println(mdata);
		return mdata;
		
	}

	public static void type(WebElement element, String string) {
		element.sendKeys(string);
	}

	public static void btnClick(WebElement element) {
		element.click();
	}

	public static void dropDown(WebElement element, String string) {
		new Select(element).selectByValue(string);
	}

	public static String getData(int rowNo, int cellNo) throws IOException {
		File loc = new File("F:\\Selenium-cucumber\\Task\\src\\main\\java\\com\\greens\\task\\excel\\adactin.xlsx");
		FileInputStream f = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(f);
		Sheet s = w.getSheet("adactin");
		Row r = s.getRow(rowNo);
		Cell c = r.getCell(cellNo);
		int type = c.getCellType();
		String name = null;
		if (type == 1) {
			name = c.getStringCellValue();
		}
		if (type == 0) {
			if (DateUtil.isCellDateFormatted(c)) {
				Date d = c.getDateCellValue();
				SimpleDateFormat si = new SimpleDateFormat("dd-mm-yy");
				si.format(d);
			} else {
				double d = c.getNumericCellValue();
				long l = (long) d;
				name = String.valueOf(l);

			}

		}
		return name;

	}

	public static String[][] getExcelData() throws IOException {
		File loc = new File("F:\\Selenium-cucumber\\Task\\src\\main\\java\\com\\greens\\task\\excel\\adactin.xlsx");
		FileInputStream f = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(f);
		Sheet s = w.getSheet("adactin");
		String name = null;
		String data[][] = new String[s.getPhysicalNumberOfRows() - 1][s.getRow(0).getPhysicalNumberOfCells()];
		System.out.println(s.getPhysicalNumberOfRows());
		System.out.println(s.getRow(0).getPhysicalNumberOfCells());
		for (int i = 1; i < s.getPhysicalNumberOfRows(); i++) {
			Row r = s.getRow(i);
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);
				if (c != null) {
					int type = c.getCellType();
					if (type == 1) {
						name = c.getStringCellValue();
					}
					if (type == 0) {
						if (DateUtil.isCellDateFormatted(c)) {
							name = new SimpleDateFormat("DD-MMM-YY").format(c.getDateCellValue());
						} else {

							name = String.valueOf((long) c.getNumericCellValue());
						}
					}
					data[i - 1][j] = name;

				}

			}
			

		}
		return data;
	}

	public static void writeValueExcel(int rowNo, int CellNo, String Name) throws IOException {
		File loc = new File("F:\\Selenium-cucumber\\Task\\src\\main\\java\\com\\greens\\task\\excel\\adactin.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet s = w.getSheet("adactin");
		Row r = s.getRow(rowNo);
		Cell c = r.getCell(CellNo);
		c.setCellValue(Name);
		FileOutputStream o = new FileOutputStream(loc);
		w.write(o);
		System.out.println("updated");

	}
	
	public boolean isAlertPresent() 
	{ 
	    try 
	    { 
	        Alert a = driver.switchTo().alert(); 
	        a.accept();
	        return true; 
	    }   // try 
	    catch (NoAlertPresentException Ex) 
	    { 
	        return false; 
	    }   // catch 
	}   // isAlertPresent()

}
