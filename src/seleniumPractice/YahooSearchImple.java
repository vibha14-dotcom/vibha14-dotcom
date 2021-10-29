package seleniumPractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooSearchImple implements Yahoo  {

	@Override
	public void setProperty() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void manage() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void window() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void maximize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getWindowHandle() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void switchTo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendKeys() {
		// TODO Auto-generated method stub
		
	}

@Override
public void close() {
	// TODO Auto-generated method stub
	
}

public static void main (String[]args) throws InterruptedException{
	System.setProperty(key1, value1);
	WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.navigate().to("http://seleniumpractise.blogspot.com/2017/");
	d.manage().deleteAllCookies();
	d.findElement(By.xpath("//a[@href='http://www.yahoo.com']")).click();
     String ParaentID = d.getWindowHandle();
     System.out.println("main window is " + ParaentID);
     Set<String> pcid = d.getWindowHandles();
     System.out.println("main + child window "+ pcid);
     for (String Y:pcid){
	    	if (!ParaentID.equals(Y)){
	    		d.switchTo().window(Y);
	    	    WebElement L = d.findElement(By.xpath("//input[@class='sbq']"));
	    		L.sendKeys("Pune");
	    		L.submit();
	    		d.close();
	    		d.switchTo().window(ParaentID);
	    		d.findElement(By.xpath("//a[@href='http://seleniumpractise.blogspot.com/2021/']")).click();
	            Thread.sleep(3000);
	            d.quit();
	    	}
	    	}
}
}
