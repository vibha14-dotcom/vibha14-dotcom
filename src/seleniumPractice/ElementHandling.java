package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementHandling {
	public static void main(String []args) throws InterruptedException{
	    System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium S_W\\Chrome Documentation\\chromedriver_win32\\chromedriver.exe");
	    WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.navigate().to("http://seleniumpractise.blogspot.com/2017/");
		d.findElement(By.xpath("//a[@href='http://www.google.com']")).click();
		
}
}