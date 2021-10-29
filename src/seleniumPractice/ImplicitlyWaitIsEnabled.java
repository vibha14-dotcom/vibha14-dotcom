package seleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitlyWaitIsEnabled {
	public static void main (String[]args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","E:\\Software Testing\\Selenium S_W\\Chrome Documentation\\chromedriver_win32\\chromedriver.exe");
	    WebDriver d = new ChromeDriver();
	    d.manage().window().maximize();
	    d.navigate().to("https://www.facebook.com/reg/");
	    d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    // below code is for IsEnabled
	   WebElement firstname = d.findElement(By.xpath("//input[@name='firstname']"));
  
		boolean res = firstname.isEnabled();
	 if(res==true){
		 firstname.sendKeys("This is time out");
		 System.out.println("test senario is passed");
	 }
	 else{
		 System.out.println("test senario is failed");
	 }
		Thread.sleep(3000);
		d.quit();
	}
	}

