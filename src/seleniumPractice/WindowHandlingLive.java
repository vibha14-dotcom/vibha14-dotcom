package seleniumPractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingLive {
	public static void main(String []args) throws InterruptedException{
    System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium S_W\\Chrome Documentation\\chromedriver_win32\\chromedriver.exe");
    WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.manage().deleteAllCookies();
	d.navigate().to("http://seleniumpractise.blogspot.com/2017/");
	d.findElement(By.xpath("//a[@href='http://www.google.com']")).click();
	
	 String parentId= d.getWindowHandle();
	    System.out.println("main window is " + parentId);
	    Set<String> pcids =d.getWindowHandles();
	    System.out.println("main + child window "+ pcids);
	    for (String q:pcids){
	    	if (!parentId.equals(q)){
	    		d.switchTo().window(q);
	    		WebElement r = d.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
	    		r.sendKeys("Pune");
	    		r.submit();
	    		//d.findElement(By.xpath("//body[@jsmodel='hspDDf']")).click();
	    		d.close();
	            d.switchTo().window(parentId);
	            d.findElement(By.xpath("//a[@href='http://seleniumpractise.blogspot.com/2021/']")).click();
	            Thread.sleep(3000);
	            d.quit();
 }
}
	}
}