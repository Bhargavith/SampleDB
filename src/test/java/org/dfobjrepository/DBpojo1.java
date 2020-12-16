package org.dfobjrepository;

import java.util.List;

import org.dftestng.DBlazeBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DBpojo1 extends DBlazeBase {
	
	public DBpojo1()
	{
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//select[@class='form-inline'])[1]")
	private WebElement from;
	@FindBy(xpath="(//select[@class='form-inline'])[2]")
	private WebElement to;
	@FindBy(xpath="//input[@class='btn btn-primary']")
	private WebElement searButton;
	//WebTable
	
	@FindBy(xpath="//table//tr//th")
	private List<WebElement> th;
	@FindBy(xpath="//table//tr[1]//td")
	private List<WebElement> trow1;
	@FindBy(xpath="//table//tr[2]//td")
	private List<WebElement> trow2;
	@FindBy(xpath="//table//tr[3]//td")
	private List<WebElement> trow3;
	@FindBy(xpath="//table//tr[4]//td")
	private List<WebElement> trow4;
	@FindBy(xpath="//table//tr[5]//td")
	private List<WebElement> trow5;
	public WebElement getFrom() {
		return from;
	}
	public WebElement getTo() {
		return to;
	}
	public WebElement getSearButton() {
		return searButton;
	}
	public List<WebElement> getTh() {
		return th;
	}
	public List<WebElement> getTrow1() {
		return trow1;
	}
	public List<WebElement> getTrow2() {
		return trow2;
	}
	public List<WebElement> getTrow3() {
		return trow3;
	}
	public List<WebElement> getTrow4() {
		return trow4;
	}
	public List<WebElement> getTrow5() {
		return trow5;
	}
	
	
	



}
