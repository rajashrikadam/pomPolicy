package dataProvidersUse;

import org.testng.annotations.DataProvider;

public class PolicyDataProviderTest 
{
	@DataProvider(name="policyBazaarData")
public static String[][]myPolicyData()
{
	String data[][]= {{"9623153925","raju@2811","Rajashri Kadam"},{"9405888174","pallu12345","Pallavi Chaudhari"}};
	return data;
}
}
