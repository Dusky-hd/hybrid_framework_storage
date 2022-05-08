package PomScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomClass {
	
	//Declaration
	@FindBy(id="firstName")
	private WebElement fname;
	
	@FindBy(id="lastName")
	private WebElement lname;
	
	@FindBy(id="userEmail")
	private WebElement uemail;
	
	@FindBy(xpath="//label[.='Female']")
	private WebElement gen;
	
	@FindBy(id="userNumber")
	private WebElement unum;
	
	@FindBy(id="dateOfBirthInput")
	public static WebElement dob;
	
	@FindBy(xpath="//div[.='27']")
	private WebElement date;
	
	@FindBy(xpath="//input[@id='subjectsInput']")
	private WebElement sub;
	
	@FindBy(xpath="//label[.='Music']")
	private WebElement hob;
	
	@FindBy(id="uploadPicture")
	private WebElement pic;
	
	@FindBy(id="currentAddress")
	private WebElement add;

	@FindBy(id="state")
	private WebElement state;
	
	@FindBy(id="city")
	private WebElement city;
	
	@FindBy(id="submit")
	private WebElement submit;
	
	//Initialization
	public PomClass(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	public void first_name(String datafname)
	{
		fname.sendKeys(datafname);
	}
	
	public void last_name(String datalname)
	{
		lname.sendKeys(datalname);
	}
	
	public void user_email(String dataemail)
	{
		uemail.sendKeys(dataemail);
	}
	
	public void user_gender()
	{
		gen.click();
	}
	
	public void user_number(String datanum)
	{
		unum.sendKeys(datanum);
	}
	
	public void date_of_birth()
	{
		dob.click();
	}
	
	public void date()
	{
		date.click();
	}
	
	public void subject()
	{
		sub.sendKeys("C");
	}
	
	public void hobby()
	{
		hob.click();
	}
	
	public void upload_picture()
	{
		pic.sendKeys("C:\\Users\\harshidn\\Downloads\\thank-you-slide-presentation-t6.jpg");
	}
	
	public void user_address()
	{
		add.sendKeys("Gravity Pg, Vijaynagar");
	}
	
	public void state()
	{
		state.click();
	}
	
	public void city()
	{
		city.click();
	}
	
}
