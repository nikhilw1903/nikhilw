




package robotclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;

import dynamiccode.base;
import dynamiccode.base;

public class uploadfile extends base {

	public static void main(String[] args) throws AWTException {
		launchbrowse("chrome");
		hiturl("https://www.ilovepdf.com/word_to_pdf");
// Click upload button
		driver.findElement(By.xpath("//a[@id='pickfiles']")).click();

// File path to 
		StringSelection ss = new StringSelection("F:\\download all file\\API_Testing_Introduction.DOCX");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

// Robot class to handle file upload dialog"" 
		Robot r = new Robot();

		r.delay(3000);

// Press Ctrl+V
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);

		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);

		r.delay(2000);

// Press Enter
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

}
