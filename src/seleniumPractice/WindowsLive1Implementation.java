package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowsLive1Implementation implements WindowHandlinglive1{

public static void main(String[]args) throws InterruptedException{
	System.setProperty(key1, value1);
	WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.navigate().to("http://seleniumpractise.blogspot.com/2017/");
	d.findElement(By.xpath("//a[@href='http://www.facebook.com']")).click();
	//d.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	WebDriverWait wait = new WebDriverWait(d,5); 
	  WebElement emailField = wait.until (ExpectedConditions.visibilityOfElementLocated(By.id("email")));
	  emailField.sendKeys("vibhalahane@gmail.com");
	//WebElement emailField = d.findElement(By.id("//input[@id='email']"));
	//d.findElement(By.xpath("//input[@id='email']")).sendKeys("vibhalahane@gmail.com");
    //d.findElement(By.xpath("//input[@data-testid='royal_pass']")).sendKeys("Suru@1407");
	//d.findElement(By.xpath("//button[@data-testid='royal_login_button']")).click();
	 
    //Thread.sleep(2000);
    d.close();
	
     
    
}

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




}