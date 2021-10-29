package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling {
	public static void main(String []args) throws InterruptedException{
	    System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium S_W\\Chrome Documentation\\chromedriver_win32\\chromedriver.exe");
	    WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.navigate().to("https://www.facebook.com/r.php?r=101");
		WebElement t = d.findElement(By.xpath("//select[@id='day']"));
		Select e = new Select(t);
	     e.selectByIndex(13);
	     Thread.sleep(3000);
		 WebElement month  = d.findElement(By.xpath("//select[@id='month']"));
		 Select f = new Select(month);
	     //f.selectByIndex(0)
		 f.selectByVisibleText("Oct");
		 Thread.sleep(2000);
		 WebElement Year  = d.findElement(By.xpath("//select[@id='year']"));
		 Select z = new Select(Year);
	     z.selectByValue("1998");
		 List<WebElement> Options = z.getOptions();
		 int count = Options.size();
		 System.out.println("Total options are= " +count);
		 for(int i=0;i<count;i++){
			 Options.get(i).getText();
		 }
		 Thread.sleep(2000);
	     d.quit();
	
	
	
	
	}	

}