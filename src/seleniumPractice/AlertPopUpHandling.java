package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandling {
	String expTextpopup ="Do you Confirm Action";
	static WebDriver d;
/**
 * @param args
 * @throws InterruptedException
 */
public static void main(String []args) throws InterruptedException{

	System.setProperty("webdriver.chrome.driver","E:\\Software Testing\\Selenium S_W\\Chrome Documentation\\chromedriver_win32\\chromedriver.exe");
    d = new ChromeDriver();
    d.manage().window().maximize();
    d.manage().deleteAllCookies();
    d.navigate().to("https://demoqa.com/alerts"); 
    d.findElement(By.xpath("//button[@id='alertButton']")).click();
    d.switchTo().alert().accept();
    Thread.sleep(3000);
    WebElement third = d.findElement(By.xpath("//button[@id='confirmButton']"));
    third.click();
    Thread.sleep(3000);
    d.switchTo().alert().dismiss();
    Thread.sleep(2000);
    third.click();
    String txt = d.switchTo().alert().getText();
    System.out.println("Text is "+txt);
    d.switchTo().alert().accept();
    Thread.sleep(3000);

    Thread.sleep(3000);
    
    WebElement fourth = d.findElement(By.xpath("//button[@id='promtButton']"));
    fourth.click();
    Thread.sleep(3000);
    d.switchTo().alert().sendKeys("pls Enter Vibha");
    d.switchTo().alert().accept();
    JavascriptExecutor j = ((JavascriptExecutor)d);
    Thread.sleep(2000);
    j.executeScript("scroll(0,300)");
    d.quit(); 
}
    
}



