package java_scriptexecuter;

import java.awt.Window;
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
import dynamiccode.base;

public class JE1 extends base {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		launchbrowse("chrome");
		hiturl("https://railyatri.in/");

		JavascriptExecutor js1 = (JavascriptExecutor) driver;

		js1.executeScript("window.scrollBy(0, document.body.scrollHeight)");
		js1.executeScript("window.history.back()");
		Thread.sleep(3000);
	js1.executeScript("window.history.forward()");

	}
}