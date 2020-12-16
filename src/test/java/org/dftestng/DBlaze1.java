package org.dftestng;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.dfobjrepository.DBpojo1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class DBlaze1 extends DBlazeBase {
	
	
	@BeforeClass
	private void loadBrowser() throws InterruptedException
	{
	//config system
	WebDriver driver = configureSystem();
	launchUrl("https://blazedemo.com/");
	
	maxWindow();
	
	Thread.sleep(3000);
	}
	@BeforeMethod
	private void startTime()
	{
	Date d=new Date();
	System.out.println(d);
	}
	@AfterMethod
	private void endTime()
	{
		Date d=new Date();
		System.out.println(d);
			
	}
	@Test(enabled=false)
	@Parameters({"firstname","address","city","state","zipcode","ccnumber","nameofcard"})
	private void tc11(String firstname,String address,String city,String state,String zipcode,String ccnumber,String nameofcard) throws InterruptedException, IOException
	{
	DBpojo1 db1=new DBpojo1();
	selVisText(db1.getFrom(), "Paris");
	selVisText(db1.getTo(), "London");
	btnClick(db1.getSearButton());
	Thread.sleep(5000);
	
	
	//webTable
		//createSheet();
		
		excelwrite(db1.getTh(), 0);
	
		excelwrite(db1.getTrow1(), 1);
		
		excelwrite(db1.getTrow2(), 2);
		
		excelwrite(db1.getTrow3(), 3);

		excelwrite(db1.getTrow4(), 4);
		
		excelwrite(db1.getTrow5(), 5);		
	System.out.println("done"); 
	}

}
