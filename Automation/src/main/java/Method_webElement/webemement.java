package Method_webElement;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.io.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webemement {

public static WebDriver driver;

public static void takescreenshot(String takecapture) throws IOException {
	TakesScreenshot shot = (TakesScreenshot) driver;
	File source1 = shot.getScreenshotAs(OutputType.FILE);
	File target1 = new File(shot+"./screenshot/"+takecapture+".png");
	FileHandler.copy(source1, target1);
	
}

	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.get("https://rahulshettyacademy.com/locatorspractice/");

		WebElement classname = driver.findElement(By.xpath("//input[@placeholder=\"Username\"]"));
		classname.sendKeys("absc@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@placeholder=\"Password\"]"));
		password.sendKeys("xyz@gmnd");
		Thread.sleep(3000);
		WebElement check = driver.findElement(By.id("chkboxOne"));
		WebElement check2 = driver.findElement(By.id("chkboxTwo"));
		check.click();
		check2.click();
		Thread.sleep(3000);
		WebElement click = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		click.click();
		WebElement forgot = driver.findElement(By.xpath("//div/a"));
		forgot.click();

		System.out.println(driver.getPageSource());
	takescreenshot("take");

	}

}
