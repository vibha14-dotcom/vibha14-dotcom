package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator3 {
public static void main(String [] args) throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "E:\\Software Testing\\Selenium S_W\\Chrome Documentation\\chromedriver_win32\\chromedriver.exe");
    WebDriver d = new ChromeDriver();
    d.manage().window().maximize();
    d.navigate().to("file:///E:/myjava/vibha1.html");
    Thread.sleep(3000);
    // 1. Relative xpath Regular- //Tagname
    d.findElement(By.xpath("//input")).sendKeys("Relative");
    // 2.Relative Xpath by Index - //Tagname[Index]
    d.findElement(By.xpath("//input[4]")).sendKeys("8421477626");
    //3.Relative Xpath by Index using signature--   //Xpath[Index]
    d.findElement(By.xpath("//input[3]")).sendKeys("MAHARASHTRA");
    d.findElement(By.xpath("//input[6]")).click();
    //4.Relative Xpath By Attribute - //Tagname[@Attributename='Attributevalue']
    d.findElement(By.xpath("//input[@id='pwd1']")).sendKeys("Suru@13");
    //5.Relative Xpath By Text Function - //Tagname[Text()='textvalue']
    d.findElement(By.xpath("//a[text()='Forgotten account?']")).click();
    d.navigate().back();
   
    //6.Relative Xpath By Contains for Attribute - //Tagname[contains(@Attributename,'Attributevalue')]
    
    d.findElement(By.xpath("//input[contains(@maxlength,'8')]")).sendKeys("baba");
    
   //7.Relative Xpath By Contains for Text Function - //Tagname[contains(Text(),'Textvalue')]


}
}
