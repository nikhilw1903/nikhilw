package base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.safari.SafariDriver;

public class base6{
	public static WebDriver driver;
	public static Actions ac;
	public static String projectpath = System.getProperty("user.dir");

	public static void launchbrowse(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("firefox")) {

			driver = new FirefoxDriver();

		} else if (browser.equalsIgnoreCase("safari")) {

			driver = new SafariDriver();
		}

		System.out.println("which browser u automate :" + browser);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));

	}

	public static void hiturl(String Url) {
		driver.get(Url);
		System.out.println("enter URL :" + Url);
	}

	public static void takescreenshot(String take) {
		
		TakesScreenshot tc = (TakesScreenshot) driver;
		File source = tc.getScreenshotAs(OutputType.FILE);
		File target = new File(projectpath+"\\screenshot1\\"+take+".png");
		FileHandler.copy(source, target);
	}
	
	
}


}