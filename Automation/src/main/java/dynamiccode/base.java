package dynamiccode;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.CopyOnWriteArrayList;

import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v138.page.model.Screenshot;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class base {
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

	public static void takescreenshot(String folder, String screenshot_name) throws IOException {
		TakesScreenshot tc = (TakesScreenshot) driver;
		File Source = tc.getScreenshotAs(OutputType.FILE);
		File target = new File(projectpath + "/" + folder + "/" + screenshot_name + ".png");
		FileHandler.copy(Source, target);

	}

	public static void Acway(String xpath, String type) {
		WebElement e = driver.findElement(By.xpath(xpath));
		ac = new Actions(driver);
		driver.switchTo().defaultContent();
		if (type.equalsIgnoreCase("click")) {

			ac.click(e).perform();
		} else if (type.equalsIgnoreCase("movetoelement")) {
			ac.moveToElement(e).perform();
		} else if (type.equalsIgnoreCase("contextclick")) {

			ac.contextClick(e).perform();
		} else if (type.equalsIgnoreCase("doubleclick")) {

			ac.doubleClick(e).perform();
		} else if (type.equalsIgnoreCase("clickandhold")) {

			ac.clickAndHold(e).perform();
		}
	
	
	
	
	}

	public static void Acdrag(String xpath1, String xpath11, String xpath2, String xpath3, String type2)
			throws InterruptedException {

		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		
		WebElement f = driver.findElement(By.xpath(xpath1));
		f.click();

		WebElement f1 = driver.findElement(By.xpath(xpath11));
		driver.switchTo().frame(f1);


		Thread.sleep(4000);
		WebElement g = driver.findElement(By.xpath(xpath2));
		Thread.sleep(4000);
		WebElement h = driver.findElement(By.xpath(xpath3));

		ac = new Actions(driver);

		if (type2.equalsIgnoreCase("draganddrop")) { // normal drag and drop
			ac.dragAndDrop(g, h).perform();
		}
	}

	public static void javascriptdiameter(String scroll) {
		
			JavascriptExecutor js3 = (JavascriptExecutor) driver;

			js3.executeScript(scroll);
			
			
	}
	
	
	public static void alert(String xpath, String actionType) {
		WebElement ap = driver.findElement(By.xpath(xpath));
		Alert al = driver.switchTo().alert();

		if (actionType.equalsIgnoreCase("accept")) {
			al.accept();

		} else if (actionType.equalsIgnoreCase("dismiss")) {
			al.dismiss();

		} else if (actionType.equalsIgnoreCase("gettext")) {
			System.out.println("Alert text: " + al.getText());
		}
	}

	public static void alertsend(String xpath,String xpath8,String send) {
		WebElement l = driver.findElement(By.xpath(xpath));
		l.click();
		WebElement m = driver.findElement(By.xpath(xpath8));
		m.click();
		Alert alert = driver.switchTo().alert();

		alert.sendKeys(send);
		alert.accept();
		
	}

public static void robot(String path) throws AWTException {
	
	StringSelection ss=new StringSelection(path);
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


	
	
	
	
	
	
}


}