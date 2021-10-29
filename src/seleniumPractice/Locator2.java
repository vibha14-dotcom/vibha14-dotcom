package seleniumPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Locator2 {
	public static void main(String []args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium S_W\\Chrome Documentation\\chromedriver_win32\\chromedriver.exe");
	    WebDriver d= new ChromeDriver();
	    d.manage().window().maximize();
	    d.navigate().to("file:///E:/myjava/vibha1.html");
	 // 1.Absolute Xpath Tagname/Tagname
	   d.findElement(By.xpath("html/body/input")).sendKeys("Vibha Lahane");
	   // absolute xpath by Index
	   d.findElement(By.xpath("html/body/input[2]")).sendKeys("12345");
}
}
