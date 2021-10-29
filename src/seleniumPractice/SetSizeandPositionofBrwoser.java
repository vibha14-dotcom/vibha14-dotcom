package seleniumPractice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeandPositionofBrwoser {
	public static void main(String [] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium S_W\\Chrome Documentation\\chromedriver_win32\\chromedriver.exe");
	    WebDriver d = new ChromeDriver();
	    d.manage().window().maximize();
	    d.manage().deleteAllCookies();
	    d.get("https://www.facebook.com/");
	    // Dimention class
	    Dimension q =new Dimension(900,600);
	    d.manage().window().setSize(q);
	    //point class
	    Point p= new Point(300,200);
	    d.manage().window().setPosition(p);
}
}