package actionClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertyFile
{public static void main(String[]args) throws IOException {
	Properties prop=new Properties();
FileInputStream myfile=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\feb18_2023Selenium\\src\\pomPolicyUsingTestNG\\pomPolicyUsingTestNG.properties");
prop.load(myfile);
System.out.println(prop.get("url"));


}
}
