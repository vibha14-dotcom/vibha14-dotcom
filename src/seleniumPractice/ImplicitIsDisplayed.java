package seleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitIsDisplayed {
	public static void main (String[]args) throws InterruptedException{
	System.setProperty("webdriver.chrome.driver"  ,"E:\\Software Testing\\Selenium S_W\\Chrome Documentation\\chromedriver_win32\\chromedriver.exe");
    WebDriver d = new ChromeDriver();
    d.manage().window().maximize();
    d.navigate().to("https://www.facebook.com/reg/");
    d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
    // below code is for IsEnabled
   WebElement fblogo = d.findElement(By.xpath("//img[@class='fb_logo _registrationPage__fbLogo img']"));

	boolean res = fblogo.isDisplayed();
 if(res==true){
	
	 System.out.println("test senario is passed");
 }
 else{
	 System.out.println("test senario is failed");
 }
	Thread.sleep(3000);
	d.quit();
}
}
