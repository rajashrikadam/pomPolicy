package excelExample;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadSheetAutoSize {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream myFile=new FileInputStream("D:\\excel jar\\Mysheet1.xlsx");
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
		//get row and cell count
		int lastRowNum = mySheet.getLastRowNum();
		int totalRowNum = lastRowNum;
	    short lastCellNum = mySheet.getRow(0).getLastCellNum();
	    int totalCellNum = lastCellNum-1;
	    for(int i=0;i<=totalRowNum;i++)
	    {
	    	for(int j=0;j<=totalCellNum;j++)
	    	{
	    		String value = mySheet.getRow(i).getCell(j).getStringCellValue();
	    		System.out.print(value+" ");
	    	}
	    }
	     System.out.println();
	

	}

}
