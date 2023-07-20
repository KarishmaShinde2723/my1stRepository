package PolicyBazarQAUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class Utility {
	
	//screenShot
	//scrollIntoView
	//read data from excel
	//wait
	//read data from property file
	
	public static void takeScreeanshot(WebDriver driver,String fileName) throws IOException
	{
		Reporter.log("Taking Screenshot", true);
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des=new File("D:\\KarishmaVData\\PolicyBazar\\Screenshot_PolicyBazar");
		FileHandler.copy(src, des);
	}
	
	public static void scrollIntoView(WebDriver driver, WebElement element)
	{
		Reporter.log("Scrolling into View", true);
		((JavascriptExecutor)driver).executeScript("Argument(0).scrollIntoView(true)",element);
	}
	
	public static String readDataFromExcel(int row, int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream myFile=new FileInputStream("D:\\KarishmaVData\\PolicyBazar\\My_PB_Data.xlsx");
		String value=WorkbookFactory.create(myFile).getSheet("Sheet1").getRow(row).getCell(cell).getStringCellValue();
		Reporter.log("reading data from excel Row num"+row+"Cell num"+cell, true);
		return value;
	}
	
	public static void waitTime(int waitTimesec) throws InterruptedException
	{
		Thread.sleep(waitTimesec);
		Reporter.log("Waiting Time"+waitTimesec+"milisec", true);
	}
	
	/*public static void readDataFromPropertyFile()
	{
		Properties obj=new Properties();
		FileInputStream objfile=new FileInputStream();
		obj.load(objfile);
		String value=obj.getProperty("URL");
	}*/

}
