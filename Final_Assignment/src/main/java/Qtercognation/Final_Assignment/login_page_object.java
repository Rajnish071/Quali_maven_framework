package Qtercognation.Final_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class login_page_object {
	public WebDriver driver;
	By user_name=By.cssSelector("body:nth-child(2) div.container form:nth-child(1) > input:nth-child(3)");
	By password = By.cssSelector("body:nth-child(2) div.container form:nth-child(1) > input:nth-child(6)");
	By click_login = By.cssSelector("body:nth-child(2) div.container form:nth-child(1) > button:nth-child(8)");
	By white_clr =By.xpath("//body/div[2]");
	By nevy_clr =By.xpath("//button[normalize-space()='Login']");
	By gold_clr = By.xpath("//div[@class='myHeading']");
	
	public login_page_object(WebDriver driver) {
		
		this.driver=driver;	
	}
	
	public WebElement getUser()
	{
		return driver.findElement(user_name);
	}
	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	public WebElement get_click_login()
	{
		return driver.findElement(click_login);
	}
	public WebElement get_white_color()
	{
		return driver.findElement(white_clr);
	}
	public WebElement get_nevy_color()
	{
		return driver.findElement(nevy_clr);
	}
	public WebElement get_gold_color()
	{
		return driver.findElement(gold_clr);
	}
}
