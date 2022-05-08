package TestScripts;

import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic.BaseClass;
import Generic.Genric_Excel;
import Generic.Utility_Methods;
import PomScripts.PomClass;

public class Test_Script extends BaseClass {
	

	@Test
	public void test() throws EncryptedDocumentException, IOException, InterruptedException, AWTException
	{
		String firstname=Genric_Excel.getData("Sheet1", 0, 0);
		String lastname=Genric_Excel.getData("Sheet1", 1, 0);
		String emailid=Genric_Excel.getData("Sheet1", 2, 0);
		String mobnum=Genric_Excel.getData("Sheet1", 3, 0);
		
		PomClass pm=new PomClass(driver);
		
		pm.first_name(firstname);
		Thread.sleep(2000);
		
		pm.last_name(lastname);
		Thread.sleep(2000);
		
		pm.user_email(emailid);
		Thread.sleep(2000);
		
		pm.user_gender();
		Thread.sleep(2000);
		
		pm.user_number(mobnum);
		Thread.sleep(2000);
		
		Utility_Methods.javascriptexe(driver).executeScript("window.scrollBy(0,600)");
		
		wait.until(ExpectedConditions.visibilityOf(pm.dob));
		
		
	    pm.date_of_birth();
	    Thread.sleep(2000);
	    WebElement month = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
	    Utility_Methods.sel(month).selectByVisibleText("March");
	    
		WebElement year = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		Utility_Methods.sel(year).selectByVisibleText("1997");
		
		pm.date();
		Thread.sleep(2000);
		
		pm.subject();
		Thread.sleep(2000);
		
		Utility_Methods.keyboard_functions().keyPress(KeyEvent.VK_DOWN);
		Utility_Methods.keyboard_functions().keyRelease(KeyEvent.VK_DOWN);
		Utility_Methods.keyboard_functions().keyPress(KeyEvent.VK_TAB);
		Utility_Methods.keyboard_functions().keyRelease(KeyEvent.VK_TAB);
		
		pm.hobby();
		Thread.sleep(2000);
		
		pm.upload_picture();
		Thread.sleep(2000);
		
		pm.user_address();
		Thread.sleep(2000);
		
		pm.state();
		Thread.sleep(2000);
		Utility_Methods.keyboard_functions().keyPress(KeyEvent.VK_DOWN);
		Utility_Methods.keyboard_functions().keyRelease(KeyEvent.VK_DOWN);
		Utility_Methods.keyboard_functions().keyPress(KeyEvent.VK_TAB);
		Utility_Methods.keyboard_functions().keyRelease(KeyEvent.VK_TAB);
		
		pm.city();
		Thread.sleep(4000);
		Utility_Methods.keyboard_functions().keyPress(KeyEvent.VK_DOWN);
		Utility_Methods.keyboard_functions().keyRelease(KeyEvent.VK_DOWN);
		Utility_Methods.keyboard_functions().keyPress(KeyEvent.VK_TAB);
		Utility_Methods.keyboard_functions().keyRelease(KeyEvent.VK_TAB);
		
	    WebElement ele = driver.findElement(By.xpath("//button[.='Submit']"));
	    Utility_Methods.actions_perform(driver).moveToElement(ele).click().perform();
		
	    String text=driver.findElement(By.xpath("(//div[.='Thanks for submitting the form'])[2]")).getText();
	    
	    Assert.assertEquals(text, "Thanks for submitting");
	    System.out.println("Framework ends");
	}
}
