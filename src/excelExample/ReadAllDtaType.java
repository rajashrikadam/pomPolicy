package excelExample;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadAllDtaType {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	
	{
		
    FileInputStream myFile=new FileInputStream("D:\\excel jar\\Mysheet1.xlsx");  
    Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet3");
    int totalRowNum = mySheet.getLastRowNum();
    int totalCellNum = mySheet.getRow(0).getLastCellNum()-1;
    for(int i=0;i<=totalRowNum;i++)
    {
    	for(int j=0;j<=totalCellNum;j++)
    	{
    		Cell myCell = mySheet.getRow(i).getCell(j);
    		CellType myCellType = myCell.getCellType();
    		if(myCellType==CellType.STRING)
    		{
    			System.out.print(myCell.getStringCellValue()+" ");
    		}
    		else if(myCellType==CellType.NUMERIC)
    		{
    			System.out.print(myCell.getNumericCellValue()+" ");	
    		}
    		else if(myCellType==CellType.BOOLEAN)
    			
    		{
    			System.out.println(myCell.getBooleanCellValue()+" ");
  
    		}
    		else if(myCellType==CellType.BLANK)
    		{
    			System.out.print(" ");
    		}
 	}
    	System.out.println();
    }
    
	}

}
