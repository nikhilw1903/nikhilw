package mock;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keybord {

	public static void main(String[] args) throws InterruptedException, AWTException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.manage().window().maximize();
		/*
		Actions a = new Actions(driver);
		a.keyDown(Keys.PAGE_DOWN).keyUp(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(3000);
		a.keyDown(Keys.PAGE_UP).keyUp(Keys.PAGE_UP).build().perform();
	*/
	
		WebElement click = driver.findElement(By.xpath("//a[@class=\"uploader__btn tooltip--left active\"]"));
		click.click();
		StringSelection ss = new StringSelection("C://Users//Digital Express//Downloads//Nikhil Test Engineer Resume");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
	
		Robot r = new Robot();
	r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_V);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	
	}

}
