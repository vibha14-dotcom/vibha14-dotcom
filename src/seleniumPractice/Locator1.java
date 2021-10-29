package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator1 {
public static void main(String []args) throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium S_W\\Chrome Documentation\\chromedriver_win32\\chromedriver.exe");
    WebDriver d= new ChromeDriver();
    d.manage().window().maximize();
    d.navigate().to("file:///E:/myjava/vibha1.html");
 // 1. Tagname
   WebElement un = d.findElement(By.tagName("input"));
   un.sendKeys("ZALA NA NEAT EXCUTE LOCATOR");
   //5. linkText
   d.findElement(By.linkText("https://www.facebook.com/login/device-based/regular/login/?login_attempt=1")).click();
  // 6.PartiallinkText
   d.findElement(By.partialLinkText("https://www.fac")).click();
   Thread.sleep(2000);
   d.quit();
}

}
