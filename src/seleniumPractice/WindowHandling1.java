package seleniumPractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling1 {
	String parentidexp= "CDwindow-371CF7A02ADDDE538E2A0490B8C7BEBE";
	@SuppressWarnings("unused")
	public static void main(String [] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium S_W\\Chrome Documentation\\chromedriver_win32\\chromedriver.exe");
	    WebDriver d = new ChromeDriver();
	    d.manage().window().maximize();
	    d.manage().deleteAllCookies();
	    d.get("https://www.naukri.com/");
	    String parentId= d.getWindowHandle();
	    System.out.println("main window is " + parentId);
	    Set<String> pcids =d.getWindowHandles();
	    System.out.println("main + child window "+ pcids);
	    for (String s:pcids){
	    	if (!parentId.equals(s)){
	    		d.switchTo().window(s);
	    		System.out.println("Child window title is"+d.getTitle());
	    		Thread.sleep(2000);
	    		
	    		d.close();
	    		}
	    	d.switchTo().window(parentId);
	    	d.findElement(By.xpath("//input[@id='qsb-location-sugg'] ]")).sendKeys("Pune");
    		d.findElement(By.xpath("//button[@class='btn']")).click();
    		Thread.sleep(2000);
    		d.close();
	    }
}
}