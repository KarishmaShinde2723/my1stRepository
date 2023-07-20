package TestNGRevision;

import org.testng.annotations.DataProvider;

public class MyDataProvider {
	
	@DataProvider(name="MyFBData")
	public static String[][]fetchData(){
		
		String Credentials[][] = {{"Pune","Pune1"}, {"Mumbai", "Mumbai1"}, {"Nagpur", "Nagpur1"}};
		return Credentials;
		
	}

}
