package robotclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

import dynamiccode.base;

public class Up2 extends base {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub

launchbrowse("chrome");
hiturl("https://www.ilovepdf.com/word_to_pdf");

driver.findElement(By.cssSelector("a#pickfiles")).click();

StringSelection ss=new StringSelection("F:\\download all file\\API_Testing_Introduction.DOCX");
//Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
Robot r=new Robot();
r.delay(3000);
r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_V);
r.keyRelease(KeyEvent.VK_V);
r.keyRelease(KeyEvent.VK_V);
r.delay(2000);

r.keyPress(KeyEvent.VK_ENTER);
r.keyPress(KeyEvent.VK_ENTER);

//Dynamic robot class 
robot("F:\\download all file\\API_Testing_Introduction.DOCX");


	}

}
