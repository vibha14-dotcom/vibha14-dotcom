package seleniumPractice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotCode {
	public static void main (String[]args) throws IOException{
	System.setProperty("webdriver.chrome.driver","E:\\Software Testing\\Selenium S_W\\Chrome Documentation\\chromedriver_win32\\chromedriver.exe");
    WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.manage().deleteAllCookies();
	d.navigate().to("https://paytm.com/");
	File S = ((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
      String path = "C:\\Users\\USER\\Pictures\\Screenshots\\Defect1.png";
	File F = new File(path);
	FileHandler.copy(S,F);
	
	
	}
}