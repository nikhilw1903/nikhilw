package java_scriptexecuter;

import java.io.IOException;
import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import dynamiccode.base;

public class JE1 extends base {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		launchbrowser("chrome");
		hiturl("https://railyatri.in/");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		JavascriptExecutor jp = (JavascriptExecutor) driver;
        jp.executeScript("window.scrollBy(0,200)");
        Thread.sleep(5000);
    jp.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    jp.executeScript("window.history.go(0)");
    
    jp.executeScript("window.history.back()");
    jp.executeScript("window.history.forward()");
	
	}
}