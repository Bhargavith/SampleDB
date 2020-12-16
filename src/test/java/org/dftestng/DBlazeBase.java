package org.dftestng;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class DBlazeBase {
	public static WebDriver driver;
	public static WebDriver configureSystem()
	{
	System.setProperty("webdriver.chrome.driver","E:\\EcllipseOxygen\\DemoBlaze\\drivers\\chromedriver.exe");
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-notifications");
	driver=new ChromeDriver(options);

	return driver;
	}

	public static void maxWindow()
	{
	driver.manage().window().maximize();
	}
	public static void launchUrl(String Url)
	{
	driver.get(Url);
	}

	public static String fill(WebElement element,String value)
	{
	element.sendKeys(value);
	String value1=element.getAttribute("value");
	return value1;
	}
	public static void btnClick(WebElement element)
	{
	element.click();
	}
	public static void selVisText(WebElement element,String s)
	{
		Select s1=new Select(element);
		s1.selectByVisibleText(s);
		
	}
	public static void createSheet() throws IOException
	{
		File f=new File("E:\\EcllipseOxygen\\DemoBlaze\\DatadriExcel\\FliDetails.xlsx");

		Workbook workbook=new XSSFWorkbook();
		workbook.createSheet("Flight Detalis");
		
		FileOutputStream fos=new FileOutputStream(f);
		workbook.write(fos);
		
	
	}

	public   static void excelwrite(List<WebElement> rowData ,int rowNo) throws IOException
	{
	File f=new File("E:\\EcllipseOxygen\\DemoBlaze\\DatadriExcel\\FliDetails.xlsx");

	
	FileInputStream fis=new FileInputStream(f);
	Workbook b=new XSSFWorkbook(fis);
	Sheet s=b.getSheet("Flight Detalis");
	s.createRow(rowNo);
	
	for(int i=0;i<rowData.size();i++)
	{
	s.getRow(rowNo).createCell(i).setCellValue(rowData.get(i).getText());
	}
	FileOutputStream fos=new FileOutputStream(f);
	b.write(fos);
	}


}
