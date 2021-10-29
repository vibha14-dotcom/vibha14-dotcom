package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorlogin {
	public static void main(String [] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium S_W\\Chrome Documentation\\chromedriver_win32\\chromedriver.exe");
	    WebDriver d = new ChromeDriver();
	    d.manage().window().maximize();
	    d.navigate().to("https://www.facebook.com/");
	    d.findElement(By.xpath("//input[@data-testid='royal_email']")).sendKeys("vibhalahane@gmail.com");
	    d.findElement(By.xpath("//input[@data-testid='royal_pass']")).sendKeys("Suru@1407");
	    d.findElement(By.xpath("//button[@data-testid='royal_login_button']")).click();
}
}