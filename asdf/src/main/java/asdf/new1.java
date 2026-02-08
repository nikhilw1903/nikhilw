package asdf;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import base.base6;


public class new1 extends base6 {


	public static void main(String[] args) throws InterruptedException {
		String projectpath = System.getProperty("user.dir");

		
		ExtentSparkReporter es = new ExtentSparkReporter(projectpath+"//Extentreport//report56");
		es.config().setTheme(Theme.STANDARD);
		es.config().setDocumentTitle("new");
		
		ExtentReports ex = new ExtentReports();
		ex.attachReporter(es);
		ex.setSystemInfo("tetsing", "automation");
		ex.setSystemInfo("os", "window");
		ex.setSystemInfo("QA", "nikhil wagh");
		
	
		
		
		
		WebDriver driver = new ChromeDriver();

		
		
		driver.get("https://jqueryui.com/droppable/");

		driver.manage().window().maximize();
		ExtentTest t = ex.createTest("amazone1");
		takescreenshot("amw1");
		t.addScreenCaptureFromPath("screenshot1/one1.png");
		
		WebElement frame = driver.findElement(By.cssSelector("iframe.demo-frame"));
		driver.switchTo().frame(frame);
		Actions ac = new Actions(driver);
		WebElement drag = driver.findElement(By.cssSelector("div#draggable"));
		WebElement drop = driver.findElement(By.cssSelector("div#droppable"));
		ac.dragAndDrop(drag, drop).build().perform();
		driver.switchTo().defaultContent();
		ExtentTest t1 = ex.createTest("amazone2");
		takescreenshot("amw2");
		t1.addScreenCaptureFromPath("screenshot1/one1.png");
		WebElement datepicker = driver.findElement(By.xpath("//a[text()=\"Datepicker\"]"));

		datepicker.click();
		Thread.sleep(3000);
		WebElement frame2 = driver.findElement(By.cssSelector("iframe.demo-frame"));
		driver.switchTo().frame(frame2);

		// open datepicker
		driver.findElement(By.id("datepicker")).click();

		String expectedMonth = "March";
		String expectedYear = "2026";
		String expectedDate = "18";

		while (true) {

		    String currentMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
		    String currentYear = driver.findElement(By.className("ui-datepicker-year")).getText();

		    if (currentMonth.equals(expectedMonth) && currentYear.equals(expectedYear)) {
		        break;
		    } else {
		        driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		    }
		}

		// select date
		driver.findElement(By.xpath("//a[text()='18']")).click();

		// come back to main page
		driver.switchTo().defaultContent();

		
	
		WebElement selectMenu = driver.findElement(By.xpath("//a[text()='Selectmenu']"));
		selectMenu.click();

		// switch to frame
		WebElement frame3 = driver.findElement(By.cssSelector("iframe.demo-frame"));
		driver.switchTo().frame(frame3);
		ExtentTest t3 = ex.createTest("amazone");
		t3.addScreenCaptureFromPath("screenshot1/one3.png");
		Thread.sleep(3000);

		// click select menu dropdown
		driver.findElement(
		    By.xpath("(//span[@class='ui-selectmenu-icon ui-icon ui-icon-triangle-1-s'])[1]")
		).click();

		// select option
		driver.findElement(
		    By.xpath("//div[text()='Faster']")
		).click();
		ExtentTest t4 = ex.createTest("amazone4");
		t4.addScreenCaptureFromPath("screenshot1/one4.png");
	
	
	ex.flush();
	
	
	driver.close();		
	
	
		
	}
	
}

		