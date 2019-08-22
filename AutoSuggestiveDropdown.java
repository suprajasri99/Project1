//This is dropdown edit changes ....



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SriSalla\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.makemytrip.com");
	//	driver.findElement(By.xpath("//input[@id='fromCity']")).clear();
		WebElement source = driver.findElement(By.xpath("//input[@id='fromCity']"));
		Thread.sleep(500);
	    source.sendKeys("DEL");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='deny']")).click();
		source.sendKeys(Keys.ARROW_DOWN);
		source.sendKeys(Keys.ARROW_DOWN);
	//	Thread.sleep(500);
		source.sendKeys(Keys.ENTER);
		WebElement destination = driver.findElement(By.id("XPath //input[@placeholder='To']"));
		destination.sendKeys("DFW");
		Thread.sleep(500);
		destination.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(500);
		destination.sendKeys(Keys.ENTER);
		
		

	}

}
