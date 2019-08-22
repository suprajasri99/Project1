package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class TestBase {
	
	public WebDriver driver = null;
	
	
	@Test
	public void Login() throws IOException {
	Properties prop = new Properties();
	FileInputStream fis = new FileInputStream("C:\\Users\\SriSalla\\eclipse-workspace\\TestNGTurorial\\src\\test\\datadriven.properties");
	prop.load(fis);
	//System.out.println(prop.getProperty("username"));
	//System.out.println(prop.getProperty("password"));
	
	if (prop.getProperty("browser").equals("Chrome")) 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SriSalla\\Selenium\\chromedriver.exe");
	 driver = new ChromeDriver();
	}
	else if (prop.getProperty("browser").equals("Firefox")) {
		 driver =  new FirefoxDriver();	
	}
	else if (prop.getProperty("browser").equals("IE")){
		System.setProperty("webdriver.ie.driver", "C:\\Users\\SriSalla\\Selenium\\IEDriverServer.exe");
		 driver = new InternetExplorerDriver();
	}
	
	driver.get(prop.getProperty("url"));
	
	}
	

}
