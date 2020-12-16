package org.dftestng;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import org.dftestng.Practice1;
import org.testng.Assert;
public class Practice {
	@Test(invocationCount=1,groups="parallel")
	private void tc1()
	{
		//Assert.assertTrue(false,"Assert fail");
		System.out.println("Test 1 "+Thread.currentThread().getId());
	}
	@Parameters("a")
	@Test(priority=-2,groups= {"smoke","@retest"})
	private void tc2(int a)
	{
		System.out.println("Test 2" +a);
	}
@Test(dataProvider="SampleData",dataProviderClass=Practice1.class)
private void tc3(String a,String b)
{
System.out.println("a value= "+a+" bvalue "+b);	
}
@Test(groups="parallel")
private void tc4()
{
System.out.println("Test 4 "+Thread.currentThread().getId());	
}
}
