package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropAction {
	@SuppressWarnings("unused")
	public static void main(String []args) throws InterruptedException{
	    System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium S_W\\Chrome Documentation\\chromedriver_win32\\chromedriver.exe");
	    WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.navigate().to("https://jqueryui.com/droppable/");
		JavascriptExecutor j=((JavascriptExecutor)d);
		Thread.sleep(3000);
		j.executeScript("scroll(0,2000)");
	    WebElement ele1 = d.findElement(By.xpath("//div[@id='draggable']"));
	    WebElement ele2 = d.findElement(By.xpath("//div[@id='droppable']")); 
	    Actions a = new Actions(d);
	    a.clickAndHold(ele2).moveToElement(ele2).build().perform();
	    //a.dragAndDrop(ele1, ele2).perform();
	    Thread.sleep(3000);
	    d.switchTo().parentFrame();
	    WebElement W = d.findElement(By.xpath("//a[@title='jQuery UI']"));
	    a.click(W).perform();
	    a.doubleClick(W).perform();
	    a.contextClick(W);
	    Thread.sleep(3000);
	 
	    d.quit();
	    
	}
	
	
	
	
	
	
}
