package Qtercognation.Final_Assignment;

import java.io.IOException;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Activity_Page extends base{
	public WebDriver driver;
//	
//	@BeforeTest
//	public void initialize() throws IOException
//	{
//		driver = initializeDriver();
//		driver.get("https://qtrecognition.testqtwiz.com/");
//	}

	@Test
	public void checkNamePic() throws IOException
	{
		driver = initializeDriver();
		driver.get("https://qtrecognition.testqtwiz.com/");
		login_page_object login_data = new login_page_object(driver);
		login_data.getUser().sendKeys("madhu.sudhan@qualitestgroup.com");
		//login_data.getPassword().sendKeys("P@ssw0rd"); 
		login_data.get_click_login().click();
		Activity_object Act_obj_obj = new Activity_object(driver);
		//Assert.assertEquals()
		Assert.assertEquals(Act_obj_obj.getName().getText(),"Madhu Sudhan M");
			System.out.println("Displaying correct name");
	}
	@Test
	public void checkTitle() throws IOException
	{
		driver = initializeDriver();
		driver.get("https://qtrecognition.testqtwiz.com/");
		login_page_object login_data = new login_page_object(driver);
		login_data.getUser().sendKeys("madhu.sudhan@qualitestgroup.com");
		login_data.getPassword().sendKeys("P@ssw0rd");
		
		login_data.get_click_login().click();
		String Title=driver.getTitle();
		System.out.println(Title);
		Assert.assertEquals(Title, "QTRecognition");
	}
//	@AfterTest
//	public void driverclose()
//	{
//		
//		driver.close();
//	
//		
//	}
		
}
