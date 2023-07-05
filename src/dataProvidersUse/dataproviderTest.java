package dataProvidersUse;

import org.testng.annotations.DataProvider;

public class dataproviderTest 
{  @DataProvider(name="rediff")
	public static String[][]testData()
	{
     String data[][]=
    	 {{"Rajashri","Kadam","9623153925"},{"Pravin","Sarnobat","8459029010"}};
	return data;
		
	}

}
