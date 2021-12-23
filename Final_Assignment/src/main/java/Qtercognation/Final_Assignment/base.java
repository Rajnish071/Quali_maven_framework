package Qtercognation.Final_Assignment;
import java.io.File;
import java.util.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	public  WebDriver driver;
	public Properties prop;
public WebDriver initializeDriver() throws IOException
{
	
 prop= new Properties();
FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\Rajnish\\src\\.metadata\\Final_Assignment\\src\\test\\java\\resources\\data.properties");

prop.load(fis);
String browserName=prop.getProperty("browser");
System.out.println(browserName);

if(browserName.equals("chrome"))
{
	 System.setProperty("webdriver.chrome.driver", "E:\\desktop_folder\\documents\\qualitest\\selenium\\crome_driver\\chromedriver.exe");
	driver= new ChromeDriver();
		//execute in chrome driver
	
}
else if (browserName.equals("firefox"))
{
	//System.setProperty("webdriver.gecko.driver", "E:\\desktop_folder\\documents\\qualitest\\selenium\\fitebox_driver\\geckodriver.exe");
	 ///driver= new FirefoxDriver();
	//firefox code
}

driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
return driver;


}

}
