package Qtercognation.Final_Assignment;

import java.io.IOException;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login_page extends base{
	public WebDriver driver;
//	@BeforeTest
//	public void initialize() throws IOException
//	{
//		driver = initializeDriver();
//		driver.get("https://qtrecognition.testqtwiz.com/");
//	}
	
	@Test
	public void loginbycredential() throws IOException {
		driver = initializeDriver();
		driver.get("https://qtrecognition.testqtwiz.com/");
		login_page_object login_data = new login_page_object(driver);
	
		login_data.getUser().sendKeys("madhu.sudhan@qualitestgroup.com");
		login_data.getPassword().sendKeys("P@ssw0rd"); 
		login_data.get_click_login().click();
		//Assert.assertTrue(condition);
		
		
	}
	@Test
	public void tital() throws IOException
	{
		driver = initializeDriver();
		driver.get("https://qtrecognition.testqtwiz.com/");
		String Title=driver.getTitle();
		System.out.println(Title);
		
		
	}
	@Test
	public void vcolourcheck_white() throws IOException
	{
		driver = initializeDriver();
		driver.get("https://qtrecognition.testqtwiz.com/");
		//WebElement e = driver.findElement(By.xpath("//body/div[2]"));
		login_page_object login_data1 = new login_page_object(driver);
		String backclr = login_data1.get_white_color().getCssValue("background-color");
		String backclrwt_hex = Color.fromString(backclr).asHex();
		//System.out.println(backclr);
		Assert.assertEquals(backclrwt_hex, "#939598");
		
	}
	@Test
	public void vcolourcheck_gold() throws IOException
	{
		driver = initializeDriver();
		driver.get("https://qtrecognition.testqtwiz.com/");
		//WebElement e1= driver.findElement(By.xpath("//div[@class='myHeading']"));
		login_page_object login_data = new login_page_object(driver);
		String backclr_gold=login_data.get_gold_color().getCssValue("background-color");
		String backclr_gold_hex = Color.fromString(backclr_gold).asHex();
		//System.out.println(backclr_golden);
		Assert.assertEquals(backclr_gold_hex, "#FECC160");
		
		
	}
	@Test
	public void vcolourcheck_nevy() throws IOException
	{
		driver = initializeDriver();
		driver.get("https://qtrecognition.testqtwiz.com/");
		//WebElement e2= driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		login_page_object login_data2 = new login_page_object(driver);
		String backclr_nevy = login_data2.get_nevy_color().getCssValue("background-color");
		//String backclr_nevy = e2.getCssValue("background-color");
		String backclr_nevy_hex = Color.fromString(backclr_nevy).asHex();
		//System.out.println(backclr_nevy);
		//Assert.assertEquals(backclr_nevy_hex, "#2A2559");
		Assert.assertTrue(backclr_nevy_hex.equalsIgnoreCase("#2A2559"));
		
		
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
