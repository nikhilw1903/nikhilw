package windowhandle;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.devtools.v136.page.model.LaunchHandler;

import dynamiccode.base;

public class handle1 extends base {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		launchbrowser("chrome");
		hiturl("https://www.naukri.com");
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0,document.body.scrollHeight);\r\n" + "");

		takescreenshot("about_pagescreenshot");
		driver.findElement(By.xpath("//a[@target=\"_blank\"][@title=\"About us\"]")).click();
		Set<String> window = driver.getWindowHandles();
		Iterator<String> id = window.iterator();

		String parent = id.next();
		String child = id.next();

		driver.switchTo().frame(child);
		
		
	}

}
