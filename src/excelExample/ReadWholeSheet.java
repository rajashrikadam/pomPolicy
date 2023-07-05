package excelExample;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadWholeSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream myFile = new FileInputStream("D:\\excel jar\\Mysheet1.xlsx");
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
		//outer for loop-->Row 0-1
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=2;j++)
			{
				String value = mySheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+" ");
			}
		}
        System.out.println();
	}

}
