package seleniumPractice;

public interface CommonProperties {
String key1="webdriver.chrome.driver";
String key2="webdriver.gecko.driver";
String value1="E:\\Software Testing\\Selenium S_W\\Chrome Documentation\\chromedriver_win32\\chromedriver.exe";
String value2="E:\\Software Testing\\Selenium S_W\\Firefox Documentation\\geckodriver-v0.30.0-win32\\geckodriver.exe";
void startBrowser();
void launchChrome();
void launchFirefox();
void endBrowser();


}
