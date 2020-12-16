package org.dfobjrepository;

import java.util.List;

import org.dftestng.DBlazeBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DBpojo2 extends DBlazeBase {
	public DBpojo2()
	{
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//input[@class='btn btn-small'])[3]")//Haswitha
	private WebElement selFlight;
	
	@FindBy(xpath="//input[@id='inputName']")//Haswitha
	private WebElement name;
	@FindBy(xpath="//input[@id='address']")//Ramapuram
	private WebElement address;
	@FindBy(xpath="//input[@id='city']")//chennai
	private WebElement city;
	@FindBy(xpath="//input[@id='state']")//Tamilnadu
	private WebElement state;
	@FindBy(xpath="//input[@id='zipCode']")//600089
	private WebElement zipcode;
	@FindBy(xpath="//select[@id='cardType']")//visa
	private WebElement cardType;
	@FindBy(xpath="//input[@id='creditCardNumber']")//1234567887654321
	private WebElement ccNumber;
	@FindBy(xpath="//input[@id='nameOnCard']")//Haswitha
	private WebElement nameonCard;
	@FindBy(xpath="//input[@class='btn btn-primary']")
	private WebElement purchageFlight;
	//page 4 output Webtable
	@FindBy(xpath="//div[@class='container hero-unit']//h1")
	private WebElement header;
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
	@FindBy(xpath="//table//tr[6]//td")
	private  List<WebElement> trow6;
	@FindBy(xpath="//table//tr[7]//td")
	private List<WebElement> trow7;
	
	public WebElement getSelFlight() {
		return selFlight;
	}
	public WebElement getName() {
		return name;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCity() {
		return city;
	}
	public WebElement getState() {
		return state;
	}
	public WebElement getZipcode() {
		return zipcode;
	}
	public WebElement getCardType() {
		return cardType;
	}
	public WebElement getCcNumber() {
		return ccNumber;
	}
	public WebElement getNameonCard() {
		return nameonCard;
	}
	public WebElement getPurchageFlight() {
		return purchageFlight;
	}
	public WebElement getHeader() {
		return header;
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
	public List<WebElement> getTrow6() {
		return trow6;
	}
	public List<WebElement> getTrow7() {
		return trow7;
	}
	
	



}
