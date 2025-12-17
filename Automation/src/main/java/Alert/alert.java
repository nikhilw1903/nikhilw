package Alert;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.TargetLocator;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import dynamiccode.base;


public class alert extends base {

	public static void main(String[] args) throws SQLException, InterruptedException, IOException {
		// TODO Auto-generated method stub

		String host = "localhost";
		 String portnumber = "3306";
		
		

//	open new window
		driver.findElement(By.xpath("//a[normalize-space()='Open New Tabbed Windows']")).click();
		driver.findElement(By.xpath("//a[@href='http://www.selenium.dev']")).click();
	
	Set<String> window = driver.getWindowHandles();
	Iterator<String> win = window.iterator();
	
	String parent = win.next();
	String child = win.next();
	
	TargetLocator winuse = driver.switchTo();
	
	driver.findElement(By.xpath("//a[normalize-space()='Open New Seperate Windows']")).click();
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	winuse.window(parent);
	
	
	
	
		Connection connect = DriverManager.getConnection("jdbc:mysql://"+host+":"+portnumber+"/testing","root","DEVaa2304@");
		Statement select = connect.createStatement();
		
		ResultSet result = select.executeQuery("select email,password from testing1 where sr_no=2;");
		result.next();
		
		System.out.println(result.getString("email"));
		System.out.println(result.getString("password"));
		


		Thread.sleep(2000);
				driver.findElement(By.xpath("//input[@placeholder='E mail']")).sendKeys(result.getString("email"));
				
				driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(result.getString("password"));
	

	
		ExtentSparkReporter ex= new ExtentSparkReporter(projectpath+"\\reports\\new");
		ex.config().setDocumentTitle("new");
		ex.config().setTheme(Theme.STANDARD);
		
		
		ExtentReports es= new ExtentReports();
		es.attachReporter(ex);
		es.setSystemInfo("OS", "windows");
		es.setSystemInfo("QA", "Nikhil Wagh");
		

		ExtentTest test=es.createTest("new web");
		test.log(Status.PASS, "good to go");
	
		
		test.log(Status.FAIL,"check this");
		
		
		 launchbrowse("chrome");
			hiturl("https://demo.automationtesting.in/Alerts.html");
		
	driver.findElement(By.cssSelector("header#header")).click();
	
	driver.findElement(By.cssSelector(".btn.btn-danger")).click();	
	
	 Alert alert1 = driver.switchTo().alert();
	alert1.accept();
	takescreenshot("alert1", "portnumber");
	test.addScreenCaptureFromPath(projectpath+"\\report_screenshot\\alert1.png");
	 driver.findElement(By.xpath("//a[normalize-space()='Alert with OK & Cancel']")).click();
	 driver.findElement(By.xpath("(//button[normalize-space()='click the button to display a confirm box'])[1]")).click();
	
	 alert1.dismiss();
	 takescreenshot("alert2", portnumber);
	    test.addScreenCaptureFromPath(projectpath +"\\report_screenshot\\alert2.png");

	driver.findElement(By.cssSelector(".analystic[href='#Textbox']")).click();
	driver.findElement(By.cssSelector(".btn.btn-info")).click();
	alert1.sendKeys("automation testing");
	alert1.accept();
	takescreenshot("alert3", child);
    test.addScreenCaptureFromPath(projectpath +"\\report_screenshot\\alert3.png");

	es.flush();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
