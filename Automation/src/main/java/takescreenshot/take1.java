package takescreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import dynamiccode.base;

public class take1 extends base{

	public static void main(String[] args) throws IOException {
	
		
		 WebDriver driver=new ChromeDriver();
		
		 driver.get("https://snapdeal.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		TakesScreenshot ts= (TakesScreenshot) driver;
		File source1=ts.getScreenshotAs(OutputType.FILE);
		 File target1=new File("./screenshot/Snapdeal_app.png");
		 FileHandler.copy(source1, target1);
		
	
	
	
	
	
	
	
	
	}

}
