package ExtentReport;

import java.io.IOException;
import java.lang.ProcessHandle.Info;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import dynamiccode.base;

public class b extends base {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ExtentSparkReporter es = new ExtentSparkReporter(projectpath + "\\reports\\ft.report");
		es.config().setTheme(Theme.DARK);
		es.config().setDocumentTitle("jhali");
		es.config().setReportName("good");

		ExtentReports ty = new ExtentReports();
		ty.createTest("QA", "nikhilwagh");
		ty.createTest("O/S", "windows");

		ExtentTest et = ty.createTest("facebook");
		et.log(Status.INFO, "chrome_Browser_launch");
		launchbrowse("chrome");
		hiturl("https://www.facebook.com/");
		takescreenshot("ghj", "new");
		et.addScreenCaptureFromBase64String(projectpath + "//report_screenshot//ghj.png");

		ty.flush();

	}
}
