package Qtercognation.Final_Assignment;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
//import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Send_kudos extends base{
	
	public WebDriver driver;
	
//	@BeforeTest
//	public void initialize() throws IOException
//	{
//		driver = initializeDriver();
//		driver.get("https://qtrecognition.testqtwiz.com/");
//	}
	
	@Test
	public void Able_tosend() throws IOException
	{

		base base_obj = new base();
		WebDriver driver =base_obj.initializeDriver();
		//driver = initializeDriver();
     	driver.get("https://qtrecognition.testqtwiz.com/");
		login_page_object login_data = new login_page_object(driver);
		login_data.getUser().sendKeys("madhu.sudhan@qualitestgroup.com");
		login_data.getPassword().sendKeys("P@ssw0rd"); 
		login_data.get_click_login().click();
		Activity_object Activity_obj = new Activity_object(driver);
		Activity_obj.get_sendkudos_btn().click();
	}
	
	@Test
	public void Able_toPut_email() throws IOException, InterruptedException
	{
		base base_obj = new base();
		WebDriver driver =base_obj.initializeDriver();
		//driver = initializeDriver();
		driver.get("https://qtrecognition.testqtwiz.com/");
		login_page_object login_data = new login_page_object(driver);
		login_data.getUser().sendKeys("madhu.sudhan@qualitestgroup.com");
		login_data.getPassword().sendKeys("P@ssw0rd"); 
		login_data.get_click_login().click();
		Activity_object Activity_obj = new Activity_object(driver);
		Activity_obj.get_sendkudos_btn().click();
		Activity_obj.get_quali_email().sendKeys("Rajnish Kumar  (rajnish.kumar@qualitestgroup.com,)");
		//Thread.sleep(3000);
		List <WebElement> emails = driver.findElements(By.id("globalUsers"));
		String email =emails.get(0).getText();
		Activity_obj.get_quali_email().sendKeys(email);
		
	}
	@Test
	public void Able_toselect_multi_kudus() throws IOException
	{
		base base_obj = new base();
		WebDriver driver =base_obj.initializeDriver();
		//driver = initializeDriver();
		driver.get("https://qtrecognition.testqtwiz.com/");
		login_page_object login_data = new login_page_object(driver);
		login_data.getUser().sendKeys("madhu.sudhan@qualitestgroup.com");
		login_data.getPassword().sendKeys("P@ssw0rd"); 
		login_data.get_click_login().click();
		Activity_object Activity_obj = new Activity_object(driver);
		Activity_obj.get_sendkudos_btn().click();
		Activity_obj.get_exacalnt_kudos().click();
		Activity_obj.get_innovative_kudos().click();
		Assert.assertFalse(driver.findElement(By.xpath("(//i[@class='fa fa-thumbs-up fa-2x'])[3]")).isDisplayed());
	}
	@Test
	public void isableTo_wt_citation() throws IOException, InterruptedException
	{
		base base_obj = new base();
		WebDriver driver =base_obj.initializeDriver();
		//driver = initializeDriver();
		driver.get("https://qtrecognition.testqtwiz.com/");
		login_page_object login_data = new login_page_object(driver);
		login_data.getUser().sendKeys("madhu.sudhan@qualitestgroup.com");
		login_data.getPassword().sendKeys("P@ssw0rd"); 
		login_data.get_click_login().click();
		Activity_object Activity_obj = new Activity_object(driver);
		Activity_obj.get_sendkudos_btn().click();
		Activity_obj.get_quali_email().sendKeys("Rajnish Kumar  (rajnish.kumar@qualitestgroup.com,)");
		List <WebElement> emails = driver.findElements(By.id("globalUsers"));
		String email =emails.get(0).getText();
		Activity_obj.get_quali_email().sendKeys(email);
		Activity_obj.get_exacalnt_kudos().click();
		Thread.sleep(4000);
		Activity_obj.get_send().click();
		Thread.sleep(4000);
		String msg =driver.findElement(By.cssSelector("div[id='display_message'] span center")).getText();
		System.out.println(msg);
		Assert.assertEquals(msg, "Please enter any comment.");
	}
//	@AfterMethod
//	public void driverclose()
//	{
//		
//		driver.close();
//	
//		
//	}
}
