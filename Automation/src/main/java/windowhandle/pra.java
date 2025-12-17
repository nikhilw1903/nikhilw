package windowhandle;



import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;

import dynamiccode.base;

public class pra  extends base{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		launchbrowse("chrome");
		hiturl("https://www.naukri.com");
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,document.body.scrollHeight);");
	 WebElement aboutus = driver.findElement(By.xpath("//a[@target=\"_blank\"][@title=\"About us\"]"));
	 aboutus.click();
Set<String> windows = driver.getWindowHandles();
	Iterator<String> id = windows.iterator();
	String paren_id = id.next();
	String childid = id.next();
	
	
	
	
	
	
	
	
	
	
	
	}

}
