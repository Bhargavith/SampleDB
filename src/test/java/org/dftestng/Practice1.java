package org.dftestng;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.asserts.SoftAssert;
public class Practice1  {
	
	@Parameters({"a","b"})
	@Test
	private void tc11(String a,String b)
	{
		SoftAssert s=new SoftAssert();
		s.assertTrue(false, "tcll fail");
		
		System.out.println(a+b);
		s.assertAll();
	}
	@Test(dataProvider="SampleData",groups="smoke")
	private void tc22(String a,String b)
	{
		System.out.println(a+b);
	}
	@DataProvider(name="SampleData")
	public static Object[][] data()
	{
return new Object[][] {{"10","20"},{"20","30"}};
	
	}
	@Test(groups="parallel")
	private void tc33()
	{
		System.out.println("Test33 "+Thread.currentThread().getId());
	}

}
