package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BrowserLaunch implements CommonProperties {
	
	
	static WebDriver d;


public void startBrowser() {
	System.out.println("your favourite browser started");
	
}

public void launchChrome() {
	System.setProperty(key1, value1);
	d = new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://www.facebook.com/r.php?locale=en_GB");
}

public void launchFirefox() {
	System.setProperty(key2, value2);
	d= new FirefoxDriver();
	d.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_5j0bx521tf_e&adgrpid=61665929249&hvpone=&hvptwo=&hvadid=486445347800&hvpos=&hvnetw=g&hvrand=15029075966946785072&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9302140&hvtargid=kwd-298441375321&hydadcr=5621_2175698&gclid=Cj0KCQjwwY-LBhD6ARIsACvT72N7v0cWYRnBr_bs1-q2LeNlTKfVmXvyGv55wQEpV8-u-pqWQ2AxKF4aAsN4EALw_wcB");
	
}

public void endBrowser() {
	d.close();
	System.out.println("Browser ended");
	
}
}
