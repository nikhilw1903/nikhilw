package dynamiccode;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.io.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

import Locators.main;

public class base {
	public static WebDriver driver;

	public static void launchbrowser(String browser) {
		//pushnotification
		ChromeOptions notify =new ChromeOptions();
		 notify.addArguments("--disable-notifications");
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver(notify);

		} else if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();

		} else if (browser.equalsIgnoreCase("edge")) {

			driver = new EdgeDriver();

		}

		driver.manage().window().maximize();
		System.out.println("browser name" + browser);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	public static void hiturl(String url) {

		driver.get(url);
		System.out.println(driver.getTitle());
	}

	public static void takescreenshot(String screenshot_name) throws IOException {
	
		        TakesScreenshot tk = (TakesScreenshot) driver;
		        File source = tk.getScreenshotAs(OutputType.FILE);
		        File target = new File("./screenshot/" + screenshot_name + ".png");
		        FileHandler.copy(source, target);

	
	}

	}


