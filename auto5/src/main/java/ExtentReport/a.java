package ExtentReport;

import java.io.IOException;

import javax.swing.plaf.metal.OceanTheme;

import org.openqa.selenium.By;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import dynamiccode.base;

public class a extends base{

	
	
	public static void main(String[] args) throws IOException {
	String projectpath = System.getProperty("user.dir");
	System.out.println(projectpath);
ExtentSparkReporter report = new ExtentSparkReporter(projectpath+"\\reports\\ft_report");
	report.config().setTheme(Theme.DARK);
	report.config().setDocumentTitle("automationft_report");
	report.config().setReportName("functional_testing_report");
	ExtentReports r = new ExtentReports();
	r.attachReporter(report);
	r.setSystemInfo("os", "windows");
	r.setSystemInfo("Browser", "chrome");
	r.setSystemInfo("QA","nikhil wagh");
	
//	extent report
	ExtentTest test = r.createTest("facebook");
	test.log(Status.INFO,"chrome_Browser_launch");
	
	launchbrowser("chrome");
	
	hiturl("https://facebook.com");
	takescreenshot("ft_facebook");
	test.addScreenCaptureFromPath(projectpath+"\\screenshot\\ft_facebook.png");
	driver.findElement(By.xpath("//input[@data-testid=\"royal-email\"]")).sendKeys("nikhilw@gmail.com");
	takescreenshot("ft_fbmail");
	test.addScreenCaptureFromPath(projectpath+"\\screenshot\\ft_fbmail.png");
	driver.findElement(By.xpath("//input[@name=\"pass\"][@id=\"pass\"]")).sendKeys("DEVaa2304");
	takescreenshot("ft_fbpass");
	test.addScreenCaptureFromPath(projectpath+"\\screenshot\\ft_fbpass.png");
	
	r.flush();
	}
}
