package seleniumPractice;
//Expected URL Matching with actual URL
public class URLandTitleVerify extends BrowserLaunch{
	String expURL = "https://www.facebook.com/r.php?locale=en_GB";
	String expTitle = "sign up for Facebook | facbook";
	public static void main (String args[]) throws InterruptedException{
		URLandTitleVerify e = new URLandTitleVerify();
		e.startBrowser();
		e.launchChrome();
		Thread.sleep(5000);
		e.verifyURL();
		//e.verifyTitle();
		e.endBrowser();
		
	}
 void verifyURL(){
	 System.out.println("Test Scenario Started ");
	 String actURL = d.getCurrentUrl();
	if(expURL.equals(actURL)){
		System.out.println("Actual URL is= "+actURL);
		System.out.println("test Scenario complted and passed");
	 }else
	 {
		 System.out.println("test Scenario Complted and failed");
	 }
	 
    
 } 
 
 
 void verifyTitle(){
	 System.out.println("Test Scenario Started");
	 String actTitle = d.getTitle();
	 if(expTitle.equals(actTitle)){
		 System.out.println("Actual title is ="+actTitle);
		 System.out.println("test Scenario complted and passed");
		 
 }
	 else
 {
	 System.out.println("Test Scenario complted and failed");
 }
 }
 }
