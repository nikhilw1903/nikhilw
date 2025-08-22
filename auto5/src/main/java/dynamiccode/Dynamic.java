package dynamiccode;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.CopyOnWriteArrayList;


import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v138.page.model.Screenshot;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Dynamic {
public static WebDriver driver;
public static void launchbrowse(String browser ) {
	if(browser.equalsIgnoreCase("chrome")) {
		
		driver=new ChromeDriver();
	

	}else if(browser.equalsIgnoreCase("firefox")) {
		
		driver=new FirefoxDriver();
		
	}else if(browser.equalsIgnoreCase("safari")) {
		
		driver=new SafariDriver();
	}

	
	
	System.out.println("which browser u automate"+browser);

	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));


} 
	

	public static void hiturl(String Url ) {
		driver.get(Url);
	}

	public static void takescreenshot(String screenshot ) throws IOException {
	TakesScreenshot ts=(TakesScreenshot) driver;
	File sourse =ts.getScreenshotAs(OutputType.FILE);
	File Traget=new File("./screenshot/"+screenshot+".png");
    FileHandler.copy(sourse, Traget);
		
	}

}
