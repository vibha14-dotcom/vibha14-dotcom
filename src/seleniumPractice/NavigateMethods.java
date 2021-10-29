package seleniumPractice;

public class NavigateMethods extends BrowserLaunch {
  String link1 = "https://www.facebook.com/r.php?locale=en_GB";
  String link2 = "https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_5j0bx521tf_e&adgrpid=61665929249&hvpone=&hvptwo=&hvadid=486445347800&hvpos=&hvnetw=g&hvrand=15029075966946785072&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9302140&hvtargid=kwd-298441375321&hydadcr=5621_2175698&gclid=Cj0KCQjwwY-LBhD6ARIsACvT72N7v0cWYRnBr_bs1-q2LeNlTKfVmXvyGv55wQEpV8-u-pqWQ2AxKF4aAsN4EALw_wcB";
	
	public void Navigate() throws InterruptedException{
	d.navigate().to(link1);
	Thread.sleep(2000);
	d.navigate().to(link2);
	Thread.sleep(2000);
	d.navigate().back();
	Thread.sleep(2000);
	d.navigate().forward();
	Thread.sleep(2000);
	d.navigate().refresh();
	
	}	
	public static void main (String args[]) throws InterruptedException{
		NavigateMethods r = new NavigateMethods();
		r.startBrowser();
		r.launchChrome();
		r.Navigate();
		Thread.sleep(2000);
		r.endBrowser();
	}
}
