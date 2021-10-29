      package seleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitIsSelected {
public static void main (String[]args) throws InterruptedException{
	System.setProperty("webdriver.chrome.driver","E:\\Software Testing\\Selenium S_W\\Chrome Documentation\\chromedriver_win32\\chromedriver.exe");
    WebDriver d = new ChromeDriver();
    d.manage().window().maximize();
    d.navigate().to("https://paytm.com/rechargel");
    d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
    // below code is for ISmethod
    d.findElement(By.xpath("//span[text()='Prepaid/Postpaid']")).click();
    WebElement postpaid= d.findElement(By.xpath("//input[@id='radio1']"));
     
	boolean res = postpaid.isSelected();
 if(res==true){
	 Thread.sleep(3000);
	 System.out.println("test senario is passed");
 }
 else{
	 System.out.println("test senario is failed");
 }
	Thread.sleep(3000);
	d.quit();
}
}
