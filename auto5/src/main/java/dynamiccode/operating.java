package dynamiccode;

import java.io.IOException;
import java.security.DigestException;
import java.util.logging.ErrorManager;

import org.openqa.selenium.JavascriptExecutor;


public class operating extends base {

	public static void main(String[] args) throws IOException, InterruptedException {
	    launchbrowser("chrome");
	    hiturl("https://www.jeevansathi.com/");

	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeAsyncScript("window.scrollBy(0, 650)");

	    Thread.sleep(3000);
	   takescreenshot("newfile2");
	
	}
	
	
		
		
		
		
		
		
		
		
	}
