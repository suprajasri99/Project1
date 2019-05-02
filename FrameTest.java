import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SriSalla\\Selenium\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("http:jqueryui.com/droppable/");
		driver.manage().window().maximize();
		//To use frame by index we get count of frames and choose the index number of frame below :-
		driver.findElement(By.tagName("iframe")).getSize();
		driver.switchTo().frame(0);
		//to find frame by web element :--below:-
	//	driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
	//	driver.findElement(By.id("draggable")).isDisplayed();
		Actions a = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target = driver.findElement(By.id("droppable"));
		a.dragAndDrop(source, target).build().perform();
		driver.switchTo().defaultContent();
		
		
		

	}

}
