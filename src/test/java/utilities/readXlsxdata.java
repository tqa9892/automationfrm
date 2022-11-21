package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class readXlsxdata {

@DataProvider(name="dvttest")		
public String[][] exldataread (Method m) throws EncryptedDocumentException, IOException {
	String excelSheetname1 =  m.getName();

	File f = new File (System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\testqa4.xlsx");
	FileInputStream fis = new FileInputStream (f);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheetname = wb.getSheet(excelSheetname1);
	int trows = sheetname.getLastRowNum();
	System.out.println(trows );
	
	int tcols = sheetname.getRow(1).getLastCellNum();
	System.out.println(tcols );
	
	DataFormatter dformat = new DataFormatter();
	String xldata [][] =new String [trows][tcols] ;
	for (int i=1; i<=trows;i++ ) {
		for(int c=0; c<tcols; c++) {
			xldata [i-1][c] = dformat.formatCellValue(sheetname.getRow(i).getCell(c));
			System.out.println(xldata [i-1][c] + " |  ");
		}
	
	}
	return xldata;
	
	
}
	}


