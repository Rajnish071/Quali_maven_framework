package Qtercognation.Final_Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Activity_object {
	public WebDriver driver;
	
	
	public Activity_object(WebDriver driver) {
		
		this.driver=driver;	
	}
	By name = By.cssSelector("div.container:nth-child(2) div.row:nth-child(1) div.col-md-4:nth-child(1) div.jumbotron div.media:nth-child(1) div.media-body > h5.header-font-size");
	By send_kudo_btn =By.cssSelector(".nav-item.nav-link[href='#myModal']");
	By email_or_name = By.xpath("//input[@id='email_address']");
	By excelent_wk = By.xpath("//div[@id='trophy_list']//div[2]//div[1]//div[1]");
	By innovative_kudo = By.xpath("//div[@id='trophy_list']//div[3]//div[1]//div[1]");
	By comment = By.id("comment");
	By send = By.className("btn-primary");
	//By 
	public WebElement getName()
	{
		return driver.findElement(name);
	}
	public WebElement get_sendkudos_btn()
	{
		return driver.findElement(send_kudo_btn);
	}
	public WebElement get_quali_email()
	{
		return driver.findElement(email_or_name);
	}
	public WebElement get_exacalnt_kudos()
	{
		return driver.findElement(excelent_wk);
	}
	public WebElement get_innovative_kudos()
	{
		return driver.findElement(innovative_kudo);
	}
	public WebElement get_comment()
	{
		return driver.findElement(comment);
	}
	public WebElement get_send()
	{
		return driver.findElement(send);
	}
}
