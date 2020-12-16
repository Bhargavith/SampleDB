package org.dftestng;

import java.io.IOException;
import java.util.Date;

import org.dfobjrepository.DBpojo1;
import org.dfobjrepository.DBpojo2;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DBlaze2 extends DBlazeBase {
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
	@Test
	@Parameters({"firstname","address","city","state","zipcode","ccnumber","nameofcard"})
	private void tc1(String firstname,String address,String city,String state,String zipcode,String ccnumber,String nameofcard) throws InterruptedException, IOException
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
	//Second pojo class
	DBpojo2 db2=new DBpojo2();
	
	btnClick(db2.getSelFlight());
	Thread.sleep(5000);
	fill(db2.getName(), firstname);
	fill(db2.getAddress(), address);
	fill(db2.getCity(), city);
	fill(db2.getState(), state);
	fill(db2.getZipcode(), zipcode);
	fill(db2.getCcNumber(), ccnumber);
	fill(db2.getNameonCard(), nameofcard);
	btnClick(db2.getPurchageFlight());
	
	
	}
	@Test(enabled=false)
	@Parameters({"firstname","address","city","state","zipcode","ccnumber","nameofcard"})
	private void tc2(String firstname,String address,String city,String state,String zipcode,String ccnumber,String nameofcard) throws InterruptedException, IOException
	{
		WebDriver driver = configureSystem();
		launchUrl("https://blazedemo.com/");
		
		maxWindow();
		
		Thread.sleep(3000);
		
	DBpojo1 db1=new DBpojo1();
	selVisText(db1.getFrom(), "Paris");
	selVisText(db1.getTo(), "London");
	btnClick(db1.getSearButton());
	Thread.sleep(5000);
	
	
	//webTable
		createSheet();
		
		excelwrite(db1.getTh(), 0);
	
		excelwrite(db1.getTrow1(), 1);
		
		excelwrite(db1.getTrow2(), 2);
		
		excelwrite(db1.getTrow3(), 3);

		excelwrite(db1.getTrow4(), 4);
		
		excelwrite(db1.getTrow5(), 5);		
	System.out.println("done"); 
	//Second pojo class
	DBpojo2 db2=new DBpojo2();
	
	btnClick(db2.getSelFlight());
	Thread.sleep(5000);
	fill(db2.getName(), firstname);
	fill(db2.getAddress(), address);
	fill(db2.getCity(), city);
	fill(db2.getState(), state);
	fill(db2.getZipcode(), zipcode);
	fill(db2.getCcNumber(), ccnumber);
	fill(db2.getNameonCard(), nameofcard);
	btnClick(db2.getPurchageFlight());
	Thread.sleep(3000);
	//Ticket update in Excel
	excelwrite(db2.getTrow1(), 8);
	excelwrite(db2.getTrow2(), 9);
	excelwrite(db2.getTrow3(), 10);
	excelwrite(db2.getTrow4(), 11);
	excelwrite(db2.getTrow5(), 12);
	excelwrite(db2.getTrow6(), 13);
	excelwrite(db2.getTrow7(), 14);
	System.out.println("flight detalis entered done");
	
	}

}
