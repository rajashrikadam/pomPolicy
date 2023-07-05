package excelExample;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReadRow {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream myFile=new FileInputStream("D:\\excel jar\\Mysheet1.xlsx");
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet2");
		//read whole row
		for(int i=0;i<=2;i++)
		{
			double value = mySheet.getRow(0).getCell(i).getNumericCellValue();
			System.out.print(value+" ");
		}
		System.out.println();
		//read whole column
		for(int i=0;i<=3;i++)
		{
			double value1 = mySheet.getRow(i).getCell(0).getNumericCellValue();
			System.out.print(value1+" ");
		}
		System.out.println();
	}

}
