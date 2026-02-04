package org.pack;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v116.serviceworker.model.RegistrationID;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {
	public static WebDriver driver;  //change global into local--blue color
	public  static WebElement des;
	public  static String value;
	public static void chromeLaunch() {
		driver = new ChromeDriver();
		
	}
	public static void urlLaunch(String string) {
		driver.get("https://www.facebook.com/");	

	}
	public static void maximize() {
		driver.manage().window().maximize();
	
	}
	public static void implicitlyWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
	}
	public static String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
	public static String getTitle() {
	    String title = driver.getTitle();
		return title;
	}
	public static void sendKeys(Object object,String value) {
		((Alert) object).sendKeys(value);

	}
	public static void  click(WebElement r) {
	r.click();
	}
	public static  void close() {
		driver.close();

	}
	public static  void quit() {
		driver.quit();

	}
	public static  String getAttribute(Object object) {
		String Attribute= getAttribute();
		return Attribute;
	}
	private static String getAttribute() {
		// TODO Auto-generated method stub
		return null;
	}
	public static String getText(WebElement e,String name) {
		String text = e.getText();
		return text;

	}
	

	
	public static void Action(WebElement src) {
	Actions a= new Actions(driver);
	a.moveToElement(src).perform();

	}
	public static void dragAnddrop(WebElement target) {
		Actions a= new Actions(driver);
		a.dragAndDrop(target, des).perform();
	}
	public static void moveToElement(WebElement src) {
		Actions a= new Actions(driver);
		a.moveToElement(src).perform();
		}
	public static void click1(WebElement target) {
		Actions a= new Actions(driver);
		a.click(target).release(des).perform();

	}
	public static void doubleClick(WebElement key) throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);
		
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

	}
    public static void accept(WebElement target) {
    	Alert a = driver.switchTo().alert();
    	a.accept();
    }
    public static void dismiss(WebElement des){
    		Alert a1= driver.switchTo().alert();
        	a1.dismiss();
    }
    public static  void sendKeys(WebElement des) {
    	Alert a2= driver.switchTo().alert();
    	a2.sendKeys("Magil");

		}
    public static void getText1(WebElement e,String name) {
    		Alert a3= driver.switchTo().alert();
    		a3.getText();
    }
    
    public static  void singleselect1(WebElement days) {
    	   Select s= new Select(days);
    	   s.selectByValue(value);
    	   
    }
    	
    public static  void selectByIndex(WebElement days) {
           Select s1= new Select(days);
           s1.selectByIndex(0);
    }
    public static  void selectByVisibleText(WebElement e,String name) {
            Select s2= new Select(e);
            s2.selectByVisibleText(getTitle());
            
    }
            
    public static  void selectvalue(WebElement days) {
             Select s3= new Select(days);
             s3.selectByValue(value);
    }
   
    public static void TakeScreenShot(WebElement src) {
    	TakesScreenshot ts= (TakesScreenshot) driver;
    	File src1= ts.getScreenshotAs(OutputType.FILE);
    	System.out.println(src1);
    
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
