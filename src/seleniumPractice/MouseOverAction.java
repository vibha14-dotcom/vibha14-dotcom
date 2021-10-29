package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverAction {
	public static void main(String []args) throws InterruptedException{
	    System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium S_W\\Chrome Documentation\\chromedriver_win32\\chromedriver.exe");
	    WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.navigate().to("http://seleniumpractise.blogspot.com/2016/08/how-to-perform-mouse-hover-in-selenium.html");
		WebElement t = d.findElement(By.xpath("//button[text() ='Automation Tools']"));
		Actions s = new Actions(d);
		s.moveToElement(t).perform();
		Thread.sleep(3000);
	    List<WebElement> opt = d.findElements(By.xpath("//div[@class='dropdown-content']/a"));
		int count = opt.size();
	    System.out.println("options are = " +count);
		for(int i=0;i<count;i++){
			  WebElement f = opt.get(i);
			  String r = f.getAttribute("innerHTML");
			  System.out.println(r);
			  if(r.equalsIgnoreCase("appium")){
				  f.click();
			  }
		}
}       
}
